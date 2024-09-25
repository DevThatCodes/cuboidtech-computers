package net.cuboidigon.cuboidtechcomputers.item;

import net.cuboidigon.cuboidtechcomputers.CuboidTechComputers;
import net.cuboidigon.cuboidtechcomputers.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup CTC_ITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(CuboidTechComputers.MODID, "ctc_items"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cuboidtech-computers.ctc_items"))
            .icon(() -> new ItemStack(ModItems.SILICA)).entries(((displayContext, entries) -> {
                entries.add(ModItems.SILICA);
                entries.add(ModItems.MMD);
                entries.add(ModItems.GPU);
                entries.add(ModItems.SILICON_INGOT);
                entries.add(ModItems.RAW_SILICON);
                entries.add(ModItems.COLOR_CARD);
            })).build());
    public static final ItemGroup CTC_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(CuboidTechComputers.MODID, "ctc_blocks"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cuboidtech-computers.ctc_blocks"))
            .icon(() -> new ItemStack(ModBlocks.SILICON_BLOCK)).entries(((displayContext, entries) -> {
                entries.add(ModBlocks.SILICON_BLOCK);
                entries.add(ModBlocks.PART_COLORER);
                entries.add(ModBlocks.OVSILICON_ORE);
                entries.add(ModBlocks.NESILICON_ORE);
                entries.add(ModBlocks.ENSILICON_ORE);
                entries.add(ModBlocks.MMD_CHECKER);

            })).build());

    public static void registerItemGroups() {
        CuboidTechComputers.LOGGER.info("Registering item groups for " + CuboidTechComputers.MODID);

    }

}
