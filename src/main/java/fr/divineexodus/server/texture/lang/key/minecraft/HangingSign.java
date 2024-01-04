package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key; 

public enum HangingSign implements Key {
    EDIT("hanging_sign.edit");

    private final String key;

    HangingSign(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
