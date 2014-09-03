package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemCheese extends ItemFoodUF {
	public ItemCheese(String name, int var2, float var3, boolean var4) {
		super(name, var2, var3, var4);
	}

	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		super.onEaten(itemstack, world, player);

		if (!world.isRemote) {
			player.removePotionEffect(Potion.poison.id);
		}
		return itemstack;
	}
}
