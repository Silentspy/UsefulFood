package mods.usefulfood.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import mods.usefulfood.mod_usefulfood;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFoodUF extends ItemFood {
	
	String name;
	
	public ItemFoodUF(int id, String name, int hunger, float saturation, boolean canwolfeat) {
		super(id, hunger, saturation, canwolfeat);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.name = name;
		GameRegistry.registerItem(this, name, "UsefulFood");
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon("usefulfood:" + name);
	}
}
