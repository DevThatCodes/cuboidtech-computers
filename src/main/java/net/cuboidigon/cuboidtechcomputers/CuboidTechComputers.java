package net.cuboidigon.cuboidtechcomputers;

import net.cuboidigon.cuboidtechcomputers.block.ModBlocks;
import net.cuboidigon.cuboidtechcomputers.block.entitiy.ModBlockEntity;
import net.cuboidigon.cuboidtechcomputers.item.ModItemGroups;
import net.cuboidigon.cuboidtechcomputers.item.ModItems;
import net.cuboidigon.cuboidtechcomputers.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuboidTechComputers implements ModInitializer {
	public static final String MODID = "cuboidtech-computers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntity.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}