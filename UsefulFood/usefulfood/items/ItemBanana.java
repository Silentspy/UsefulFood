package usefulfood.items;

import java.util.Random;

import usefulfood.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBanana extends Item
{
    public ItemBanana(int var1)
    {
        super(var1);
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setTextureFile(mod_usefulfood.itemtextures);
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
    	if (!player.capabilities.isCreativeMode)
        {
    		if(itemstack.stackSize > 1) {
	    		if(player.inventory.addItemStackToInventory(new ItemStack(UsefulFoodItems.Bananapeeled, 1))) {
	    			--itemstack.stackSize;
	    		}
    		}
    		return itemstack.stackSize <= 1 ? new ItemStack(UsefulFoodItems.Bananapeeled) : itemstack;
        }
    	else 
        {
        	player.inventory.addItemStackToInventory(new ItemStack(UsefulFoodItems.Bananapeeled));
        }
    	return itemstack;
    }
}
