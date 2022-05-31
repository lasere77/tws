package fr.lasere.TWS.items;

import fr.lasere.TWS.Reference;
import fr.lasere.TWS.init.ItemMod;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.realms.RendererUtility;

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

}
