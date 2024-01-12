package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Instrument implements Key {
    MINECRAFT_ADMIRE_GOAT_HORN("instrument.minecraft.admire_goat_horn"),
    MINECRAFT_CALL_GOAT_HORN("instrument.minecraft.call_goat_horn"),
    MINECRAFT_DREAM_GOAT_HORN("instrument.minecraft.dream_goat_horn"),
    MINECRAFT_FEEL_GOAT_HORN("instrument.minecraft.feel_goat_horn"),
    MINECRAFT_PONDER_GOAT_HORN("instrument.minecraft.ponder_goat_horn"),
    MINECRAFT_SEEK_GOAT_HORN("instrument.minecraft.seek_goat_horn"),
    MINECRAFT_SING_GOAT_HORN("instrument.minecraft.sing_goat_horn"),
    MINECRAFT_YEARN_GOAT_HORN("instrument.minecraft.yearn_goat_horn");
    
    private final String key;
    
    Instrument(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
