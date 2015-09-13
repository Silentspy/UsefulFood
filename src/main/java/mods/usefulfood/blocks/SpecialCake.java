package mods.usefulfood.blocks;

import mods.usefulfood.UFBlocks;
import mods.usefulfood.UFItems;
import mods.usefulfood.items.ItemCakeUF;
import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SpecialCake extends BlockCakeUF {

    String name;

    public SpecialCake(String name, int foodlevel, float saturation) {
        super(foodlevel / 6, saturation);
        this.setTickRandomly(true);
        this.setHardness(0.5F);
        this.setStepSound(Block.soundTypeCloth);
        this.name = name;
        this.setUnlocalizedName(name);
        GameRegistry.registerBlock(this, ItemCakeUF.class, name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos) {
        if (this == UFBlocks.AppleCake) return UFItems.AppleCake;
        if (this == UFBlocks.ChocolateCake) return UFItems.ChocolateCake;
        if (this == UFBlocks.CaramelCake) return UFItems.CaramelCake;
        return Items.cake;
    }
}
