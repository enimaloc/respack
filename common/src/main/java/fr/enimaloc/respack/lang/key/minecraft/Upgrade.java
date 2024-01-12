package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

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
