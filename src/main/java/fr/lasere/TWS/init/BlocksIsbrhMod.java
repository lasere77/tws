package fr.lasere.TWS.init;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.lasere.TWS.proxy.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlocksIsbrhMod extends Block {

	public BlocksIsbrhMod(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	public boolean isOpaqueCube() {
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	public int getRenderType() {
		return ClientProxy.renderIsbrh;
	}
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess access, int x, int y, int z, int side) {
		return true;
	}
	

}
