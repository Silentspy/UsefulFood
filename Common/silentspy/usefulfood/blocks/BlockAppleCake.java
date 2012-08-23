package silentspy.usefulfood.blocks;

import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class BlockAppleCake extends BlockCake
{
    public BlockAppleCake(int var1)
    {
        super(var1, 0);
        this.setTickRandomly(true);
    }
    
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        return var1 == 0 ? 0 : (var1 == 1 ? 1 : (var2 > 0 && var1 == 4 ? 3 : 2));
    }

    public void eatCakeSlice(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        if (par5EntityPlayer.canEat(false))
        {
            par5EntityPlayer.getFoodStats().addStats(3, 0.1F);
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
    
    public String getTextureFile()
    {
        return mod_usefulfood.blocktextures;
    }
    
    @SideOnly(Side.CLIENT)
    
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return UsefulFoodContent.applecakeitem.shiftedIndex;
    }
}
