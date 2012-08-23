package silentspy.usefulfood.blocks;

import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class BlockMagicCake extends BlockCake
{
    public BlockMagicCake(int var1)
    {
        super(var1, 0);
        this.setTickRandomly(true);
    }
    
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        return var1 == 0 ? 8 : (var1 == 1 ? 9 : (var2 > 0 && var1 == 4 ? 11 : 10));
    }

    public void eatCakeSlice(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        if (par5EntityPlayer.canEat(false))
        {
            par5EntityPlayer.getFoodStats().addStats(8, 0.5F);
            par5EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 3));
            par5EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 2000, 0));
            par5EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2000, 0));
            int var6 = par1World.getBlockMetadata(par2, par3, par4) + 1;

            if (var6 >= 6)
            {
                par1World.setBlockWithNotify(par2, par3, par4, 0);
            }
            else
            {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, var6);
                par1World.markBlockAsNeedsUpdate(par2, par3, par4);
            }
        }
    }
	
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
    	double var9 = (double)((float)par2 + par5Random.nextFloat());
        double var11 = (double)((float)par3 + par5Random.nextFloat());
        double var13 = (double)((float)par4 + par5Random.nextFloat());
    	
    	par1World.spawnParticle("reddust", var9, var11, var13, 0.0D /*red*/, 1.0D /*green*/, 0.0D /*blue*/);
    }
    
    public String getTextureFile()
    {
        return mod_usefulfood.blocktextures;
    }
    
    @SideOnly(Side.CLIENT)
    
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return UsefulFoodContent.magiccakeitem.shiftedIndex;
    }
}
