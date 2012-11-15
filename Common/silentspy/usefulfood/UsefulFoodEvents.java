package silentspy.usefulfood;

import java.util.Random;

import net.minecraft.src.EntitySheep;
import net.minecraft.src.EntitySquid;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class UsefulFoodEvents {
	
	@ForgeSubscribe
	public void LivingDropsEvent(LivingDropsEvent event) {
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
						event.entity.dropItem(UsefulFoodContent.mutton.shiftedIndex, 1);
					} 
					else 
					{
						event.entity.dropItem(UsefulFoodContent.muttonraw.shiftedIndex, 1);
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
				event.entity.dropItem(UsefulFoodContent.cookedsquidtentacle.shiftedIndex, 1);
			} 
			else 
			{
				event.entity.dropItem(UsefulFoodContent.squidtentacle.shiftedIndex, 1);
			}
	        }
		}
	}

	/*
	 * @ForgeSubscribe public void BonemealEvent(BonemealEvent event) {
	 * if(event.ID == UsefulFoodContent.blueberrycrop.blockID || event.ID ==
	 * UsefulFoodContent.strawberrycrop.blockID) { int metadata =
	 * event.world.getBlockMetadata(event.X, event.Y, event.Z);
	 * 
	 * if(metadata < 3) { event.world.setBlockMetadata(event.X, event.Y,
	 * event.Z, 3); } } }
	 */
}
