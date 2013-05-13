package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodStick extends ItemFoodUF {
	public ItemFoodStick(int var1, String name, int var2, float var3, boolean var4) {
		super(var1, name, var2, var3, var4);
		this.setMaxStackSize(1);
	}

	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		super.onEaten(itemstack, world, player);
		return new ItemStack(Item.stick);
	}
}
