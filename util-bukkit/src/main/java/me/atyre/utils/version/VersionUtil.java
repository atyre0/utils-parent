package me.atyre.utils.version;

import org.bukkit.Bukkit;

import java.util.Arrays;
import java.util.List;

public class VersionUtil {
    public static MCVersion getMCVersion() {
        if (Bukkit.getVersion().contains("1.7")) {
            return MCVersion.v1_7;
        } else if (Bukkit.getVersion().contains("1.8")) {
            return MCVersion.v1_8;
        } else if (Bukkit.getVersion().contains("1.9")) {
            return MCVersion.v1_9;
        } else if (Bukkit.getVersion().contains("1.10")) {
            return MCVersion.v1_10;
        } else if (Bukkit.getVersion().contains("1.11")) {
            return MCVersion.v1_11;
        } else if (Bukkit.getVersion().contains("1.12")) {
            return MCVersion.v1_12;
        } else if (Bukkit.getVersion().contains("1.13")) {
            return MCVersion.v1_13;
        } else if (Bukkit.getVersion().contains("1.14")) {
            return MCVersion.v1_14;
        } else if (Bukkit.getVersion().contains("1.15")) {
            return MCVersion.v1_15;
        } else if (Bukkit.getVersion().contains("1.16")) {
            return MCVersion.v1_16;
        } else if (Bukkit.getVersion().contains("1.17")) {
            return MCVersion.v1_17;
        }

        return null;
    }

    public static MCVersion getMCVersion(int protocol) {
        if (protocol == 5) {
            return MCVersion.v1_7;
        } else if (protocol >= 6 && protocol <= 47) {
            return MCVersion.v1_8;
        } else if (protocol >= 48 && protocol <= 110) {
            return MCVersion.v1_9;
        } else if (protocol >= 201 && protocol <= 210) {
            return MCVersion.v1_10;
        } else if (protocol >= 301 && protocol <= 316) {
            return MCVersion.v1_11;
        } else if (protocol >= 317 && protocol <= 340) {
            return MCVersion.v1_12;
        } else if (protocol >= 341 && protocol <= 404) {
            return MCVersion.v1_13;
        } else if (protocol >= 441 && protocol <= 498) {
            return MCVersion.v1_14;
        } else if (protocol >= 550 && protocol <= 578) {
            return MCVersion.v1_15;
        } else if (protocol >= 701 && protocol <= 754) {
            return MCVersion.v1_16;
        } else if (protocol >= 755 && protocol <= 756) {
            return MCVersion.v1_17;
        }

        return null;
    }

    public static boolean is19OrNewer() {
        List<MCVersion> newerMCVersions = Arrays.asList(
                MCVersion.v1_9, MCVersion.v1_10, MCVersion.v1_11,
                MCVersion.v1_12, MCVersion.v1_13, MCVersion.v1_14,
                MCVersion.v1_15, MCVersion.v1_16, MCVersion.v1_17);

        return newerMCVersions.contains(getMCVersion());
    }

    public static boolean is111OrNewer() {
        List<MCVersion> newerMCVersions = Arrays.asList(
                MCVersion.v1_11, MCVersion.v1_12, MCVersion.v1_13,
                MCVersion.v1_14, MCVersion.v1_15, MCVersion.v1_16,
                MCVersion.v1_17);

        return newerMCVersions.contains(getMCVersion());
    }
}
