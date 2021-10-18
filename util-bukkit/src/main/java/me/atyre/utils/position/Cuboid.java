package me.atyre.utils.position;

import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.serialization.ConfigurationSerializable;

import java.util.Map;

public class Cuboid implements Cloneable, ConfigurationSerializable {

    @Getter World world;
    @Getter int x1;
    @Getter int x2;
    @Getter int y1;
    @Getter int y2;
    @Getter int z1;
    @Getter int z2;

    public Cuboid(Location loc1, Location loc2) {
        this.world = loc1.getWorld();
        this.x1 = loc1.getBlockX();
        this.x2 = loc2.getBlockX();
        this.y1 = loc1.getBlockY();
        this.y2 = loc2.getBlockY();
        this.z1 = loc1.getBlockZ();
        this.z2 = loc2.getBlockZ();
    }


    @Override
    public Map<String, Object> serialize() {
        return null;
    }
}
