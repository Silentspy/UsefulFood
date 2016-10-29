package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemTea extends ItemBottle {

	int hearts;
	
	public ItemTea(String name, int hearts) {
		super(name, 0, 0.0F, true);
		this.hearts = hearts;
	}
	
	@Override
	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
			if(itemstack.stackSize > 0) {
				player.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
			}
		}

		if (!world.isRemote) {
			player.heal(hearts);
			if(removepoison) {
				player.removePotionEffect(Potion.poison.id);
			}
		}
		
		return itemstack.stackSize <= 0 ? new ItemStack(Items.glass_bottle) : itemstack;
	}
}
