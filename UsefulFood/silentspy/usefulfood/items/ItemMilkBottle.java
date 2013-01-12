package silentspy.usefulfood.items;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import silentspy.usefulfood.mod_usefulfood;

public class ItemMilkBottle extends ItemBottle {
	public ItemMilkBottle(int id, int var2, float var3) 
	{
		super(id, var2, var3);
	}

	public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
			if(itemstack.stackSize > 0) {
				player.inventory.addItemStackToInventory(new ItemStack(Item.glassBottle));
			}
		}

		if (!world.isRemote) {
			player.removePotionEffect(Potion.poison.id);
		}

		return itemstack.stackSize <= 0 ? new ItemStack(Item.glassBottle) : itemstack;
	}
}
