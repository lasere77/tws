package fr.lasere.TWS.blocks;

import fr.lasere.TWS.blocks.tileEntity.TileEntityPurifier;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlocksBasic extends Block{

	public BlocksBasic(Material p_i45394_1_, int level) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", level);
		
	}
	
}
