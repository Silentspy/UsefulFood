package mods.usefulfood.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class UFFluid extends Fluid {

    public UFFluid(String fluidName, ResourceLocation still, ResourceLocation flow) {
        super(fluidName, still, flow);
        FluidRegistry.registerFluid(this);
    }

}
