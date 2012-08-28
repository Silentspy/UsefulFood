package silentspy.usefulfood.blocks;

import java.util.ArrayList;
import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class BlockHayBall extends Block{

	public BlockHayBall(int var1) {
		super(var1, Material.cloth);
		this.setCreativeTab(CreativeTabs.tabFood);
	}
	
	public int getBlockTextureFromSide(int par1)
    {
        return par1 != 1 && par1 != 0 ? 12 : 13;
    }
	
	public void addCreativeItems(ArrayList itemList)
    {
        itemList.add(new ItemStack(this, 1));
    }
	
	public int quantityDropped(Random par1Random)
    {
        return 9;
    }
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.wheat.shiftedIndex;
    }
	
	public String getTextureFile()
    {
        return mod_usefulfood.blocktextures;
    }
	
	public int getFlammability(IBlockAccess world, int x, int y, int z, int metadata, int face)
    {
    	return 50;
    }
	
	public static void setBurnProperties(int id, int encouragement, int flammability)
    {
    	encouragement = 50;
        flammability = 100;
    }
}
