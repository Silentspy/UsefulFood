//FreezerRecipesAPI for MrCrayfish's Furniture Mod
//Do not modify anything in this API
//Makes sure you have this class included with you mod once compiled and reobfuscated
//For a tutorial on how to use this API, head over to this link

package com.mrcrayfish.furnitureapi;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FreezerRecipesAPI
{
	private static final FreezerRecipesAPI solidifyingBase = new FreezerRecipesAPI();
    private Map solidifyingList;
    
    /**
     * Returns an instance of FreezerRecipesAPI;
     */
    public static final FreezerRecipesAPI instance()
    {
        return solidifyingBase;
    }
    
    /**
     * Initialize recipeList;
     */
    private FreezerRecipesAPI()
    {
        solidifyingList = new HashMap();
    }
    
    /**
     * Adds item to freezer solidifying list.
     */
    public void addSolidifying(int i, ItemStack itemstack)
    {
        solidifyingList.put(Integer.valueOf(i), itemstack);
    }
    
    /**
     * Returns the result of the item froze.
     */
    public ItemStack getSolidifyingResult(int i)
    {
        return (ItemStack)solidifyingList.get(Integer.valueOf(i));
    }
    
    /**
     * Returns the solidifying list.
     */
    public Map getSolidifyingList()
    {
        return solidifyingList;
    }

}