package fr.lasere.TWS.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlocksMeta extends Block{

	public static String[] subBlock = new String[] {"face", "side", "bottom", "top"};
	public IIcon[] iconArray = new IIcon[subBlock.length];
	
	protected BlocksMeta(Material material) {
		super(material.rock);
	}
	public int damageDropped(int metaData) {
        return metaData;
    }
	
    public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
    	for(int i = 0; i < subBlock.length; i++) {
    		list.add(new ItemStack(item, 1, i));
    	}
    }
	
    public IIcon getIcon(int side, int metaData) {
        return this.blockIcon;
    }
	
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(this.getTextureName());
    }

}
