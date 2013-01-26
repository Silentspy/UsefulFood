package usefulfood.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import usefulfood.mod_usefulfood;

public class ItemFoodDebug extends Item {
	public ItemFoodDebug(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setTextureFile(mod_usefulfood.itemtextures);
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		player.getFoodStats().setFoodLevel(0);
		player.getFoodStats().setFoodSaturationLevel(0.0F);
		return itemstack;
	}
	
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{
		l.add("Sets hunger and saturation to zero!");
	}
}
