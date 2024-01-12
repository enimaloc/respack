package fr.enimaloc.respack.lang.key.minecraft;

import fr.enimaloc.respack.lang.key.Key;

public enum Pack implements Key {
    AVAILABLE_TITLE("pack.available.title"),
    COPYFAILURE("pack.copyFailure"),
    DROPCONFIRM("pack.dropConfirm"),
    DROPINFO("pack.dropInfo"),
    FOLDERINFO("pack.folderInfo"),
    INCOMPATIBLE("pack.incompatible"),
    INCOMPATIBLE_CONFIRM_NEW("pack.incompatible.confirm.new"),
    INCOMPATIBLE_CONFIRM_OLD("pack.incompatible.confirm.old"),
    INCOMPATIBLE_CONFIRM_TITLE("pack.incompatible.confirm.title"),
    INCOMPATIBLE_NEW("pack.incompatible.new"),
    INCOMPATIBLE_OLD("pack.incompatible.old"),
    NAMEANDSOURCE("pack.nameAndSource"),
    OPENFOLDER("pack.openFolder"),
    SELECTED_TITLE("pack.selected.title"),
    SOURCE_BUILTIN("pack.source.builtin"),
    SOURCE_FEATURE("pack.source.feature"),
    SOURCE_LOCAL("pack.source.local"),
    SOURCE_SERVER("pack.source.server"),
    SOURCE_WORLD("pack.source.world");
    
    private final String key;
    
    Pack(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
