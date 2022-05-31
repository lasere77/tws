package fr.lasere.TWS.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksBasic extends Block{

	public BlocksBasic(Material p_i45394_1_, int level) {
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", level);
		
	}

	
}
