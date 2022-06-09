package fr.lasere.TWS.items.swords;

import fr.lasere.TWS.init.ItemMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;


public class ItemsSwordsGalaxium extends ItemSword{

	public ItemsSwordsGalaxium(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}
    
	/*
	 add effect/enchantment to this sword
	 */
	public void onUpdate(ItemStack stack, World p_77663_2_, Entity entity, int p_77663_4_, boolean p_77663_5_) {
    	EntityPlayer player = (EntityPlayer)entity;
    	ItemStack equip = player.getCurrentEquippedItem();
    	if(equip == stack) {
    		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 400, 0));
    	}
    }
	
}
