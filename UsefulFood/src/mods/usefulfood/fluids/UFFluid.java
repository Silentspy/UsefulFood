package mods.usefulfood.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class UFFluid extends Fluid{

	public UFFluid(String fluidName) {
		super(fluidName);
		FluidRegistry.registerFluid(this);
	}

}
