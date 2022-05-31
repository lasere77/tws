package fr.lasere.TWS.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.lasere.TWS.items.ItemsSwords;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class CraftsMod {

	public static void init(){
		GameRegistry.addRecipe(new ItemStack(BlockMod.galaxium_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_ingot, 9), new Object[]{"#", '#', BlockMod.galaxium_block});
		GameRegistry.addSmelting(BlockMod.galaxium_ore, new ItemStack(ItemMod.galaxium_nugget), 1000.0F);
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_pickaxe, 1), new Object[] {"###", " # ", " k ", '#', ItemMod.galaxium_ingot, 'k', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_sword, 1), new Object[] {" k ", " # ", " # ", '#', ItemMod.galaxium_ingot, 'k', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_ingot, 1), new Object[] {"###", "###", "###", '#', ItemMod.galaxium_nugget});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_nugget, 9), new Object[] {"#", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_helmet, 1), new Object[] {"###", "# #", "   ", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_leggings, 1), new Object[] {"###", "# #", "# #", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_chestplate, 1), new Object[] {"# #", "###", "###", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_boots, 1), new Object[] {"# #", "# #", '#', ItemMod.galaxium_ingot});
	}
}
