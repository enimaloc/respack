package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum SoundCategory implements Key {
    AMBIENT("soundCategory.ambient"),
    BLOCK("soundCategory.block"),
    HOSTILE("soundCategory.hostile"),
    MASTER("soundCategory.master"),
    MUSIC("soundCategory.music"),
    NEUTRAL("soundCategory.neutral"),
    PLAYER("soundCategory.player"),
    RECORD("soundCategory.record"),
    VOICE("soundCategory.voice"),
    WEATHER("soundCategory.weather");
    
    private final String key;
    
    SoundCategory(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
