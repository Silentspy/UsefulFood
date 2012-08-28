package silentspy.usefulfood.blocks;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import java.util.ArrayList;
import java.util.Random;

import silentspy.usefulfood.UsefulFoodContent;
import silentspy.usefulfood.mod_usefulfood;

import net.minecraft.src.*;

public class BlockBlueberryCrop extends BlockFlower
{
    public BlockBlueberryCrop(int par1, int par2)
    {
        super(par1, par2);
        this.setTickRandomly(true);
        float var2 = 0.5F;
        this.setBlockBounds(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 0.25F, 0.5F + var2);
        this.setCreativeTab(null);
    }

    /**
     * Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
     * blockID passed in. Args: blockID
     */
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.tilledField.blockID;
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return this.canThisPlantGrowOnThisBlockID(par1World.getBlockId(par2, par3 - 1, par4));
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        int var6 = par1World.getBlockMetadata(par2, par3, par4);

        if (var6 < 3 && par5Random.nextInt(10) == 0)
        {
            ++var6;
            par1World.setBlockMetadataWithNotify(par2, par3, par4, var6);
        }

        super.updateTick(par1World, par2, par3, par4, par5Random);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        return par2 >= 3 ? this.blockIndexInTexture + 2 : (par2 > 0 ? this.blockIndexInTexture + 1 : this.blockIndexInTexture);
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 6;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return par1 == 3 ? Item.wheat.shiftedIndex : -1;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    
    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
    	ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        if (metadata == 3)
        {
            ret.add(new ItemStack(UsefulFoodContent.blueberry));
        }

        for (int n = 0; n < 3 + fortune; n++)
        {

            if (world.rand.nextInt(15) <= metadata)
            {
                ret.add(new ItemStack(UsefulFoodContent.blueberryseed));
            }
        }

        return ret;
    }

    @SideOnly(Side.CLIENT)
    public int idPicked(World world, int par2, int par3, int par4)
    {
    	return UsefulFoodContent.blueberryseed.shiftedIndex;
    }
    
    public String getTextureFile()
    {
        return mod_usefulfood.blocktextures;
    }
}
