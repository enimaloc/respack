package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum Clear implements Key {
    FAILED_MULTIPLE("clear.failed.multiple"),
    FAILED_SINGLE("clear.failed.single");

    private final String key;

    Clear(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
