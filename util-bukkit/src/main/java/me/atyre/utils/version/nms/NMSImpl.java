package me.atyre.utils.version.nms;

import org.bukkit.entity.Player;

public interface NMSImpl {
    public void setNameTag(Player player, String newTag);

    public boolean sendTitle(Player player, String message, int titleFadeInTime, int titleStayTime, int titleFadeOutTime);

    public boolean sendSubTitle(Player player, String message, int titleFadeInTime, int titleStayTime, int titleFadeOutTime);

    public boolean sendActionTitle(Player player, String message);

    public void createBossBar(Player player, String title);

    public void clearArrows(Player player);
}
