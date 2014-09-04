package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodStick extends ItemFoodUF {
	public ItemFoodStick(String name, int Hunger, float Saturation, boolean CanWolfEat) {
		super(name, Hunger, Saturation, CanWolfEat);
		this.setMaxStackSize(1);
	}

	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		super.onEaten(itemstack, world, player);
		return new ItemStack(Items.stick);
	}
}
