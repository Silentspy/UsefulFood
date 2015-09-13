package mods.usefulfood.blocks;

import mods.usefulfood.UsefulFood;
import net.minecraft.block.BlockCake;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class BlockCakeUF extends BlockCake  {

    int foodlevel;
    float saturation;

    protected BlockCakeUF() {
        this(2, 0.1F);
    }

    protected BlockCakeUF(int foodlevel, float saturation) {
        this.foodlevel = foodlevel;
        this.saturation = saturation;
        this.setTickRandomly(true);
        setDefaultState(blockState.getBaseState().withProperty(BlockCake.BITES, 0));
        setCreativeTab(UsefulFood.tabUsefulFood);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (world.isRemote) return true;//Checking if we're on the client-side, if we are, don't do anything.
        eatCakeSlice(world, pos, state, playerIn);
        return true;
    }

    @Override
    public void onBlockClicked(World world, BlockPos pos, EntityPlayer playerIn) {
        if (world.isRemote) return;//Checking if we're on the client-side, if we are, don't do anything.
        eatCakeSlice(world, pos, world.getBlockState(pos), playerIn);
    }

    protected void eatCakeSlice(World world, BlockPos blockPos, IBlockState blockState, EntityPlayer player) {
        if (player.canEat(false)) {
            player.getFoodStats().addStats(foodlevel, saturation);
            if (getPotionEffects() != null) {
                for(PotionEffect potionEffect : getPotionEffects()) {
                    player.addPotionEffect(potionEffect);
                }
            }
            world.playSoundAtEntity(player, "random.eat", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);

            int l = ((Integer)world.getBlockState(blockPos).getValue(BlockCake.BITES)) + 1;
            if (l >= 6) {
                world.setBlockToAir(blockPos);
            } else {
                world.setBlockState(blockPos, world.getBlockState(blockPos).withProperty(BlockCake.BITES, l), 2);
            }
        }
    }

    public PotionEffect[] getPotionEffects() {
        return null;
    }
}

