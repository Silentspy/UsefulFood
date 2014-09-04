package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import mods.usefulfood.mod_usefulfood;

public class ItemBottle extends ItemFoodUF {

	int foodlevel;
	float saturation;
	boolean removepoison = false;
	
	public ItemBottle(String name, int foodlevel, float saturation, boolean removepoison) {
		super(name, 0, 0, false);
		this.setMaxStackSize(16);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.foodlevel = foodlevel;
		this.saturation = saturation;
		this.removepoison = removepoison;
	}
	
	public ItemBottle(String name, int foodlevel, float saturation) {
		super(name, 0, 0, false);
		this.setMaxStackSize(16);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.foodlevel = foodlevel;
		this.saturation = saturation;
	}
	
    public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
			if(itemstack.stackSize > 0) player.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
		}

		if (!world.isRemote) {
			player.getFoodStats().addStats(foodlevel, saturation);
			world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
			if(this.removepoison) player.removePotionEffect(Potion.poison.id);
		}
		
		return itemstack.stackSize <= 0 ? new ItemStack(Items.glass_bottle) : itemstack;
	}

	/**
	 * How long it takes to use or consume an item
	 */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 16;
    }

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }

	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
}
