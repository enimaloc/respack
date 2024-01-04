package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Translation implements Key {
    TEST_ARGS("translation.test.args"),
    TEST_COMPLEX("translation.test.complex"),
    TEST_ESCAPE("translation.test.escape"),
    TEST_INVALID("translation.test.invalid"),
    TEST_INVALID2("translation.test.invalid2"),
    TEST_NONE("translation.test.none"),
    TEST_WORLD("translation.test.world");
    
    private final String key;
    
    Translation(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
