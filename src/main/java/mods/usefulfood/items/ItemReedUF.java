package mods.usefulfood.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemReed;
import mods.usefulfood.UsefulFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemReedUF extends ItemReed {

    String name;
    
    public ItemReedUF(Block var2, String name) {
        super(var2);
        this.setMaxStackSize(1);
        this.setCreativeTab(UsefulFood.tabUsefulFood);
        this.setUnlocalizedName(name);
        this.name = name;
        GameRegistry.registerItem(this, name, UsefulFood.MOD_ID);
    }
}
