package silentspy.usefulfood.items;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.World;

public class ItemMagicAppleJuice extends ItemJuice {

	int foodlevel;
	float saturation;

	public ItemMagicAppleJuice(int id, int var2, float var3) {
		super(id, var2, var3);
		this.foodlevel = var2;
		this.saturation = var3;
	}

	public ItemStack onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
		}

		if (!world.isRemote) {
			player.getFoodStats().addStats(foodlevel, saturation);
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 0));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 6000, 0));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 400, 0));
		}

		return itemstack.stackSize <= 0 ? new ItemStack(Item.glassBottle) : itemstack;
	}

	public EnumRarity getRarity(ItemStack var1) {
		return EnumRarity.epic;
	}

	public boolean hasEffect(ItemStack var1) {
		return true;
	}

}
