package silentspy.recipear;

/*import ic2.api.Ic2Recipes;
import ic2.core.AdvRecipe;
import ic2.core.AdvShapelessRecipe;
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.FMLLog;

public class RecipeRemover {
	static public Set<String> bannedrecipes = new HashSet<String>();
	
	public static boolean Check(int ItemID, int ItemMetaData) {
		if(RecipeRemover.bannedrecipes.contains(Integer.toString(ItemID) + ":-1") ||
				RecipeRemover.bannedrecipes.contains(Integer.toString(ItemID) + ":" + Integer.toString(ItemMetaData))) 
		{
			return true;
		}
		return false;
	}

	public static void RemoveRecipes() {
		FMLLog.info("[Recipear] Removing " + bannedrecipes.size() + " recipe(s)");

		int ItemID = 0;
		int ItemMetaData = 0;
		boolean shapeless = false;
		int itemsremoved = 0;

		for (String bannedrecipe : bannedrecipes) {
			FMLLog.info("Banned Recipe: " + bannedrecipe);
		}

		for (Iterator<Object> itr = CraftingManager.getInstance().getRecipeList().iterator(); itr.hasNext();) {
			Object recipeoutput = itr.next();
			shapeless = false;

			if (recipeoutput instanceof ShapedRecipes) {
				ShapedRecipes recipe = (ShapedRecipes) recipeoutput;
				ItemID = recipe.getRecipeOutput().itemID;
				ItemMetaData = recipe.getRecipeOutput().getItemDamage();
			}
			if (recipeoutput instanceof ShapelessRecipes) {
				shapeless = true;
				ShapelessRecipes recipe = (ShapelessRecipes) recipeoutput;
				ItemID = recipe.getRecipeOutput().itemID;
				ItemMetaData = recipe.getRecipeOutput().getItemDamage();
			}

			/* if (mod_recipear.IC2Detected) {
				if (recipeoutput instanceof AdvRecipe) {
					AdvRecipe recipe = (AdvRecipe) recipeoutput;
					ItemID = recipe.b().c;
					ItemMetaData = recipe.b().j();
				} else if (recipeoutput instanceof AdvShapelessRecipe) {
					shapeless = true;
					AdvShapelessRecipe recipe = (AdvShapelessRecipe) recipeoutput;
					ItemID = recipe.b().c;
					ItemMetaData = recipe.b().j();
				}
			
			}
			*/

			if (mod_recipear.OreDictionaryDetected) {
				if (recipeoutput instanceof ShapedOreRecipe) {
					ShapedOreRecipe recipe = (ShapedOreRecipe) recipeoutput;
					ItemID = recipe.getRecipeOutput().itemID;
					ItemMetaData = recipe.getRecipeOutput().getItemDamage();
				}
				if (recipeoutput instanceof ShapelessOreRecipe) {
					shapeless = true;
					ShapelessOreRecipe recipe = (ShapelessOreRecipe) recipeoutput;
					ItemID = recipe.getRecipeOutput().itemID;
					ItemMetaData = recipe.getRecipeOutput().getItemDamage();
				}
			}

			if (shapeless) {
				FMLLog.info("[Recipear] Checking Recipe for: " + ItemID + ":" + ItemMetaData + " Shapeless");
			} else {
				FMLLog.info("[Recipear] Checking Recipe for: " + ItemID + ":" + ItemMetaData);
			}
			
			if (Check(ItemID, ItemMetaData)) 
			{
				itr.remove();
				itemsremoved++;
			}
		}
		
		/* if (mod_recipear.Thaumcraft3Detected) {
			
			List l = null;
			l = thaumcraft.api.ThaumcraftApi.getCraftingRecipes();
			
			for (Iterator itr = l.iterator(); itr.hasNext();) {
				Map.Entry entry = (Map.Entry) itr.next();
				ItemStack Item = (ItemStack) entry.getValue();
				ItemID = Item.itemID;
				ItemMetaData = Item.getItemDamage();

				FMLLog.info("[Recipear] Checking Recipe for: " + ItemID
						+ ":" + ItemMetaData);
				if (Check(ItemID, ItemMetaData)) 
				{
					itr.remove();
					itemsremoved++;
				}
			}
		}
		
		*/

		/* if (mod_recipear.IC2Detected) 
		{
			List l = null;

			FMLLog.info("[Recipear] Checking special IC2 recipes");
			for (int i = 0; i < 3; i++) {
				if (i == 0) {
					l = Ic2Recipes.getMaceratorRecipes();
				} else if (i == 1) {
					l = Ic2Recipes.getCompressorRecipes();
				} else if (i == 2) {
					l = Ic2Recipes.getExtractorRecipes();
				}

				for (Iterator itr = l.iterator(); itr.hasNext();) {
					Map.Entry entry = (Map.Entry) itr.next();
					ItemStack Item = (ItemStack) entry.getValue();
					ItemID = Item.itemID;
					ItemMetaData = Item.getItemDamage();

					FMLLog.info("[Recipear] Checking Recipe for: " + ItemID
							+ ":" + ItemMetaData);
					if (Check(ItemID, ItemMetaData)) 
					{
						itr.remove();
						itemsremoved++;
					}
				}
			}
		}
		*/

		if (itemsremoved > 0) {
			FMLLog.info("[Recipear] Removed " + itemsremoved + " recipe(s)");
		}
	}
}
