package silentspy.usefulfood.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import silentspy.usefulfood.UsefulFoodBlocks;
import silentspy.usefulfood.UsefulFoodConfig;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
     switch (world.provider.dimensionId)
     {
      case -1: generateNether(world, random, chunkX*16, chunkZ*16);
      case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
     }
    }
    
    private void generateSurface(World world, Random random, int blockX, int blockZ)
	{
    	// Generate Blueberry Bush
    	 if(UsefulFoodConfig.GenerateBlueberryBush) {
    		int Xcoord = blockX + random.nextInt(16);
    		int Ycoord = world.getHeightValue(blockX, blockZ) + 1;
    		int Zcoord = blockZ + random.nextInt(16);
    		(new WorldGenBush()).generate(world, random, blockX, Ycoord, blockZ, UsefulFoodBlocks.bush.blockID, 0);
    	}
    	
    	// Generate Strawberry Bush
    	if(UsefulFoodConfig.GenerateStrawberryBush) {
    		int	Xcoord = blockX + random.nextInt(16);
    		int Ycoord = world.getHeightValue(blockX, blockZ) + 1;
    		int Zcoord = blockZ + random.nextInt(16);
    		(new WorldGenBush()).generate(world, random, blockX, Ycoord, blockZ, UsefulFoodBlocks.bush.blockID, 1);
    	}
	}
    
    public void generateNether(World world, Random random, int chunkX, int chunkZ)
    {
    	
    }

	public void generateEnd(World world, Random random, int chunkX, int chunkZ)
	{
		
	}
}
