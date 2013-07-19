package mods.usefulfood.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMagicAppleJuice extends ItemJuice {

	
	public ItemMagicAppleJuice(int id, String name, int var2, float var3) {
		super(id, name, var2, var3);
	}

	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
			if(itemstack.stackSize > 0) {
				player.inventory.addItemStackToInventory(new ItemStack(Item.glassBottle));
			}
		}

		if (!world.isRemote) {
			player.getFoodStats().addStats(foodlevel, saturation);
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 3));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 6000, 0));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 6000, 0));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 400, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 0));
		}

		return itemstack.stackSize <= 0 ? new ItemStack(Item.glassBottle) : itemstack;
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack var1) {
		return EnumRarity.epic;
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
