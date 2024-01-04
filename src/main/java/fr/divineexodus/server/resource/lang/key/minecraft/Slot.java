package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

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
