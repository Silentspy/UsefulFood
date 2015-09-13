package mods.usefulfood.items;

import mods.usefulfood.UFItems;
import mods.usefulfood.UsefulFood;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by Master801 on 9/13/2015 at 9:11 AM.
 * @author Master801
 */
public final class ItemCakeUF extends ItemBlock {

    public ItemCakeUF(Block block) {
        super(block);
        setMaxStackSize(1);
        setCreativeTab(UsefulFood.tabUsefulFood);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemstack) {
        return this == UFItems.MagicCake;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack var1) {
        return this == UFItems.MagicCake ? EnumRarity.EPIC : super.getRarity(var1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B) {
        if (this == UFItems.MagicCake) l.add(LanguageRegistry.instance().getStringLocalization("item.magiccake.tooltip"));
    }

}
