package net.cuboidigon.cuboidtechcomputers.screen;

import net.cuboidigon.cuboidtechcomputers.CuboidTechComputers;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<PartColorerScreenHandler> PART_COLORER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(CuboidTechComputers.MODID, "part_colorer"),
                    new ExtendedScreenHandlerType<>(PartColorerScreenHandler::new));

    public static void registerScreenHandlers(){
        CuboidTechComputers.LOGGER.info("Registering screen handlers for "+ CuboidTechComputers.MODID);
    }
}
