package fr.lasere.TWS.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import fr.lasere.TWS.blocks.container.ContainerGalaxiumChest;
import fr.lasere.TWS.blocks.tileEntity.TileEntityGalaxiumChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandlerGalaxiumChest implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile = world.getTileEntity(x, y, z);
		if(tile instanceof TileEntityGalaxiumChest) {
			return new ContainerGalaxiumChest((TileEntityGalaxiumChest) ((TileEntity)tile), player.inventory);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile = world.getTileEntity(x, y, z);
		if(tile instanceof TileEntityGalaxiumChest) {
			return new GuiGalaxiumChest((TileEntityGalaxiumChest) ((TileEntity)tile), player.inventory);
		}
		return null;
	}

}
