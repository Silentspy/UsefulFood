package usefulfood;

import java.util.Random;

import cpw.mods.fml.common.FMLLog;

import net.minecraft.entity.passive.*;
import net.minecraft.entity.monster.*;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class UsefulFoodEvents {
	
	@ForgeSubscribe
	public void LivingDropsEvent(LivingDropsEvent event) {
		
		if(event.entity instanceof EntityMob) 
		{
			if(UsefulFoodConfig.FruitDropRateMonsters > 0) 
			{
				DropFruit(event, UsefulFoodConfig.FruitDropRateMonsters);
			}
		}
		else if (event.entity instanceof EntityAnimal) 
		{
			if(UsefulFoodConfig.FruitDropRateAnimals > 0) 
			{
				DropFruit(event, UsefulFoodConfig.FruitDropRateAnimals);
			}
		}
		
		if (event.entity instanceof EntitySheep) 
		{
			if (!event.entityLiving.isChild()) 
			{
				Random random = new Random();
				
				int var3 = random.nextInt(2) + 1 + random.nextInt(1 + event.lootingLevel);
				int var4;
				
				for (var4 = 0; var4 < var3; ++var4)
		        {
					if (event.entityLiving.isBurning()) 
					{
						event.entity.dropItem(UsefulFoodItems.mutton.itemID, 1);
					} 
					else 
					{
						event.entity.dropItem(UsefulFoodItems.muttonraw.itemID, 1);
					}
				}
			}
		}
		else if (event.entity instanceof EntitySquid) 
		{
			Random random = new Random();
			
			int var3 = random.nextInt(4) + 1 + random.nextInt(1 + event.lootingLevel);
			int var4;
			
	        for (var4 = 0; var4 < var3; ++var4)
	        {
	        	if (event.entityLiving.isBurning()) 
				{
					event.entity.dropItem(UsefulFoodItems.cookedsquidtentacle.itemID, 1);
				} 
				else 
				{
					event.entity.dropItem(UsefulFoodItems.squidtentacle.itemID, 1);
				}
	        }
		}
	}
	
	public void DropFruit(LivingDropsEvent event, int droprate) 
	{
		Random random = new Random();
		int lootchance = random.nextInt(101);
		
		FMLLog.info(String.valueOf(lootchance));
		if(lootchance <= droprate) 
		{
			int fruit = 1 + random.nextInt(5);
			switch (fruit) 
			{
			   case 1: event.entity.dropItem(UsefulFoodItems.Banana.itemID, 1); break;
			   case 2: event.entity.dropItem(UsefulFoodItems.Orange.itemID, 1); break;
			   case 3: event.entity.dropItem(UsefulFoodItems.Peach.itemID, 1); break;
			   case 4: event.entity.dropItem(UsefulFoodItems.Pear.itemID, 1); break;
			   case 5: event.entity.dropItem(UsefulFoodItems.Cherry.itemID, 2); break;
			   default: event.entity.dropItem(UsefulFoodItems.Banana.itemID, 1); break;
			}
		}
	}
}
