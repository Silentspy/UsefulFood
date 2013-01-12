package silentspy.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemCheese extends ItemUsefulFood {
	public ItemCheese(int var1, int var2, float var3, boolean var4) {
		super(var1, var2, var3, var4);
	}

	public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		super.onFoodEaten(itemstack, world, player);

		if (!world.isRemote) {
			player.removePotionEffect(Potion.poison.id);
		}
		return itemstack;
	}
}
