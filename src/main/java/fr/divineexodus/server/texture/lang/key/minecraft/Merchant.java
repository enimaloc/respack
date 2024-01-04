package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key; 

public enum Merchant implements Key {
    CURRENT_LEVEL("merchant.current_level"),
    DEPRECATED("merchant.deprecated"),
    LEVEL_1("merchant.level.1"),
    LEVEL_2("merchant.level.2"),
    LEVEL_3("merchant.level.3"),
    LEVEL_4("merchant.level.4"),
    LEVEL_5("merchant.level.5"),
    NEXT_LEVEL("merchant.next_level"),
    TITLE("merchant.title"),
    TRADES("merchant.trades"),;
    
    private final String key;
    
    Merchant(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
