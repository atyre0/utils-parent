package me.atyre.utils.position;

import lombok.Data;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.serialization.ConfigurationSerializable;

import java.util.Map;

@Data
public class CustomLocation implements Cloneable, ConfigurationSerializable {
    @Getter private World world;
    @Getter private double x;
    @Getter private double y;
    @Getter private double z;
    @Getter private float yaw;
    @Getter private float pitch;

    public CustomLocation(World world, double x, double y, double z) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = 0.0f;
        this.pitch = 0.0f;
    }

    public CustomLocation(World world, double x, double y, double z, float yaw, float pitch) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public Location toLocation() {
        Location location = new Location(world, x, y, z, yaw, pitch);
        return location;
    }

    @Override
    public Map<String, Object> serialize() {
        return null;
    }
}
