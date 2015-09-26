package mods.usefulfood.items;

import mods.usefulfood.UF;
import mods.usefulfood.UFItem2Model;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemUF extends Item {

	String name;
	
	public ItemUF(String name) {
		super();
		this.setCreativeTab(UF.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.name = name;
		GameRegistry.registerItem(this, name);
		UF.getItem2Models().add(new UFItem2Model(this, name));
	}
}
