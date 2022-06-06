 package fr.lasere.TWS.init;

import java.util.Random;

import fr.lasere.TWS.world.structures.StructureMeteore;
import fr.lasere.TWS.world.structures.StructureMod;
import net.minecraft.world.World;

public class StructureGenMod {
	
	public static final String structureMod = "structureMod";
	public static final String galaxium_meteore = "galaxium_meteore";
	
	public boolean generate(String string, World world, Random random, int x, int y, int z) {
		switch(string) {
			case structureMod:
				StructureMod.init(world, x, y, z);
				break;
			case galaxium_meteore:
				StructureMeteore.init(world, x, y, z);
				break;
		}
		return true;
	}
}
