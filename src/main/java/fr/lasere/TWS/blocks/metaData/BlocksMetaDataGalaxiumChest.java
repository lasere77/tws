package fr.lasere.TWS.blocks.metaData;

import java.util.List;
import java.util.Random;

import fr.lasere.TWS.Reference;
import fr.lasere.TWS.blocks.tileEntity.TileEntityGalaxiumChest;
import fr.lasere.TWS.blocks.tileEntity.TileEntityPurifier;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlocksMetaDataGalaxiumChest extends Block{



	public BlocksMetaDataGalaxiumChest(Material p_i45394_1_) {
		super(p_i45394_1_);
	}


	/*
	 * metaData of purifier block and multiTexture and call "TileEntityPurifier"
	 */
	
    private IIcon face;
	private IIcon top_bottom;
	private IIcon side;
	private IIcon block_textur_default;
	
	
	public static String[] subBlock = new String[] {"galaxium_chest"};
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
    	this.face = iiconregisters.registerIcon(Reference.MOD_ID + ":galaxium_chest_face");
		this.top_bottom = iiconregisters.registerIcon(Reference.MOD_ID + ":galaxium_chest_top_bottom");
		this.side = iiconregisters.registerIcon(Reference.MOD_ID + ":galaxium_chest_side");
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
    	return this.getIcon(side, world.getBlockMetadata(x, y, z));
    }
    
    
    public IIcon getIcon(int side, int metaData) {
    	if(side == 1 || side == 0) {
			 return this.top_bottom;
		  }
  	  if((side == 4 && metaData == 0) || (side == 4 && metaData == 1) || (side == 2 && metaData == 2) || (side == 5 && metaData == 3)) {
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
  			return new TileEntityGalaxiumChest();
  		}
  		return null;
	} 
	
  	
  	
  	
  	public boolean onBlockActivated(World worl, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (worl.isRemote) {
            return true;
        }else {
        	player.openGui(Reference.instance, 0, worl, x, y, z);
            return true;
        }
    }
	
	
	public void breakBlock(World world, int x, int y, int z, Block block, int metaData) {
        TileEntity tileentity = world.getTileEntity(x, y, z);

        if (tileentity instanceof IInventory) {
        	IInventory inv = ((IInventory)tileentity);
            for (int i1 = 0; i1 < inv.getSizeInventory(); ++i1) {
                ItemStack itemstack = inv.getStackInSlot(i1);

                if (itemstack != null) {
                    float f = world.rand.nextFloat() * 0.8F + 0.1F;
                    float f1 = world.rand.nextFloat() * 0.8F + 0.1F;
                    EntityItem entityitem;

                    for (float f2 = world.rand.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; world.spawnEntityInWorld(entityitem)) {
                        int j1 = world.rand.nextInt(21) + 10;

                        if (j1 > itemstack.stackSize) {
                            j1 = itemstack.stackSize;
                        }

                        itemstack.stackSize -= j1;
                        entityitem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));
                        float f3 = 0.05F;
                        entityitem.motionX = (double)((float)world.rand.nextGaussian() * f3);
                        entityitem.motionY = (double)((float)world.rand.nextGaussian() * f3 + 0.2F);
                        entityitem.motionZ = (double)((float)world.rand.nextGaussian() * f3);

                        if (itemstack.hasTagCompound()) {
                            entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                        }
                    }
                }
            }

            world.func_147453_f(x, y, z, block);
        }

        super.breakBlock(world, x, y, z, block, metaData);
    }


}
