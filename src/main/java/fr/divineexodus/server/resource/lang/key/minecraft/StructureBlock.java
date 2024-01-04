package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum StructureBlock implements Key {
    BUTTON_DETECT_SIZE("structure_block.button.detect_size"),
    BUTTON_LOAD("structure_block.button.load"),
    BUTTON_SAVE("structure_block.button.save"),
    CUSTOM_DATA("structure_block.custom_data"),
    DETECT_SIZE("structure_block.detect_size"),
    HOVER_CORNER("structure_block.hover.corner"),
    HOVER_DATA("structure_block.hover.data"),
    HOVER_LOAD("structure_block.hover.load"),
    HOVER_SAVE("structure_block.hover.save"),
    INCLUDE_ENTITIES("structure_block.include_entities"),
    INTEGRITY("structure_block.integrity"),
    INTEGRITY_INTEGRITY("structure_block.integrity.integrity"),
    INTEGRITY_SEED("structure_block.integrity.seed"),
    INVALID_STRUCTURE_NAME("structure_block.invalid_structure_name"),
    LOAD_NOT_FOUND("structure_block.load_not_found"),
    LOAD_PREPARE("structure_block.load_prepare"),
    LOAD_SUCCESS("structure_block.load_success"),
    MODE_INFO_CORNER("structure_block.mode_info.corner"),
    MODE_INFO_DATA("structure_block.mode_info.data"),
    MODE_INFO_LOAD("structure_block.mode_info.load"),
    MODE_INFO_SAVE("structure_block.mode_info.save"),
    MODE_CORNER("structure_block.mode.corner"),
    MODE_DATA("structure_block.mode.data"),
    MODE_LOAD("structure_block.mode.load"),
    MODE_SAVE("structure_block.mode.save"),
    POSITION("structure_block.position"),
    POSITION_X("structure_block.position.x"),
    POSITION_Y("structure_block.position.y"),
    POSITION_Z("structure_block.position.z"),
    SAVE_FAILURE("structure_block.save_failure"),
    SAVE_SUCCESS("structure_block.save_success"),
    SHOW_AIR("structure_block.show_air"),
    SHOW_BOUNDINGBOX("structure_block.show_boundingbox"),
    SIZE("structure_block.size"),
    SIZE_FAILURE("structure_block.size_failure"),
    SIZE_SUCCESS("structure_block.size_success"),
    SIZE_X("structure_block.size.x"),
    SIZE_Y("structure_block.size.y"),
    SIZE_Z("structure_block.size.z"),
    STRUCTURE_NAME("structure_block.structure_name");
    
    private final String key;
    
    StructureBlock(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
