package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum AdvMode implements Key {
    ALLENTITIES("advMode.allEntities"),
    ALLPLAYERS("advMode.allPlayers"),
    COMMAND("advMode.command"),
    MODE("advMode.mode"),
    MODE_AUTO("advMode.mode.auto"),
    MODE_AUTOEXEC_BAT("advMode.mode.autoexec.bat"),
    MODE_CONDITIONAL("advMode.mode.conditional"),
    MODE_REDSTONE("advMode.mode.redstone"),
    MODE_REDSTONETRIGGERED("advMode.mode.redstoneTriggered"),
    MODE_SEQUENCE("advMode.mode.sequence"),
    MODE_UNCONDITIONAL("advMode.mode.unconditional"),
    NEARESTPLAYER("advMode.nearestPlayer"),
    NOTALLOWED("advMode.notAllowed"),
    NOTENABLED("advMode.notEnabled"),
    PREVIOUSOUTPUT("advMode.previousOutput"),
    RANDOMPLAYER("advMode.randomPlayer"),
    SELF("advMode.self"),
    SETCOMMAND("advMode.setCommand"),
    SETCOMMAND_SUCCESS("advMode.setCommand.success"),
    TRACKOUTPUT("advMode.trackOutput"),
    TRIGGERING("advMode.triggering"),
    TYPE("advMode.type");

    private final String key;

    AdvMode(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
