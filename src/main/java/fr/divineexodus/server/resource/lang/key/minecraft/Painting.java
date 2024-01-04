package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Painting implements Key {
    DIMENSIONS("painting.dimensions"),
    MINECRAFT_ALBAN_AUTHOR("painting.minecraft.alban.author"),
    MINECRAFT_ALBAN_TITLE("painting.minecraft.alban.title"),
    MINECRAFT_AZTEC_AUTHOR("painting.minecraft.aztec.author"),
    MINECRAFT_AZTEC_TITLE("painting.minecraft.aztec.title"),
    MINECRAFT_AZTEC2_AUTHOR("painting.minecraft.aztec2.author"),
    MINECRAFT_AZTEC2_TITLE("painting.minecraft.aztec2.title"),
    MINECRAFT_BOMB_AUTHOR("painting.minecraft.bomb.author"),
    MINECRAFT_BOMB_TITLE("painting.minecraft.bomb.title"),
    MINECRAFT_BURNING_SKULL_AUTHOR("painting.minecraft.burning_skull.author"),
    MINECRAFT_BURNING_SKULL_TITLE("painting.minecraft.burning_skull.title"),
    MINECRAFT_BUST_AUTHOR("painting.minecraft.bust.author"),
    MINECRAFT_BUST_TITLE("painting.minecraft.bust.title"),
    MINECRAFT_COURBET_AUTHOR("painting.minecraft.courbet.author"),
    MINECRAFT_COURBET_TITLE("painting.minecraft.courbet.title"),
    MINECRAFT_CREEBET_AUTHOR("painting.minecraft.creebet.author"),
    MINECRAFT_CREEBET_TITLE("painting.minecraft.creebet.title"),
    MINECRAFT_DONKEY_KONG_AUTHOR("painting.minecraft.donkey_kong.author"),
    MINECRAFT_DONKEY_KONG_TITLE("painting.minecraft.donkey_kong.title"),
    MINECRAFT_EARTH_AUTHOR("painting.minecraft.earth.author"),
    MINECRAFT_EARTH_TITLE("painting.minecraft.earth.title"),
    MINECRAFT_FIGHTERS_AUTHOR("painting.minecraft.fighters.author"),
    MINECRAFT_FIGHTERS_TITLE("painting.minecraft.fighters.title"),
    MINECRAFT_FIRE_AUTHOR("painting.minecraft.fire.author"),
    MINECRAFT_FIRE_TITLE("painting.minecraft.fire.title"),
    MINECRAFT_GRAHAM_AUTHOR("painting.minecraft.graham.author"),
    MINECRAFT_GRAHAM_TITLE("painting.minecraft.graham.title"),
    MINECRAFT_KEBAB_AUTHOR("painting.minecraft.kebab.author"),
    MINECRAFT_KEBAB_TITLE("painting.minecraft.kebab.title"),
    MINECRAFT_MATCH_AUTHOR("painting.minecraft.match.author"),
    MINECRAFT_MATCH_TITLE("painting.minecraft.match.title"),
    MINECRAFT_PIGSCENE_AUTHOR("painting.minecraft.pigscene.author"),
    MINECRAFT_PIGSCENE_TITLE("painting.minecraft.pigscene.title"),
    MINECRAFT_PLANT_AUTHOR("painting.minecraft.plant.author"),
    MINECRAFT_PLANT_TITLE("painting.minecraft.plant.title"),
    MINECRAFT_POINTER_AUTHOR("painting.minecraft.pointer.author"),
    MINECRAFT_POINTER_TITLE("painting.minecraft.pointer.title"),
    MINECRAFT_POOL_AUTHOR("painting.minecraft.pool.author"),
    MINECRAFT_POOL_TITLE("painting.minecraft.pool.title"),
    MINECRAFT_SEA_AUTHOR("painting.minecraft.sea.author"),
    MINECRAFT_SEA_TITLE("painting.minecraft.sea.title"),
    MINECRAFT_SKELETON_AUTHOR("painting.minecraft.skeleton.author"),
    MINECRAFT_SKELETON_TITLE("painting.minecraft.skeleton.title"),
    MINECRAFT_SKULL_AND_ROSES_AUTHOR("painting.minecraft.skull_and_roses.author"),
    MINECRAFT_SKULL_AND_ROSES_TITLE("painting.minecraft.skull_and_roses.title"),
    MINECRAFT_STAGE_AUTHOR("painting.minecraft.stage.author"),
    MINECRAFT_STAGE_TITLE("painting.minecraft.stage.title"),
    MINECRAFT_SUNSET_AUTHOR("painting.minecraft.sunset.author"),
    MINECRAFT_SUNSET_TITLE("painting.minecraft.sunset.title"),
    MINECRAFT_VOID_AUTHOR("painting.minecraft.void.author"),
    MINECRAFT_VOID_TITLE("painting.minecraft.void.title"),
    MINECRAFT_WANDERER_AUTHOR("painting.minecraft.wanderer.author"),
    MINECRAFT_WANDERER_TITLE("painting.minecraft.wanderer.title"),
    MINECRAFT_WASTELAND_AUTHOR("painting.minecraft.wasteland.author"),
    MINECRAFT_WASTELAND_TITLE("painting.minecraft.wasteland.title"),
    MINECRAFT_WATER_AUTHOR("painting.minecraft.water.author"),
    MINECRAFT_WATER_TITLE("painting.minecraft.water.title"),
    MINECRAFT_WIND_AUTHOR("painting.minecraft.wind.author"),
    MINECRAFT_WIND_TITLE("painting.minecraft.wind.title"),
    MINECRAFT_WITHER_AUTHOR("painting.minecraft.wither.author"),
    MINECRAFT_WITHER_TITLE("painting.minecraft.wither.title"),
    RANDOM("painting.random");
    
    private final String key;
    
    Painting(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
