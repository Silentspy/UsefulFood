package silentspy.usefulfood.items;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class ItemFoodDebug extends Item
{
	public ItemFoodDebug(int var1)
    {
        super(var1);
        this.setTabToDisplayOn(CreativeTabs.tabMisc);
    }
	
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
    	var3.getFoodStats().setFoodLevel(0);
    	var3.getFoodStats().setFoodSaturationLevel(0.0F);
        return var1;
    }
	
	public String getTextureFile()
    {
		return mod_usefulfood.itemtextures;
    }
}
