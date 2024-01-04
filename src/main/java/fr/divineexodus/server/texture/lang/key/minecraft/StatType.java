package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key; 

public enum StatType implements Key {
    MINECRAFT_BROKEN("stat_type.minecraft.broken"),
    MINECRAFT_CRAFTED("stat_type.minecraft.crafted"),
    MINECRAFT_DROPPED("stat_type.minecraft.dropped"),
    MINECRAFT_KILLED("stat_type.minecraft.killed"),
    MINECRAFT_KILLED_BY("stat_type.minecraft.killed_by"),
    MINECRAFT_KILLED_BY_NONE("stat_type.minecraft.killed_by.none"),
    MINECRAFT_KILLED_NONE("stat_type.minecraft.killed.none"),
    MINECRAFT_MINED("stat_type.minecraft.mined"),
    MINECRAFT_PICKED_UP("stat_type.minecraft.picked_up"),
    MINECRAFT_USED("stat_type.minecraft.used");
    
    private final String key;
    
    StatType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
