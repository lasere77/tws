package fr.lasere.TWS.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.lasere.TWS.Reference;
import fr.lasere.TWS.items.ItemArmorMod;
import fr.lasere.TWS.items.ItemsPickaxesMod;
import fr.lasere.TWS.items.ItemsSwords;
import net.minecraft.creativetab.CreativeTabs;
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
	
	public static void init() {
		galaxium_ingot = new Item().setUnlocalizedName("galaxium_ingot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Reference.MOD_ID + ":galaxium_ingot");
		galaxium_sword = new ItemsSwords(GALAXIUM).setUnlocalizedName("galaxium_sword").setTextureName(Reference.MOD_ID + ":galaxium_sword");
		galaxium_pickaxe = new ItemsPickaxesMod(GALAXIUM).setUnlocalizedName("galaxium_pickaxe").setTextureName(Reference.MOD_ID + ":galaxium_pickaxe");
		galaxium_nugget = new Item().setUnlocalizedName("galaxium_nugget").setTextureName(Reference.MOD_ID + ":galaxium_nugget").setCreativeTab(CreativeTabs.tabMaterials);
		galaxium_helmet = new ItemArmorMod(GALAXIUMA, 0, 0).setUnlocalizedName("galaxium_helmet").setTextureName(Reference.MOD_ID + ":galaxium_helmet").setCreativeTab(CreativeTabs.tabCombat);
		galaxium_chestplate = new ItemArmorMod(GALAXIUMA, 0, 1).setUnlocalizedName("galaxium_chestplate").setTextureName(Reference.MOD_ID + ":galaxium_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		galaxium_leggings = new ItemArmorMod(GALAXIUMA, 0, 2).setUnlocalizedName("galaxium_leggings").setTextureName(Reference.MOD_ID + ":galaxium_leggings").setCreativeTab(CreativeTabs.tabCombat);
		galaxium_boots = new ItemArmorMod(GALAXIUMA, 0, 3).setUnlocalizedName("galaxium_boots").setTextureName(Reference.MOD_ID + ":galaxium_boots").setCreativeTab(CreativeTabs.tabCombat); 
		galaxium_stick = new Item().setUnlocalizedName("galaxium_stick").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Reference.MOD_ID + ":galaxium_stick");
		
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
		
	}
}
