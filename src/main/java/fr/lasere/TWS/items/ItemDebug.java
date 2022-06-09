package fr.lasere.TWS.items;

import fr.lasere.TWS.blocks.tileEntity.TileEntityPurifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemDebug extends Item{
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
    	if(!world.isRemote) {
            player.addChatMessage(new ChatComponentText("serve : side " + side));
            player.addChatMessage(new ChatComponentText("serv : metadata"  + world.getBlockMetadata(x, y, z)));
            TileEntity tile = world.getTileEntity(x, y, z);
            if(tile instanceof TileEntityPurifier) {
            	player.addChatMessage(new ChatComponentText("serve : direction " + ((TileEntityPurifier)tile).getDirection()));
            }
    	}else {
    		player.addChatMessage(new ChatComponentText("client : side " + side));
            player.addChatMessage(new ChatComponentText("client : metadata"  + world.getBlockMetadata(x, y, z)));
            TileEntity tile = world.getTileEntity(x, y, z);
            if(tile instanceof TileEntityPurifier) {
            	player.addChatMessage(new ChatComponentText("client : direction " + ((TileEntityPurifier)tile).getDirection()));
            }
		}
    	world.getBlock(x, y, z).rotateBlock(world, x, y, z,  ForgeDirection.getOrientation(side));
    	return false;
    }
}
