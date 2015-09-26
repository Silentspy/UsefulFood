package mods.usefulfood.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMagicFruitSalad extends ItemBowl{

	public ItemMagicFruitSalad(String name, int var2, float var3, boolean var4) {
		super(name, var2, var3, var4);
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack var1) {
		return true;
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack var1) {
		return EnumRarity.RARE;
	}
}
