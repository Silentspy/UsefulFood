package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBowl extends ItemFoodUF {
	public ItemBowl(int var1, String name, int var2, float var3, boolean var4) {
		super(var1, name, var2, var3, var4);
		this.setMaxStackSize(1);
	}

	public ItemStack onEaten(ItemStack var1, World var2, EntityPlayer var3) {
		super.onEaten(var1, var2, var3);
		return new ItemStack(Item.bowlEmpty);
	}
}
