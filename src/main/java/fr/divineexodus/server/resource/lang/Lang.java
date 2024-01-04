package fr.divineexodus.server.resource.lang;

import com.google.gson.JsonObject;
import fr.divineexodus.server.resource.lang.key.Key;

import java.util.HashMap;
import java.util.Map;

public class Lang {
    private final MCLocale locale;
    private Map<String, String> translations = new HashMap<>();

    public Lang(MCLocale locale) {
        this.locale = locale;
    }

    public Lang add(Key key, String value) {
        return add(key.getKey(), value);
    }

    public Lang add(String key, String value) {
        translations.put(key, value);
        return this;
    }

    public String get(Key key) {
        return get(key.getKey());
    }

    public String get(String key) {
        return translations.get(key);
    }

    public JsonObject toJson() {
        JsonObject object = new JsonObject();
        translations.forEach(object::addProperty);
        return object;
    }

    public MCLocale getLocale() {
        return locale;
    }

}
