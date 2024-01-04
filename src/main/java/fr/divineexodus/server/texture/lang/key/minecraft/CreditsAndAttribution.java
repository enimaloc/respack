package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum CreditsAndAttribution implements Key {
        BUTTON_ATTRIBUTION("credits_and_attribution.button.attribution"),
        BUTTON_CREDITS("credits_and_attribution.button.credits"),
        BUTTON_LICENSES("credits_and_attribution.button.licenses"),
        SCREEN_TITLE("credits_and_attribution.screen.title");
    
    private final String key;
    
    CreditsAndAttribution(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
