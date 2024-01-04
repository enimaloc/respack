package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key; 

public enum Potion implements Key {
    POTENCY_0("potion.potency.0"),
    POTENCY_1("potion.potency.1"),
    POTENCY_2("potion.potency.2"),
    POTENCY_3("potion.potency.3"),
    POTENCY_4("potion.potency.4"),
    POTENCY_5("potion.potency.5"),
    WHENDRANK("potion.whenDrank"),
    WITHAMPLIFIER("potion.withAmplifier"),
    WITHDURATION("potion.withDuration");

    private final String key;

    Potion(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
