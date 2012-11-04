package silentspy.usefulfood.blocks;

import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class BlockChocoCake extends BlockCake
{
    public BlockChocoCake(int var1)
    {
        super(var1, 0);
        this.setTickRandomly(true);
    }
    
    public int getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        return var1 == 0 ? 4 : (var1 == 1 ? 5 : (var2 > 0 && var1 == 4 ? 7 : 6));
    }

    public void eatCakeSlice(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        if (par5EntityPlayer.canEat(false))
        {
            par5EntityPlayer.getFoodStats().addStats(4, 0.5F);
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
        return UsefulFoodContent.chococakeitem.shiftedIndex;
    }
}
