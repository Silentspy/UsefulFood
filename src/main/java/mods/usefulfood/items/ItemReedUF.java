package mods.usefulfood.items;


import mods.usefulfood.UF;
import mods.usefulfood.UFItem2Model;
import net.minecraft.block.Block;
import net.minecraft.item.ItemReed;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemReedUF extends ItemReed 
{
	String name;
	
	public ItemReedUF(Block var2, String name) {
		super(var2);
		this.setMaxStackSize(1);
		this.setCreativeTab(UF.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.name = name;
		GameRegistry.registerItem(this, name);
		UF.getItem2Models().add(new UFItem2Model(this, name));
	}
}
