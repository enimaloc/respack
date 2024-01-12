package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Container implements Key {
    BARREL("container.barrel"),
    BEACON("container.beacon"),
    BLAST_FURNACE("container.blast_furnace"),
    BREWING("container.brewing"),
    CARTOGRAPHY_TABLE("container.cartography_table"),
    CHEST("container.chest"),
    CHESTDOUBLE("container.chestDouble"),
    CRAFTING("container.crafting"),
    CREATIVE("container.creative"),
    DISPENSER("container.dispenser"),
    DROPPER("container.dropper"),
    ENCHANT("container.enchant"),
    ENCHANT_CLUE("container.enchant.clue"),
    ENCHANT_LAPIS_MANY("container.enchant.lapis.many"),
    ENCHANT_LAPIS_ONE("container.enchant.lapis.one"),
    ENCHANT_LEVEL_MANY("container.enchant.level.many"),
    ENCHANT_LEVEL_ONE("container.enchant.level.one"),
    ENCHANT_LEVEL_REQUIREMENT("container.enchant.level.requirement"),
    ENDERCHEST("container.enderchest"),
    FURNACE("container.furnace"),
    GRINDSTONE_TITLE("container.grindstone_title"),
    HOPPER("container.hopper"),
    INVENTORY("container.inventory"),
    ISLOCKED("container.isLocked"),
    LECTERN("container.lectern"),
    LOOM("container.loom"),
    REPAIR("container.repair"),
    REPAIR_COST("container.repair.cost"),
    REPAIR_EXPENSIVE("container.repair.expensive"),
    SHULKERBOX("container.shulkerBox"),
    SHULKERBOX_MORE("container.shulkerBox.more"),
    SMOKER("container.smoker"),
    SPECTATORCANTOPEN("container.spectatorCantOpen"),
    STONECUTTER("container.stonecutter"),
    UPGRADE("container.upgrade"),
    UPGRADE_ERROR_TOOLTIP("container.upgrade.error_tooltip"),
    UPGRADE_MISSING_TEMPLATE_TOOLTIP("container.upgrade.missing_template_tooltip");
    
    private final String key;
    
    Container(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
