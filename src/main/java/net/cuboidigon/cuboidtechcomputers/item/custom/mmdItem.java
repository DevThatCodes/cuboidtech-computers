package net.cuboidigon.cuboidtechcomputers.item.custom;

import net.cuboidigon.cuboidtechcomputers.CuboidTechComputers;
import net.cuboidigon.cuboidtechcomputers.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class mmdItem extends Item {
    public mmdItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.cuboidtech-computers.mmd.tooltip"));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()) {
            BlockState state = context.getWorld().getBlockState(context.getBlockPos());
            PlayerEntity player = context.getPlayer();

            CuboidTechComputers.LOGGER.info("Used on block " + state);
            if (state.isOf(ModBlocks.MMD_CHECKER)) {
                player.sendMessage(Text.translatable("message.cuboidtech-computers.mmdresultsucces"));
            } else if (!state.isOf(ModBlocks.MMD_CHECKER)) {
                player.sendMessage(Text.translatable("message.cuboidtech-computers.mmdresultfail"));
            }

        }
        return ActionResult.SUCCESS;
    }
}
