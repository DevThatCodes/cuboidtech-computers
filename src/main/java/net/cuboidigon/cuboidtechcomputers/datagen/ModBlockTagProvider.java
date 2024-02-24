package net.cuboidigon.cuboidtechcomputers.datagen;

import net.cuboidigon.cuboidtechcomputers.block.ModBlocks;
import net.cuboidigon.cuboidtechcomputers.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.COMPUTER_BLOCK);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MMD_CHECKER)
                .add(ModBlocks.SILICON_BLOCK)
                .add(ModBlocks.NESILICON_ORE)
                .add(ModBlocks.OVSILICON_ORE)
                .add(ModBlocks.ENSILICON_ORE)
                .add(ModBlocks.PART_COLORER);
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE);
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MMD_CHECKER)
                .add(ModBlocks.SILICON_BLOCK)
                .add(ModBlocks.NESILICON_ORE)
                .add(ModBlocks.OVSILICON_ORE)
                .add(ModBlocks.ENSILICON_ORE)
                .add(ModBlocks.PART_COLORER);
    }
}
