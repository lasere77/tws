package fr.lasere.TWS.blocks;

import fr.lasere.TWS.init.ItemMod;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockCropsMod extends BlockCrops {
	
	protected Item func_149866_i()
    {
        return ItemMod.seed_strawberry;
    }
	
	 protected Item func_149865_P()
	    {
	        return ItemMod.strawberry;
	    }

}
