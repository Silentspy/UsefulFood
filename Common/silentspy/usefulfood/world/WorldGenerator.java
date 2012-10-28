package silentspy.usefulfood.world;

import java.util.Random;

import silentspy.usefulfood.UsefulFoodConfig;
import silentspy.usefulfood.UsefulFoodContent;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.ChunkProviderEnd;
import net.minecraft.src.ChunkProviderGenerate;
import net.minecraft.src.ChunkProviderHell;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.PlayerManager;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import net.minecraft.src.WorldGenTrees;
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
    		int Ycoord = world.getHeightValue(blockX, blockZ);
    		int Zcoord = blockZ + random.nextInt(16);
    		(new WorldGenBush()).generate(world, random, blockX, Ycoord, blockZ, UsefulFoodContent.blueberrybush.blockID);
    	}
    	
    	// Generate Strawberry Bush
    	if(UsefulFoodConfig.GenerateStrawberryBush) {
    		int	Xcoord = blockX + random.nextInt(16);
    		int Ycoord = world.getHeightValue(blockX, blockZ);
    		int Zcoord = blockZ + random.nextInt(16);
    		(new WorldGenBush()).generate(world, random, blockX, Ycoord, blockZ, UsefulFoodContent.strawberrybush.blockID);
    	}
    	
    	// Generate Apple Tree
    	if(UsefulFoodConfig.GenerateAppleTree) {
    		int Xcoord = blockX + random.nextInt(16);
    		int Ycoord = world.getHeightValue(blockX, blockZ);
    		int Zcoord = blockZ + random.nextInt(16);
    	
    		(new WorldGenAppleTree()).generate(world, random, Xcoord, Ycoord, Zcoord);
    	}
	}
    
    public void generateNether(World world, Random random, int chunkX, int chunkZ)
    {
    	
    }

	public void generateEnd(World world, Random random, int chunkX, int chunkZ)
	{
		
	}
}
