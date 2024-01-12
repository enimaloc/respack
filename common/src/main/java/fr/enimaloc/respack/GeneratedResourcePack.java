package fr.enimaloc.respack;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sun.net.httpserver.HttpServer;
import fr.enimaloc.respack.extra.RegionalCompliancies;
import fr.enimaloc.respack.gson.UnicodeWriter;
import fr.enimaloc.respack.lang.Lang;
import fr.enimaloc.respack.lang.MCLocale;
import fr.enimaloc.respack.meta.ResourcePackMeta;
import fr.enimaloc.respack.texture.Texture;
import fr.enimaloc.respack.font.FontModifier;
import fr.enimaloc.utils.ISO3166;
import fr.enimaloc.utils.MinecraftVersion;
import fr.enimaloc.utils.NetUtils;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GeneratedResourcePack {
    public static final Logger LOGGER = LoggerFactory.getLogger(GeneratedResourcePack.class);
    private static HttpServer server;
    private ResourcePackMeta meta;
    private Map<String, FontModifier> fontModifiers = new HashMap<>();
    private Map<ISO3166, RegionalCompliancies> regionalCompliancies = new HashMap<>();
    private List<Texture> textures = new ArrayList<>();
    private Map<MCLocale, Lang> langs = new HashMap<>();
    private File outputDirectory;
    private File outputZip;
    private String httpPath;
    private UploadedResourcePack uploadedResourcePack;

    public GeneratedResourcePack(ResourcePackMeta meta) {
        this.meta = meta;
    }

    public GeneratedResourcePack(MinecraftVersion version) {
        this.meta = ResourcePackMeta.of(version);
    }

    public List<FontModifier> getFontModifiers() {
        return List.copyOf(fontModifiers.values());
    }

    public FontModifier getFontModifier() {
        return getFontModifier((String) null);
    }

    public FontModifier getFontModifier(@Nullable Key key) {
        return getFontModifier(key == null ? null : key.asString().replace(":", "_"));
    }

    public FontModifier getFontModifier(@Nullable String name) {
        if (name == null) {
            name = "default";
        }
        return fontModifiers.computeIfAbsent(name, FontModifier::new);
    }

    public ResourcePackMeta getMeta() {
        return meta;
    }

    public RegionalCompliancies getRegionalCompliancies(ISO3166 country) {
        return regionalCompliancies.computeIfAbsent(country, RegionalCompliancies::new);
    }

    public Lang getLang(MCLocale locale) {
        return langs.computeIfAbsent(locale, Lang::new);
    }

    public void addTexture(Texture texture) {
        textures.add(texture);
    }

    public void build() {
        meta.buildWith(langs.keySet().stream().filter(Predicate.not(MCLocale::defaultLocale)).toList());
        for (FontModifier fontModifier : fontModifiers.values()) {
            fontModifier.rebuild();
        }
    }

    public File generate() throws IOException {
        Path directory = Files.createTempDirectory("resource-pack.");
        generate(directory.toFile());
        return directory.toFile();
    }

    public void generate(File output) throws IOException {
        generate(output, new Gson());
    }

    public void generate(File output, Gson gson) throws IOException {
        build();
        LOGGER.info("Generating resource pack in {}", output.getAbsolutePath());
        // region MCMETA
        if (meta.getPackFormat() > 0) {
            LOGGER.debug("Creating mcmeta file");
            LOGGER.debug("- pack format: {}", meta.getPackFormat());
            LOGGER.debug("- description: {}", meta.getDescription());
            LOGGER.trace("- JSON: {}", gson.toJson(meta.toJson()));
            File mcmeta = new File(output, "pack.mcmeta");
            mcmeta.createNewFile();
            try (FileWriter writer = new FileWriter(mcmeta)) {
                writer.write(gson.toJson(meta.toJson()));
            }
        }
        // endregion
        File assetsFolder = new File(output, "assets");
        if (assetsFolder.exists()) {
            assetsFolder.delete();
        }
        assetsFolder.mkdirs();
        // region Font
        File fontFolder = new File(assetsFolder, "minecraft/font");
        if (!fontModifiers.isEmpty()) {
            LOGGER.debug("Creating font file");
            for (FontModifier fontModifier : fontModifiers.values()) {
                LOGGER.debug("- name: {}", fontModifier.getFontName());
                LOGGER.trace("- JSON: {}", gson.toJson(fontModifier.toJson()));
                fontFolder.mkdirs();
                File fontFile = new File(fontFolder, fontModifier.getFontName()+".json");
                fontFile.createNewFile();
                try (UnicodeWriter writer = new UnicodeWriter(new FileWriter(fontFile))) {
                    writer.write(gson.toJson(fontModifier.toJson()));
                }
            }
        } else {
            fontFolder.delete();
        }
        // endregion
        // region Regional Compliancies
        File regionalFolder = new File(assetsFolder, "minecraft/regional_compliancies.json");
        List<RegionalCompliancies> regionalCompliancies = this.regionalCompliancies.values()
                .stream()
                .filter(Predicate.not(RegionalCompliancies::isEmpty))
                .toList();
        if (!regionalCompliancies.isEmpty()) {
            LOGGER.debug("Creating regional compliancies file");
            for (RegionalCompliancies regionalCompliancy : regionalCompliancies) {
                JsonObject json = new JsonObject();
                LOGGER.debug("- {}", regionalCompliancy.getCountry());
                regionalCompliancy.toJson(json);
                LOGGER.trace("  - JSON: {}", gson.toJson(json));
            }
            regionalFolder.createNewFile();
            try (FileWriter writer = new FileWriter(regionalFolder)) {
                JsonObject json = new JsonObject();
                for (RegionalCompliancies regionalCompliancy : regionalCompliancies) {
                    regionalCompliancy.toJson(json);
                }
                writer.write(gson.toJson(json));
            }
        } else {
            regionalFolder.delete();
        }
        // endregion
        // region Textures
        for (Texture texture : textures) {
            LOGGER.debug("Creating texture file");
            LOGGER.debug("- namespace: {}", texture.getNamespace());
            LOGGER.debug("- path: {}", texture.getNamespace().value());
            try {
                texture.generate(assetsFolder);
            } catch (IOException e) {
                LOGGER.error("Unable to generate texture file", e);
            }
        }
        // endregion
        // region Lang
        File langFolder = new File(assetsFolder, "minecraft/lang");
        if (!langs.isEmpty()) {
            langFolder.mkdirs();
            for (Map.Entry<MCLocale, Lang> entry : langs.entrySet()) {
                LOGGER.debug("Creating lang file");
                LOGGER.debug("- locale: {}", entry.getKey());
                LOGGER.trace("- JSON: {}", gson.toJson(entry.getValue().toJson()));
                File langFile = new File(langFolder, entry.getKey().code() + ".json");
                langFile.createNewFile();
                try (FileWriter writer = new FileWriter(langFile)) {
                    writer.write(gson.toJson(entry.getValue().toJson()));
                }
            }
        } else {
            langFolder.delete();
        }
        // endregion
        LOGGER.info("Resource pack generated");
        outputDirectory = output;
    }

    public File pack() throws IOException {
        File tempFile = File.createTempFile("resource-pack.", ".zip");
        pack(tempFile.getParentFile());
        return tempFile;
    }

    public void pack(File output) throws IOException {
        if (outputDirectory == null || !outputDirectory.exists()) {
            outputDirectory = generate();
        }
        LOGGER.info("Packing resource pack in {}", output.getAbsolutePath());
        output.createNewFile();
        try (FileOutputStream fos = new FileOutputStream(output);
             ZipOutputStream zos = new ZipOutputStream(fos)) {
            Files.walk(outputDirectory.toPath())
                    .filter(Files::isRegularFile)
                    .forEach(path -> {
                        try {
                            zos.putNextEntry(new ZipEntry(outputDirectory.toPath().relativize(path).toString().replace("\\", "/")));
                            zos.write(Files.readAllBytes(path));
                            zos.closeEntry();
                        } catch (IOException e) {
                            LOGGER.error("Unable to pack resource pack", e);
                        }
                    });
        }
        LOGGER.info("Resource pack packed");
        outputZip = output;
    }

    public byte[] getMD5() throws NoSuchAlgorithmException, IOException {
        if (uploadedResourcePack != null) {
            return uploadedResourcePack.hash().getBytes();
        }
        if (outputZip == null || !outputZip.exists()) {
            outputZip = pack();
        }
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(Files.readAllBytes(outputZip.toPath()));
        return md5.digest();
    }

    public String getHttpPath() {
        return httpPath;
    }

    public String getUrl() {
        if (server == null && uploadedResourcePack == null) {
            throw new IllegalStateException("HTTP server not started and resource pack not published");
        }
        if (uploadedResourcePack != null) {
            return uploadedResourcePack.url();
        }
        return "http://" + server.getAddress().getHostString() + ":" + server.getAddress().getPort() + httpPath;
    }

    public URI getUri() {
        return URI.create(getUrl());
    }

    public UploadedResourcePack publishToMCPack() throws IOException {
        if (outputZip == null || !outputZip.exists()) {
            outputZip = pack();
        }

        URLConnection connection = new URL("https://mc-packs.net/").openConnection();
        connection.setDoOutput(true);
        String boundary = Long.toHexString(System.currentTimeMillis());
        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

        try (OutputStream output = connection.getOutputStream();
             PrintWriter writer = new PrintWriter(new OutputStreamWriter(output, "UTF-8"), true)) {
            writer.append("--").append(boundary).append("\r\n");
            writer.append("Content-Disposition: form-data; name=\"file\"; filename=\"").append(outputZip.getName()).append("\"").append("\r\n");
            writer.append("Content-Type: application/x-zip-compressed").append("\r\n");
            writer.append("\r\n").flush();
            Files.copy(outputZip.toPath(), output);
            output.flush();
            writer.append("\r\n").flush();
            writer.append("--").append(boundary).append("--").append("\r\n").flush();
        }

        HttpURLConnection result = ((HttpURLConnection) connection);
        if (result.getResponseCode() != 200) {
            throw new IOException("Bad response code: " + result.getResponseCode());
        }
        LOGGER.info("Resource pack published to MCPack");
        URLConnection redirect = result.getURL().openConnection();
        redirect.connect();
        String[] content = new String[2];
        int i = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(redirect.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("<input")) {
                    content[i++] = line.substring(line.indexOf("value=\"") + 7, line.lastIndexOf("\""));
                }
            }
        }
        LOGGER.debug("content = {}", Arrays.toString(content));
        return uploadedResourcePack = new UploadedResourcePack(content[0], content[1]);
    }
    public record UploadedResourcePack(String url, String hash) {

    }

    public void addToHttpServer(String path) throws IOException {
        if (outputZip == null || !outputZip.exists()) {
            outputZip = pack();
        }
        if (path == null) {
            path = "/";
        }
        if (server == null) {
            throw new IllegalStateException("HTTP server not started");
        }
        server.createContext(path, exchange -> {
            exchange.sendResponseHeaders(200, outputZip.length());
            try (OutputStream os = exchange.getResponseBody()) {
                Files.copy(outputZip.toPath(), os);
            }
            exchange.close();
        });
        httpPath = path;
        LOGGER.debug("HTTP context created: {}", path);
    }

    public static void startHttpServer(int port) throws IOException {
        startHttpServer(NetUtils.getPublicIp(), port);
    }

    public static void startHttpServer(String ip, int port) throws IOException {
        if (server != null) {
            throw new IllegalStateException("HTTP server already started");
        }
        LOGGER.debug("Creating HTTP server");
        server = HttpServer.create(new InetSocketAddress(InetAddress.getByName(ip), port), 0);
        server.start();
        LOGGER.info("HTTP server started");
    }
}
