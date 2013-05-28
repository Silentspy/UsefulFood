package mods.usefulfood.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mods.usefulfood.mod_usefulfood;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemUF extends Item {

	String name;
	
	public ItemUF(int par1, String name) {
		super(par1);
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
	
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        return par1ItemStack;
    }
}
