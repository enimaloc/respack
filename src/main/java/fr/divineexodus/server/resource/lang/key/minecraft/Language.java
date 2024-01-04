package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Language implements Key {
    CODE("language.code"),
    NAME("language.name"),
    REGION("language.region");

    private final String key;

    Language(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return this.key;
    }
}
