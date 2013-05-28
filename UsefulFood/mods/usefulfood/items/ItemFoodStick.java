package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodStick extends ItemFoodUF {
	public ItemFoodStick(int var1, String name, int Hunger, float Saturation, boolean CanWolfEat) {
		super(var1, name, Hunger, Saturation, CanWolfEat);
		this.setMaxStackSize(1);
	}

	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		super.onEaten(itemstack, world, player);
		return new ItemStack(Item.stick);
	}
}
