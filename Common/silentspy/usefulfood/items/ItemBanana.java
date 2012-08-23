package silentspy.usefulfood.items;

import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class ItemBanana extends Item
{
    public ItemBanana(int var1)
    {
        super(var1);
        this.setTabToDisplayOn(CreativeTabs.tabFood);
    }

    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
    	if(var3.inventory.addItemStackToInventory(new ItemStack(UsefulFoodContent.bananapeeled, 1)))
    	{
    		var1.stackSize--;
    	}
        return var1;
    }
    
    public String getTextureFile()
    {
    	return mod_usefulfood.itemtextures;
    }

}
