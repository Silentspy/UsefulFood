package mods.usefulfood;

import java.util.Random;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class UFEvents {
	
	@ForgeSubscribe
	public void LivingDropsEvent(LivingDropsEvent event) 
	{
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
						event.entity.dropItem(UFItems.mutton.itemID, 1);
					} 
					else 
					{
						event.entity.dropItem(UFItems.muttonraw.itemID, 1);
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
					event.entity.dropItem(UFItems.cookedsquidtentacle.itemID, 1);
				} 
				else 
				{
					event.entity.dropItem(UFItems.squidtentacle.itemID, 1);
				}
	        }
		}
	}
}
