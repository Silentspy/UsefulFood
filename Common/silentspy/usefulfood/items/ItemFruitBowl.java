package silentspy.usefulfood.items;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import silentspy.usefulfood.UsefulFoodContent;

public class ItemFruitBowl extends ItemBowl {
	public ItemFruitBowl(int var1, int var2, float var3, boolean var4) {
		super(var1, var2, var3, var4);
	}

	public ItemStack onFoodEaten(ItemStack var1, World var2, EntityPlayer var3) {
		super.onFoodEaten(var1, var2, var3);
		return new ItemStack(Item.bowlEmpty);
	}

	public boolean hasEffect(ItemStack var1) {
		if (var1.getItem().shiftedIndex == UsefulFoodContent.superfruitsalad.shiftedIndex) {
			return true;
		} else {
			return false;
		}
	}

	public EnumRarity getRarity(ItemStack var1) {
		if (var1.getItem().shiftedIndex == UsefulFoodContent.superfruitsalad.shiftedIndex) {
			return EnumRarity.epic;
		} else {
			return EnumRarity.common;
		}
	}
}
