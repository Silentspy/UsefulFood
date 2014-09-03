package mods.usefulfood.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

import mods.usefulfood.mod_usefulfood;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SpecialCake extends BlockCakeUF {

	int foodlevel;
	float saturation;
	String name;
	
	@SideOnly(Side.CLIENT)
	private IIcon cake_top_icon;
	@SideOnly(Side.CLIENT)
	private IIcon cake_bottom_icon;
	@SideOnly(Side.CLIENT)
	private IIcon cake_inner_icon;
	
	public SpecialCake(String name, int foodlevel, float saturation) {
		super();
		this.foodlevel = foodlevel / 6;
		this.saturation = saturation;
		this.setTickRandomly(true);
		this.setHardness(0.5F);
		this.setStepSound(Block.soundTypeCloth);
		this.name = name;
		this.setBlockName(name);
		GameRegistry.registerBlock(this, name);
	}

	/**
	 * Heals the player and removes a slice from the cake.
	 */
	public void eatCakeSlice(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        if (par5EntityPlayer.canEat(false))
        {
            par5EntityPlayer.getFoodStats().addStats(foodlevel, saturation);
            int l = par1World.getBlockMetadata(par2, par3, par4) + 1;
            par1World.playSoundAtEntity(par5EntityPlayer, "random.eat", 0.5F, par1World.rand.nextFloat() * 0.1F + 0.9F);
            if (l >= 6)
            {
                par1World.setBlockToAir(par2, par3, par4);
            }
            else
            {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
            }
        }
    }
	
	@SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
	@Override
    public IIcon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.cake_top_icon : (par1 == 0 ? this.cake_bottom_icon : (par2 > 0 && par1 == 4 ? this.cake_inner_icon : this.blockIcon));
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	@Override
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("usefulfood:" + name + "_side");
        this.cake_inner_icon = par1IconRegister.registerIcon("usefulfood:" + name + "_inner");
        this.cake_top_icon = par1IconRegister.registerIcon("usefulfood:" + name + "_top");
        this.cake_bottom_icon = par1IconRegister.registerIcon("usefulfood:" + name + "_bottom");
    }

/*	@SideOnly(Side.CLIENT)
	
	public int idPicked(World par1World, int par2, int par3, int par4) {
		return cakeitemid + 256;
	}*/
}
