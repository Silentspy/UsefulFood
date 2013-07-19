package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.stats.StatBase;
import net.minecraft.world.World;

public class ItemTea extends ItemBottle {

	int hearts;
	
	public ItemTea(int id, String name, int hearts) {
		super(id, name, 0, 0.0F, true);
		this.hearts = hearts;
	}
	
	@Override
	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
			if(itemstack.stackSize > 0) {
				player.inventory.addItemStackToInventory(new ItemStack(Item.glassBottle));
			}
		}

		if (!world.isRemote) {
			player.heal(hearts);
			if(removepoison) {
				player.removePotionEffect(Potion.poison.id);
			}
		}
		
		return itemstack.stackSize <= 0 ? new ItemStack(Item.glassBottle) : itemstack;
	}
}
