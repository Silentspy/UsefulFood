package silentspy.usefulfood.blocks;

import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class BlockAppleCake extends BlockCake {
	public BlockAppleCake(int var1) {
		super(var1, 0);
		this.setTickRandomly(true);
	}

	public int getBlockTextureFromSideAndMetadata(int var1, int var2) {
		return var1 == 0 ? 0
				: (var1 == 1 ? 1 : (var2 > 0 && var1 == 4 ? 3 : 2));
	}

	public void eatCakeSlice(World world, int par2, int par3, int par4, EntityPlayer player) {
		if (player.canEat(false)) {
			world.playSoundAtEntity(player, "random.eat", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
			
			player.getFoodStats().addStats(3, 0.5F);
			int var6 = world.getBlockMetadata(par2, par3, par4) + 1;

			if (var6 >= 6) {
				world.setBlockWithNotify(par2, par3, par4, 0);
			} else {
				world.setBlockMetadataWithNotify(par2, par3, par4, var6);
				world.markBlockForRenderUpdate2(par2, par3, par4);
			}
		}
	}

	public String getTextureFile() {
		return mod_usefulfood.blocktextures;
	}

	@SideOnly(Side.CLIENT)
	public int idPicked(World par1World, int par2, int par3, int par4) {
		return UsefulFoodContent.applecakeitem.shiftedIndex;
	}
}
