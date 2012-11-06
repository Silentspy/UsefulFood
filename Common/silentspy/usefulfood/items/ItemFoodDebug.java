package silentspy.usefulfood.items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import silentspy.usefulfood.mod_usefulfood;

public class ItemFoodDebug extends Item {
	public ItemFoodDebug(int var1) {
		super(var1);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setTextureFile(mod_usefulfood.itemtextures);
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2,
			EntityPlayer var3) {
		var3.getFoodStats().setFoodLevel(0);
		var3.getFoodStats().setFoodSaturationLevel(0.0F);
		return var1;
	}
}
