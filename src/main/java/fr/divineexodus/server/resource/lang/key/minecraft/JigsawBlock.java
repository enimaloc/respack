package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum JigsawBlock implements Key {
    FINAL_STATE("jigsaw_block.final_state"),
    GENERATE("jigsaw_block.generate"),
    JOINT_LABEL("jigsaw_block.joint_label"),
    JOINT_ALIGNED("jigsaw_block.joint.aligned"),
    JOINT_ROLLABLE("jigsaw_block.joint.rollable"),
    KEEP_JIGSAWS("jigsaw_block.keep_jigsaws"),
    LEVELS("jigsaw_block.levels"),
    NAME("jigsaw_block.name"),
    POOL("jigsaw_block.pool"),
    TARGET("jigsaw_block.target");
    
    private final String key;
    
    JigsawBlock(final String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return this.key;
    }
}
