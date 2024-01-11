package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

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
