package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key; 

public enum QuickPlay implements Key {
    ERROR_INVALID_IDENTIFIER("quickplay.error.invalid_identifier"),
    ERROR_REALM_CONNECT("quickplay.error.realm_connect"),
    ERROR_REALM_PERMISSION("quickplay.error.realm_permission"),
    ERROR_TITLE("quickplay.error.title"),;
    
    private final String key;
    
    QuickPlay(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
