package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

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
