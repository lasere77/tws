package fr.lasere.TWS.blocks.container;

import fr.lasere.TWS.blocks.tileEntity.TileEntityGalaxiumChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class ContainerGalaxiumChest extends Container{

	private final TileEntityGalaxiumChest tile;
	
	public ContainerGalaxiumChest(TileEntityGalaxiumChest tile, InventoryPlayer inventory) {
		this.tile = tile;
		tile.openInventory();
		for (int j = 0; j < 3; ++j) {
            for (int k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(tile, k + j * 9, 8 + k * 18, 18 + j * 18));
            }
        }
		this.bindPlayerInventory(inventory);
	}
	
	private  void bindPlayerInventory(InventoryPlayer inv) {
		for (int j = 0; j < 3; ++j) {
            for (int k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(inv, k + j * 9 + 9, 8 + k * 18, 103 + j * 18 - 14));
            }
        }

        for (int j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot(inv, j, 8 + j * 18, 161 - 15));
        }
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.tile.isUseableByPlayer(player);
	}
	
    public void onContainerClosed(EntityPlayer player) {
        super.onContainerClosed(player);
        this.tile.closeInventory();
    }
    
    
    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ < this.tile.getSizeInventory())  {
                if (!this.mergeItemStack(itemstack1, this.tile.getSizeInventory(), this.inventorySlots.size(), true)) {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, this.tile.getSizeInventory(), false)) {
                return null;
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack((ItemStack)null);
            }else {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

}
