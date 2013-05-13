package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemJellyBowl extends ItemFoodUF {
	public ItemJellyBowl(int var1, String name, int var2, float var3, boolean var4) {
		super(var1, name, var2, var3, var4);
		this.setMaxStackSize(1);
	}

	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		super.onEaten(itemstack, world, player);
			if (!world.isRemote) 
			{
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 600, 0));
			}
		return new ItemStack(Item.bowlEmpty);
	}
}
