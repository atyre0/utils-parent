package me.atyre.utils;

import net.minecraft.server.v1_8_R3.NetworkManager;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

public class PlayerUtil {
    public static int getClientVersion(Player player) throws NoSuchFieldException, IllegalAccessException {
        NetworkManager networkManager = ((CraftPlayer) player).getHandle().playerConnection.networkManager;
        Field protocolField = networkManager.getClass().getDeclaredField("protocolVersion");
        protocolField.setAccessible(true);
        int protocolVersion = protocolField.getInt(networkManager);
        return protocolVersion;
    }
}
