package mods.usefulfood.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import mods.usefulfood.mod_usefulfood;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFoodUF extends ItemFood {
	
	String name;
	
	public ItemFoodUF(int var1, String name, int var2, float var3, boolean var4) {
		super(var1, var2, var3, var4);
		this.setCreativeTab(mod_usefulfood.tabUsefulFood);
		this.setUnlocalizedName(name);
		this.name = name;
		GameRegistry.registerItem(this, name);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon("usefulfood:" + name);
	}
}
