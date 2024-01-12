package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Record implements Key {
    NOWPLAYING("record.nowPlaying");

    private final String key;

    Record(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
