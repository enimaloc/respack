package fr.divineexodus.server.resource.meta;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import fr.divineexodus.server.resource.lang.MCLocale;
import fr.divineexodus.utils.MinecraftVersion;
import net.minestom.server.utils.Either;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static fr.divineexodus.utils.MinecraftVersion.*;

public class ResourcePackMeta {
    private final int packFormat;
    private Either<String, JsonObject> description;
    private File icon;
    private List<MCLocale> additionalLocales;
    private List<Filter> filters = new ArrayList<>();

    public static ResourcePackMeta of(MinecraftVersion version) {
        if (version.isBefore(V1_6_1)) {
            return new ResourcePackMeta(-1);
        } else if (version.isBetween(V1_6_1, V1_8_9)) {
            return new ResourcePackMeta(1);
        } else if (version.isBetween(V1_9, V1_10_2)) {
            return new ResourcePackMeta(2);
        } else if (version.isBetween(V1_11, V1_12_2)) {
            return new ResourcePackMeta(3);
        } else if (version.isBetween(V1_13, V1_14_4)) {
            return new ResourcePackMeta(4);
        } else if (version.isBetween(V1_15, V1_16_1)) {
            return new ResourcePackMeta(5);
        } else if (version.isBetween(V1_16_2, V1_16_5)) {
            return new ResourcePackMeta(6);
        } else if (version.isBetween(V1_17, V1_17_1)) {
            return new ResourcePackMeta(7);
        } else if (version.isBetween(V1_18, V1_18_2)) {
            return new ResourcePackMeta(8);
        } else if (version.isBetween(V1_19, V1_19_2)) {
            return new ResourcePackMeta(9);
        } else if (version.equals(V1_19_3)) {
            return new ResourcePackMeta(12);
        } else if (version.equals(V1_19_4)) {
            return new ResourcePackMeta(13);
        } else if (version.isBetween(V1_20, V1_20_1)) {
            return new ResourcePackMeta(15);
        } else if (version.equals(V1_20_2) ){
            return new ResourcePackMeta(18);
        } else if (version.isAfterOrEqual(V1_20_3)) {
            return new ResourcePackMeta(22);
        }
        throw new IllegalArgumentException("Unsupported version: " + version);
    }

    public ResourcePackMeta(int packFormat) {
        this.packFormat = packFormat;
    }

    public Either<String, JsonObject> getDescription() {
        return description;
    }

    public ResourcePackMeta setDescription(String description) {
        this.description = Either.left(description);
        return this;
    }

    public ResourcePackMeta setDescription(JsonObject description) {
        this.description = Either.right(description);
        return this;
    }

    public File getIcon() {
        return icon;
    }

    public ResourcePackMeta setIcon(File icon) {
        this.icon = icon;
        return this;
    }

    public int getPackFormat() {
        return packFormat;
    }

    public void buildWith(List<MCLocale> additionalLocales) {
        this.additionalLocales = additionalLocales;
    }

    public ResourcePackMeta addFilter(String namespace, String path) {
        return addFilter(new Filter(namespace, path));
    }

    public ResourcePackMeta addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        JsonObject pack = new JsonObject();
        pack.addProperty("pack_format", packFormat);
        if (description != null) {
            if (description.isLeft()) {
                pack.addProperty("description", description.left());
            } else {
                pack.add("description", description.right());
            }
        }
        json.add("pack", pack);
        if (additionalLocales != null && !additionalLocales.isEmpty()) {
            JsonObject lang = new JsonObject();
            for (MCLocale locale : additionalLocales) {
                JsonObject localeJson = new JsonObject();
                localeJson.addProperty("name", locale.name());
                localeJson.addProperty("region", locale.region());
                localeJson.addProperty("bidirectional", locale.bidirectional());
                lang.add(locale.code(), localeJson);
            }
            json.add("language", lang);
        }
        if (filters != null && !filters.isEmpty()) {
            JsonObject filter = new JsonObject();
            JsonArray blocks = new JsonArray();
            for (Filter f : filters) {
                JsonObject block = new JsonObject();
                if (f.namespace() != null) {
                    block.addProperty("namespace", f.namespace());
                }
                if (f.path() != null) {
                    block.addProperty("path", f.path());
                }
                blocks.add(block);
            }
            filter.add("block", blocks);
            json.add("filter", filter);
        }
        return json;
    }
}
