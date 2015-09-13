package mods.usefulfood.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBlockBush extends ItemBlock {

    public ItemBlockBush(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getUnlocalizedName(ItemStack itemstack) {
         String name;
         switch(itemstack.getItemDamage()) {
               case 0: {
                   name = "blueberry";
                   break;
               }
               case 1: {
                   name = "strawberry"; 
                   break;
               }
               default:
                   name = "blueberry";
                   break;
         }
         return getUnlocalizedName() + "." + name;
     }

    @Override
    public int getMetadata(int par1) {
        return par1;
    }
}