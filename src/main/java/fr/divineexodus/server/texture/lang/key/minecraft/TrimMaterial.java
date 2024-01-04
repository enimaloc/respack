package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum TrimMaterial implements Key {
    MINECRAFT_AMETHYST("trim_material.minecraft.amethyst"),
    MINECRAFT_COPPER("trim_material.minecraft.copper"),
    MINECRAFT_DIAMOND("trim_material.minecraft.diamond"),
    MINECRAFT_EMERALD("trim_material.minecraft.emerald"),
    MINECRAFT_GOLD("trim_material.minecraft.gold"),
    MINECRAFT_IRON("trim_material.minecraft.iron"),
    MINECRAFT_LAPIS("trim_material.minecraft.lapis"),
    MINECRAFT_NETHERITE("trim_material.minecraft.netherite"),
    MINECRAFT_QUARTZ("trim_material.minecraft.quartz"),
    MINECRAFT_REDSTONE("trim_material.minecraft.redstone");
    
    private final String key;
    
    TrimMaterial(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
