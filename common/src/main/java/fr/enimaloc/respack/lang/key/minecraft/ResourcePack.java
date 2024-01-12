package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum ResourcePack implements Key {
    BROKEN_ASSETS("resourcePack.broken_assets"),
    DOWNLOADING("resourcepack.downloading"),
    HIGH_CONTRAST_NAME("resourcePack.high_contrast.name"),
    LOAD_FAIL("resourcePack.load_fail"),
    PROGRAMMER_ART_NAME("resourcePack.programmer_art.name"),
    PROGRESS("resourcepack.progress"),
    REQUESTING("resourcepack.requesting"),
    SERVER_NAME("resourcePack.server.name"),
    TITLE("resourcePack.title"),
    VANILLA_DESCRIPTION("resourcePack.vanilla.description"),
    VANILLA_NAME("resourcePack.vanilla.name");

    private final String key;

    ResourcePack(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
