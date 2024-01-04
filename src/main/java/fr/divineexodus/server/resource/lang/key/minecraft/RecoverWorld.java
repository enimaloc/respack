package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum RecoverWorld implements Key {
    BUG_TRACKER("recover_world.bug_tracker"),
    BUTTON("recover_world.button"),
    DONE_FAILED("recover_world.done.failed"),
    DONE_SUCCESS("recover_world.done.success"),
    DONE_TITLE("recover_world.done.title"),
    ISSUE_MISSING_FILE("recover_world.issue.missing_file"),
    ISSUE_NONE("recover_world.issue.none"),
    MESSAGE("recover_world.message"),
    NO_FALLBACK("recover_world.no_fallback"),
    RESTORE("recover_world.restore"),
    RESTORING("recover_world.restoring"),
    STATE_ENTRY("recover_world.state_entry"),
    STATE_ENTRY_UNKNOWN("recover_world.state_entry.unknown"),
    TITLE("recover_world.title"),
    WARNING("recover_world.warning");

    private final String key;

    RecoverWorld(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
