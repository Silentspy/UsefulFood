package mods.usefulfood.items;


import cpw.mods.fml.common.registry.GameRegistry;
import mods.usefulfood.mod_usefulfood;
import net.minecraft.block.Block;
import net.minecraft.item.ItemReed;

public class ItemReedUF extends ItemReed 
{

	String name;
	
	public ItemReedUF(Block var2, String name) {
		super(var2);
		this.setMaxStackSize(16);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.name = name;
		this.setTextureName("usefulfood:" + name);
		GameRegistry.registerItem(this, name, "UsefulFood");
	}
}
