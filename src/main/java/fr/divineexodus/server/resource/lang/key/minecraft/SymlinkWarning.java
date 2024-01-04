package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum SymlinkWarning implements Key {
    TITLE("symlink_warning.title"),
    MESSAGE("symlink_warning.message");

    private final String key;

    SymlinkWarning(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
