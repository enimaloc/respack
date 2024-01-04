package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Mount implements Key {
    ONBOARD("mount.onboard");

    private final String key;

    Mount(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
