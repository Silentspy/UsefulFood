package mods.usefulfood.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class ItemTea extends ItemBottle {

	int hearts;
	
	public ItemTea(String name, int hearts) {
		super(name, 0, 0.0F, true);
		this.hearts = hearts;
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
        
        playerIn.heal(hearts);
		if(removepoison) {
			playerIn.removePotionEffect(Potion.poison.id);
		}
        worldIn.playSoundAtEntity(playerIn, "random.burp", 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        return stack;
    }
}
