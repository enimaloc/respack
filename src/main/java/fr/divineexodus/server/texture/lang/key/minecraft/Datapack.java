package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum Datapack implements Key {
    BUNDLE_DESCRIPTION("dataPack.bundle.description"),
    BUNDLE_NAME("dataPack.bundle.name"),
    TITLE("dataPack.title"),
    UPDATE_1_20_DESCRIPTION("dataPack.update_1_20.description"),
    UPDATE_1_20_NAME("dataPack.update_1_20.name"),
    VALIDATION_BACK("dataPack.validation.back"),
    VALIDATION_FAILED("dataPack.validation.failed"),
    VALIDATION_RESET("dataPack.validation.reset"),
    VALIDATION_WORKING("dataPack.validation.working"),
    VANILLA_DESCRIPTION("dataPack.vanilla.description"),
    VANILLA_NAME("dataPack.vanilla.name");
    
    private final String key;
    
    Datapack(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
