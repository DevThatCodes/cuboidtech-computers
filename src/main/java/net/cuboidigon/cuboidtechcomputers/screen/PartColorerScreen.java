package net.cuboidigon.cuboidtechcomputers.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.cuboidigon.cuboidtechcomputers.CuboidTechComputers;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PartColorerScreen extends HandledScreen<PartColorerScreenHandler> {

    private static final Identifier texture =  new Identifier(CuboidTechComputers.MODID, "textures/gui/colorer.png");

    public PartColorerScreen(PartColorerScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void init() {
        super.init();
        titleY = 600;
        playerInventoryTitleY=600;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0,texture);
        int x = (width-backgroundWidth) / 2;
        int y = (height-backgroundHeight) / 2;

        context.drawTexture(texture,x,y,0,0, backgroundWidth, backgroundHeight);
    }


    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
