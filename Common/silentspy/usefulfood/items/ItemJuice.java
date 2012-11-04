package silentspy.usefulfood.items;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class ItemJuice extends Item
{
	
	int foodlevel;
	float saturation;
	
	public ItemJuice(int id, int var2, float var3) 
	{
		super(id);
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setTextureFile(mod_usefulfood.itemtextures);
        this.foodlevel = var2;
        this.saturation = var3;
	}
	
    public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --itemstack.stackSize;
        }

        if (!world.isRemote)
        {
            player.getFoodStats().addStats(foodlevel, saturation);
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 0));
        }

        return itemstack.stackSize <= 0 ? new ItemStack(Item.glassBottle) : itemstack;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.drink;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
    	player.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));
        return itemstack;
    }

}
