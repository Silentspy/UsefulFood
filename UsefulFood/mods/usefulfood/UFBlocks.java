package mods.usefulfood;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCake;
import mods.usefulfood.blocks.BlockCakeUF;
import mods.usefulfood.blocks.MagicCake;
import mods.usefulfood.blocks.SpecialCake;

public class UFBlocks {
	
	public static Block AppleCake;
	public static Block ChocolateCake;
	public static Block MagicCake;
	public static Block CaramelCake;
	
	public void init() 
	{
		AppleCake = new SpecialCake(UFConfig.ApplecakeBlockID, "applecake", 18, 0.6F, UFConfig.applecakeItemID);
		ChocolateCake = new SpecialCake(UFConfig.ChococakeBlockID, "chocolatecake", 12, 0.5F, UFConfig.chococakeItemID);
		MagicCake = new MagicCake(UFConfig.MagiccakeBlockID, "magiccake", 48, 0.5F, UFConfig.magiccakeItemID);
		
		// 1.4
		CaramelCake = new SpecialCake(UFConfig.CaramelCakeBlockID, "caramelcake", 12, 0.8F, UFConfig.CaramelCakeItemID);
	}
}
