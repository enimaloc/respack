package fr.divineexodus.server.resource;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import fr.divineexodus.server.gson.UnicodeWriter;
import fr.divineexodus.server.resource.extra.RegionalCompliancies;
import fr.divineexodus.server.resource.font.FontKey;
import fr.divineexodus.server.resource.font.FontModifier;
import fr.divineexodus.server.resource.lang.Lang;
import fr.divineexodus.server.resource.lang.MCLocale;
import fr.divineexodus.server.resource.meta.ResourcePackMeta;
import fr.divineexodus.server.resource.texture.Texture;
import fr.divineexodus.utils.ISO3166;
import fr.divineexodus.utils.MinecraftVersion;
import net.minestom.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;

public class GeneratedResourcePack {
    public static final Logger LOGGER = LoggerFactory.getLogger(GeneratedResourcePack.class);
    private ResourcePackMeta meta;
    private Map<String, FontModifier> fontModifiers = new HashMap<>();
    private Map<ISO3166, RegionalCompliancies> regionalCompliancies = new HashMap<>();
    private List<Texture> textures = new ArrayList<>();
    private Map<MCLocale, Lang> langs = new HashMap<>();

    public GeneratedResourcePack() {
        this.meta = ResourcePackMeta.of(new MinecraftVersion(MinecraftServer.VERSION_NAME));
    }

    public GeneratedResourcePack(ResourcePackMeta meta) {
        this.meta = meta;
    }

    public GeneratedResourcePack(MinecraftVersion version) {
        this.meta = ResourcePackMeta.of(version);
    }

    public List<FontModifier> getFontModifiers() {
        return Collections.unmodifiableList(new ArrayList<>(fontModifiers.values()));
    }

    public FontModifier getFontModifier() {
        return getFontModifier((String) null);
    }

    public FontModifier getFontModifier(@Nullable FontKey key) {
        String name = null;
        if (key != null) {
            name = "";
            if (key.namespace() != null) {
                name += key.namespace() + "_";
            }
            name += key.value();
        }
        return getFontModifier(name);
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

    public void pack() {
        meta.buildWith(langs.keySet().stream().filter(Predicate.not(MCLocale::defaultLocale)).toList());
        fontModifier.rebuild();
    }

    public void generate(File output) throws IOException {
        generate(output, new Gson());
    }

    public void generate(File output, Gson gson) throws IOException {
        pack();
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
            LOGGER.debug("- path: {}", texture.getNamespace().path());
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
                File langFile = new File(langFolder, entry.getKey().code()+".json");
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
    }
}
