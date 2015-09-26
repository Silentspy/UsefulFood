package mods.usefulfood.items;

import mods.usefulfood.UF;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSoupUF extends ItemBowl {
	int foodlevel;
	float saturation;

	public ItemSoupUF(String name, int var2, float var3) {
		super(name, var2, var3, false);
		this.setMaxStackSize(1);
		this.setCreativeTab(UF.tabUsefulFood);
		this.foodlevel = var2;
		this.saturation = var3;
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
		return EnumAction.DRINK;
	}

}
