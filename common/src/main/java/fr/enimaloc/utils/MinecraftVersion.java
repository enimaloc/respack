package fr.enimaloc.utils;

import org.jetbrains.annotations.NotNull;

public record MinecraftVersion(int major, int minor, int patch) implements Comparable<MinecraftVersion> {
    // Used in ResourcePackMeta.java
    public static final MinecraftVersion V1_6_1 = new MinecraftVersion(1, 6, 1);
    public static final MinecraftVersion V1_8_9 = new MinecraftVersion(1, 8, 9);
    public static final MinecraftVersion V1_9 = new MinecraftVersion(1, 9);
    public static final MinecraftVersion V1_10_2 = new MinecraftVersion(1, 10, 2);
    public static final MinecraftVersion V1_11 = new MinecraftVersion(1, 11);
    public static final MinecraftVersion V1_12_2 = new MinecraftVersion(1, 12, 2);
    public static final MinecraftVersion V1_13 = new MinecraftVersion(1, 13);
    public static final MinecraftVersion V1_14_4 = new MinecraftVersion(1, 14, 4);
    public static final MinecraftVersion V1_15 = new MinecraftVersion(1, 15);
    public static final MinecraftVersion V1_16_1 = new MinecraftVersion(1, 16, 1);
    public static final MinecraftVersion V1_16_2 = new MinecraftVersion(1, 16, 2);
    public static final MinecraftVersion V1_16_5 = new MinecraftVersion(1, 16, 5);
    public static final MinecraftVersion V1_17 = new MinecraftVersion(1, 17);
    public static final MinecraftVersion V1_17_1 = new MinecraftVersion(1, 17, 1);
    public static final MinecraftVersion V1_18 = new MinecraftVersion(1, 18);
    public static final MinecraftVersion V1_18_2 = new MinecraftVersion(1, 18, 2);
    public static final MinecraftVersion V1_19 = new MinecraftVersion(1, 19);
    public static final MinecraftVersion V1_19_2 = new MinecraftVersion(1, 19, 2);
    public static final MinecraftVersion V1_19_3 = new MinecraftVersion(1, 19, 3);
    public static final MinecraftVersion V1_19_4 = new MinecraftVersion(1, 19, 4);
    public static final MinecraftVersion V1_20 = new MinecraftVersion(1, 20);
    public static final MinecraftVersion V1_20_1 = new MinecraftVersion(1, 20, 1);
    public static final MinecraftVersion V1_20_2 = new MinecraftVersion(1, 20, 2);
    public static final MinecraftVersion V1_20_3 = new MinecraftVersion(1, 20, 3);


    public MinecraftVersion(String version) {
        this(version.split("\\."));
    }

    public MinecraftVersion(String[] version) {
        this(
                version.length > 0 ? Integer.parseInt(version[0]) : 0,
                version.length > 1 ? Integer.parseInt(version[1]) : 0,
                version.length > 2 ? Integer.parseInt(version[2]) : 0
        );
    }

    public MinecraftVersion(int major) {
        this(major, 0);
    }

    public MinecraftVersion(int major, int minor) {
        this(major, minor, 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MinecraftVersion version) {
            return major == version.major && minor == version.minor && patch == version.patch;
        }
        return false;
    }

    @Override
    public int compareTo(@NotNull MinecraftVersion o) {
        if (major != o.major) {
            return major - o.major;
        }
        if (minor != o.minor) {
            return minor - o.minor;
        }
        return patch - o.patch;
    }

    public boolean isBefore(MinecraftVersion version) {
        return compareTo(version) < 0;
    }

    public boolean isAfter(MinecraftVersion version) {
        return compareTo(version) > 0;
    }

    public boolean isBeforeOrEqual(MinecraftVersion version) {
        return compareTo(version) <= 0;
    }

    public boolean isAfterOrEqual(MinecraftVersion version) {
        return compareTo(version) >= 0;
    }

    public boolean isBetween(MinecraftVersion min, MinecraftVersion max) {
        return isAfterOrEqual(min) && isBeforeOrEqual(max);
    }
}
