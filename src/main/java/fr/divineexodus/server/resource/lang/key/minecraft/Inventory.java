package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Inventory implements Key {
    BINSLOT("inventory.binSlot"),
    HOTBARINFO("inventory.hotbarInfo"),
    HOTBARSAVED("inventory.hotbarSaved");
    
    private final String key;
    
    Inventory(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
