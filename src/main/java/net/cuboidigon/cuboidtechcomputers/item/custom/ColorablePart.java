package net.cuboidigon.cuboidtechcomputers.item.custom;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ColorablePart extends Item {
    public ColorablePart(Settings settings) {
        super(settings);
    }

    public static void Color(ItemStack stack) {
        ColorProviderRegistry.ITEM.register((stack, layer) -> {
            return layer == 0 ? stack.getOrCreateNbt().getInt("color") : 0xFFFFFF;
        }, stack);
    }
}
