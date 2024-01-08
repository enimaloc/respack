package fr.divineexodus.server.resource.font;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minestom.server.utils.NamespaceID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class FontModifier {
    public static final int START_RANGE = 0xE000;
    public static final int END_RANGE = 0xF8FF;
    private final String fontName;
    private boolean invalid = true;

    private List<Provider> providers = new ArrayList<>();

    public FontModifier(String fontName) {
        this.fontName = fontName;
    }

    public String getFontName() {
        return fontName;
    }

    public FontModifier addModifier(Provider provider) {
        providers.add(provider);
        invalid = true;
        return this;
    }

    public void rebuild() {
        int c = fontName.equals("default") ? START_RANGE : 0;
        for (Provider provider : providers) {
            if (fontName.equals("default") && c + provider.getLength() > END_RANGE) {
                throw new IllegalStateException("Not enough space for all chars");
            }
            provider.setChars(IntStream.range(c, c + provider.getLength()).toArray());
            c += provider.getLength();
        }
        invalid = false;
    }

    public JsonObject toJson() {
        if (invalid) {
            throw new IllegalStateException("FontModifier is invalid, call rebuild() first");
        }
        JsonObject json = new JsonObject();
        JsonArray providers = new JsonArray();
        for (Provider provider : this.providers) {
            providers.add(provider.toJson());
        }
        json.add("providers", providers);
        return json;
    }

    public int[] getCodepoint(NamespaceID namespace) {
        for (Provider provider : providers) {
            if (provider instanceof Provider.Bitmap bitmap && bitmap.getNamespace().equals(namespace)) {
                return provider.getCodepoints();
            }
        }
        return new int[0];
    }

    public int getCodepoint(int spaceWidth) {
        for (Provider provider : providers) {
            if (provider instanceof Provider.Space space && space.getCodepoint(spaceWidth) != -1) {
                return space.getCodepoint(spaceWidth);
            }
        }
        return -1;
    }

    public String getChar(int spaceWidth) {
        int c = getCodepoint(spaceWidth);
        if (c == -1) {
            return "";
        }
        return Character.toString(c);
    }

    public String getChar(NamespaceID namespace) {
        int[] chars = getCodepoint(namespace);
        if (chars.length == 0) {
            return "";
        }
        return Character.toString(chars[0]);
    }

    public List<Provider> getProviders() {
        return Collections.unmodifiableList(providers);
    }

    public boolean isEmpty() {
        return providers.isEmpty();
    }

    @Override
    public String toString() {
        return "FontModifier{" +
                "fontName='" + fontName + '\'' +
                ", providers=" + providers +
                '}';
    }
}
