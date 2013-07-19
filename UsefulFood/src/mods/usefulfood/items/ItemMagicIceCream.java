package mods.usefulfood.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMagicIceCream extends ItemBowl{

	public ItemMagicIceCream(int var1, String name, int var2, float var3, boolean var4) {
		super(var1, name, var2, var3, var4);
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack var1) {
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack var1) {
		return EnumRarity.rare;
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{
		l.add("Looks Delicious!");
	}
}
