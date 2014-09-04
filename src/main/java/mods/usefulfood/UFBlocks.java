package mods.usefulfood;

import mods.usefulfood.blocks.MagicCake;
import mods.usefulfood.blocks.SpecialCake;
import net.minecraft.block.Block;

public class UFBlocks {
	
	public static Block AppleCake;
	public static Block ChocolateCake;
	public static Block MagicCake;
	public static Block CaramelCake;
	
	public static Block ChocolateStillFluid;
	
	public UFBlocks() 
	{
		AppleCake = new SpecialCake("applecake", 18, 0.6F);
		ChocolateCake = new SpecialCake("chocolatecake", 12, 0.5F);
		MagicCake = new MagicCake("magiccake", 48, 0.5F);
		
		// 1.4
		CaramelCake = new SpecialCake("caramelcake", 19, 0.8F);
		// ChocolateStillFluid = new ChocolateFluidStill(UFConfig.ChocolateFluidStill);
	}
}
