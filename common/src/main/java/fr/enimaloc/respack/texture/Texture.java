package fr.enimaloc.respack.texture;


import net.kyori.adventure.key.Key;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Texture {
    private final Key namespace;
    private final byte[] content;

    public Texture(Key namespace, byte[] content) {
        this.namespace = namespace;
        this.content = content;
    }

    public Texture(Key namespace, File content) throws IOException {
        this.namespace = namespace;
        this.content = Files.readAllBytes(content.toPath());
    }

    public Key getNamespace() {
        return namespace;
    }

    public byte[] getContent() {
        return content;
    }

    public void generate(File output) throws IOException {
        File dstFolder = new File(output, namespace.namespace()+"/textures/"+namespace.value().substring(0, namespace.value().lastIndexOf('/')));
        dstFolder.mkdirs();
        File dst = new File(dstFolder, namespace.value().substring(namespace.value().lastIndexOf('/')+1));
        try (FileOutputStream fos = new FileOutputStream(dst)) {
            fos.write(content);
        }
    }
}
