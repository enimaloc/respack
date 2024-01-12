package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Mirror implements Key {
    FRONT_BACK("mirror.front_back"),
    LEFT_RIGHT("mirror.left_right"),
    NONE("mirror.none");

    private final String key;

    Mirror(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
