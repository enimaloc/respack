package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Biome implements Key {
    MINECRAFT_BADLANDS("biome.minecraft.badlands"),
    MINECRAFT_BAMBOO_JUNGLE("biome.minecraft.bamboo_jungle"),
    MINECRAFT_BASALT_DELTAS("biome.minecraft.basalt_deltas"),
    MINECRAFT_BEACH("biome.minecraft.beach"),
    MINECRAFT_BIRCH_FOREST("biome.minecraft.birch_forest"),
    MINECRAFT_CHERRY_GROVE("biome.minecraft.cherry_grove"),
    MINECRAFT_COLD_OCEAN("biome.minecraft.cold_ocean"),
    MINECRAFT_CRIMSON_FOREST("biome.minecraft.crimson_forest"),
    MINECRAFT_DARK_FOREST("biome.minecraft.dark_forest"),
    MINECRAFT_DEEP_COLD_OCEAN("biome.minecraft.deep_cold_ocean"),
    MINECRAFT_DEEP_DARK("biome.minecraft.deep_dark"),
    MINECRAFT_DEEP_FROZEN_OCEAN("biome.minecraft.deep_frozen_ocean"),
    MINECRAFT_DEEP_LUKEWARM_OCEAN("biome.minecraft.deep_lukewarm_ocean"),
    MINECRAFT_DEEP_OCEAN("biome.minecraft.deep_ocean"),
    MINECRAFT_DESERT("biome.minecraft.desert"),
    MINECRAFT_DRIPSTONE_CAVES("biome.minecraft.dripstone_caves"),
    MINECRAFT_END_BARRENS("biome.minecraft.end_barrens"),
    MINECRAFT_END_HIGHLANDS("biome.minecraft.end_highlands"),
    MINECRAFT_END_MIDLANDS("biome.minecraft.end_midlands"),
    MINECRAFT_ERODED_BADLANDS("biome.minecraft.eroded_badlands"),
    MINECRAFT_FLOWER_FOREST("biome.minecraft.flower_forest"),
    MINECRAFT_FOREST("biome.minecraft.forest"),
    MINECRAFT_FROZEN_OCEAN("biome.minecraft.frozen_ocean"),
    MINECRAFT_FROZEN_PEAKS("biome.minecraft.frozen_peaks"),
    MINECRAFT_FROZEN_RIVER("biome.minecraft.frozen_river"),
    MINECRAFT_GROVE("biome.minecraft.grove"),
    MINECRAFT_ICE_SPIKES("biome.minecraft.ice_spikes"),
    MINECRAFT_JAGGED_PEAKS("biome.minecraft.jagged_peaks"),
    MINECRAFT_JUNGLE("biome.minecraft.jungle"),
    MINECRAFT_LUKEWARM_OCEAN("biome.minecraft.lukewarm_ocean"),
    MINECRAFT_LUSH_CAVES("biome.minecraft.lush_caves"),
    MINECRAFT_MANGROVE_SWAMP("biome.minecraft.mangrove_swamp"),
    MINECRAFT_MEADOW("biome.minecraft.meadow"),
    MINECRAFT_MUSHROOM_FIELDS("biome.minecraft.mushroom_fields"),
    MINECRAFT_NETHER_WASTES("biome.minecraft.nether_wastes"),
    MINECRAFT_OCEAN("biome.minecraft.ocean"),
    MINECRAFT_OLD_GROWTH_BIRCH_FOREST("biome.minecraft.old_growth_birch_forest"),
    MINECRAFT_OLD_GROWTH_PINE_TAIGA("biome.minecraft.old_growth_pine_taiga"),
    MINECRAFT_OLD_GROWTH_SPRUCE_TAIGA("biome.minecraft.old_growth_spruce_taiga"),
    MINECRAFT_PLAINS("biome.minecraft.plains"),
    MINECRAFT_RIVER("biome.minecraft.river"),
    MINECRAFT_SAVANNA("biome.minecraft.savanna"),
    MINECRAFT_SAVANNA_PLATEAU("biome.minecraft.savanna_plateau"),
    MINECRAFT_SMALL_END_ISLANDS("biome.minecraft.small_end_islands"),
    MINECRAFT_SNOWY_BEACH("biome.minecraft.snowy_beach"),
    MINECRAFT_SNOWY_PLAINS("biome.minecraft.snowy_plains"),
    MINECRAFT_SNOWY_SLOPES("biome.minecraft.snowy_slopes"),
    MINECRAFT_SNOWY_TAIGA("biome.minecraft.snowy_taiga"),
    MINECRAFT_SOUL_SAND_VALLEY("biome.minecraft.soul_sand_valley"),
    MINECRAFT_SPARSE_JUNGLE("biome.minecraft.sparse_jungle"),
    MINECRAFT_STONY_PEAKS("biome.minecraft.stony_peaks"),
    MINECRAFT_STONY_SHORE("biome.minecraft.stony_shore"),
    MINECRAFT_SUNFLOWER_PLAINS("biome.minecraft.sunflower_plains"),
    MINECRAFT_SWAMP("biome.minecraft.swamp"),
    MINECRAFT_TAIGA("biome.minecraft.taiga"),
    MINECRAFT_THE_END("biome.minecraft.the_end"),
    MINECRAFT_THE_VOID("biome.minecraft.the_void"),
    MINECRAFT_WARM_OCEAN("biome.minecraft.warm_ocean"),
    MINECRAFT_WARPED_FOREST("biome.minecraft.warped_forest"),
    MINECRAFT_WINDSWEPT_FOREST("biome.minecraft.windswept_forest"),
    MINECRAFT_WINDSWEPT_GRAVELLY_HILLS("biome.minecraft.windswept_gravelly_hills"),
    MINECRAFT_WINDSWEPT_HILLS("biome.minecraft.windswept_hills"),
    MINECRAFT_WINDSWEPT_SAVANNA("biome.minecraft.windswept_savanna"),
    MINECRAFT_WOODED_BADLANDS("biome.minecraft.wooded_badlands");

    private final String key;

    Biome(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
