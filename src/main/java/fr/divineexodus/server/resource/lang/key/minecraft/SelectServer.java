package fr.divineexodus.server.resource.lang.key.minecraft;

import fr.divineexodus.server.resource.lang.key.Key;

public enum SelectServer implements Key {
    ADD("selectServer.add"),
    DEFAULTNAME("selectServer.defaultName"),
    DELETE("selectServer.delete"),
    DELETEBUTTON("selectServer.deleteButton"),
    DELETEQUESTION("selectServer.deleteQuestion"),
    DELETEWARNING("selectServer.deleteWarning"),
    DIRECT("selectServer.direct"),
    EDIT("selectServer.edit"),
    HIDDENADDRESS("selectServer.hiddenAddress"),
    REFRESH("selectServer.refresh"),
    SELECT("selectServer.select"),
    TITLE("selectServer.title");
    
    private final String key;
    
    SelectServer(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
