package com.mrcrayfish.furniture.api;

import net.minecraft.item.ItemStack;

public class FurnitureRegister
  implements IFurnitureRegister
{
  private static FurnitureRegister furnitureRegister = null;
  
  public static FurnitureRegister getInstance()
  {
    if (furnitureRegister == null) {
      furnitureRegister = new FurnitureRegister();
    }
    return furnitureRegister;
  }
  
  public void registerMineBayItem(ItemStack item, ItemStack currency, int price)
  {
    FurnitureAPI.addMineBayRecipe(new ItemData().setInput(item).setCurrency(currency).setPrice(price));
  }
  
  public void registerOvenRecipe(ItemStack input, ItemStack output)
  {
    FurnitureAPI.addOvenRecipe(new ItemData().setInput(input).setOutput(output));
  }
  
  public void registerFreezerRecipe(ItemStack input, ItemStack output)
  {
    FurnitureAPI.addFreezerRecipe(new ItemData().setInput(input).setOutput(output));
  }
  
  public void registerPrinterRecipe(ItemStack input)
  {
    FurnitureAPI.addPrinterRecipe(new ItemData().setInput(input));
  }
}