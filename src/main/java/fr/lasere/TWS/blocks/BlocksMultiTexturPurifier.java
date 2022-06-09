package fr.lasere.TWS.blocks;

import fr.lasere.TWS.Reference;
import fr.lasere.TWS.blocks.tileEntity.TileEntityPurifier;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlocksMultiTexturPurifier extends Block{
	private IIcon face;
	private IIcon top_bottom;
	private IIcon side;
	private IIcon block_textur_default;

	public BlocksMultiTexturPurifier(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
	
	public void registerBlockIcons(IIconRegister iiconregisters) {
		this.face = iiconregisters.registerIcon(Reference.MOD_ID + ":purifier_face");
		this.top_bottom = iiconregisters.registerIcon(Reference.MOD_ID + ":purifier_top_bottom");
		this.side = iiconregisters.registerIcon(Reference.MOD_ID + ":purifier_side");
		this.block_textur_default = iiconregisters.registerIcon(Reference.MOD_ID + ":block_default");
    }
	
	  public IIcon getIcon(int side, int metadata) {
		  if(side == 1 || side == 0) {
				 return this.top_bottom;
			  }
		  if(side == 2 ||side == 3 || side == 4) {
				 return this.side;
			  }
		  if(side == 5) {
				 return this.face;
			  }
	        return this.block_textur_default;
	    }
	  
	  /* utile pour connaitre le side.
	  public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		  if(world.isRemote) {
			  player.addChatMessage(new ChatComponentText("side :" + side));
		  }
	        return true;
	    }*/

	  
	     
	  
	  
}
