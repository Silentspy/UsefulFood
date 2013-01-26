package silentspy.usefullamp.blocks;

import silentspy.usefullamp.UsefulLampContent;
import silentspy.usefullamp.mod_usefullamp;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class BlockLamp extends Block{

	public BlockLamp(int par1) {
		super(par1, Material.redstoneLight);
		
		this.setLightOpacity(255);
		this.setLightValue(1.0F);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setTextureFile(mod_usefullamp.blocktextures);
	}

}
