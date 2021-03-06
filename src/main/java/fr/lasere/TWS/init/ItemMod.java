package fr.lasere.TWS.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.lasere.TWS.Reference;
import fr.lasere.TWS.TWS;
import fr.lasere.TWS.items.ItemDebug;
import fr.lasere.TWS.items.ItemSeedMod;
import fr.lasere.TWS.items.Food.ItemFoodGalaxiumApple;
import fr.lasere.TWS.items.Food.ItemsFoodMod;
import fr.lasere.TWS.items.Pickaxes.ItemsPickaxesGalaxium;
import fr.lasere.TWS.items.armors.ItemArmorMod;
import fr.lasere.TWS.items.swords.ItemsSwordsGalaxium;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod {
	
	public static ToolMaterial GALAXIUM = EnumHelper.addToolMaterial("GALAXIUM", 4, 2500, 15, 6, 12);
	public static ArmorMaterial GALAXIUMA =  EnumHelper.addArmorMaterial("GALAXIUMA", 40, new int[]{13, 20, 16, 10}, 12);
	
	public static Item galaxium_ingot;
	public static Item galaxium_sword;
	public static Item galaxium_pickaxe;
	public static Item galaxium_nugget;
	public static Item galaxium_helmet;
	public static Item galaxium_chestplate;
	public static Item galaxium_leggings;
	public static Item galaxium_boots;
	public static Item galaxium_stick;
	public static Item galaxium_apple;
	public static Item galaxium_mixed_coal;
	public static Item seed_strawberry;
	public static Item strawberry;
	public static Item debug_stick;
	public static Item fex;
	public static Item flex;
	public static Item flex_and_fex;

	public static void init() {
		galaxium_ingot = new Item().setUnlocalizedName("galaxium_ingot").setCreativeTab(TWS.creativeTabMod).setTextureName(Reference.MOD_ID + ":galaxium_ingot");
		galaxium_sword = new ItemsSwordsGalaxium(GALAXIUM).setUnlocalizedName("galaxium_sword").setTextureName(Reference.MOD_ID + ":galaxium_sword").setCreativeTab(TWS.creativeTabMod);
		galaxium_pickaxe = new ItemsPickaxesGalaxium(GALAXIUM).setUnlocalizedName("galaxium_pickaxe").setTextureName(Reference.MOD_ID + ":galaxium_pickaxe").setCreativeTab(TWS.creativeTabMod);
		galaxium_nugget = new Item().setUnlocalizedName("galaxium_nugget").setTextureName(Reference.MOD_ID + ":galaxium_nugget").setCreativeTab(TWS.creativeTabMod);
		galaxium_helmet = new ItemArmorMod(GALAXIUMA, 0, 0).setUnlocalizedName("galaxium_helmet").setTextureName(Reference.MOD_ID + ":galaxium_helmet").setCreativeTab(TWS.creativeTabMod);
		galaxium_chestplate = new ItemArmorMod(GALAXIUMA, 0, 1).setUnlocalizedName("galaxium_chestplate").setTextureName(Reference.MOD_ID + ":galaxium_chestplate").setCreativeTab(TWS.creativeTabMod);
		galaxium_leggings = new ItemArmorMod(GALAXIUMA, 0, 2).setUnlocalizedName("galaxium_leggings").setTextureName(Reference.MOD_ID + ":galaxium_leggings").setCreativeTab(TWS.creativeTabMod);
		galaxium_boots = new ItemArmorMod(GALAXIUMA, 0, 3).setUnlocalizedName("galaxium_boots").setTextureName(Reference.MOD_ID + ":galaxium_boots").setCreativeTab(TWS.creativeTabMod); 
		galaxium_stick = new Item().setUnlocalizedName("galaxium_stick").setCreativeTab(TWS.creativeTabMod).setTextureName(Reference.MOD_ID + ":galaxium_stick");
		galaxium_apple = new ItemFoodGalaxiumApple(15, 10.0F, false).setAlwaysEdible().setCreativeTab(TWS.creativeTabMod).setTextureName(Reference.MOD_ID + ":galaxium_apple").setUnlocalizedName("galaxium_apple");
		galaxium_mixed_coal = new Item().setUnlocalizedName("galaxium_mixed_coal").setCreativeTab(TWS.creativeTabMod).setTextureName(Reference.MOD_ID + ":galaxium_mixed_coal");
		seed_strawberry = new ItemSeedMod(BlockMod.strawberry_block, Blocks.farmland).setUnlocalizedName("seed_strawberry").setCreativeTab(TWS.creativeTabMod).setTextureName(Reference.MOD_ID + ":seed_strawberry");
		strawberry = new ItemsFoodMod(4, 2.0F, false).setUnlocalizedName("strawberry").setCreativeTab(TWS.creativeTabMod).setTextureName(Reference.MOD_ID + ":strawberry");
		debug_stick = new ItemDebug().setUnlocalizedName("debug_stick").setTextureName(Reference.MOD_ID + ":debug_stick").setCreativeTab(TWS.creativeTabMod);
		fex = new Item().setUnlocalizedName("fex").setCreativeTab(TWS.creativeTabMod).setTextureName(Reference.MOD_ID + ":fex");
		flex = new Item().setUnlocalizedName("flex").setCreativeTab(TWS.creativeTabMod).setTextureName(Reference.MOD_ID + ":flex");
		flex_and_fex= new Item().setUnlocalizedName("flex_and_fex").setCreativeTab(TWS.creativeTabMod).setTextureName(Reference.MOD_ID + ":flex_and_fex");
		
		}
	
	public static void register() {
		GameRegistry.registerItem(galaxium_ingot, "galaxium_ingot");
		GameRegistry.registerItem(galaxium_sword, "galaxium_sword");
		GameRegistry.registerItem(galaxium_pickaxe, "galaxium_pickaxe");
		GameRegistry.registerItem(galaxium_nugget, "galaxium_nugget");
		GameRegistry.registerItem(galaxium_helmet, "galaxium_helmet");
		GameRegistry.registerItem(galaxium_chestplate, "galaxium_chesplate");
		GameRegistry.registerItem(galaxium_leggings, "galaxium_leggings");
		GameRegistry.registerItem(galaxium_boots, "galaxium_boot");
		GameRegistry.registerItem(galaxium_stick, "galaxium_stick");
		GameRegistry.registerItem(galaxium_apple, "galaxium_apple");
		GameRegistry.registerItem(galaxium_mixed_coal, "galaxium_mixed_coal");
		GameRegistry.registerItem(seed_strawberry, "seed_strawberry");
		GameRegistry.registerItem(strawberry, "strawberry");
		GameRegistry.registerItem(debug_stick, "debug_stick");
		GameRegistry.registerItem(fex, "fex");
		GameRegistry.registerItem(flex, "flex");
		GameRegistry.registerItem(flex_and_fex, "flex_and_fex");
		
	}
}
