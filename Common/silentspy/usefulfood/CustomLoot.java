package silentspy.usefulfood;

import java.util.*;

import net.minecraft.src.*;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class CustomLoot 
{
    @ForgeSubscribe
    public void LivingDropsEvent(LivingDropsEvent event)
    {
        if(event.entity instanceof EntitySheep)
        {
            if(!event.entityLiving.isChild()) {
                Random generator = new Random();
                int lootchance =  generator.nextInt(5);
                
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
}
