package usefulfood.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockBush extends ItemBlock{

	public ItemBlockBush(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	
	public String getItemNameIS(ItemStack itemstack) 
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
		 return getItemName() + "." + name;
	 }
	
	public int getMetadata(int par1)
    {
        return par1;
    }
}