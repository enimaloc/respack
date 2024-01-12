package fr.enimaloc.respack.impl;

import fr.enimaloc.respack.GeneratedResourcePack;
import fr.enimaloc.utils.MinecraftVersion;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class SpigotUtils {
    private SpigotUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static GeneratedResourcePack createResourcePack() {
        return new GeneratedResourcePack(new MinecraftVersion(Bukkit.getVersion().split("-")[0]));
    }

    public static void sendResourcePack(Player player, GeneratedResourcePack resourcePack, String prompt, boolean force) throws NoSuchAlgorithmException, IOException {
        player.setResourcePack(resourcePack.getUrl(), resourcePack.getMD5(), prompt, force);
    }

    public static void sendResourcePack(Player player, GeneratedResourcePack resourcePack, boolean force) throws NoSuchAlgorithmException, IOException {
        sendResourcePack(player, resourcePack, null, force);
    }

    public static void sendResourcePack(Player player, GeneratedResourcePack resourcePack, String prompt) throws NoSuchAlgorithmException, IOException {
        sendResourcePack(player, resourcePack, prompt, true);
    }

    public static void sendResourcePack(Player player, GeneratedResourcePack resourcePack) throws NoSuchAlgorithmException, IOException {
        sendResourcePack(player, resourcePack, false);
    }
}
