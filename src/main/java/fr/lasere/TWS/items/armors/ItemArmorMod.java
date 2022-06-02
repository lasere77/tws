package fr.lasere.TWS.items.armors;

import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;

import fr.lasere.TWS.Reference;
import fr.lasere.TWS.init.ItemMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.realms.RendererUtility;
import net.minecraft.world.World;

public class ItemArmorMod extends ItemArmor{

	public ItemArmorMod(ArmorMaterial material, int idArmor, int metaData) {
		super(material, idArmor, metaData);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == ItemMod.galaxium_leggings) {
			return Reference.MOD_ID + ":textures/models/armor/galaxium_layer_2.png";
		}
		else if (stack.getItem() == ItemMod.galaxium_helmet || stack.getItem() == ItemMod.galaxium_chestplate || stack.getItem() == ItemMod.galaxium_boots) {
			return Reference.MOD_ID + ":textures/models/armor/galaxium_layer_1.png";
		}
		return null;
	}
	
	/*
	 add effect/enchantment to this armor
	 */
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if(this == ItemMod.galaxium_helmet) {
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 400, 0));
		}
		if(this == ItemMod.galaxium_chestplate) {
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 400, 0));
		}
		if(this == ItemMod.galaxium_leggings) {
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 400, 0));
		}
	}

}
