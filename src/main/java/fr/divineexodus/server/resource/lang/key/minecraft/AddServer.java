package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum AddServer implements Key {
    ADD("addServer.add"),
    ENTER_IP("addServer.enterIp"),
    ENTER_NAME("addServer.enterName"),
    HIDE_ADDRESS("addServer.hideAddress"),
    RESOURCE_PACK("addServer.resourcePack"),
    RESOURCE_PACK_PROMPT("addServer.resourcePack.prompt"),
    RESOURCE_PACK_ENABLED("addServer.resourcePack.enabled"),
    RESOURCE_PACK_DISABLED("addServer.resourcePack.disabled"),
    TITLE("addServer.title");

    private final String key;

    AddServer(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
