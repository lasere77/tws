package fr.lasere.TWS.world.structures;

import fr.lasere.TWS.init.BiomesMod;
import fr.lasere.TWS.init.BlockMod;
import fr.lasere.TWS.world.biomes.BiomesModMain;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class StructureMod {

	public static void init(World world, int x, int  y, int z) {
		if(world.getBlock(x, y-1, z) == BlockMod.mossy_galaxium && world.getBlock(x, y+7, z) == Blocks.air) {
			world.setBlock(x, y, z, BlockMod.galaxium_ore);
			world.setBlock(x, y+1, z, BlockMod.mossy_galaxium);
			world.setBlock(x, y, z+1, BlockMod.mossy_galaxium);
			world.setBlock(x+1, y, z, BlockMod.mossy_galaxium);
			world.setBlock(x, y, z-1, BlockMod.mossy_galaxium);
			world.setBlock(x-1, y, z, BlockMod.mossy_galaxium);
		}
		
	}
	
}
