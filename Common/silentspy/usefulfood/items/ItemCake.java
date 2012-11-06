package silentspy.usefulfood.items;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.ItemReed;
import net.minecraft.src.ItemStack;
import silentspy.usefulfood.UsefulFoodContent;
import silentspy.usefulfood.mod_usefulfood;

public class ItemCake extends ItemReed {

	public ItemCake(int var1, Block var2) {
		super(var1, var2);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

	public boolean hasEffect(ItemStack var1) {
		if (var1.getItem().shiftedIndex == UsefulFoodContent.magiccakeitem.shiftedIndex) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Return an item rarity from EnumRarity
	 */
	public EnumRarity getRarity(ItemStack var1) {
		if (var1.getItem().shiftedIndex == UsefulFoodContent.magiccakeitem.shiftedIndex) {
			return EnumRarity.epic;
		} else {
			return EnumRarity.common;
		}
	}

	public String getTextureFile() {
		return mod_usefulfood.itemtextures;
	}
}
