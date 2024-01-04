package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum TrimPattern implements Key {
     MINECRAFT_COAST("trim_pattern.minecraft.coast"),
     MINECRAFT_DUNE("trim_pattern.minecraft.dune"),
     MINECRAFT_EYE("trim_pattern.minecraft.eye"),
     MINECRAFT_HOST("trim_pattern.minecraft.host"),
     MINECRAFT_RAISER("trim_pattern.minecraft.raiser"),
     MINECRAFT_RIB("trim_pattern.minecraft.rib"),
     MINECRAFT_SENTRY("trim_pattern.minecraft.sentry"),
     MINECRAFT_SHAPER("trim_pattern.minecraft.shaper"),
     MINECRAFT_SILENCE("trim_pattern.minecraft.silence"),
     MINECRAFT_SNOUT("trim_pattern.minecraft.snout"),
     MINECRAFT_SPIRE("trim_pattern.minecraft.spire"),
     MINECRAFT_TIDE("trim_pattern.minecraft.tide"),
     MINECRAFT_VEX("trim_pattern.minecraft.vex"),
     MINECRAFT_WARD("trim_pattern.minecraft.ward"),
     MINECRAFT_WAYFINDER("trim_pattern.minecraft.wayfinder"),
     MINECRAFT_WILD("trim_pattern.minecraft.wild");
    
    private final String key;
    
    TrimPattern(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
