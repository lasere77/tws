package fr.lasere.TWS.init;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelHndlerMod implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == ItemMod.galaxium_mixed_coal) {
			return 6350;
		}
		return 0;
	}
	
}
