package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum FilledMap implements Key {
    BURIED_TREASURE("filled_map.buried_treasure"),
    EXPLORER_JUNGLE("filled_map.explorer_jungle"),
    EXPLORER_SWAMP("filled_map.explorer_swamp"),
    ID("filled_map.id"),
    LEVEL("filled_map.level"),
    LOCKED("filled_map.locked"),
    MANSION("filled_map.mansion"),
    MONUMENT("filled_map.monument"),
    SCALE("filled_map.scale"),
    UNKNOWN("filled_map.unknown"),
    VILLAGE_DESERT("filled_map.village_desert"),
    VILLAGE_PLAINS("filled_map.village_plains"),
    VILLAGE_SAVANNA("filled_map.village_savanna"),
    VILLAGE_SNOWY("filled_map.village_snowy"),
    VILLAGE_TAIGA("filled_map.village_taiga");
    
    private final String key;
    
    FilledMap(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
