package fr.lasere.TWS.blocks;

import fr.lasere.TWS.blocks.tileEntity.TileEntityMeteor;
import fr.lasere.TWS.blocks.tileEntity.TileEntityPurifier;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockMeteor extends Block{
	
	public BlockMeteor(Material material) {
		super(material);
	}
	
	
	
	/*
	* call tileentity
	*/
	public boolean hasTileEntity(int metadata) {
		return true;
	}

	public TileEntity createTileEntity(World world, int metadata) {
		return new TileEntityPurifier();
	} 
	
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		return true;
  }
	
    public void breakBlock(World world, int x, int y, int z, Block block, int metadata) {
        TileEntity tileentity = (TileEntity)world.getTileEntity(x, y, z);

        if (tileentity instanceof IInventory) {
        	IInventory inv = ((IInventory)tileentity);
            for (int i1 = 0; i1 < inv.getSizeInventory(); ++i1) {
                ItemStack itemstack = inv.getStackInSlot(i1);

                if (itemstack != null)  {
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

                        if (itemstack.hasTagCompound()){
                            entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                        }
                    }
                }
            }

            world.func_147453_f(x, y, z, block);
        }

        super.breakBlock(world, x, y, z, block, metadata);
    }
    
    public void onBlockPlacedBy(World worl, int x, int y, int z, EntityLivingBase living, ItemStack stack) {
    	if(stack.getItemDamage() == 0) {
    		TileEntity tile = worl.getTileEntity(x, y, z);
    		if(tile instanceof TileEntityMeteor) {
    			if(stack.hasDisplayName()) {
    	    		((TileEntityMeteor)tile).setCustomName(stack.getDisplayName());
    	    	}
    		}
    	}
    	
    }
}
