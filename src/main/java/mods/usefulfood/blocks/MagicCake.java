package mods.usefulfood.blocks;

import java.util.Random;

import mods.usefulfood.UF;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MagicCake extends SpecialCake {
	
	int tick = 0;
	
	public MagicCake(String name, int foodlevel, float saturation) {
		super(name, foodlevel, saturation);
	}

	@Override
	public void eatCake(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
    {
		if (player.canEat(false))
        {
            player.getFoodStats().addStats(foodlevel, saturation);
            int i = ((Integer)state.getValue(BITES)).intValue();

            player.getFoodStats().addStats(foodlevel, saturation);
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 3));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 2000, 0));
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2000, 0));
			worldIn.playSoundAtEntity(player, "random.eat", 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            if (i < 6)
            {
                worldIn.setBlockState(pos, state.withProperty(BITES, Integer.valueOf(i + 1)), 3);
            }
            else
            {
                worldIn.setBlockToAir(pos);
            }
        }
    }
	
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
		
    }
	
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
	
		/*
		tick++;
		if(tick == 5) {
			UF.proxy.generateParticles(pos, worldIn);
			tick = 0;
		}
		
		*/
	}
}
