package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import mods.usefulfood.mod_usefulfood;

public class ItemBottle extends ItemUF {

	int foodlevel;
	float saturation;
	boolean removepoison = false;
	
	public ItemBottle(int id, String name, int foodlevel, float saturation, boolean removepoison) {
		super(id, name);
		this.setMaxStackSize(16);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.foodlevel = foodlevel;
		this.saturation = saturation;
		this.removepoison = removepoison;
	}
	
	public ItemBottle(int id, String name, int var2, float var3) {
		super(id, name);
		this.setMaxStackSize(16);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.foodlevel = var2;
		this.saturation = var3;
	}
	
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        return false;
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
			player.getFoodStats().addStats(foodlevel, saturation);
			if(removepoison) {
				player.removePotionEffect(Potion.poison.id);
			}
		}
		
		return itemstack.stackSize <= 0 ? new ItemStack(Item.glassBottle) : itemstack;
	}

	/**
	 * How long it takes to use or consume an item
	 */
	public int getMaxItemUseDuration(ItemStack itemstack) {
		return 32;
	}

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	public EnumAction getItemUseAction(ItemStack itemstack) {
		return EnumAction.drink;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		player.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));
		return itemstack;
	}
}
