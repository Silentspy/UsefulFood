package mods.usefulfood.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBush extends ItemBlock{

	public ItemBlockBush(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	
	@SideOnly(Side.CLIENT)
	public String getUnlocalizedName(ItemStack itemstack) 
	 {
		 String name = "";
		 switch(itemstack.getItemDamage()) 
		 {
	   		case 0: 
	   		{
	   			name = "blueberry";
	   			break;
	   		}
	   		case 1: 
	   		{ 
	   			name = "strawberry"; 
	   			break;
	   		}
	   		default: name = "blueberry";
		 }
		 return getUnlocalizedName() + "." + name;
	 }
	
	public int getMetadata(int par1)
    {
        return par1;
    }
}