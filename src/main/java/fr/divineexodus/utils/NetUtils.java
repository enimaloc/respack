package fr.divineexodus.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetUtils {
    NetUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String getPublicIp() throws IOException {
        URL whatismyip = new URL("http://checkip.amazonaws.com");
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                whatismyip.openStream()))) {
            return in.readLine();
        }
    }
}
