package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum LanServer implements Key {
    OTHERPLAYERS("lanServer.otherPlayers"),
    PORT("lanServer.port"),
    PORT_INVALID("lanServer.port.invalid"),
    PORT_INVALID_NEW("lanServer.port.invalid.new"),
    PORT_UNAVAILABLE("lanServer.port.unavailable"),
    PORT_UNAVAILABLE_NEW("lanServer.port.unavailable.new"),
    SCANNING("lanServer.scanning"),
    START("lanServer.start"),
    TITLE("lanServer.title");
    
    private final String key;
    
    LanServer(final String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return this.key;
    }
}
