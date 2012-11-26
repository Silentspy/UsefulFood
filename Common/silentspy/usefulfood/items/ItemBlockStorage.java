package silentspy.usefulfood.items;

import net.minecraft.src.Block;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class ItemBlockStorage extends ItemBlock{

	public ItemBlockStorage(int par1) {
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
