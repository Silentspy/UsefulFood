package silentspy.usefulfood.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockStorage extends Block{
	
	public BlockStorage(int var1) {
		super(var1, Material.cloth);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setBurnProperties(var1, 50, 100);
		this.setTextureFile(mod_usefulfood.blocktextures);
	}

	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		switch(metadata) 
		 {
	   		case 0: 
	   		{
	   			return side != 1 && side != 0 ? 12 : 13;
	   		}
	   		case 1: 
	   		{ 
	   			return side != 1 && side != 0 ? 72 : 73;
	   		}
		 }
		return 13;
	}

	public void addCreativeItems(ArrayList itemList) {
		itemList.add(new ItemStack(this, 1));
	}

	public int quantityDropped(Random par1Random) {
		return 9;
	}
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
    	switch(par1) 
		 {
	   		case 0: 
	   		{
	   			return Item.wheat.itemID;
	   		}
	   		case 1: 
	   		{ 
	   		    return Item.reed.itemID;
	   		}
		 }
		return Item.wheat.itemID;
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
