package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Debug implements Key {
    ADVANCED_TOOLTIPS_HELP("debug.advanced_tooltips.help"),
    ADVANCED_TOOLTIPS_OFF("debug.advanced_tooltips.off"),
    ADVANCED_TOOLTIPS_ON("debug.advanced_tooltips.on"),
    CHUNK_BOUNDARIES_HELP("debug.chunk_boundaries.help"),
    CHUNK_BOUNDARIES_OFF("debug.chunk_boundaries.off"),
    CHUNK_BOUNDARIES_ON("debug.chunk_boundaries.on"),
    CLEAR_CHAT_HELP("debug.clear_chat.help"),
    COPY_LOCATION_HELP("debug.copy_location.help"),
    COPY_LOCATION_MESSAGE("debug.copy_location.message"),
    CRASH_MESSAGE("debug.crash.message"),
    CRASH_WARNING("debug.crash.warning"),
    CREATIVE_SPECTATOR_ERROR("debug.creative_spectator.error"),
    CREATIVE_SPECTATOR_HELP("debug.creative_spectator.help"),
    DUMP_DYNAMIC_TEXTURES("debug.dump_dynamic_textures"),
    DUMP_DYNAMIC_TEXTURES_HELP("debug.dump_dynamic_textures.help"),
    GAMEMODES_ERROR("debug.gamemodes.error"),
    GAMEMODES_HELP("debug.gamemodes.help"),
    GAMEMODES_PRESS_F4("debug.gamemodes.press_f4"),
    GAMEMODES_SELECT_NEXT("debug.gamemodes.select_next"),
    HELP_HELP("debug.help.help"),
    HELP_MESSAGE("debug.help.message"),
    INSPECT_CLIENT_BLOCK("debug.inspect.client.block"),
    INSPECT_CLIENT_ENTITY("debug.inspect.client.entity"),
    INSPECT_HELP("debug.inspect.help"),
    INSPECT_SERVER_BLOCK("debug.inspect.server.block"),
    INSPECT_SERVER_ENTITY("debug.inspect.server.entity"),
    PAUSE_FOCUS_HELP("debug.pause_focus.help"),
    PAUSE_FOCUS_OFF("debug.pause_focus.off"),
    PAUSE_FOCUS_ON("debug.pause_focus.on"),
    PAUSE_HELP("debug.pause.help"),
    PREFIX("debug.prefix"),
    PROFILING_HELP("debug.profiling.help"),
    PROFILING_START("debug.profiling.start"),
    PROFILING_STOP("debug.profiling.stop"),
    RELOAD_CHUNKS_HELP("debug.reload_chunks.help"),
    RELOAD_CHUNKS_MESSAGE("debug.reload_chunks.message"),
    RELOAD_RESOURCEPACKS_HELP("debug.reload_resourcepacks.help"),
    RELOAD_RESOURCEPACKS_MESSAGE("debug.reload_resourcepacks.message"),
    SHOW_HITBOXES_HELP("debug.show_hitboxes.help"),
    SHOW_HITBOXES_OFF("debug.show_hitboxes.off"),
    SHOW_HITBOXES_ON("debug.show_hitboxes.on");
    
    private final String key;
    
    Debug(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
