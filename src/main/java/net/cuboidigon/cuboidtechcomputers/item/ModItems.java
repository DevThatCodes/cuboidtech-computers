package net.cuboidigon.cuboidtechcomputers.item;

import net.cuboidigon.cuboidtechcomputers.CuboidTechComputers;
import net.cuboidigon.cuboidtechcomputers.item.custom.mmdItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SILICA = registerItem("silica", new Item(new FabricItemSettings()));
    public static final Item RAW_SILICON = registerItem("raw_silicon", new Item(new FabricItemSettings()));
    public static final Item SILICON_INGOT = registerItem("silicon_ingot", new Item(new FabricItemSettings()));
    public static final Item MMD = registerItem("mmd", new mmdItem(new FabricItemSettings()));

    private static void  addItemsToIngredientsTab(FabricItemGroupEntries entries) {
        entries.add(SILICA);
        entries.add(SILICON_INGOT);
        entries.add(RAW_SILICON);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CuboidTechComputers.MODID, name), item);
    }
    public static void registerModItems() {
        CuboidTechComputers.LOGGER.info("Registering mod items for " + CuboidTechComputers.MODID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTab);
    }
}
