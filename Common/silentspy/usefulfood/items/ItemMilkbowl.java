package silentspy.usefulfood.items;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class ItemMilkbowl extends Item
{
    public ItemMilkbowl(int var1)
    {
        super(var1);
        this.setTextureFile(mod_usefulfood.itemtextures);
    }

    public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --itemstack.stackSize;
        }

        if (!world.isRemote)
        {
			player.clearActivePotions();
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 0));
        }

        return itemstack.stackSize <= 0 ? new ItemStack(Item.bowlEmpty) : itemstack;
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
