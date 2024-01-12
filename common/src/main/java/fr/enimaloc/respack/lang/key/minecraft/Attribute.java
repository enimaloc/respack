package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Attribute implements Key {
    MODIFIER_EQUALS_0("attribute.modifier.equals.0"),
    MODIFIER_EQUALS_1("attribute.modifier.equals.1"),
    MODIFIER_EQUALS_2("attribute.modifier.equals.2"),
    MODIFIER_PLUS_0("attribute.modifier.plus.0"),
    MODIFIER_PLUS_1("attribute.modifier.plus.1"),
    MODIFIER_PLUS_2("attribute.modifier.plus.2"),
    MODIFIER_TAKE_0("attribute.modifier.take.0"),
    MODIFIER_TAKE_1("attribute.modifier.take.1"),
    MODIFIER_TAKE_2("attribute.modifier.take.2"),
    NAME_GENERIC_ARMOR("attribute.name.generic.armor"),
    NAME_GENERIC_ARMOR_TOUGHNESS("attribute.name.generic.armor_toughness"),
    NAME_GENERIC_ATTACK_DAMAGE("attribute.name.generic.attack_damage"),
    NAME_GENERIC_ATTACK_KNOCKBACK("attribute.name.generic.attack_knockback"),
    NAME_GENERIC_ATTACK_SPEED("attribute.name.generic.attack_speed"),
    NAME_GENERIC_FLYING_SPEED("attribute.name.generic.flying_speed"),
    NAME_GENERIC_FOLLOW_RANGE("attribute.name.generic.follow_range"),
    NAME_GENERIC_KNOCKBACK_RESISTANCE("attribute.name.generic.knockback_resistance"),
    NAME_GENERIC_LUCK("attribute.name.generic.luck"),
    NAME_GENERIC_MAX_HEALTH("attribute.name.generic.max_health"),
    NAME_GENERIC_MOVEMENT_SPEED("attribute.name.generic.movement_speed"),
    NAME_HORSE_JUMP_STRENGTH("attribute.name.horse.jump_strength"),
    NAME_ZOMBIE_SPAWN_REINFORCEMENTS("attribute.name.zombie.spawn_reinforcements");

    private final String key;

    Attribute(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
