package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

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
