package net.cuboidigon.cuboidtechcomputers.item.custom;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ColorablePart extends Item {
    public ColorablePart(Settings settings) {
        super(settings);
    }

    public void Color() {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x3495eb, new ColorablePart(new FabricItemSettings()));
    }
}
