package silentspy.usefulfood.world;

import java.util.Random;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.World;
import silentspy.usefulfood.UsefulFoodContent;

public class WorldGenBush {
	
	public static void generate(World world, Random random, int chunkX, int chunkZ, int metadata)
	{
    	//Generate Blueberry bushes
    	
    	int chunkY = world.getHeightValue(chunkX, chunkZ);
    	
    	int var7 = chunkX + random.nextInt(8) - random.nextInt(8);
        int var8 = chunkY + random.nextInt(4) - random.nextInt(4);
        int var9 = chunkZ + random.nextInt(8) - random.nextInt(8);
        
    	if(world.isAirBlock(var7, var8, var9) && Block.blocksList[37].canBlockStay(world, var7, var8, var9)) 
    	{
    		int chance =  random.nextInt(5);
    		
    		if(chance < 3) {
    			world.setBlockAndMetadata(var7, var8, var9, UsefulFoodContent.bush.blockID, metadata);
    		}
    	}
    }
}
