package mods.usefulfood.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SpecialCake extends BlockCakeUF {

	int foodlevel;
	float saturation;
	String name;
	
	public SpecialCake(String name, int foodlevel, float saturation) {
		super();
		this.foodlevel = foodlevel / 6;
		this.saturation = saturation;
		this.setTickRandomly(true);
		this.setHardness(0.5F);
		this.setStepSound(Block.soundTypeCloth);
		this.name = name;
		this.setUnlocalizedName(name);
		GameRegistry.registerBlock(this, name);
	}

	/**
	 * Heals the player and removes a slice from the cake.
	 */
	
	@Override
	public void eatCake(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
    {
        if (player.canEat(false))
        {
            player.getFoodStats().addStats(foodlevel, saturation);
            int i = ((Integer)state.getValue(BITES)).intValue();

            worldIn.playSoundAtEntity(player, "random.eat", 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            if (i < 6)
            {
                worldIn.setBlockState(pos, state.withProperty(BITES, Integer.valueOf(i + 1)), 3);
            }
            else
            {
                worldIn.setBlockToAir(pos);
            }
        }
    }
	
    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos)
    {
    	return GameRegistry.findItem("UsefulFood", name.replace("Block", ""));
    }
}
