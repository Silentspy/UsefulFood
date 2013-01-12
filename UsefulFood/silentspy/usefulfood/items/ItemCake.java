package silentspy.usefulfood.items;


import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import silentspy.usefulfood.UsefulFoodItems;
import silentspy.usefulfood.mod_usefulfood;

public class ItemCake extends ItemReed {

	public ItemCake(int var1, Block var2) {
		super(var1, var2);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setTextureFile(mod_usefulfood.itemtextures);
	}
}
