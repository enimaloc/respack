package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Recipe implements Key {
    NOTFOUND("recipe.notFound"),
    TOAST_DESCRIPTION("recipe.toast.description"),
    TOAST_TITLE("recipe.toast.title");

    private final String key;

    Recipe(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
