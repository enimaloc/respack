package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Menu implements Key {
    CONVERTINGLEVEL("menu.convertingLevel"),
    DISCONNECT("menu.disconnect"),
    GAME("menu.game"),
    GENERATINGLEVEL("menu.generatingLevel"),
    GENERATINGTERRAIN("menu.generatingTerrain"),
    LOADINGFORCEDCHUNKS("menu.loadingForcedChunks"),
    LOADINGLEVEL("menu.loadingLevel"),
    MODDED("menu.modded"),
    MULTIPLAYER("menu.multiplayer"),
    ONLINE("menu.online"),
    OPTIONS("menu.options"),
    PAUSED("menu.paused"),
    PLAYDEMO("menu.playdemo"),
    PLAYERREPORTING("menu.playerReporting"),
    PREPARINGSPAWN("menu.preparingSpawn"),
    QUIT("menu.quit"),
    REPORTBUGS("menu.reportBugs"),
    RESETDEMO("menu.resetdemo"),
    RESPAWNING("menu.respawning"),
    RETURNTOGAME("menu.returnToGame"),
    RETURNTOMENU("menu.returnToMenu"),
    SAVINGCHUNKS("menu.savingChunks"),
    SAVINGLEVEL("menu.savingLevel"),
    SENDFEEDBACK("menu.sendFeedback"),
    SHARETOLAN("menu.shareToLan"),
    SINGLEPLAYER("menu.singleplayer"),
    WORKING("menu.working");
    
    private final String key;
    
    Menu(final String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return this.key;
    }
}
