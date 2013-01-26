package usefulfood.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockStorage extends ItemBlock{

	public ItemBlockStorage(int id) {
		super(id);
		this.setHasSubtypes(true);
	}
	
	public String getItemNameIS(ItemStack itemstack) 
	 {
		 String name = "";
		 switch(itemstack.getItemDamage()) 
		 {
	   		case 0: 
	   		{
	   			name = "hay";
	   			break;
	   		}
	   		case 1: 
	   		{ 
	   			name = "sugarcane"; 
	   			break;
	   		}
	   		default: name = "hay";
		 }
		 return getItemName() + "." + name;
	 }
	
	public int getMetadata(int par1)
    {
        return par1;
    }
}
