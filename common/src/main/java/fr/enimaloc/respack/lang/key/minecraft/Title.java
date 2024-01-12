package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Title implements Key {
    _32BIT_DEPRECATION("title.32bit.deprecation"),
    _32BIT_DEPRECATION_REALMS("title.32bit.deprecation.realms"),
    _32BIT_DEPRECATION_REALMS_CHECK("title.32bit.deprecation.realms.check"),
    _32BIT_DEPRECATION_REALMS_HEADER("title.32bit.deprecation.realms.header"),
    MULTIPLAYER_DISABLED("title.multiplayer.disabled"),
    MULTIPLAYER_DISABLED_BANNED_PERMANENT("title.multiplayer.disabled.banned.permanent"),
    MULTIPLAYER_DISABLED_BANNED_TEMPORARY("title.multiplayer.disabled.banned.temporary"),
    MULTIPLAYER_LAN("title.multiplayer.lan"),
    MULTIPLAYER_OTHER("title.multiplayer.other"),
    MULTIPLAYER_REALMS("title.multiplayer.realms"),
    SINGLEPLAYER("title.singleplayer");
    
    private final String key;
    
    Title(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
