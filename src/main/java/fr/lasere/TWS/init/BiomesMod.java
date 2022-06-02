package fr.lasere.TWS.init;

import fr.lasere.TWS.world.biomes.BiomesModMain;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomesMod {
	
	
	public static void init() {
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(new BiomesModMain(100), 1));
	}
}
