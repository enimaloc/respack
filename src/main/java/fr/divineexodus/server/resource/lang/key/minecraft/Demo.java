package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Demo implements Key {
    DAY_1("demo.day.1"),
    DAY_2("demo.day.2"),
    DAY_3("demo.day.3"),
    DAY_4("demo.day.4"),
    DAY_5("demo.day.5"),
    DAY_6("demo.day.6"),
    DAY_WARNING("demo.day.warning"),
    DEMOEXPIRED("demo.demoExpired"),
    HELP_BUY("demo.help.buy"),
    HELP_FULLWRAPPED("demo.help.fullWrapped"),
    HELP_INVENTORY("demo.help.inventory"),
    HELP_JUMP("demo.help.jump"),
    HELP_LATER("demo.help.later"),
    HELP_MOVEMENT("demo.help.movement"),
    HELP_MOVEMENTMOUSE("demo.help.movementMouse"),
    HELP_MOVEMENTSHORT("demo.help.movementShort"),
    HELP_TITLE("demo.help.title"),
    REMAININGTIME("demo.remainingTime"),
    REMINDER("demo.reminder");
    
    private final String key;
    
    Demo(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
