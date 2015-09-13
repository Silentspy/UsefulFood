package mods.usefulfood.items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mods.usefulfood.UsefulFood;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFoodDebug extends ItemUF {

    public ItemFoodDebug(String name) {
        super(name);
        this.setCreativeTab(UsefulFood.tabUsefulFood);
    }

    @SuppressWarnings("unchecked")
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack is, EntityPlayer player, List l, boolean advancedTooltips) {
        l.add(LanguageRegistry.instance().getStringLocalization("item.debug.tooltip"));
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
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5)  {
        if(par5 && (entity instanceof EntityPlayer)) {
               EntityPlayer player = (EntityPlayer)entity;
               if (!world.isRemote && !player.capabilities.isCreativeMode) {
                  if (player.getFoodStats().getFoodLevel() >= 0) {
                     player.getFoodStats().setFoodLevel(player.getFoodStats().getFoodLevel() - 1);
                     player.getFoodStats().setFoodSaturationLevel(0);
                }
            }
        }
    }

}
