package mods.usefulfood;

import mods.usefulfood.blocks.MagicCake;
import mods.usefulfood.blocks.SpecialCake;

public class UFBlocks {
	
	public static SpecialCake AppleCake;
	public static SpecialCake ChocolateCake;
	public static SpecialCake MagicCake;
	public static SpecialCake CaramelCake;
	
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
