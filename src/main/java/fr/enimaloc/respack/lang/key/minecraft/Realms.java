package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Realms implements Key {
    MISSING_MODULE_ERROR_TEXT("realms.missing.module.error.text"),
    MISSING_SNAPSHOT_ERROR_TEXT("realms.missing.snapshot.error.text");

    private final String key;

    Realms(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
