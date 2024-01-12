package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Compliance implements Key {
    PLAYTIME_GREATERTHAN24HOURS("compliance.playtime.greaterThan24Hours"),
    PLAYTIME_HOURS("compliance.playtime.hours"),
    PLAYTIME_MESSAGE("compliance.playtime.message");

    private final String key;

    Compliance(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
