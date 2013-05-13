package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mods.usefulfood.mod_usefulfood;

public class ItemSoupUF extends ItemUF {
	int foodlevel;
	float saturation;

	public ItemSoupUF(int var1, String name, int var2, float var3) {
		super(var1, name);
		this.setMaxStackSize(1);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.foodlevel = var2;
		this.saturation = var3;
	}

	public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
		}

		if (!world.isRemote) {
			player.getFoodStats().addStats(foodlevel, 0);
		}

		return itemstack.stackSize <= 0 ? new ItemStack(Item.bowlEmpty) : itemstack;
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
