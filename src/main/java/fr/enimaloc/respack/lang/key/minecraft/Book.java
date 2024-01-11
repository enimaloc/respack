package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Book implements Key {
    BY_AUTHOR("book.byAuthor"),
    EDIT_TITLE("book.editTitle"),
    FINALIZE_BUTTON("book.finalizeButton"),
    FINALIZE_WARNING("book.finalizeWarning"),
    GENERATION_0("book.generation.0"),
    GENERATION_1("book.generation.1"),
    GENERATION_2("book.generation.2"),
    GENERATION_3("book.generation.3"),
    INVALID_TAG("book.invalid.tag"),
    PAGE_INDICATOR("book.pageIndicator"),
    SIGN_BUTTON("book.signButton");

    private final String key;

    Book(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
