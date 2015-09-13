package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mods.usefulfood.UsefulFood;

public class ItemSoupUF extends ItemUF {

    int foodlevel;
    float saturation;

    public ItemSoupUF(String name, int var2, float var3) {
        super(name);
        this.setMaxStackSize(1);
        this.setCreativeTab(UsefulFood.tabUsefulFood);
        this.foodlevel = var2;
        this.saturation = var3;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack itemstack, World world, EntityPlayer player) {
        if (!player.capabilities.isCreativeMode) --itemstack.stackSize;
        if (!world.isRemote) player.getFoodStats().addStats(foodlevel, 0);
        return itemstack.stackSize <= 0 ? new ItemStack(Items.bowl) : itemstack;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemstack) {
        return 32;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack itemstack) {
        return EnumAction.DRINK;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
        player.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));
        return itemstack;
    }

}
