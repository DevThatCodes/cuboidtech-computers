package net.cuboidigon.cuboidtechcomputers.datagen;

import net.cuboidigon.cuboidtechcomputers.block.ModBlocks;
import net.cuboidigon.cuboidtechcomputers.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENSILICON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILICON_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MMD_CHECKER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OVSILICON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NESILICON_ORE);
        blockStateModelGenerator.registerItemModel(ModBlocks.PART_COLORER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MMD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILICA, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SILICON, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILICON_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GPU, Models.GENERATED_THREE_LAYERS);
    }
}
