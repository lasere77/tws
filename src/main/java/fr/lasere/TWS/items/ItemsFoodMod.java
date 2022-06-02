package fr.lasere.TWS.items;

import fr.lasere.TWS.init.BlockMod;
import fr.lasere.TWS.init.ItemMod;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemsFoodMod extends ItemFood{

	public ItemsFoodMod(int demi_gigo, float saturation, boolean p_i45339_3_) {
		super(demi_gigo, saturation, p_i45339_3_);
	}
	
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1500, 3));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 15000, 3));
		player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 15000, 3));
		player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 15000, 3));
		player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 15000, 3));
    }

}
