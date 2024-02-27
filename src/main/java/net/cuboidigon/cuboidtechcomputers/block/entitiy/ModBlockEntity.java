package net.cuboidigon.cuboidtechcomputers.block.entitiy;

import net.cuboidigon.cuboidtechcomputers.CuboidTechComputers;
import net.cuboidigon.cuboidtechcomputers.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntity {
    public static final BlockEntityType<PartColorerBlockEntity> PART_COLORER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(CuboidTechComputers.MODID, "part_colorer_be"),
                    FabricBlockEntityTypeBuilder.create(PartColorerBlockEntity::new,
                            ModBlocks.PART_COLORER).build());

    public static void registerBlockEntities() {
        CuboidTechComputers.LOGGER.info("Registering block entity for " + CuboidTechComputers.MODID);
    }
}
