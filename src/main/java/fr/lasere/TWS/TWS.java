package fr.lasere.TWS;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.lasere.TWS.blocks.tileEntity.TileEntityMeteor;
import fr.lasere.TWS.blocks.tileEntity.TileEntityPurifier;
import fr.lasere.TWS.init.BiomesMod;
import fr.lasere.TWS.init.BlockMod;
import fr.lasere.TWS.init.CraftsMod;
import fr.lasere.TWS.init.FuelHndlerMod;
import fr.lasere.TWS.init.ItemMod;
import fr.lasere.TWS.proxy.CommonProxy;
import fr.lasere.TWS.world.WorldRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class TWS {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	public static CreativeTabs creativeTabMod = new CreativeTabs("tws") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			return Item.getItemFromBlock(BlockMod.galaxium_ore);
		}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent envent) {
		BlockMod.init();
		BlockMod.register();
		ItemMod.init();
		ItemMod.register();
		CraftsMod.init();
		WorldRegister.mainRegistie();
		BiomesMod.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent envent) {
		proxy.registerRenders();
		GameRegistry.registerFuelHandler(new FuelHndlerMod());
		GameRegistry.registerTileEntity(TileEntityPurifier.class, Reference.MOD_ID + ":purifier");
		GameRegistry.registerTileEntity(TileEntityMeteor.class, Reference.MOD_ID + ":meteor");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent envent) {
		
	}
	
	
}
