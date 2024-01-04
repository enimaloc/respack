package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum Connect implements Key {
    ABORTED("connect.aborted"),
    AUTHORIZING("connect.authorizing"),
    CONNECTING("connect.connecting"),
    ENCRYPTING("connect.encrypting"),
    FAILED("connect.failed"),
    JOINING("connect.joining"),
    NEGOTIATING("connect.negotiating");

    private final String key;

    Connect(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
