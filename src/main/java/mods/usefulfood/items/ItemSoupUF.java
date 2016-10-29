package mods.usefulfood.items;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Optional;
import mods.usefulfood.mod_usefulfood;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import squeek.applecore.api.food.FoodValues;
import squeek.applecore.api.food.IEdible;
import squeek.applecore.api.food.ItemFoodProxy;

@Optional.Interface(iface = "squeek.applecore.api.food.IEdible", modid = "AppleCore")
public class ItemSoupUF extends ItemUF implements IEdible {
	int foodlevel;
	float saturation;

	//Object because reasons
	private Object foodValues;

	public ItemSoupUF(String name, int var2, float var3) {
		super(name);
		this.setMaxStackSize(1);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.foodlevel = var2;
		this.saturation = var3;
	}

	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
		}

		if (!world.isRemote) {
			if(Loader.isModLoaded("AppleCore")) {
				eatAppleCore(itemstack, world, player);
			} else {
				eatVanilla(itemstack, world, player);
			}
			
		}

		return itemstack.stackSize <= 0 ? new ItemStack(Items.bowl) : itemstack;
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
	
	public void eatVanilla(ItemStack itemstack, World world, EntityPlayer player) {
		player.getFoodStats().addStats(foodlevel, saturation);

	}
	
	@Optional.Method(modid = "AppleCore")
	public void eatAppleCore(ItemStack itemstack, World world, EntityPlayer player) {
		player.getFoodStats().func_151686_a(new ItemFoodProxy(this), itemstack);

	}

	@Optional.Method(modid = "AppleCore")
	@Override
	public FoodValues getFoodValues(ItemStack itemStack) {
		return (FoodValues)(foodValues==null?foodValues = new FoodValues(foodlevel, saturation):foodValues);
	}
	
	

}
