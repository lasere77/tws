package fr.lasere.TWS.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import fr.lasere.TWS.init.BlockMod;
import fr.lasere.TWS.init.StructureGenMod;
import fr.lasere.TWS.world.structures.StructureMod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenMod implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case -1:
			GenerateNether(world, chunkX * 16, chunkZ * 16, random);
			break;
		case 0:
			GenerateOverWorld(world, chunkX * 16, chunkZ * 16, random);
			break;
		case 1:
			GenerateEnd(world, chunkX * 16, chunkZ * 16, random);
			break;
		}
		
	}

	private void addOre(Block block, Block blockSpawn ,Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int luck){
		for(int i=0; i < luck; i++) {
			int chunkSize = 16;
			int Xpos = posX + random.nextInt(chunkSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posZ + random.nextInt(chunkSize);
			
			
			new WorldGenMinable(block, maxV).generate(world, random, Xpos, Ypos, Zpos);
		}
	}
	
	private void addStructure(String string, Random random, World world, int posX, int posZ, int minY, int maxY, int luck) {
		for(int i = 0; i < luck; i++) {
			int chunkSize = 16;
			int Xpos = posX + random.nextInt(chunkSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posZ + random.nextInt(chunkSize);
			
			new StructureGenMod().generate(string, world, random, Xpos, Ypos, Zpos);
		}
	}
	
	private void GenerateEnd(World world, int i, int j, Random random) {
		addOre(BlockMod.galaxium_ore, Blocks.end_stone, random, world, i, j, 5, 10, 1, 3, 2);
	}

	private void GenerateOverWorld(World world, int i, int j, Random random) {
		addOre(BlockMod.galaxium_ore, Blocks.stone, random, world, i, j, 20, 60, 1, 3, 1);
		addStructure(StructureGenMod.structureMod, random, world, i, j, 50, 150, 10);
		addStructure(StructureGenMod.galaxium_meteore, random, world, i, j, 50, 150, 60);
		
	}

	private void GenerateNether(World world, int i, int j, Random random) {
		
		
	}
}
