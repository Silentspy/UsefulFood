package silentspy.usefulfood.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class BlockBlueberryBush extends BlockLeavesBase{

	public BlockBlueberryBush(int id) {
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
	
	public int getBlockTextureFromSideAndMetadata(int side, int metadata)
    {
		return side != 1 && side != 0 ? 12 : 13;
    }
	
	public int getRenderType()
    {
        return 0;
    }
	
	public int damageDropped(int par1)
    {
        return par1;
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(4);
    }
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return UsefulFoodContent.blueberry.shiftedIndex;
    }
	
	public String getTextureFile()
    {
        return mod_usefulfood.blocktextures;
    }
}
