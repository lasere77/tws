package fr.lasere.TWS.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister {
	
	
	public static void mainRegistie() {
		registerWorldGen(new WorldGenMod(), -1);
		registerWorldGen(new WorldGenMod(), 0);
		registerWorldGen(new WorldGenMod(), 1);
	}
	
	
	public static void registerWorldGen(IWorldGenerator iGenerator, int probability) {
		GameRegistry.registerWorldGenerator(iGenerator, probability);
	}
}
