package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Upgrade implements Key {
    MINECRAFT_NETHERITE_UPGRADE("upgrade.minecraft.netherite_upgrade");

    private final String key;

    Upgrade(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}