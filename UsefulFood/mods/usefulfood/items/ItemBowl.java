package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemBowl extends ItemFoodUF {
	
	boolean removepoison = false;
	
	public ItemBowl(int id, String name, int hunger, float saturation, boolean removepoison) {
		super(id, name, hunger, saturation, false);
		this.setMaxStackSize(1);
		this.removepoison = removepoison;
	}
	
	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		super.onEaten(itemstack, world, player);
		if (!world.isRemote){
			if(removepoison) {
				player.removePotionEffect(Potion.poison.id);
			}
		}
		return new ItemStack(Item.bowlEmpty);
	}
}
