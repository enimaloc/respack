package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Generator implements Key {
    CUSTOM("generator.custom"),
    CUSTOMIZED("generator.customized"),
    MINECRAFT_AMPLIFIED("generator.minecraft.amplified"),
    MINECRAFT_AMPLIFIED_INFO("generator.minecraft.amplified.info"),
    MINECRAFT_DEBUG_ALL_BLOCK_STATES("generator.minecraft.debug_all_block_states"),
    MINECRAFT_FLAT("generator.minecraft.flat"),
    MINECRAFT_LARGE_BIOMES("generator.minecraft.large_biomes"),
    MINECRAFT_NORMAL("generator.minecraft.normal"),
    MINECRAFT_SINGLE_BIOME_SURFACE("generator.minecraft.single_biome_surface"),
    SINGLE_BIOME_CAVES("generator.single_biome_caves"),
    SINGLE_BIOME_FLOATING_ISLANDS("generator.single_biome_floating_islands");
    
    private final String key;
    
    Generator(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
