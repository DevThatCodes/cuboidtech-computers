package net.cuboidigon.cuboidtechcomputers.util;

import net.cuboidigon.cuboidtechcomputers.CuboidTechComputers;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> COMPUTER_BLOCK = createTag("computer_block");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(CuboidTechComputers.MODID, name));
        }

    }
    public static class Items {

        public static final TagKey<Item> PC_PART = createTag("pc_part");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(CuboidTechComputers.MODID, name));
        }

    }
}
