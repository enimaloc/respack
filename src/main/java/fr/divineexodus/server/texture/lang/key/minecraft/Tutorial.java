package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum Tutorial implements Key {
     BUNDLEINSERT_DESCRIPTION("tutorial.bundleInsert.description"),
     BUNDLEINSERT_TITLE("tutorial.bundleInsert.title"),
     CRAFT_PLANKS_DESCRIPTION("tutorial.craft_planks.description"),
     CRAFT_PLANKS_TITLE("tutorial.craft_planks.title"),
     FIND_TREE_DESCRIPTION("tutorial.find_tree.description"),
     FIND_TREE_TITLE("tutorial.find_tree.title"),
     LOOK_DESCRIPTION("tutorial.look.description"),
     LOOK_TITLE("tutorial.look.title"),
     MOVE_DESCRIPTION("tutorial.move.description"),
     MOVE_TITLE("tutorial.move.title"),
     OPEN_INVENTORY_DESCRIPTION("tutorial.open_inventory.description"),
     OPEN_INVENTORY_TITLE("tutorial.open_inventory.title"),
     PUNCH_TREE_DESCRIPTION("tutorial.punch_tree.description"),
     PUNCH_TREE_TITLE("tutorial.punch_tree.title"),
     SOCIALINTERACTIONS_DESCRIPTION("tutorial.socialInteractions.description"),
     SOCIALINTERACTIONS_TITLE("tutorial.socialInteractions.title");
    
    private final String key;
    
    Tutorial(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
