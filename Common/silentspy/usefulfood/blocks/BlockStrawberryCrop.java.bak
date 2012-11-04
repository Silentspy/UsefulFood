package silentspy.usefulfood.blocks;

import java.util.ArrayList;
import java.util.Random;

import silentspy.usefulfood.UsefulFoodContent;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class BlockStrawberryCrop extends BlockBlueberryCrop{

	public BlockStrawberryCrop(int par1, int par2) {
		super(par1, par2);
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return par1 == 3 ? UsefulFoodContent.strawberry.shiftedIndex : -1;
    }
    
    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
    	ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
    	
    	Random random = new Random();
        if (metadata == 3)
        {
            ret.add(new ItemStack(UsefulFoodContent.strawberry, 2 + random.nextInt(3)));
        }

        for (int n = 0; n < 3 + fortune; n++)
        {

            if (world.rand.nextInt(15) <= metadata)
            {
                ret.add(new ItemStack(UsefulFoodContent.strawberryseed, 1 + random.nextInt(2)));
            }
        }

        return ret;
    }

	
	@SideOnly(Side.CLIENT)
    public int idPicked(World world, int par2, int par3, int par4)
    {
    	return UsefulFoodContent.strawberryseed.shiftedIndex;
    }

}
