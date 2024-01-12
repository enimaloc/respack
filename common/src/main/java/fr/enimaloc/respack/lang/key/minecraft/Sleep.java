package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Sleep implements Key {
    NOT_POSSIBLE("sleep.not_possible"),
    PLAYERS_SLEEPING("sleep.players_sleeping"),
    SKIPPING_NIGHT("sleep.skipping_night");

    private final String key;

    Sleep(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
