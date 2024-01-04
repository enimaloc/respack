package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum Effect implements Key {
    DURATION_INFINITE("effect.duration.infinite"),
    MINECRAFT_ABSORPTION("effect.minecraft.absorption"),
    MINECRAFT_BAD_OMEN("effect.minecraft.bad_omen"),
    MINECRAFT_BLINDNESS("effect.minecraft.blindness"),
    MINECRAFT_CONDUIT_POWER("effect.minecraft.conduit_power"),
    MINECRAFT_DARKNESS("effect.minecraft.darkness"),
    MINECRAFT_DOLPHINS_GRACE("effect.minecraft.dolphins_grace"),
    MINECRAFT_FIRE_RESISTANCE("effect.minecraft.fire_resistance"),
    MINECRAFT_GLOWING("effect.minecraft.glowing"),
    MINECRAFT_HASTE("effect.minecraft.haste"),
    MINECRAFT_HEALTH_BOOST("effect.minecraft.health_boost"),
    MINECRAFT_HERO_OF_THE_VILLAGE("effect.minecraft.hero_of_the_village"),
    MINECRAFT_HUNGER("effect.minecraft.hunger"),
    MINECRAFT_INSTANT_DAMAGE("effect.minecraft.instant_damage"),
    MINECRAFT_INSTANT_HEALTH("effect.minecraft.instant_health"),
    MINECRAFT_INVISIBILITY("effect.minecraft.invisibility"),
    MINECRAFT_JUMP_BOOST("effect.minecraft.jump_boost"),
    MINECRAFT_LEVITATION("effect.minecraft.levitation"),
    MINECRAFT_LUCK("effect.minecraft.luck"),
    MINECRAFT_MINING_FATIGUE("effect.minecraft.mining_fatigue"),
    MINECRAFT_NAUSEA("effect.minecraft.nausea"),
    MINECRAFT_NIGHT_VISION("effect.minecraft.night_vision"),
    MINECRAFT_POISON("effect.minecraft.poison"),
    MINECRAFT_REGENERATION("effect.minecraft.regeneration"),
    MINECRAFT_RESISTANCE("effect.minecraft.resistance"),
    MINECRAFT_SATURATION("effect.minecraft.saturation"),
    MINECRAFT_SLOW_FALLING("effect.minecraft.slow_falling"),
    MINECRAFT_SLOWNESS("effect.minecraft.slowness"),
    MINECRAFT_SPEED("effect.minecraft.speed"),
    MINECRAFT_STRENGTH("effect.minecraft.strength"),
    MINECRAFT_UNLUCK("effect.minecraft.unluck"),
    MINECRAFT_WATER_BREATHING("effect.minecraft.water_breathing"),
    MINECRAFT_WEAKNESS("effect.minecraft.weakness"),
    MINECRAFT_WITHER("effect.minecraft.wither"),
    NONE("effect.none");

    private final String key;

    Effect(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
