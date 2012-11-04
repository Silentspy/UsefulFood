package silentspy.usefulfood.items;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class ItemCheese extends ItemFood
{
	public ItemCheese(int var1, int var2, float var3, boolean var4)
    {
        super(var1, var2, var3, var4);
        this.setTextureFile(mod_usefulfood.itemtextures);
    }
	
	public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player)
    {
        super.onFoodEaten(itemstack, world, player);
        itemstack.stackSize--;
    	if (!world.isRemote)
        {
    	    player.curePotionEffects(itemstack);
        }
		return itemstack;
    }
}
