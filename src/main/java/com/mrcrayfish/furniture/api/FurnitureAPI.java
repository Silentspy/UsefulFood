package com.mrcrayfish.furniture.api;

import java.util.ArrayList;
import net.minecraft.item.ItemStack;

public class FurnitureAPI
{
  private static ArrayList<ItemData> mineBayRecipes = new ArrayList();
  private static ArrayList<ItemData> ovenRecipes = new ArrayList();
  private static ArrayList<ItemData> freezerRecipes = new ArrayList();
  private static ArrayList<ItemData> printerRecipes = new ArrayList();
  
  public static void addMineBayRecipe(ItemData itemData)
  {
    mineBayRecipes.add(itemData);
  }
  
  public static void addOvenRecipe(ItemData itemData)
  {
    ovenRecipes.add(itemData);
  }
  
  public static void addFreezerRecipe(ItemData itemData)
  {
    freezerRecipes.add(itemData);
  }
  
  public static void addPrinterRecipe(ItemData itemData)
  {
    freezerRecipes.add(itemData);
  }
  
  public static ItemData[] getMineBayItems()
  {
    return (ItemData[])mineBayRecipes.toArray(new ItemData[1]);
  }
  
  public static ItemData getOvenRecipeDataFromInput(ItemStack itemStack)
  {
    for (int i = 0; i < ovenRecipes.size(); i++)
    {
      ItemStack validItemStack = ((ItemData)ovenRecipes.get(i)).getInput();
      if ((validItemStack.getItem() == itemStack.getItem()) && 
        (validItemStack.getItemDamage() == itemStack.getItemDamage())) {
        return (ItemData)ovenRecipes.get(i);
      }
    }
    return null;
  }
  
  public static ItemData getFreezerRecipeDataFromInput(ItemStack itemStack)
  {
    for (int i = 0; i < freezerRecipes.size(); i++)
    {
      ItemStack validItemStack = ((ItemData)freezerRecipes.get(i)).getInput();
      if ((validItemStack.getItem() == itemStack.getItem()) && 
        (validItemStack.getItemDamage() == itemStack.getItemDamage())) {
        return (ItemData)freezerRecipes.get(i);
      }
    }
    return null;
  }
  
  public static ItemData getPrinterRecipeDataFromInput(ItemStack itemStack)
  {
    for (int i = 0; i < printerRecipes.size(); i++)
    {
      ItemStack validItemStack = ((ItemData)printerRecipes.get(i)).getInput();
      if ((validItemStack.getItem() == itemStack.getItem()) && 
        (validItemStack.getItemDamage() == itemStack.getItemDamage()) && 
        (itemStack.stackSize == 1)) {
        return (ItemData)printerRecipes.get(i);
      }
    }
    return null;
  }
}
