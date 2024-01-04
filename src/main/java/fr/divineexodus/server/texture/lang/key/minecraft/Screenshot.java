package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key; 

public enum Screenshot implements Key {
    FAILURE("screenshot.failure"),
    SUCCESS("screenshot.success");

    private final String key;

    Screenshot(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
