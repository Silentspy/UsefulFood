package usefulfood;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import cpw.mods.fml.common.FMLLog;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;

public class RecipeRemover
{
	static Set<ItemStack> recipeOutputSet = new HashSet<ItemStack>();
	
	public static void AddRecipe(Item item) {
		recipeOutputSet.add(new ItemStack(item));
	}
	
	public static void AddRecipe(Block block) {
		recipeOutputSet.add(new ItemStack(block));
	}
	
	public static void RemoveRecipes()
	{
		FMLLog.fine("[UsefulFood] Removing Vanilla Recipes");
		
		ItemStack recipeResult = null;
		ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
		for (int scan = 0; scan < recipes.size(); scan++)
		{
	         IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
	         if (tmpRecipe instanceof ShapedRecipes)
	         {
	        	 ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
	        	 recipeResult = recipe.getRecipeOutput();
	         }
	         if (tmpRecipe instanceof ShapelessRecipes)
	         {
	        	 ShapelessRecipes recipe = (ShapelessRecipes)tmpRecipe;
	        	 recipeResult = recipe.getRecipeOutput();
	         }
	         
	        for (ItemStack recipeoutput : recipeOutputSet) {
	 			if(ItemStack.areItemStacksEqual(recipeoutput, recipeResult)) {
	 				FMLLog.fine("[UsefulFood] Removed Recipe: " + recipeResult.getItemName() );
	 				recipes.remove(scan);
	 			}
	 		}
		}
		FMLLog.fine("[UsefulFood] Removed Vanilla Recipes");
	}
}
