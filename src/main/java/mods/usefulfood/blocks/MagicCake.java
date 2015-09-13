package mods.usefulfood.blocks;

import java.util.Random;

import mods.usefulfood.UFItems;
import net.minecraft.block.BlockCake;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class MagicCake extends SpecialCake {

    public MagicCake(String name, int foodlevel, float saturation) {
        super(name, foodlevel, saturation);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World par1World, BlockPos blockPos, IBlockState blockState, Random random) {
        double var9 = (double) blockPos.getX() + random.nextFloat();
        double var11 = (double) blockPos.getY() + random.nextFloat();
        double var13 = (double) blockPos.getZ() + random.nextFloat();

        par1World.spawnParticle(EnumParticleTypes.REDSTONE, var9, var11, var13, 0.0D /* red */,
                1.0D /* green */, 0.0D /* blue */);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos) {
        return UFItems.MagicCake;
    }

    @Override
    public PotionEffect[] getPotionEffects() {
        return new PotionEffect[] { new PotionEffect(Potion.regeneration.id, 200, 3), new PotionEffect(Potion.resistance.id, 2000, 0), new PotionEffect(Potion.fireResistance.id, 2000, 0) };
    }
}
