package mods.usefulfood.items;

import cpw.mods.fml.common.registry.GameRegistry;
import mods.usefulfood.mod_usefulfood;
import net.minecraft.item.ItemFood;

public class ItemFoodUF extends ItemFood {
	
	String name;
	
	public ItemFoodUF(String name, int hunger, float saturation, boolean canwolfeat) {
		super(hunger, saturation, canwolfeat);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.name = name;
		this.setTextureName("usefulfood:" + name);
		GameRegistry.registerItem(this, name, "UsefulFood");
	}
}
