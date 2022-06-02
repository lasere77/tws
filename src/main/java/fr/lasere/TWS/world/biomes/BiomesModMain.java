package fr.lasere.TWS.world.biomes;

import java.util.ArrayList;
import java.util.Random;

import fr.lasere.TWS.init.BlockMod;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomesModMain extends BiomeGenBase{

	public BiomesModMain(int p_i1971_1_) {
		super(p_i1971_1_);
		this.topBlock = BlockMod.mossy_galaxium;
		this.fillerBlock = Blocks.stone;
		this.enableRain = false;
		this.enableSnow = true;
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCreeper.class, 5, 1, 5));
		this.waterColorMultiplier = 11141375;
		this.addDefaultFlowers();
	}
	
   public void decorate(World p_76728_1_, Random p_76728_2_, int p_76728_3_, int p_76728_4_) {

    }

}
