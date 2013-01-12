package silentspy.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemJellyBowl extends ItemUsefulFood {
	public ItemJellyBowl(int var1, int var2, float var3, boolean var4) {
		super(var1, var2, var3, var4);
		this.setMaxStackSize(1);
	}

	public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		super.onFoodEaten(itemstack, world, player);
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 600, 0));
			}
		return new ItemStack(Item.bowlEmpty);
	}
}
