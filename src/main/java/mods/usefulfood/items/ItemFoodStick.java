package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodStick extends ItemFoodUF {
	public ItemFoodStick(String name, int Hunger, float Saturation, boolean CanWolfEat) {
		super(name, Hunger, Saturation, CanWolfEat);
		this.setMaxStackSize(1);
	}

	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        super.onItemUseFinish(stack, worldIn, playerIn);
        return new ItemStack(Items.stick);
    }
}
