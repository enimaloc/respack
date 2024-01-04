package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum FlatWorldPreset implements Key {
    MINECRAFT_BOTTOMLESS_PIT("flat_world_preset.minecraft.bottomless_pit"),
    MINECRAFT_CLASSIC_FLAT("flat_world_preset.minecraft.classic_flat"),
    MINECRAFT_DESERT("flat_world_preset.minecraft.desert"),
    MINECRAFT_OVERWORLD("flat_world_preset.minecraft.overworld"),
    MINECRAFT_REDSTONE_READY("flat_world_preset.minecraft.redstone_ready"),
    MINECRAFT_SNOWY_KINGDOM("flat_world_preset.minecraft.snowy_kingdom"),
    MINECRAFT_THE_VOID("flat_world_preset.minecraft.the_void"),
    MINECRAFT_TUNNELERS_DREAM("flat_world_preset.minecraft.tunnelers_dream"),
    MINECRAFT_WATER_WORLD("flat_world_preset.minecraft.water_world"),
    UNKNOWN("flat_world_preset.unknown");
    
    private final String key;
    
    FlatWorldPreset(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
