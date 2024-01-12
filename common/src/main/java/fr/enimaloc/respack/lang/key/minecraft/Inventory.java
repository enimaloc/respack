package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

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
