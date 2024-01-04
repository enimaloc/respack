package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key; 

public enum OutOfMemory implements Key {
    MESSAGE("outOfMemory.message"),
    TITLE("outOfMemory.title");

    private final String key;

    OutOfMemory(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
