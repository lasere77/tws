package fr.lasere.TWS.blocks.metaData;

import java.util.List;

import fr.lasere.TWS.Reference;
import fr.lasere.TWS.blocks.tileEntity.TileEntityPurifier;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.common.util.RotationHelper;

public class BlocksMetaDataPurifier extends Block{
	
	/*
	 * metaData of purifier block and multiTexture and call "TileEnriryPurifier"
	 */
	
    private IIcon face;
	private IIcon top_bottom;
	private IIcon side;
	private IIcon block_textur_default;
	
	public BlocksMetaDataPurifier(Material material) {
		super(material);
	}
	
	public static String[] subBlock = new String[] {"Purifier"};
	public IIcon[] iconArray = new IIcon[subBlock.length];
	
	public int damageDropped(int metaData) {
        return metaData;
    }
	
	
    public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
    	for(int i = 0; i < subBlock.length; i++) {
    		list.add(new ItemStack(item, 1, i));
    	}
    }
    
    public void registerBlockIcons(IIconRegister iiconregisters) {
    	this.face = iiconregisters.registerIcon(Reference.MOD_ID + ":purifier_face");
		this.top_bottom = iiconregisters.registerIcon(Reference.MOD_ID + ":purifier_top_bottom");
		this.side = iiconregisters.registerIcon(Reference.MOD_ID + ":purifier_side");
		this.block_textur_default = iiconregisters.registerIcon(Reference.MOD_ID + ":block_default");
    }
    
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack)
    {
    	if(stack.getItemDamage() == 0) {
    		TileEntity tile = world.getTileEntity(x, y, z);
    		if(tile instanceof TileEntityPurifier) {
    			int direction = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
    			((TileEntityPurifier)tile).setDirection((byte)direction);
    		}
    	}
    }
    
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
    	if(side == 0 || side == 1) {
    		return this.top_bottom;
    		}
    	TileEntity tile = world.getTileEntity(x, y, z);
    	if(tile instanceof TileEntityPurifier) {
    		byte direction = ((TileEntityPurifier)tile).getDirection();
     	  if((side == 3 && direction == 0) || (side == 4 && direction == 1) || (side == 2 && direction == 2) || (side == 5 && direction == 3)) {
   			 return this.face;
   		  }
    	  if(side == 3 || side == 4 || side == 2 || side == 5) {
 			 return this.side;
 		  }

    	}
    	return this.block_textur_default;
    	//return this.getIcon(side, world.getBlockMetadata(x, y, z));
    }
    
    
    public IIcon getIcon(int side, int metaData) {
    	if(side == 1 || side == 0) {
			 return this.top_bottom;
		  }
  	  if((side == 3 && metaData == 0) || (side == 4 && metaData == 1) || (side == 2 && metaData == 2) || (side == 5 && metaData == 3)) {
			 return this.face;
		  }
	  if(side == 3 || side == 4 || side == 2 || side == 5) {
			 return this.side;
		  }
	  return this.block_textur_default;
    }
    
       /*
	   * call tileentity
	   */
  	public boolean hasTileEntity(int metadata) {
  		if(metadata == 0 || metadata == 1) {
  			return true;
  		}
		return false;
	}

  	public TileEntity createTileEntity(World world, int metadata) {
  		if(metadata == 0) {
  			return new TileEntityPurifier();
  		}
  		return null;
	} 
	
  	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		return true;
    }
}
