package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum DatapackFailure implements Key {
    SAFEMODE("datapackFailure.safeMode"),
    SAFEMODE_FAILED_DESCRIPTION("datapackFailure.safeMode.failed.description"),
    SAFEMODE_FAILED_TITLE("datapackFailure.safeMode.failed.title"),
    TITLE("datapackFailure.title");
    
    private final String key;
    
    DatapackFailure(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
}
