package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Event implements Key {
    MINECRAFT_RAID("event.minecraft.raid"),
    MINECRAFT_RAID_DEFEAT("event.minecraft.raid.defeat"),
    MINECRAFT_RAID_DEFEAT_FULL("event.minecraft.raid.defeat.full"),
    MINECRAFT_RAID_RAIDERS_REMAINING("event.minecraft.raid.raiders_remaining"),
    MINECRAFT_RAID_VICTORY("event.minecraft.raid.victory"),
    MINECRAFT_RAID_VICTORY_FULL("event.minecraft.raid.victory.full");
    
    private final String key;
    
    Event(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
