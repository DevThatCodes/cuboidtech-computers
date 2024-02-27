package net.cuboidigon.cuboidtechcomputers;

import net.cuboidigon.cuboidtechcomputers.screen.ModScreenHandlers;
import net.cuboidigon.cuboidtechcomputers.screen.PartColorerScreen;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class CuboidTechComputersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.PART_COLORER_SCREEN_HANDLER, PartColorerScreen::new);
    }
}
