package mods.usefulfood.items;

import java.util.List;

import mods.usefulfood.UF;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFoodDebug extends ItemUF {
	
	int tick = 0;
	
	public ItemFoodDebug(String name) {
		super(name);
		this.setCreativeTab(UF.tabUsefulFood);
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{
		l.add("Siphons the food outta you!");
	}
	
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack var1) {
		return EnumRarity.EPIC;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack var1) {
		return true;
	}
	
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean isHeld) 
	{
		tick++;
		
		if(this.tick == 20) {
			if(isHeld && (entity instanceof EntityPlayer)) {
				   EntityPlayer player = (EntityPlayer)entity;
				   if (!world.isRemote && !player.capabilities.isCreativeMode) {
				      if (player.getFoodStats().getFoodLevel() >= 0) {
				         player.getFoodStats().setFoodLevel(player.getFoodStats().getFoodLevel()-1);
				         player.getFoodStats().setFoodSaturationLevel(0);
				    }
				}
			}
			this.tick = 0;
		}
	}
}
