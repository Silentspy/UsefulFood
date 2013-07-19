//OvenRecipesAPI for MrCrayfish's Furniture Mod
//Do not modify anything in this API
//Makes sure you have this class included with you mod once compiled and reobfuscated
//For a tutorial on how to use this API, head over to this link

package com.mrcrayfish.furnitureapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OvenRecipesAPI 
{
	private static final OvenRecipesAPI recipeBase = new OvenRecipesAPI();
    private static Map recipeList;
    private HashMap<List<Integer>, ItemStack> metaRecipeList = new HashMap<List<Integer>, ItemStack>();
    
    /**
     * Returns an instance of OvenRecipesAPI;
     */
    public static final OvenRecipesAPI instance()
    {
        return recipeBase;
    }
    
    /**
     * Initialize recipeList;
     */
    private OvenRecipesAPI()
    {
        recipeList = new HashMap();
    }
    
    /**
     * Adds item to oven cook-able list.
     */
    public void addFoodToOvenRecipes(int i, ItemStack itemstack)
    {
        recipeList.put(Integer.valueOf(i), itemstack);
    }
    
    /**
     * Returns the result of the item cooked.
     */
    public ItemStack getCookingResult(ItemStack item) 
    {
        if (item == null)
        {
            return null;
        }
        ItemStack ret = (ItemStack)metaRecipeList.get(Arrays.asList(item.itemID, item.getItemDamage()));
        if (ret != null) 
        {
            return ret;
        }
        return (ItemStack)recipeList.get(Integer.valueOf(item.itemID));
    }
    
    /**
     * Returns the cook-able list.
     */
    public Map getRecipeList()
    {
        return recipeList;
    }

}
