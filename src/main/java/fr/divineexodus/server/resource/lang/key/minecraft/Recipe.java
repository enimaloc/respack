package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

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
