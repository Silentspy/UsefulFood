package usefulfood.blocks;

import java.util.Random;

import usefulfood.*;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockMagicCake extends BlockCake {
	public BlockMagicCake(int id, int blockindex, int foodlevel, float saturation, int cakeitem) {
		super(id, blockindex, foodlevel, saturation, cakeitem);
	}

	public void eatCakeSlice(World world, int x, int y, int z, EntityPlayer player) {
		if (player.canEat(false)) {
			world.playSoundAtEntity(player, "random.eat", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
			
			player.getFoodStats().addStats(foodlevel, saturation);
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 3));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 2000, 0));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2000, 0));
			int var6 = world.getBlockMetadata(x, y, z) + 1;

			if (var6 >= 6) {
				world.setBlockWithNotify(x, y, z, 0);
			} else {
				world.setBlockMetadataWithNotify(x, y, z, var6);
				world.markBlockForRenderUpdate2(x, y, z);
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
		return UsefulFoodItems.magiccake.itemID;
	}
}
