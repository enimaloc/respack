package fr.enimaloc.respack.font;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.kyori.adventure.key.Key;

import java.util.Arrays;
import java.util.StringJoiner;

public abstract class Provider {
    private int[] chars;

    protected void setChars(int... chars) {
        this.chars = chars;
    }

    public int[] getCodepoints() {
        return chars;
    }

    public String[] getCharsStr() {
        return Arrays.stream(chars)
                .mapToObj(i -> String.format("\\u%04X", i))
                .toArray(String[]::new);
    }

    public int getLength() {
        return chars.length;
    }

    public abstract JsonObject toJson();

    protected Provider() {}

    public static Space space(int... widths) {
        return new Space(widths);
    }

    public static Space space(int min, int max) {
        return new Space(min, max);
    }

    public static Bitmap bitmap(Key namespace, int ascent) {
        return new Bitmap(namespace, ascent);
    }

    public static Provider bitmap(Key namespace, int ascent, int height) {
        return new Bitmap(namespace, ascent).setHeight(height);
    }

    public static class Bitmap extends Provider {
        private final Key namespace;
        private final int ascent;
        private int height = 8;

        public Bitmap(Key namespace, int ascent) {
            this.namespace = namespace;
            this.ascent = ascent;
        }

        public Bitmap setHeight(int height) {
            this.height = height;
            return this;
        }

        @Override
        public JsonObject toJson() {
            JsonObject json = new JsonObject();
            json.addProperty("type", "bitmap");
            json.addProperty("file", namespace.toString());
            if (height != 8)
                json.addProperty("height", height);
            json.addProperty("ascent", ascent);
            JsonArray chars = new JsonArray();
            for (int i = 0; i < getCharsStr().length; i++) {
                chars.add(getCharsStr()[i]);
            }
            json.add("chars", chars);
            return json;
        }

        @Override
        public int getLength() {
            return 1;
        }

        public int getAscent() {
            return ascent;
        }

        public Key getNamespace() {
            return namespace;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return "BitmapProvider{" +
                    "namespace=" + namespace +
                    ", height=" + height +
                    ", ascent=" + ascent +
                    ", chars=" + Arrays.toString(getCharsStr()) +
                    '}';
        }
    }

    public static class Space extends Provider {

        private final int[] widths;

        public Space(int... widths) {
            this.widths = widths;
        }

        public Space(int min, int max) {
            this.widths = new int[max - min + 1];
            for (int i = 0; i < widths.length; i++) {
                widths[i] = min + i;
            }
        }

        @Override
        public int getLength() {
            return widths.length;
        }

        public int[] getWidths() {
            return widths;
        }

        public int getCodepoint(int width) {
            for (int i = 0; i < widths.length; i++) {
                if (widths[i] == width) {
                    return getCodepoints()[i];
                }
            }
            return -1;
        }

        public String getCharStr(int width) {
            for (int i = 0; i < widths.length; i++) {
                if (widths[i] == width) {
                    return getCharsStr()[i];
                }
            }
            return null;
        }

        @Override
        public JsonObject toJson() {
            JsonObject json = new JsonObject();
            json.addProperty("type", "space");
            JsonObject chars = new JsonObject();
            for (int i = 0; i < getCharsStr().length; i++) {
                chars.addProperty(getCharsStr()[i], widths[i]);
            }
            json.add("advances", chars);
            return json;
        }

        @Override
        public String toString() {
            StringJoiner joiner = new StringJoiner(", ");
            for (int i = 0; i < getCharsStr().length; i++) {
                joiner.add(getCharsStr()[i] + "=" + widths[i]);
            }
            return "SpaceProvider{" +
                    joiner +
                    '}';
        }

    }
}
