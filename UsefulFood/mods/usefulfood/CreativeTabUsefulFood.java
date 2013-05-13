package mods.usefulfood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabUsefulFood extends CreativeTabs 
{	
	public CreativeTabUsefulFood(String label) {
		super(label);
	}

	@Override
    public ItemStack getIconItemStack() {
		return new ItemStack(UsefulFoodItems.magiccake);
	}
	
	@Override
    public String getTranslatedTabLabel() {
		return "UsefulFood";
	}
}
