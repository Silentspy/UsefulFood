package usefulfood.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import usefulfood.*;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockBush extends Block{

	public BlockBush(int var1) 
	{
		super(var1, 14, Material.leaves);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setBurnProperties(var1, 50, 100);
		this.setTextureFile(mod_usefulfood.blocktextures);
		this.setHardness(0.0F);
		this.setLightOpacity(1);
		this.setStepSound(soundGrassFootstep);
		float var3 = 0.4F;
		this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.4F, 0.5F + var3);
	}

	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		switch(metadata) 
		{
	   		case 0: 
	   		{
	   			return side != 1 && side != 0 ? 14 : 14;
	   		}
	   		case 1: 
	   		{ 
	   			return side != 1 && side != 0 ? 16 : 16;
	   		}
		}
		return 14;
	}

	public void addCreativeItems(ArrayList itemList) {
		itemList.add(new ItemStack(this, 1));
	}

	public int quantityDropped(Random random) {
		return 2 + random.nextInt(4);
	}
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
    	switch(par1) 
		 {
	   		case 0: 
	   		{
	   			return UsefulFoodItems.blueberry.itemID;
	   		}
	   		case 1: 
	   		{ 
	   		    return UsefulFoodItems.strawberry.itemID;
	   		}
		 }
    	return UsefulFoodItems.blueberry.itemID;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public int getRenderType()
    {
        return 1;
    }
	
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 2; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}
