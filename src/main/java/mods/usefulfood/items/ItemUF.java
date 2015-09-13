package mods.usefulfood.items;

import net.minecraft.item.Item;
import mods.usefulfood.UsefulFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemUF extends Item {

    String name;

    public ItemUF(String name) {
        super();
        this.setCreativeTab(UsefulFood.tabUsefulFood);
        this.setUnlocalizedName(name);
        this.name = name;
        GameRegistry.registerItem(this, name, UsefulFood.MOD_ID);
    }
}
