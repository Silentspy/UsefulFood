package silentspy.usefullamp;

import cpw.mods.fml.common.registry.GameRegistry;
import silentspy.usefullamp.blocks.BlockLamp;
import net.minecraft.block.Block;

public class UsefulLampContent {
	
	public static Block lamp;

	public void init() {
		setupBlocks();
	}

	private void setupBlocks() {
		lamp = new BlockLamp(3242).setBlockName("lamp");
		
		GameRegistry.registerBlock(lamp, "UsefulLamp");
	}

}
