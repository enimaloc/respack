package fr.divineexodus.server.resource.meta;

import org.jetbrains.annotations.Nullable;

public record Filter(@Nullable String namespace, @Nullable String path) {
}
