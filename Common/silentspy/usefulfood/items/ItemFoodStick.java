package silentspy.usefulfood.items;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class ItemFoodStick extends ItemUsefulFood
{
    public ItemFoodStick(int var1, int var2, float var3, boolean var4)
    {
        super(var1, var2, var3, var4);
        this.setMaxStackSize(1);
    }

    public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player)
    {
        super.onFoodEaten(itemstack, world, player);
        return new ItemStack(Item.stick);
    }
}
