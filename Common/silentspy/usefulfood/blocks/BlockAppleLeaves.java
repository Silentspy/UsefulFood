package silentspy.usefulfood.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;
import net.minecraftforge.common.IShearable;

public class BlockAppleLeaves extends BlockLeavesBase implements IShearable {

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
	
	@Override
	public boolean isLeaves(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public boolean isShearable(ItemStack item, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<ItemStack> onSheared(ItemStack item, World world, int x,
			int y, int z, int fortune) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return rand.nextInt(20) == 0 ? 1 : 0;
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess par1iBlockAccess,
			int par2, int par3, int par4, int par5)
	{
		graphicsLevel = !Block.leaves.isOpaqueCube(); // fix leaf render
														// bug
		return super.shouldSideBeRendered(par1iBlockAccess, par2, par3,
				par4, par5);
	}
}
