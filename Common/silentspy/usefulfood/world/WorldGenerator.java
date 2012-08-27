package silentspy.usefulfood.world;

import java.util.Random;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.ChunkProviderEnd;
import net.minecraft.src.ChunkProviderGenerate;
import net.minecraft.src.ChunkProviderHell;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.PlayerManager;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    	if (chunkGenerator instanceof ChunkProviderGenerate)
		{
			generateSurface(world, random, chunkX << 4, chunkZ << 4);
		}
		else if (chunkGenerator instanceof ChunkProviderHell)
		{
			generateNether(world, random, chunkX << 4, chunkZ << 4);
		}
		else if (chunkGenerator instanceof ChunkProviderEnd)
		{
			generateEnd(world, random, chunkX << 4, chunkZ << 4);
		}
    }
    
    public void generateSurface(World world, Random random, int chunkX, int chunkZ)
	{
    	//Generate Blueberry bushes
    	
    	BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
    	
    	int chunkY = world.getHeightValue(chunkX, chunkZ);
    	
    	int var7 = chunkX + random.nextInt(8) - random.nextInt(8);
        int var8 = chunkY + random.nextInt(4) - random.nextInt(4);
        int var9 = chunkZ + random.nextInt(8) - random.nextInt(8);
        
    	if(world.isAirBlock(var7, var8, var9) && Block.blocksList[37].canBlockStay(world, var7, var8, var9)) 
    	{
    		int chance =  random.nextInt(5);
    		
    		if(chance < 3) {
    			world.setBlock(var7, var8, var9, 5);
    		}
    	}
    }
    
    public void generateNether(World world, Random random, int chunkX, int chunkZ)
    {
    	
    }

	public void generateEnd(World world, Random random, int chunkX, int chunkZ)
	{
		
	}	
}
