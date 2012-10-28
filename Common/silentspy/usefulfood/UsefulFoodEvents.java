package silentspy.usefulfood;

import java.util.*;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class UsefulFoodEvents
{
    @ForgeSubscribe
    public void LivingDropsEvent(LivingDropsEvent event)
    {
        if(event.entity instanceof EntitySheep)
        {
            if(!event.entityLiving.isChild()) {
                Random random = new Random();
                int lootchance =  random.nextInt(5);
                
                if(lootchance < 4) {
                    if(event.entityLiving.isBurning()){
                        event.drops.add(new EntityItem(event.entityLiving.worldObj, event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, new ItemStack(UsefulFoodContent.mutton, 1)));
                    } else {
                        event.drops.add(new EntityItem(event.entityLiving.worldObj, event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, new ItemStack(UsefulFoodContent.muttonraw, 1)));
                    }
                }
            }
        }
    }
    
    @ForgeSubscribe
    public void BonemealEvent(BonemealEvent event)
    {	
    	if(event.ID == UsefulFoodContent.blueberrycrop.blockID || event.ID == UsefulFoodContent.strawberrycrop.blockID) {
    		int metadata = event.world.getBlockMetadata(event.X, event.Y, event.Z);
    		
    		if(metadata < 3)
    		{
    			event.world.setBlockMetadata(event.X, event.Y, event.Z, 3);
    		}
    	}
    }
}
