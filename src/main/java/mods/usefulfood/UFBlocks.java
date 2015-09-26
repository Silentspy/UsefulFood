package mods.usefulfood;

import mods.usefulfood.blocks.MagicCake;
import mods.usefulfood.blocks.SpecialCake;
import net.minecraft.block.Block;

public class UFBlocks {
	
	public Block AppleCake;
	public Block ChocolateCake;
	public Block MagicCake;
	public Block CaramelCake;
	
	public Block ChocolateStillFluid;

	public UFBlocks init() {
		AppleCake = new SpecialCake("AppleCakeBlock", 18, 0.6F);
		ChocolateCake = new SpecialCake("ChocolateCakeBlock", 12, 0.5F);
		MagicCake = new MagicCake("MagicCakeBlock", 48, 0.5F);
		
		// 1.4
		CaramelCake = new SpecialCake("CaramelCakeBlock", 19, 0.8F);
		return this;
	}
}
