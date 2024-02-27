package net.cuboidigon.cuboidtechcomputers.datagen;

import net.cuboidigon.cuboidtechcomputers.block.ModBlocks;
import net.cuboidigon.cuboidtechcomputers.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILICON_SMELTABLES = List.of(
            ModItems.RAW_SILICON,
            ModBlocks.ENSILICON_ORE,
            ModBlocks.NESILICON_ORE,
            ModBlocks.OVSILICON_ORE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, SILICON_SMELTABLES, RecipeCategory.MISC, ModItems.SILICON_INGOT,0.7f,200,"silicon");
        offerBlasting(exporter, SILICON_SMELTABLES, RecipeCategory.MISC, ModItems.SILICON_INGOT,0.9f,100,"silicon");
        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS,ModItems.SILICON_INGOT,RecipeCategory.DECORATIONS,ModBlocks.SILICON_BLOCK);
    }
}
