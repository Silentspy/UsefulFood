package mods.usefulfood.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMagicAppleJuice extends ItemJuice {

    public ItemMagicAppleJuice(String name, int var2, float var3) {
        super(name, var2, var3);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack itemstack, World world, EntityPlayer player) {
        if (!player.capabilities.isCreativeMode) {
            --itemstack.stackSize;
            if(itemstack.stackSize > 0) player.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
        }
        if (!world.isRemote) {
            player.getFoodStats().addStats(foodlevel, saturation);
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 0));
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 6000, 0));
            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 400, 0));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 0));
        }
        return itemstack.stackSize <= 0 ? new ItemStack(Items.glass_bottle) : itemstack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack var1) {
        return EnumRarity.EPIC;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemstack) {
        return true;
    }

    @Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B) {
        l.add(LanguageRegistry.instance().getStringLocalization("item.MagicAppleJuice.tooltip"));
    }
}
