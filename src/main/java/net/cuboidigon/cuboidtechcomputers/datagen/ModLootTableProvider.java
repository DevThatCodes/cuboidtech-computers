package net.cuboidigon.cuboidtechcomputers.datagen;

import net.cuboidigon.cuboidtechcomputers.block.ModBlocks;
import net.cuboidigon.cuboidtechcomputers.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MMD_CHECKER);
        addDrop(ModBlocks.PART_COLORER);
        addDrop(ModBlocks.SILICON_BLOCK);

        addDrop(ModBlocks.ENSILICON_ORE, copperLikeOreDrops(ModBlocks.ENSILICON_ORE, ModItems.RAW_SILICON));
        addDrop(ModBlocks.OVSILICON_ORE, copperLikeOreDrops(ModBlocks.OVSILICON_ORE, ModItems.RAW_SILICON));
        addDrop(ModBlocks.NESILICON_ORE, copperLikeOreDrops(ModBlocks.NESILICON_ORE, ModItems.RAW_SILICON));

    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
