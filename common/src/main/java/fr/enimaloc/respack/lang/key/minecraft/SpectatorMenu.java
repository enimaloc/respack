package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum SpectatorMenu implements Key {
    CLOSE("spectatorMenu.close"),
    NEXT_PAGE("spectatorMenu.next_page"),
    PREVIOUS_PAGE("spectatorMenu.previous_page"),
    ROOT_PROMPT("spectatorMenu.root.prompt"),
    TEAM_TELEPORT("spectatorMenu.team_teleport"),
    TEAM_TELEPORT_PROMPT("spectatorMenu.team_teleport.prompt"),
    TELEPORT("spectatorMenu.teleport"),
    TELEPORT_PROMPT("spectatorMenu.teleport.prompt");
    
    private final String key;
    
    SpectatorMenu(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
