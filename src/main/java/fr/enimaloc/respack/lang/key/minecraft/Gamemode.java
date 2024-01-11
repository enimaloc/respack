package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Gamemode implements Key {
    ADVENTURE("gameMode.adventure"),
    CHANGED("gameMode.changed"),
    CREATIVE("gameMode.creative"),
    HARDCORE("gameMode.hardcore"),
    SPECTATOR("gameMode.spectator"),
    SURVIVAL("gameMode.survival");

    private final String key;

    Gamemode(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
