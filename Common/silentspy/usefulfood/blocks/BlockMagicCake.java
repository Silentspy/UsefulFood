package silentspy.usefulfood.blocks;

import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class BlockMagicCake extends BlockCake {
	public BlockMagicCake(int var1) {
		super(var1, 0);
	}

	public int getBlockTextureFromSideAndMetadata(int var1, int var2) {
		return var1 == 0 ? 8 : (var1 == 1 ? 9 : (var2 > 0 && var1 == 4 ? 11
				: 10));
	}

	public void eatCakeSlice(World world, int x, int y, int z, EntityPlayer player) {
		if (player.canEat(false)) {
			world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
			
			player.getFoodStats().addStats(8, 0.5F);
			player.addPotionEffect(new PotionEffect(
					Potion.regeneration.id, 200, 3));
			player.addPotionEffect(new PotionEffect(
					Potion.resistance.id, 2000, 0));
			player.addPotionEffect(new PotionEffect(
					Potion.fireResistance.id, 2000, 0));
			int var6 = world.getBlockMetadata(x, y, z) + 1;

			if (var6 >= 6) {
				world.setBlockWithNotify(x, y, z, 0);
			} else {
				world.setBlockMetadataWithNotify(x, y, z, var6);
				world.markBlockAsNeedsUpdate(x, y, z);
			}
		}
	}

	public void randomDisplayTick(World par1World, int par2, int par3,
			int par4, Random random) {
		double var9 = (double) ((float) par2 + random.nextFloat());
		double var11 = (double) ((float) par3 + random.nextFloat());
		double var13 = (double) ((float) par4 + random.nextFloat());

		par1World.spawnParticle("reddust", var9, var11, var13, 0.0D /* red */,
				1.0D /* green */, 0.0D /* blue */);
	}

	@SideOnly(Side.CLIENT)
	public int idPicked(World par1World, int par2, int par3, int par4) {
		return UsefulFoodContent.magiccakeitem.shiftedIndex;
	}
}
