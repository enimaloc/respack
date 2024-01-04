package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum ItemGroup implements Key {
    BUILDINGBLOCKS("itemGroup.buildingBlocks"),
    COLOREDBLOCKS("itemGroup.coloredBlocks"),
    COMBAT("itemGroup.combat"),
    CONSUMABLES("itemGroup.consumables"),
    CRAFTING("itemGroup.crafting"),
    FOODANDDRINK("itemGroup.foodAndDrink"),
    FUNCTIONAL("itemGroup.functional"),
    HOTBAR("itemGroup.hotbar"),
    INGREDIENTS("itemGroup.ingredients"),
    INVENTORY("itemGroup.inventory"),
    NATURAL("itemGroup.natural"),
    OP("itemGroup.op"),
    REDSTONE("itemGroup.redstone"),
    SEARCH("itemGroup.search"),
    SPAWNEGGS("itemGroup.spawnEggs"),
    TOOLS("itemGroup.tools");
    
    private final String key;
    
    ItemGroup(final String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return this.key;
    }
}
