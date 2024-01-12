package fr.enimaloc.respack.impl;

import fr.enimaloc.respack.GeneratedResourcePack;
import fr.enimaloc.utils.MinecraftVersion;
import net.kyori.adventure.text.Component;
import net.minestom.server.MinecraftServer;
import net.minestom.server.entity.Player;
import net.minestom.server.resourcepack.ResourcePack;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class MinestomUtils {

    public static GeneratedResourcePack createResourcePack() {
        return new GeneratedResourcePack(new MinecraftVersion(MinecraftServer.VERSION_NAME));
    }

    public static void sendOptionalResourcePack(Player player, GeneratedResourcePack resourcePack) throws NoSuchAlgorithmException, IOException {
        sendOptionalResourcePack(player, resourcePack, null);
    }

    public static void sendOptionalResourcePack(Player player, GeneratedResourcePack resourcePack, @Nullable Component prompt) throws NoSuchAlgorithmException, IOException {
        player.setResourcePack(ResourcePack.optional(resourcePack.getUrl(), new String(resourcePack.getMD5()), prompt));
    }

    public static void sendForcedResourcePack(Player player, GeneratedResourcePack resourcePack) throws NoSuchAlgorithmException, IOException {
        sendForcedResourcePack(player, resourcePack, null);
    }

    public static void sendForcedResourcePack(Player player, GeneratedResourcePack resourcePack, @Nullable Component prompt) throws NoSuchAlgorithmException, IOException {
        player.setResourcePack(ResourcePack.forced(resourcePack.getUrl(), new String(resourcePack.getMD5()), prompt));
    }
}
