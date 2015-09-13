package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import mods.usefulfood.UsefulFood;

public class ItemBottle extends ItemFoodUF {

    int foodlevel;
    float saturation;
    boolean removepoison = false;

    public ItemBottle(String name, int foodlevel, float saturation, boolean removepoison) {
        super(name, 0, 0, false);
        this.setMaxStackSize(16);
        this.setCreativeTab(UsefulFood.tabUsefulFood);
        this.foodlevel = foodlevel;
        this.saturation = saturation;
        this.removepoison = removepoison;
    }

    public ItemBottle(String name, int foodlevel, float saturation) {
        super(name, 0, 0, false);
        this.setMaxStackSize(16);
        this.setCreativeTab(UsefulFood.tabUsefulFood);
        this.foodlevel = foodlevel;
        this.saturation = saturation;
    }

    @Override
    protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
        if (!player.capabilities.isCreativeMode) {
            --itemstack.stackSize;
            if(itemstack.stackSize > 0) player.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
        }
        if (!world.isRemote) {
            player.getFoodStats().addStats(foodlevel, saturation);
            world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
            if(this.removepoison) player.removePotionEffect(Potion.poison.id);
        }
    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 16;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.DRINK;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
}
