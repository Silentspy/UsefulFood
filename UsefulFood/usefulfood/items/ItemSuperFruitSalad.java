package usefulfood.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ItemSuperFruitSalad extends ItemBowl{

	public ItemSuperFruitSalad(int var1, int var2, float var3, boolean var4) {
		super(var1, var2, var3, var4);
	}
	
	public boolean hasEffect(ItemStack var1) {
		return true;
	}

	public EnumRarity getRarity(ItemStack var1) {
		return EnumRarity.epic;
	}

}
