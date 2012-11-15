package silentspy.usefulfood.items;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumAction;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import silentspy.usefulfood.mod_usefulfood;

public class ItemCarrotSoup extends Item {
	int foodlevel;
	float saturation;

	public ItemCarrotSoup(int var1, int var2, float var3) {
		super(var1);
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
