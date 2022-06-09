package fr.lasere.TWS.world.structures;

import fr.lasere.TWS.init.BlockMod;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class StructureMeteore {
	
	public static void init(World world, int x, int  y, int z) {
		if(world.getBlock(x, y-1, z) == BlockMod.mossy_galaxium && world.getBlock(x, y+7, z) == Blocks.air) {
			world.setBlock(x, y, z, BlockMod.galaxium_meteore);
		}
		
	}

}
