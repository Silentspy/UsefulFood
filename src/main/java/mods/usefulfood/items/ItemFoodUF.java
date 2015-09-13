package mods.usefulfood.items;

import net.minecraft.item.ItemFood;
import mods.usefulfood.UsefulFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemFoodUF extends ItemFood {
    
    String name;
    
    public ItemFoodUF(String name, int hunger, float saturation, boolean canwolfeat) {
        super(hunger, saturation, canwolfeat);
        this.setCreativeTab(UsefulFood.tabUsefulFood);
        this.setUnlocalizedName(name);
        this.name = name;
        GameRegistry.registerItem(this, name, UsefulFood.MOD_ID);
    }
}
