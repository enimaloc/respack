package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum OptimizeWorld implements Key {
    CONFIRM_DESCRIPTION("optimizeWorld.confirm.description"),
    CONFIRM_TITLE("optimizeWorld.confirm.title"),
    INFO_CONVERTED("optimizeWorld.info.converted"),
    INFO_SKIPPED("optimizeWorld.info.skipped"),
    INFO_TOTAL("optimizeWorld.info.total"),
    STAGE_COUNTING("optimizeWorld.stage.counting"),
    STAGE_FAILED("optimizeWorld.stage.failed"),
    STAGE_FINISHED("optimizeWorld.stage.finished"),
    STAGE_UPGRADING("optimizeWorld.stage.upgrading"),
    TITLE("optimizeWorld.title");

    private final String key;

    OptimizeWorld(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
