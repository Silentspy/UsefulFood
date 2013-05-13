package mods.usefulfood;

import net.minecraft.block.Block;
import mods.usefulfood.blocks.MagicCake;
import mods.usefulfood.blocks.SpecialCake;

public class UsefulFoodBlocks {
	
	public static Block applecake;
	public static Block chococake;
	public static Block magiccake;
	// public static Block storage;
	// public static Block bush;
	// public static Block blueberrycake;
	// public static Block strawberrycake;
	public static Block CaramelCake;
	
	public void init() 
	{
		applecake = new SpecialCake(UsefulFoodConfig.ApplecakeBlockID, "applecake", 3, 0.5F, UsefulFoodConfig.applecakeItemID);
		chococake = new SpecialCake(UsefulFoodConfig.ChococakeBlockID, "chocolatecake", 4, 0.5F, UsefulFoodConfig.chococakeItemID);
		magiccake = new MagicCake(UsefulFoodConfig.MagiccakeBlockID, "magiccake", 8, 0.5F, UsefulFoodConfig.magiccakeItemID);
		
		/*
		if(UsefulFoodConfig.EnableStorageBlock) 
		{
			storage = new BlockStorage(UsefulFoodConfig.StorageBlockID, "usefulfood.storage");
		}
		*/
		
		CaramelCake = new SpecialCake(UsefulFoodConfig.CaramelCakeBlockID, "caramelcake", 4, 0.5F, UsefulFoodConfig.CaramelCakeItemID);
	}
}
