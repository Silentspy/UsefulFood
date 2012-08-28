package silentspy.usefulfood.world;

import java.util.Random;

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
    	// Generate Blueberry Bush
    	WorldGenBush.generate(world, random, chunkX, chunkZ, 0);
    	// Generate Strawberry Bush
    	WorldGenBush.generate(world, random, chunkX, chunkZ, 1);
	}
    
    public void generateNether(World world, Random random, int chunkX, int chunkZ)
    {
    	
    }

	public void generateEnd(World world, Random random, int chunkX, int chunkZ)
	{
		
	}
}
