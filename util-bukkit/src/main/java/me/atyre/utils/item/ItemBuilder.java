package me.atyre.utils.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;
import java.util.UUID;

public class ItemBuilder {
    private ItemStack item;

    public ItemBuilder(Material material, int amount) {
        item = new ItemStack(material, amount);
    }

    public ItemBuilder(Material material) {
        item = new ItemStack(material);
    }

    public ItemBuilder(ItemStack itemStack) {
        item = itemStack;
    }

    public ItemBuilder name(String name) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder amount(int amount) {
        item.setAmount(amount);
        return this;
    }

    public ItemBuilder maxSizeAmount() {
        item.setAmount(item.getMaxStackSize());
        return this;
    }

    public ItemBuilder lore(String[] lore) {
        return this;
    }

    public ItemBuilder lore(List<String> lore) {
        return this;
    }

    public ItemBuilder durability(short durability) {
        item.setDurability(durability);
        return this;
    }

    public ItemBuilder enchantments(Enchantment[] enchantments) {
        return this;
    }

    public ItemBuilder enchantments(List<Enchantment> enchantments) {
        return this;
    }

    public ItemBuilder skullOwner(UUID player) {
        return this;
    }

    public ItemStack build() {
        return item;
    }
}
