package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemBowl extends ItemFoodUF {

    boolean removepoison = false;

    public ItemBowl(String name, int hunger, float saturation, boolean removepoison) {
        super(name, hunger, saturation, false);
        this.setMaxStackSize(1);
        this.removepoison = removepoison;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack itemstack, World world, EntityPlayer player) {
        super.onItemUseFinish(itemstack, world, player);
        if (!world.isRemote) {
            if(removepoison) player.removePotionEffect(Potion.poison.id);
        }
        return new ItemStack(Items.bowl);
    }
}
