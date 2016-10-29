package mods.usefulfood.items;

import cpw.mods.fml.common.Optional;
import mods.usefulfood.blocks.SpecialCake;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import squeek.applecore.api.food.FoodValues;
import squeek.applecore.api.food.IEdible;

@Optional.Interface(iface = "squeek.applecore.api.food.IEdible", modid = "AppleCore")
public class ItemCakeUF extends ItemReedUF implements IEdible {

	// Object because reasons
	private Object foodValuesPerSlice;
	private final SpecialCake cake;

	public ItemCakeUF(SpecialCake var2, String name) {
		super(var2, name);
		cake = var2;
		cake.item = this;
	}

	@Optional.Method(modid = "AppleCore")
	@Override
	public FoodValues getFoodValues(ItemStack itemStack) {
		return (FoodValues) (foodValuesPerSlice == null
				? foodValuesPerSlice = new FoodValues(cake.foodlevel, cake.saturation) : foodValuesPerSlice);
	}

	@Override
	public EnumAction getItemUseAction(ItemStack p_77661_1_) {
		return EnumAction.eat;
	}

}
