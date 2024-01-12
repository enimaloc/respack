package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Permissions implements Key {
    REQUIRES_ENTITY("permissions.requires.entity"),
    REQUIRES_PLAYER("permissions.requires.player");

    private final String key;

    Permissions(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
