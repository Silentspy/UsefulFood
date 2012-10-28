package silentspy.usefulfood.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class BlockAppleLeaves extends BlockLeavesBase {

	protected BlockAppleLeaves(int id) {
		super(id, 80, Material.leaves, false);
		setTickRandomly(true);
		setHardness(0.2F);
		setLightOpacity(1);
		setStepSound(soundGrassFootstep);
		setRequiresSelfNotify();
		Block.setBurnProperties(blockID, 30, 60);
		setTextureFile(mod_usefulfood.blocktextures);
		setCreativeTab(CreativeTabs.tabDecorations);
	}
}
