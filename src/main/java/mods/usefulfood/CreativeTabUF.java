package mods.usefulfood;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabUF extends CreativeTabs 
{	
	public CreativeTabUF(String label) {
		super(label);
	}

	@Override
    public ItemStack getIconItemStack() {
		return new ItemStack(UF.items.MuttonRaw);
	}
	
	@Override
    public String getTranslatedTabLabel() {
		return "UsefulFood";
	}

	@Override
	public Item getTabIconItem() {
		return UF.items.MuttonRaw;
	}
}
