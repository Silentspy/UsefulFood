package silentspy.usefulfood.items;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class ItemJellyBowl extends ItemUsefulFood {
	public ItemJellyBowl(int var1, int var2, float var3, boolean var4) {
		super(var1, var2, var3, var4);
		this.setMaxStackSize(1);
	}

	public ItemStack onFoodEaten(ItemStack itemstack, World world,
			EntityPlayer player) {
		super.onFoodEaten(itemstack, world, player);
		if (!world.isRemote) {
			player.curePotionEffects(itemstack);
		}
		return new ItemStack(Item.bowlEmpty);
	}
}
