package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Build implements Key {
    TOO_HIGH("build.too_high");

    private final String key;

    Build(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
