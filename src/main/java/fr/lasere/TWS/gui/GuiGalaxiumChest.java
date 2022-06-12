package fr.lasere.TWS.gui;

import org.lwjgl.opengl.GL11;

import fr.lasere.TWS.Reference;
import fr.lasere.TWS.blocks.container.ContainerGalaxiumChest;
import fr.lasere.TWS.blocks.tileEntity.TileEntityGalaxiumChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class GuiGalaxiumChest extends GuiContainer {
	
    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/gui/container/gui_galaxium_chest.png");
    private TileEntityGalaxiumChest tile;
    private IInventory playerInv;
	
	public GuiGalaxiumChest(TileEntityGalaxiumChest tile, InventoryPlayer inventory) {
		super(new ContainerGalaxiumChest(tile, inventory));
        this.tile = tile;
        this.playerInv = inventory;
        this.allowUserInput = false;
        this.ySize = 168;
	}
	
    protected void drawGuiContainerForegroundLayer(int x, int y) {
        this.fontRendererObj.drawString(this.tile.hasCustomInventoryName() ? this.tile.getInventoryName() : I18n.format(this.tile.getInventoryName()), 8, 6, 4210752);
        this.fontRendererObj.drawString(this.playerInv.hasCustomInventoryName() ? this.playerInv.getInventoryName() : I18n.format(this.playerInv.getInventoryName()), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float partialRenderTick, int x, int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
}