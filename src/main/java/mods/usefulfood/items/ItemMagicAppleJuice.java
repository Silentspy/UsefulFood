package mods.usefulfood.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMagicAppleJuice extends ItemJuice {

	
	public ItemMagicAppleJuice(String name, int var2, float var3) {
		super(name, var2, var3);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
		if (!playerIn.capabilities.isCreativeMode)
        {
            --stack.stackSize;
        }

        playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);

        if (!playerIn.capabilities.isCreativeMode)
        {
            if (stack.stackSize <= 0)
            {
                return new ItemStack(Items.glass_bottle);
            }

            playerIn.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
        }
        
        playerIn.getFoodStats().addStats(foodlevel, saturation);
        playerIn.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
        playerIn.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 0));
        playerIn.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 6000, 0));
        playerIn.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 400, 0));
        playerIn.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 0));
        this.onFoodEaten(stack, worldIn, playerIn);
        worldIn.playSoundAtEntity(playerIn, "random.burp", 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        return stack;
    }

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack var1) {
		return EnumRarity.EPIC;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack var1) {
		return true;
	}
	
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{
		l.add("Makes you feel leg... wait for it.... endary!");
	}
}
