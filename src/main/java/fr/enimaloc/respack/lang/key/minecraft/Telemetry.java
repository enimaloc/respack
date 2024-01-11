package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Telemetry implements Key {
    EVENT_ADVANCEMENT_MADE_DESCRIPTION("telemetry.event.advancement_made.description"),
    EVENT_ADVANCEMENT_MADE_TITLE("telemetry.event.advancement_made.title"),
    EVENT_GAME_LOAD_TIMES_DESCRIPTION("telemetry.event.game_load_times.description"),
    EVENT_GAME_LOAD_TIMES_TITLE("telemetry.event.game_load_times.title"),
    EVENT_OPTIONAL("telemetry.event.optional"),
    EVENT_PERFORMANCE_METRICS_DESCRIPTION("telemetry.event.performance_metrics.description"),
    EVENT_PERFORMANCE_METRICS_TITLE("telemetry.event.performance_metrics.title"),
    EVENT_REQUIRED("telemetry.event.required"),
    EVENT_WORLD_LOAD_TIMES_DESCRIPTION("telemetry.event.world_load_times.description"),
    EVENT_WORLD_LOAD_TIMES_TITLE("telemetry.event.world_load_times.title"),
    EVENT_WORLD_LOADED_DESCRIPTION("telemetry.event.world_loaded.description"),
    EVENT_WORLD_LOADED_TITLE("telemetry.event.world_loaded.title"),
    EVENT_WORLD_UNLOADED_DESCRIPTION("telemetry.event.world_unloaded.description"),
    EVENT_WORLD_UNLOADED_TITLE("telemetry.event.world_unloaded.title"),
    PROPERTY_ADVANCEMENT_GAME_TIME_TITLE("telemetry.property.advancement_game_time.title"),
    PROPERTY_ADVANCEMENT_ID_TITLE("telemetry.property.advancement_id.title"),
    PROPERTY_CLIENT_ID_TITLE("telemetry.property.client_id.title"),
    PROPERTY_CLIENT_MODDED_TITLE("telemetry.property.client_modded.title"),
    PROPERTY_DEDICATED_MEMORY_KB_TITLE("telemetry.property.dedicated_memory_kb.title"),
    PROPERTY_EVENT_TIMESTAMP_UTC_TITLE("telemetry.property.event_timestamp_utc.title"),
    PROPERTY_FRAME_RATE_SAMPLES_TITLE("telemetry.property.frame_rate_samples.title"),
    PROPERTY_GAME_MODE_TITLE("telemetry.property.game_mode.title"),
    PROPERTY_GAME_VERSION_TITLE("telemetry.property.game_version.title"),
    PROPERTY_LAUNCHER_NAME_TITLE("telemetry.property.launcher_name.title"),
    PROPERTY_LOAD_TIME_BOOTSTRAP_MS_TITLE("telemetry.property.load_time_bootstrap_ms.title"),
    PROPERTY_LOAD_TIME_LOADING_OVERLAY_MS_TITLE("telemetry.property.load_time_loading_overlay_ms.title"),
    PROPERTY_LOAD_TIME_PRE_WINDOW_MS_TITLE("telemetry.property.load_time_pre_window_ms.title"),
    PROPERTY_LOAD_TIME_TOTAL_TIME_MS_TITLE("telemetry.property.load_time_total_time_ms.title"),
    PROPERTY_MINECRAFT_SESSION_ID_TITLE("telemetry.property.minecraft_session_id.title"),
    PROPERTY_NEW_WORLD_TITLE("telemetry.property.new_world.title"),
    PROPERTY_NUMBER_OF_SAMPLES_TITLE("telemetry.property.number_of_samples.title"),
    PROPERTY_OPERATING_SYSTEM_TITLE("telemetry.property.operating_system.title"),
    PROPERTY_OPT_IN_TITLE("telemetry.property.opt_in.title"),
    PROPERTY_PLATFORM_TITLE("telemetry.property.platform.title"),
    PROPERTY_REALMS_MAP_CONTENT_TITLE("telemetry.property.realms_map_content.title"),
    PROPERTY_RENDER_DISTANCE_TITLE("telemetry.property.render_distance.title"),
    PROPERTY_RENDER_TIME_SAMPLES_TITLE("telemetry.property.render_time_samples.title"),
    PROPERTY_SECONDS_SINCE_LOAD_TITLE("telemetry.property.seconds_since_load.title"),
    PROPERTY_SERVER_MODDED_TITLE("telemetry.property.server_modded.title"),
    PROPERTY_SERVER_TYPE_TITLE("telemetry.property.server_type.title"),
    PROPERTY_TICKS_SINCE_LOAD_TITLE("telemetry.property.ticks_since_load.title"),
    PROPERTY_USED_MEMORY_SAMPLES_TITLE("telemetry.property.used_memory_samples.title"),
    PROPERTY_USER_ID_TITLE("telemetry.property.user_id.title"),
    PROPERTY_WORLD_LOAD_TIME_MS_TITLE("telemetry.property.world_load_time_ms.title"),
    PROPERTY_WORLD_SESSION_ID_TITLE("telemetry.property.world_session_id.title");
    
    private final String key;
    
    Telemetry(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
