package fr.lasere.TWS.items.Pickaxes;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemsPickaxesGalaxium extends ItemPickaxe{

	public ItemsPickaxesGalaxium(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
	}
	
	/*
	 add effect/enchantment to this pickaxe
	 */
	public void onUpdate(ItemStack stack, World p_77663_2_, Entity entity, int p_77663_4_, boolean p_77663_5_) {
   	EntityPlayer player = (EntityPlayer)entity;
   	ItemStack equip = player.getCurrentEquippedItem();
   	if(equip == stack) {
   		player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 400, 0));
   		}
   	}
}
