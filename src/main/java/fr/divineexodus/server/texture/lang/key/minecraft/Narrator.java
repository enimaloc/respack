package fr.divineexodus.server.texture.lang.key.minecraft;

import fr.divineexodus.server.texture.lang.key.Key; 

public enum Narrator implements Key {
    BUTTON_ACCESSIBILITY("narrator.button.accessibility"),
    BUTTON_DIFFICULTY_LOCK("narrator.button.difficulty_lock"),
    BUTTON_DIFFICULTY_LOCK_LOCKED("narrator.button.difficulty_lock.locked"),
    BUTTON_DIFFICULTY_LOCK_UNLOCKED("narrator.button.difficulty_lock.unlocked"),
    BUTTON_LANGUAGE("narrator.button.language"),
    CONTROLS_BOUND("narrator.controls.bound"),
    CONTROLS_RESET("narrator.controls.reset"),
    CONTROLS_UNBOUND("narrator.controls.unbound"),
    JOINING("narrator.joining"),
    LOADING("narrator.loading"),
    LOADING_DONE("narrator.loading.done"),
    POSITION_LIST("narrator.position.list"),
    POSITION_OBJECT_LIST("narrator.position.object_list"),
    POSITION_SCREEN("narrator.position.screen"),
    POSITION_TAB("narrator.position.tab"),
    READY_TO_PLAY("narrator.ready_to_play"),
    SCREEN_TITLE("narrator.screen.title"),
    SCREEN_USAGE("narrator.screen.usage"),
    SELECT("narrator.select"),
    SELECT_WORLD("narrator.select.world"),
    SELECT_WORLD_INFO("narrator.select.world_info"),
    TOAST_DISABLED("narrator.toast.disabled"),
    TOAST_ENABLED("narrator.toast.enabled");

    private final String key;

    Narrator(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
