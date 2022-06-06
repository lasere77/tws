package fr.lasere.TWS.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.lasere.TWS.Reference;
import fr.lasere.TWS.TWS;
import fr.lasere.TWS.blocks.BlockCropsMod;
import fr.lasere.TWS.blocks.BlocksBasic;
import fr.lasere.TWS.blocks.BlocksMeta;
import fr.lasere.TWS.blocks.BlocksStrairsMod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockMod {
	
	public static Block galaxium_ore;
	public static Block galaxium_block;
	public static Block galaxium_strairs;
	public static Block galaxium_fence;
	public static Block cave_block;
	public static Block mossy_galaxium;
	public static Block galaxium_meteore;
	public static Block strawberry_block;
	public static Block purifier;
	
	public static void init() {
		galaxium_ore = new BlocksBasic(net.minecraft.block.material.Material.rock, 3).setCreativeTab(TWS.creativeTabMod).setBlockName("galaxium_ore").setBlockTextureName(Reference.MOD_ID + ":galaxium_ore").setHardness(60.0F).setResistance(2000.0F).setStepSound(Block.soundTypePiston);
		galaxium_block = new BlocksBasic(net.minecraft.block.material.Material.rock, 3).setCreativeTab(TWS.creativeTabMod).setBlockName("galaxium_block").setBlockTextureName(Reference.MOD_ID + ":galaxium_block").setHardness(10.0F).setResistance(2000.0F).setStepSound(Block.soundTypePiston);
		galaxium_strairs = new BlocksStrairsMod(galaxium_block, 0).setBlockName("galaxium_strairs").setCreativeTab(TWS.creativeTabMod).setResistance(2000.0F).setStepSound(Block.soundTypePiston);
		galaxium_fence = new BlocksFencesMod(Reference.MOD_ID + ":galaxium_block", net.minecraft.block.material.Material.rock).setBlockName("galaxium_fence").setCreativeTab(TWS.creativeTabMod).setHardness(10.0F).setResistance(2000.0F).setStepSound(Block.soundTypePiston);
		cave_block = new BlocksBasic(net.minecraft.block.material.Material.glass, 3).setCreativeTab(TWS.creativeTabMod).setBlockName("cave_block").setBlockTextureName(Reference.MOD_ID + ":cave_block").setLightOpacity(1).setStepSound(Block.soundTypeGlass); 
		mossy_galaxium = new BlocksBasic(net.minecraft.block.material.Material.rock, 2).setCreativeTab(TWS.creativeTabMod).setBlockName("mossy_galaxium").setBlockTextureName(Reference.MOD_ID + ":mossy_galaxium").setHardness(60.0F).setResistance(50.0F);
		galaxium_meteore = new BlocksBasic(net.minecraft.block.material.Material.rock, 4).setCreativeTab(TWS.creativeTabMod).setBlockName("galaxium_meteore").setBlockTextureName(Reference.MOD_ID + ":galaxium_meteore").setHardness(20.0F).setResistance(50.0F);
		strawberry_block = new BlockCropsMod().setBlockName("strawberry_block").setBlockTextureName(Reference.MOD_ID + ":strawberry_block");
		purifier = new BlocksMeta(null);
	}
	
	public static void register() {
		GameRegistry.registerBlock(galaxium_ore, galaxium_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(galaxium_block, galaxium_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(galaxium_strairs, galaxium_strairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(galaxium_fence, galaxium_fence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cave_block, cave_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mossy_galaxium, mossy_galaxium.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(galaxium_meteore, galaxium_meteore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(strawberry_block, strawberry_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(purifier, purifier.getUnlocalizedName().substring(5));
	}
}
