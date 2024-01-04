package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Color implements Key {
         MINECRAFT_BLACK("color.minecraft.black"),
        MINECRAFT_BLUE("color.minecraft.blue"),
        MINECRAFT_BROWN("color.minecraft.brown"),
        MINECRAFT_CYAN("color.minecraft.cyan"),
        MINECRAFT_GRAY("color.minecraft.gray"),
        MINECRAFT_GREEN("color.minecraft.green"),
        MINECRAFT_LIGHT_BLUE("color.minecraft.light_blue"),
        MINECRAFT_LIGHT_GRAY("color.minecraft.light_gray"),
        MINECRAFT_LIME("color.minecraft.lime"),
        MINECRAFT_MAGENTA("color.minecraft.magenta"),
        MINECRAFT_ORANGE("color.minecraft.orange"),
        MINECRAFT_PINK("color.minecraft.pink"),
        MINECRAFT_PURPLE("color.minecraft.purple"),
        MINECRAFT_RED("color.minecraft.red"),
        MINECRAFT_WHITE("color.minecraft.white"),
        MINECRAFT_YELLOW("color.minecraft.yellow");

    private final String key;

    Color(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}