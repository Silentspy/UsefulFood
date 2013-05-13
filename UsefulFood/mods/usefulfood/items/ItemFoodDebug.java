package mods.usefulfood.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mods.usefulfood.mod_usefulfood;

public class ItemFoodDebug extends ItemUF {
	public ItemFoodDebug(int id, String name) {
		super(id, name);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		if (!world.isRemote && !player.capabilities.isCreativeMode) 
		{
			player.getFoodStats().setFoodLevel(0);
			player.getFoodStats().setFoodSaturationLevel(0.0F);
		}
		return itemstack;
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{
		l.add("Weird, might it be good?");
	}
	
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack var1) {
		return EnumRarity.epic;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack var1) {
		return true;
	}
}
