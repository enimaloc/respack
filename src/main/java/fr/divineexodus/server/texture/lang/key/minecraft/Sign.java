package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key; 

public enum Sign implements Key {
    EDIT("sign.edit");

    private final String key;

    Sign(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
