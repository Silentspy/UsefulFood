package mods.usefulfood.items;

import mods.usefulfood.UF;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class ItemBottle extends ItemFoodUF {

	int foodlevel;
	float saturation;
	boolean removepoison = false;
	
	public ItemBottle(String name, int foodlevel, float saturation, boolean removepoison) {
		super(name, foodlevel, saturation, false);
		this.setMaxStackSize(16);
		this.setCreativeTab(UF.tabUsefulFood);
		this.foodlevel = foodlevel;
		this.saturation = saturation;
		this.removepoison = removepoison;
	}
	
	public ItemBottle(String name, int foodlevel, float saturation) {
		super(name, foodlevel, saturation, false);
		this.setMaxStackSize(16);
		this.setCreativeTab(UF.tabUsefulFood);
		this.foodlevel = foodlevel;
		this.saturation = saturation;
	}

	/**
	 * How long it takes to use or consume an item
	 */
	
	@Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 16;
    }

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
    
    @Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.DRINK;
    }
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
		if (!playerIn.capabilities.isCreativeMode)
        {
            --stack.stackSize;
        }

        playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);

        if (!playerIn.capabilities.isCreativeMode)
        {
            if (stack.stackSize <= 0)
            {
                return new ItemStack(Items.glass_bottle);
            }

            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
        }
        
        if(this.removepoison) {
        	playerIn.removePotionEffect(Potion.poison.id);
        }
        
        playerIn.getFoodStats().addStats(this, stack);
        worldIn.playSoundAtEntity(playerIn, "random.burp", 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(stack, worldIn, playerIn);
        return stack;
    }

	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        if (playerIn.canEat(true))
        {
            playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
        }

        return itemStackIn;
    }
}
