package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum TelemetryInfo implements Key {
    BUTTON_GIVE_FEEDBACK("telemetry_info.button.give_feedback"),
    BUTTON_SHOW_DATA("telemetry_info.button.show_data"),
    PROPERTY_TITLE("telemetry_info.property_title"),
    SCREEN_DESCRIPTION("telemetry_info.screen.description"),
    SCREEN_TITLE("telemetry_info.screen.title");

    private final String key;
    
    TelemetryInfo(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
