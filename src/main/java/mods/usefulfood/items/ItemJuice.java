package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemJuice extends ItemBottle {

    public ItemJuice(String name, int var2, float var3) {
        super(name, var2, var3);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack itemstack, World world, EntityPlayer player) {
        if (!player.capabilities.isCreativeMode) {
            --itemstack.stackSize;
            if (itemstack.stackSize > 0) player.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
        }
        if (!world.isRemote) {
            player.getFoodStats().addStats(foodlevel, saturation);
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 30*20, 0));
        }
        return itemstack.stackSize <= 0 ? new ItemStack(Items.glass_bottle) : itemstack;
    }
}
