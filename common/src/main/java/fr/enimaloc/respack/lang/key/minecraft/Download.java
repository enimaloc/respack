package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Download implements Key {
    PACK_FAILED("download.pack.failed"),
    PACK_PROGRESS_BYTES("download.pack.progress.bytes"),
    PACK_PROGRESS_PERCENT("download.pack.progress.percent"),
    PACK_TITLE("download.pack.title");

    private final String key;

    Download(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
