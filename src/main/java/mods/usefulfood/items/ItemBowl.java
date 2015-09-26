package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemBowl extends ItemFoodUF {
	
	boolean removepoison = false;
	
	public ItemBowl(String name, int hunger, float saturation, boolean removepoison) {
		super(name, hunger, saturation, false);
		this.setMaxStackSize(1);
		this.removepoison = removepoison;
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        super.onItemUseFinish(stack, worldIn, playerIn);
        if(removepoison) {
        	playerIn.removePotionEffect(Potion.poison.id);
		}
        return new ItemStack(Items.bowl);
    }
}
