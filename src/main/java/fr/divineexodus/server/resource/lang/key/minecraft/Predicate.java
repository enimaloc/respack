package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Predicate implements Key {
    UNKNOWN("predicate.unknown");

    private final String key;

    Predicate(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
