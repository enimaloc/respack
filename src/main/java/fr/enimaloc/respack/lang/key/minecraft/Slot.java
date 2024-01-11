package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Slot implements Key {
    UNKNOWN("slot.unknown");

    private final String key;

    Slot(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
