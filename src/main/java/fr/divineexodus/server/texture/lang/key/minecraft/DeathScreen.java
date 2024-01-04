package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum DeathScreen implements Key {
    QUIT_CONFIRM("deathScreen.quit.confirm"),
    RESPAWN("deathScreen.respawn"),
    SCORE("deathScreen.score"),
    SPECTATE("deathScreen.spectate"),
    TITLE("deathScreen.title"),
    TITLE_HARDCORE("deathScreen.title.hardcore"),
    TITLESCREEN("deathScreen.titleScreen");
    
    private final String key;
    
    DeathScreen(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
