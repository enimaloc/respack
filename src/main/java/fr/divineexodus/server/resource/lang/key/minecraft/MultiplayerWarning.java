package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum MultiplayerWarning implements Key {
    CHECK("multiplayerWarning.check"),
    HEADER("multiplayerWarning.header"),
    MESSAGE("multiplayerWarning.message");

    private final String key;

    MultiplayerWarning(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}