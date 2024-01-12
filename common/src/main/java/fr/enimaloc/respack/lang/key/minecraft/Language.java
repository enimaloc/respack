package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

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
