package mods.usefulfood;

import net.minecraft.block.Block;
import mods.usefulfood.blocks.MagicCake;
import mods.usefulfood.blocks.SpecialCake;

public class UFBlocks {
	
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
		applecake = new SpecialCake(UFConfig.ApplecakeBlockID, "applecake", 3, 0.5F, UFConfig.applecakeItemID);
		chococake = new SpecialCake(UFConfig.ChococakeBlockID, "chocolatecake", 4, 0.5F, UFConfig.chococakeItemID);
		magiccake = new MagicCake(UFConfig.MagiccakeBlockID, "magiccake", 8, 0.5F, UFConfig.magiccakeItemID);
		
		/*
		if(UsefulFoodConfig.EnableStorageBlock) 
		{
			storage = new BlockStorage(UsefulFoodConfig.StorageBlockID, "usefulfood.storage");
		}
		*/
		
		CaramelCake = new SpecialCake(UFConfig.CaramelCakeBlockID, "caramelcake", 4, 0.5F, UFConfig.CaramelCakeItemID);
	}
}
