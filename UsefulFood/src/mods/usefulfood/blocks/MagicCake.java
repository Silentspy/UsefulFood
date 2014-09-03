package mods.usefulfood.blocks;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MagicCake extends SpecialCake {
	public MagicCake(String name, int foodlevel, float saturation) {
		super(name, foodlevel, saturation);
	}

	public void eatCakeSlice(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        if (par5EntityPlayer.canEat(false))
        {
            par5EntityPlayer.getFoodStats().addStats(foodlevel, saturation);
            par5EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 3));
            par5EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 2000, 0));
			par5EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2000, 0));
			par1World.playSoundAtEntity(par5EntityPlayer, "random.eat", 0.5F, par1World.rand.nextFloat() * 0.1F + 0.9F);
            
            int l = par1World.getBlockMetadata(par2, par3, par4) + 1;

            if (l >= 6)
            {
                par1World.setBlockToAir(par2, par3, par4);
            }
            else
            {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
            }
        }
    }

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random random) {
		double var9 = (double) ((float) par2 + random.nextFloat());
		double var11 = (double) ((float) par3 + random.nextFloat());
		double var13 = (double) ((float) par4 + random.nextFloat());

		par1World.spawnParticle("reddust", var9, var11, var13, 0.0D /* red */,
				1.0D /* green */, 0.0D /* blue */);
	}

/*	@SideOnly(Side.CLIENT)
	public int idPicked(World par1World, int par2, int par3, int par4) {
		return cakeitemid + 256;
	}*/
}
