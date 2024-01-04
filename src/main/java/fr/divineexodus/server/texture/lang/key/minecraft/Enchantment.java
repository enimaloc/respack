package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key;

public enum Enchantment implements Key {
    LEVEL_1("enchantment.level.1"),
    LEVEL_2("enchantment.level.2"),
    LEVEL_3("enchantment.level.3"),
    LEVEL_4("enchantment.level.4"),
    LEVEL_5("enchantment.level.5"),
    LEVEL_6("enchantment.level.6"),
    LEVEL_7("enchantment.level.7"),
    LEVEL_8("enchantment.level.8"),
    LEVEL_9("enchantment.level.9"),
    LEVEL_10("enchantment.level.10"),
    MINECRAFT_AQUA_AFFINITY("enchantment.minecraft.aqua_affinity"),
    MINECRAFT_BANE_OF_ARTHROPODS("enchantment.minecraft.bane_of_arthropods"),
    MINECRAFT_BINDING_CURSE("enchantment.minecraft.binding_curse"),
    MINECRAFT_BLAST_PROTECTION("enchantment.minecraft.blast_protection"),
    MINECRAFT_CHANNELING("enchantment.minecraft.channeling"),
    MINECRAFT_DEPTH_STRIDER("enchantment.minecraft.depth_strider"),
    MINECRAFT_EFFICIENCY("enchantment.minecraft.efficiency"),
    MINECRAFT_FEATHER_FALLING("enchantment.minecraft.feather_falling"),
    MINECRAFT_FIRE_ASPECT("enchantment.minecraft.fire_aspect"),
    MINECRAFT_FIRE_PROTECTION("enchantment.minecraft.fire_protection"),
    MINECRAFT_FLAME("enchantment.minecraft.flame"),
    MINECRAFT_FORTUNE("enchantment.minecraft.fortune"),
    MINECRAFT_FROST_WALKER("enchantment.minecraft.frost_walker"),
    MINECRAFT_IMPALING("enchantment.minecraft.impaling"),
    MINECRAFT_INFINITY("enchantment.minecraft.infinity"),
    MINECRAFT_KNOCKBACK("enchantment.minecraft.knockback"),
    MINECRAFT_LOOTING("enchantment.minecraft.looting"),
    MINECRAFT_LOYALTY("enchantment.minecraft.loyalty"),
    MINECRAFT_LUCK_OF_THE_SEA("enchantment.minecraft.luck_of_the_sea"),
    MINECRAFT_LURE("enchantment.minecraft.lure"),
    MINECRAFT_MENDING("enchantment.minecraft.mending"),
    MINECRAFT_MULTISHOT("enchantment.minecraft.multishot"),
    MINECRAFT_PIERCING("enchantment.minecraft.piercing"),
    MINECRAFT_POWER("enchantment.minecraft.power"),
    MINECRAFT_PROJECTILE_PROTECTION("enchantment.minecraft.projectile_protection"),
    MINECRAFT_PROTECTION("enchantment.minecraft.protection"),
    MINECRAFT_PUNCH("enchantment.minecraft.punch"),
    MINECRAFT_QUICK_CHARGE("enchantment.minecraft.quick_charge"),
    MINECRAFT_RESPIRATION("enchantment.minecraft.respiration"),
    MINECRAFT_RIPTIDE("enchantment.minecraft.riptide"),
    MINECRAFT_SHARPNESS("enchantment.minecraft.sharpness"),
    MINECRAFT_SILK_TOUCH("enchantment.minecraft.silk_touch"),
    MINECRAFT_SMITE("enchantment.minecraft.smite"),
    MINECRAFT_SOUL_SPEED("enchantment.minecraft.soul_speed"),
    MINECRAFT_SWEEPING("enchantment.minecraft.sweeping"),
    MINECRAFT_SWIFT_SNEAK("enchantment.minecraft.swift_sneak"),
    MINECRAFT_THORNS("enchantment.minecraft.thorns"),
    MINECRAFT_UNBREAKING("enchantment.minecraft.unbreaking"),
    MINECRAFT_VANISHING_CURSE("enchantment.minecraft.vanishing_curse");

    private final String key;

    Enchantment(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
