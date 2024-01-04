package fr.divineexodus.server.resource.texture;

import net.minestom.server.utils.NamespaceID;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Texture {
    private final NamespaceID namespace;
    private final byte[] content;

    public Texture(NamespaceID namespace, byte[] content) {
        this.namespace = namespace;
        this.content = content;
    }

    public Texture(NamespaceID namespace, File content) throws IOException {
        this.namespace = namespace;
        this.content = Files.readAllBytes(content.toPath());
    }

    public NamespaceID getNamespace() {
        return namespace;
    }

    public byte[] getContent() {
        return content;
    }

    public void generate(File output) throws IOException {
        File dstFolder = new File(output, namespace.domain()+"/textures/"+namespace.path().substring(0, namespace.path().lastIndexOf('/')));
        dstFolder.mkdirs();
        File dst = new File(dstFolder, namespace.path().substring(namespace.path().lastIndexOf('/')+1));
        try (FileOutputStream fos = new FileOutputStream(dst)) {
            fos.write(content);
        }
    }
}
