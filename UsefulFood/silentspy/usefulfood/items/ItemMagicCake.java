package silentspy.usefulfood.items;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import silentspy.usefulfood.UsefulFoodItems;
import silentspy.usefulfood.mod_usefulfood;

public class ItemMagicCake extends ItemCake{
	
	public ItemMagicCake(int var1, Block var2) {
		super(var1, var2);
	}
	
	public boolean hasEffect(ItemStack var1) {
		return true;
	}
	
	public EnumRarity getRarity(ItemStack var1) {
		return EnumRarity.epic;
	}
	
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{
		l.add("it is not a lie!");
	}
}
