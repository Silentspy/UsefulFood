package mods.usefulfood;

import mods.usefulfood.blocks.MagicCake;
import mods.usefulfood.blocks.SpecialCake;
import net.minecraft.block.Block;

public final class UFBlocks {

    public static Block AppleCake;
    public static Block ChocolateCake;
    public static Block MagicCake;
    public static Block CaramelCake;

    public static Block ChocolateStillFluid;

    public UFBlocks() {
        UFBlocks.AppleCake = new SpecialCake("AppleCake", 18, 0.6F);
        UFBlocks.ChocolateCake = new SpecialCake("ChocolateCake", 12, 0.5F);
        UFBlocks.MagicCake = new MagicCake("MagicCake", 48, 0.5F);

        // 1.4
        UFBlocks.CaramelCake = new SpecialCake("CaramelCake", 19, 0.8F);
        //UFBlocks.ChocolateStillFluid = new ChocolateFluidStill(UFConfig.ChocolateFluidStill, new ResourceLocation("usefulfood", "chocolate_still"), new ResourceLocation("usefulfood", "chocolate_flow"));
    }
}
