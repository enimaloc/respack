package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum Controls implements Key {
    KEYBINDS("controls.keybinds"),
    KEYBINDS_DUPLICATE_KEYBINDS("controls.keybinds.duplicateKeybinds"),
    KEYBINDS_TITLE("controls.keybinds.title"),
    RESET("controls.reset"),
    RESETALL("controls.resetAll"),
    TITLE("controls.title");
    
    private final String key;
    
    Controls(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
