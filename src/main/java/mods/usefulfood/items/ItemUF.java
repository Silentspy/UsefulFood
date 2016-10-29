package mods.usefulfood.items;

import cpw.mods.fml.common.registry.GameRegistry;
import mods.usefulfood.mod_usefulfood;
import net.minecraft.item.Item;

public class ItemUF extends Item {

	String name;
	
	public ItemUF(String name) {
		super();
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.name = name;
		this.setTextureName("usefulfood:" + name);
		GameRegistry.registerItem(this, name, "UsefulFood");
	}
}
