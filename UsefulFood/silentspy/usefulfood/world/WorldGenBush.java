package silentspy.usefulfood.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class WorldGenBush {
	
	public static void generate(World world, Random random, int chunkX, int chunkY, int chunkZ, int id, int metadata)
	{
    	
    	int x = chunkX + random.nextInt(8) - random.nextInt(8);
        int y = chunkY + random.nextInt(4) - random.nextInt(4);
        int z = chunkZ + random.nextInt(8) - random.nextInt(8);
        
    	if(world.isAirBlock(x, y, z) && Block.blocksList[37].canBlockStay(world, x, y, z)) 
    	{
    		if(random.nextInt(3) > 1) {
    			world.setBlockAndMetadata(x, y, z, id, metadata);
    		}
    	}
    }
}
