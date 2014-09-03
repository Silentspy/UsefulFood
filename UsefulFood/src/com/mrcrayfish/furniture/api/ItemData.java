package com.mrcrayfish.furniture.api;

import net.minecraft.item.ItemStack;

public class ItemData
{
  private ItemStack input;
  private ItemStack output;
  private ItemStack currency;
  private int price;
  
  public ItemData setInput(ItemStack input)
  {
    this.input = input;
    return this;
  }
  
  public ItemData setOutput(ItemStack output)
  {
    this.output = output;
    return this;
  }
  
  public ItemData setCurrency(ItemStack currency)
  {
    this.currency = currency;
    return this;
  }
  
  public ItemData setPrice(int price)
  {
    this.price = price;
    return this;
  }
  
  public ItemStack getInput()
  {
    return this.input;
  }
  
  public ItemStack getOutput()
  {
    return this.output;
  }
  
  public ItemStack getCurrency()
  {
    return this.currency;
  }
  
  public int getPrice()
  {
    return this.price;
  }
}
