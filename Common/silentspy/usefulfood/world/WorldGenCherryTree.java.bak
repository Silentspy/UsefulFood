package silentspy.usefulfood.world;

import java.util.Random;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.World;
import silentspy.usefulfood.UsefulFoodContent;

public class WorldGenCherryTree extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
			Block.grass.blockID,
			Block.dirt.blockID
		};
	}

	public boolean LocationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);

		while (checkID != 0){
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}

		if (distanceToAir > 3){
			return false;
		}
		j += distanceToAir - 1;

		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j+1, k);
		int blockIDBelow = world.getBlockId(i, j-1, k);
		for (int x : GetValidSpawnBlocks()){
			if (blockIDAbove != 0){
				return false;
			}
			if (blockID == x){
				return true;
			}else if (blockID == Block.snow.blockID && blockIDBelow == x){
				return true;
			}
		}
		return false;
	}

	public WorldGenCherryTree() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 6, j, k) || !LocationIsValidSpawn(world, i + 6, j, k + 6) || !LocationIsValidSpawn(world, i, j, k + 6))
		{
			return false;
		}

		world.setBlockAndMetadata(i + 0, j + 2, k + 3, Block.leaves.blockID, 4);
		world.setBlockAndMetadata(i + 1, j + 2, k + 2, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 1, j + 2, k + 3, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 1, j + 2, k + 4, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 1, j + 3, k + 3, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 2, j + 2, k + 1, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 2, j + 2, k + 2, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 2, j + 2, k + 3, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 2, j + 2, k + 4, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 2, j + 2, k + 5, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 2, j + 3, k + 2, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 2, j + 3, k + 3, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 2, j + 3, k + 4, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 2, j + 4, k + 3, Block.leaves.blockID, 12);
		world.setBlock(i + 3, j + 0, k + 3, Block.wood.blockID);
		world.setBlock(i + 3, j + 1, k + 3, Block.wood.blockID);
		world.setBlockAndMetadata(i + 3, j + 2, k + 0, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 2, k + 1, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 2, k + 2, Block.leaves.blockID, 12);
		world.setBlock(i + 3, j + 2, k + 3, Block.wood.blockID);
		world.setBlockAndMetadata(i + 3, j + 2, k + 4, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 2, k + 5, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 2, k + 6, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 3, k + 1, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 3, k + 2, Block.leaves.blockID, 12);
		world.setBlock(i + 3, j + 3, k + 3, Block.wood.blockID);
		world.setBlockAndMetadata(i + 3, j + 3, k + 4, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 3, k + 5, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 4, k + 2, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 4, k + 3, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 4, k + 4, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 3, j + 5, k + 3, Block.leaves.blockID, 4);
		world.setBlockAndMetadata(i + 4, j + 2, k + 1, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 4, j + 2, k + 2, Block.leaves.blockID, 4);
		world.setBlockAndMetadata(i + 4, j + 2, k + 3, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 4, j + 2, k + 4, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 4, j + 2, k + 5, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 4, j + 3, k + 2, Block.leaves.blockID, 4);
		world.setBlockAndMetadata(i + 4, j + 3, k + 3, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 4, j + 3, k + 4, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 4, j + 4, k + 3, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 5, j + 2, k + 2, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 5, j + 2, k + 3, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 5, j + 2, k + 4, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 5, j + 3, k + 3, Block.leaves.blockID, 12);
		world.setBlockAndMetadata(i + 6, j + 2, k + 3, Block.leaves.blockID, 4);

		return true;
	}
}