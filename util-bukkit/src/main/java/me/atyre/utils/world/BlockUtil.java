package me.atyre.utils.world;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

import java.util.List;

public class BlockUtil {
    public static void getVeinSingleBlock(Block block, Material type, List<Block> blocks){
        if (!(block.getType() == type)) return;
        if (blocks.contains(block)) return;

        blocks.add(block);

        for (BlockFace blockFace : BlockFace.values()) {
            getVeinSingleBlock(block.getRelative(blockFace), block.getType(), blocks);
        }
    }

    public static void getVeinMultipleBlocks(Block block, List<Material> types, List<Block> blocks){
        if (!(types.contains(block.getType()))) return;
        if (blocks.contains(block)) return;

        blocks.add(block);

        for (BlockFace blockFace : BlockFace.values()) {
            getVeinMultipleBlocks(block.getRelative(blockFace), types, blocks);
        }
    }
}
