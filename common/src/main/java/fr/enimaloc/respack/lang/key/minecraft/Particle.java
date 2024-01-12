package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Particle implements Key {
    NOTFOUND("particle.notFound");

    private final String key;

    Particle(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
