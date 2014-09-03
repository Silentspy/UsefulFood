package com.mrcrayfish.furniture.api;

import net.minecraft.item.ItemStack;

public abstract interface IFurnitureRegister
{
  public abstract void registerMineBayItem(ItemStack paramItemStack1, ItemStack paramItemStack2, int paramInt);
  
  public abstract void registerOvenRecipe(ItemStack paramItemStack1, ItemStack paramItemStack2);
  
  public abstract void registerFreezerRecipe(ItemStack paramItemStack1, ItemStack paramItemStack2);
  
  public abstract void registerPrinterRecipe(ItemStack paramItemStack);
}
