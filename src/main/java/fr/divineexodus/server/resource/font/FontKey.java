package fr.divineexodus.server.resource.font;

import net.kyori.adventure.key.InvalidKeyException;
import net.kyori.adventure.key.Key;
import net.kyori.examination.ExaminableProperty;
import org.intellij.lang.annotations.RegExp;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;

public class FontKey implements Key {
    public static final Comparator<? super Key> COMPARATOR = Comparator.comparing(Key::value).thenComparing(Key::namespace);

    public static final @RegExp String NAMESPACE_PATTERN = "[a-z0-9_\\-.]+";
    public static final @RegExp String VALUE_PATTERN = "[a-z0-9_\\-./]+";

    private final String namespace;
    private final String value;

    public FontKey(final @NotNull String value) {
        this(value.contains(":") ? value.substring(0, value.indexOf(':')) : null, value.contains(":") ? value.substring(value.indexOf(':') + 1) : value);
    }

    public FontKey(final @NotNull String namespace, final @NotNull String value) {
        checkError("namespace", namespace, value, Key.checkNamespace(namespace));
        checkError("value", namespace, value, Key.checkValue(value));
        this.namespace = requireNonNull(namespace, "namespace");
        this.value = requireNonNull(value, "value");
    }

    private static void checkError(final String name, final String namespace, final String value, final OptionalInt index) {
        if (index.isPresent()) {
            final int indexValue = index.getAsInt();
            final char character = value.charAt(indexValue);
            throw new IllegalArgumentException(String.format(
                    "Non [a-z0-9_.-] character in %s of Key[%s] at index %d ('%s', bytes: %s)",
                    name,
                    asString(namespace, value),
                    indexValue,
                    character,
                    Arrays.toString(String.valueOf(character).getBytes(StandardCharsets.UTF_8))
            ));
//            throw new InvalidKeyException(namespace, value, String.format(
//                    "Non [a-z0-9_.-] character in %s of Key[%s] at index %d ('%s', bytes: %s)",
//                    name,
//                    asString(namespace, value),
//                    indexValue,
//                    character,
//                    Arrays.toString(String.valueOf(character).getBytes(StandardCharsets.UTF_8))
//            ));
        }
    }

    static boolean allowedInNamespace(final char character) {
        return character == '_' || character == '-' || (character >= 'a' && character <= 'z') || (character >= '0' && character <= '9') || character == '.';
    }

    static boolean allowedInValue(final char character) {
        return character == '_' || character == '-' || (character >= 'a' && character <= 'z') || (character >= '0' && character <= '9') || character == '.' || character == '/';
    }

    @Override
    public @NotNull String namespace() {
        return this.namespace;
    }

    @Override
    public @NotNull String value() {
        return this.value;
    }

    @Override
    public @NotNull String asString() {
        return asString(this.namespace, this.value);
    }

    private static @NotNull String asString(final @NotNull String namespace, final @NotNull String value) {
        return namespace + '_' + value;
    }

    @Override
    public @NotNull String toString() {
        return this.asString();
    }

    @Override
    public @NotNull Stream<? extends ExaminableProperty> examinableProperties() {
        return Stream.of(
                ExaminableProperty.of("namespace", this.namespace),
                ExaminableProperty.of("value", this.value)
        );
    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) return true;
        if (!(other instanceof Key)) return false;
        final Key that = (Key) other;
        return Objects.equals(this.namespace, that.namespace()) && Objects.equals(this.value, that.value());
    }

    @Override
    public int hashCode() {
        int result = this.namespace.hashCode();
        result = (31 * result) + this.value.hashCode();
        return result;
    }

    @Override
    public int compareTo(final @NotNull Key that) {
        return Key.super.compareTo(that);
    }
}
