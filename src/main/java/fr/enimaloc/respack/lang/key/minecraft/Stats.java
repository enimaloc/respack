package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Stats implements Key {
    TOOLTIP_TYPE_STATISTIC("stats.tooltip.type.statistic");

    private final String key;

    Stats(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
