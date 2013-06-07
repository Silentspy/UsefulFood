package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBowl extends ItemFoodUF {
	public ItemBowl(int id, String name, int hunger, float saturation, boolean curepoison) {
		super(id, name, hunger, saturation, false);
		this.setMaxStackSize(1);
	}
	
	public ItemStack onEaten(ItemStack var1, World var2, EntityPlayer var3) {
		super.onEaten(var1, var2, var3);
		return new ItemStack(Item.bowlEmpty);
	}
}
