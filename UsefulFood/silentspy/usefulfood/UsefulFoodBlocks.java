package silentspy.usefulfood;

import net.minecraft.block.Block;
import silentspy.usefulfood.blocks.BlockBush;
import silentspy.usefulfood.blocks.BlockCake;
import silentspy.usefulfood.blocks.BlockMagicCake;
import silentspy.usefulfood.blocks.BlockStorage;
import silentspy.usefulfood.items.ItemBlockBush;
import silentspy.usefulfood.items.ItemBlockStorage;
import cpw.mods.fml.common.registry.GameRegistry;

public class UsefulFoodBlocks {
	
	public static Block applecake;
	public static Block chococake;
	public static Block magiccake;
	public static Block storage;
	public static Block bush;
	public static Block blueberrycake;
	public static Block strawberrycake;
	
	public void init() 
	{
		applecake = new BlockCake(UsefulFoodConfig.ApplecakeBlockID, 0, 3, 0.5F, UsefulFoodConfig.applecakeItemID).setBlockName("AppleCake");
		chococake = new BlockCake(UsefulFoodConfig.ChococakeBlockID, 4, 4, 0.5F, UsefulFoodConfig.chococakeItemID).setBlockName("ChocoCake");
		magiccake = new BlockMagicCake(UsefulFoodConfig.MagiccakeBlockID, 8, 8, 0.5F, UsefulFoodConfig.magiccakeItemID).setBlockName("MagicCake");
		storage = new BlockStorage(UsefulFoodConfig.StorageBlockID).setHardness(0.8F).setBlockName("usefulfood.storage");
		bush = new BlockBush(UsefulFoodConfig.BushBlockID).setBlockName("usefulfood.bush");
		
		// 1.3
		blueberrycake = new BlockCake(UsefulFoodConfig.BlueberrycakeBlockID, 30, 3, 0.5F, UsefulFoodConfig.BlueberrycakeItemID).setBlockName("BlueberryCake");
		strawberrycake = new BlockCake(UsefulFoodConfig.StrawberrycakeBlockID, 26, 3, 0.5F, UsefulFoodConfig.StrawberrycakeItemID).setBlockName("StrawberryCake");
	}
}
