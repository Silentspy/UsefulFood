package usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import usefulfood.mod_usefulfood;

public class ItemPumpkinsoup extends Item {
	int foodlevel;
	float saturation;

	public ItemPumpkinsoup(int id, int var2, float var3) {
		super(id);
		this.setMaxStackSize(1);
		this.setTextureFile(mod_usefulfood.itemtextures);
		this.foodlevel = var2;
		this.saturation = var3;
	}

	public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
		}

		if (!world.isRemote) {
			player.getFoodStats().addStats(foodlevel, saturation);

		}

		return new ItemStack(Item.bowlEmpty);
	}

	/**
	 * How long it takes to use or consume an item
	 */
	public int getMaxItemUseDuration(ItemStack itemstack) {
		return 32;
	}

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	public EnumAction getItemUseAction(ItemStack itemstack) {
		return EnumAction.drink;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		player.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));
		return itemstack;
	}

}
