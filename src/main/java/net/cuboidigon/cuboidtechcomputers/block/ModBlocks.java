package net.cuboidigon.cuboidtechcomputers.block;

import net.cuboidigon.cuboidtechcomputers.CuboidTechComputers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

        public static final Block SILICON_BLOCK = registerBlock("silicon_block",  new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));
        public static final Block OVSILICON_ORE = registerBlock("ovsilicon_ore",  new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
        public static final Block NESILICON_ORE = registerBlock("nesilicon_ore",  new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
        public static final Block ENSILICON_ORE = registerBlock("ensilicon_ore",  new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
        public static final Block MMD_CHECKER = registerBlock("mmd_checker",  new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
        public static final Block PART_COLORER = registerBlock("part_colorer",  new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CuboidTechComputers.MODID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(CuboidTechComputers.MODID, name),
            new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks()
    {
        CuboidTechComputers.LOGGER.info("Registering mod blocks for " + CuboidTechComputers.MODID);
    }
}
