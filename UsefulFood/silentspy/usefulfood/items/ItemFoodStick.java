package silentspy.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodStick extends ItemUsefulFood {
	public ItemFoodStick(int var1, int var2, float var3, boolean var4) {
		super(var1, var2, var3, var4);
		this.setMaxStackSize(1);
	}

	public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		super.onFoodEaten(itemstack, world, player);
		return new ItemStack(Item.stick);
	}
}
