package fr.lasere.TWS.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.lasere.TWS.items.swords.ItemsSwordsGalaxium;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGlassBottle;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class CraftsMod {

	public static void init(){
		GameRegistry.addRecipe(new ItemStack(BlockMod.galaxium_block, 1), new Object[]{"###", "###", "###", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_ingot, 9), new Object[]{"#", '#', BlockMod.galaxium_block});
		GameRegistry.addSmelting(BlockMod.galaxium_ore, new ItemStack(ItemMod.galaxium_nugget), 1000.0F);
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_pickaxe, 1), new Object[] {"###", " s ", " k ", '#', ItemMod.galaxium_ingot, 'k', Items.gold_ingot, 's', ItemMod.galaxium_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_sword, 1), new Object[] {" k ", " # ", " s ", '#', ItemMod.galaxium_ingot, 'k', Items.gold_ingot, 's', ItemMod.galaxium_stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_ingot, 1), new Object[] {"###", "###", "###", '#', ItemMod.galaxium_nugget});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_nugget, 9), new Object[] {"#", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_helmet, 1), new Object[] {"###", "# #", "   ", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_leggings, 1), new Object[] {"###", "# #", "# #", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_chestplate, 1), new Object[] {"# #", "###", "###", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_boots, 1), new Object[] {"# #", "# #", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(BlockMod.galaxium_strairs, 6), new Object[] {"  #", " ##", "###",'#', BlockMod.galaxium_block});
		GameRegistry.addRecipe(new ItemStack(BlockMod.galaxium_fence, 6), new Object[] {"#h#", "#h#", '#', BlockMod.galaxium_block, 'h', ItemMod.galaxium_stick});
		GameRegistry.addRecipe(new ItemStack(BlockMod.cave_block, 1), new Object[] {"gng", "ngn", "gng", 'g', BlockMod.galaxium_block, 'n', ItemMod.galaxium_nugget});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_stick, 6), new Object[] {"#", "#", '#', ItemMod.galaxium_ingot});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_apple, 1), new Object[] {"###", "#a#", "###", '#', ItemMod.galaxium_ingot, 'a', Items.apple});
		GameRegistry.addRecipe(new ItemStack(ItemMod.galaxium_mixed_coal, 2), new Object[] {"###", "#c#", "###", '#', ItemMod.galaxium_ingot, 'c', Items.coal});
		GameRegistry.addRecipe(new ItemStack(ItemMod.seed_strawberry, 3), new Object[] {"###", "#s#", "###", '#', ItemMod.galaxium_ingot, 's', Items.wheat_seeds});
		GameRegistry.addRecipe(new ItemStack(BlockMod.galaxium_chest, 1),new Object[] {"#b#", "bcb", "#b#", '#', ItemMod.galaxium_ingot, 'b', BlockMod.galaxium_block, 'c', Blocks.chest});
	}
}
