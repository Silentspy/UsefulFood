package usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class ItemBowl extends ItemUsefulFood {
	public ItemBowl(int var1, int var2, float var3, boolean var4) {
		super(var1, var2, var3, var4);
		this.setMaxStackSize(1);
	}

	public ItemStack onFoodEaten(ItemStack var1, World var2, EntityPlayer var3) {
		super.onFoodEaten(var1, var2, var3);
		return new ItemStack(Item.bowlEmpty);
	}
}
