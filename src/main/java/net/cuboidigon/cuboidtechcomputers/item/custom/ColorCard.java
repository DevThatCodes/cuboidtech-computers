package net.cuboidigon.cuboidtechcomputers.item.custom;

import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;

public class ColorCard extends Item {
    public ColorCard(Settings settings) {
        super(settings);
    }

    public void setColor(String color){
        this.getDefaultStack().getOrCreateNbt().putString("color", color);
    }
}
