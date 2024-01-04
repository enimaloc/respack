package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum EditGamerule implements Key {
    DEFAULT("editGamerule.default"),
    TITLE("editGamerule.title");

    private final String key;

    EditGamerule(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
