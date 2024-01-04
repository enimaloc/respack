package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum Parsing implements Key {
    BOOL_EXPECTED("parsing.bool.expected"),
    BOOL_INVALID("parsing.bool.invalid"),
    DOUBLE_EXPECTED("parsing.double.expected"),
    DOUBLE_INVALID("parsing.double.invalid"),
    EXPECTED("parsing.expected"),
    FLOAT_EXPECTED("parsing.float.expected"),
    FLOAT_INVALID("parsing.float.invalid"),
    INT_EXPECTED("parsing.int.expected"),
    INT_INVALID("parsing.int.invalid"),
    LONG_EXPECTED("parsing.long.expected"),
    LONG_INVALID("parsing.long.invalid"),
    QUOTE_ESCAPE("parsing.quote.escape"),
    QUOTE_EXPECTED_END("parsing.quote.expected.end"),
    QUOTE_EXPECTED_START("parsing.quote.expected.start");
    
    private final String key;
    
    Parsing(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
