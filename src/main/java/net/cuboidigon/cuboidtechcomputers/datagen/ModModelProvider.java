package net.cuboidigon.cuboidtechcomputers.datagen;

import net.cuboidigon.cuboidtechcomputers.CuboidTechComputers;
import net.cuboidigon.cuboidtechcomputers.block.ModBlocks;
import net.cuboidigon.cuboidtechcomputers.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;
import java.util.function.BiConsumer;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    private final Model PC_PART = item("generated", TextureKey.LAYER0,TextureKey.LAYER1,TextureKey.LAYER2);
    private static Model item(String parent, TextureKey LAYER0, TextureKey LAYER1, TextureKey LAYER2) {
        return new Model(Optional.of(new Identifier("item/" + parent)), Optional.empty(), LAYER0, LAYER1, LAYER2);
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
        itemModelGenerator.register(ModItems.GPU, PC_PART.upload(new Identifier(CuboidTechComputers.MODID, "item/gpu"), TextureMap.layered(new Identifier(CuboidTechComputers.MODID, "item/gpu_connector_thing"), new Identifier(CuboidTechComputers.MODID, "item/gpu_fg"), new Identifier(CuboidTechComputers.MODID, "item/gpu_fan"))));
    }
}
