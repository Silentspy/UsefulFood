package mods.usefulfood;

import com.mrcrayfish.furniture.api.FurnitureRegister;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UFRecipes 
{
	public UFRecipes() 
	{
		AddSmeltingRecipes();
		AddRecipes();
		AddShapelessRecipes();
	}

	private void AddRecipes() 
	{
		GameRegistry.addRecipe(new ItemStack(UFItems.porkwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Items.cooked_porkchop });
		GameRegistry.addRecipe(new ItemStack(UFItems.steakwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Items.cooked_beef });
		GameRegistry.addRecipe(new ItemStack(UFItems.fishwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Items.cooked_fished });
		GameRegistry.addRecipe(new ItemStack(UFItems.chickenwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Items.cooked_chicken });
		GameRegistry.addRecipe(new ItemStack(UFItems.eggwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.friedegg });
		GameRegistry.addRecipe(new ItemStack(UFItems.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', Items.apple, 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', new ItemStack(Items.dye, 1, 3), 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', new ItemStack(Items.golden_apple, 1, 1), 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.MuttonSandwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.MuttonCooked });

		// 1.2
		GameRegistry.addRecipe(new ItemStack(UFItems.SquidSandwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.SquidTentacleCooked });
		
		// 1.4
		GameRegistry.addRecipe(new ItemStack(UFItems.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', UFItems.caramel, 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', UFItems.caramel, 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.apple, 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', new ItemStack(Items.dye, 1, 3), 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', new ItemStack(Items.golden_apple, 1, 1), 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.CheeseSandwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.Cheese });
	}

	private void AddShapelessRecipes() 
	{
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.milkbottle, 2), new Object[] { Items.glass_bottle, Items.glass_bottle, Items.milk_bucket });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.magicfruitsalad), new Object[] {Items.bowl, Items.speckled_melon, Items.golden_apple });
		
		if(mod_usefulfood.MoCreatures) 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarcube), new Object[] { Items.sugar, Items.sugar, Items.sugar, Items.sugar, Items.sugar});
		}
		else 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarcube), new Object[] { Items.sugar, Items.sugar, Items.sugar, Items.sugar});
		}
		
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.caramelapple), new Object[] { Items.stick, UFItems.caramel, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.pumpkinsoup), new Object[] {Items.bowl, Blocks.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.salad), new Object[] { Blocks.red_flower, Blocks.yellow_flower, Items.bowl, Items.wheat_seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.fruitsalad), new Object[] {Items.bowl, Items.melon, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Oatmeal), new Object[] { Items.bowl, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.jelly), new Object[] { Items.bowl, Items.slime_ball,Items.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.marshmallow), new Object[] { Items.stick, Items.water_bucket, Items.sugar, Items.sugar, Items.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.icecream), new Object[] { Items.bowl,Items.snowball, Items.sugar, UFItems.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.breadslice, 5), new Object[] { Items.bread });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.biscuit, 3), new Object[] { Items.wheat, Items.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.trailmix), new Object[] { Items.bowl, Items.pumpkin_seeds, Items.wheat_seeds, Items.melon_seeds });
		
		// 1.2
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatecandy), new Object[] { new ItemStack(Items.dye, 1, 3), Items.sugar, UFItems.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolateicecream), new Object[] {UFItems.chocolatecandy, UFItems.icecream });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sushi), new Object[] { Items.fish, Blocks.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.melonjuice), new Object[] {Items.melon, Items.melon, Items.melon, Items.glass_bottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.applejuice), new Object[] {Items.apple, Items.apple, Items.apple, Items.glass_bottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotjuice), new Object[] {Items.carrot, Items.carrot, Items.carrot, Items.glass_bottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.magicapplejuice), new Object[] {new ItemStack(Items.golden_apple, 1, 1), new ItemStack(Items.golden_apple, 1, 0), new ItemStack(Items.golden_apple, 1, 0), Items.glass_bottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotsoup), new Object[] {Items.carrot, Items.carrot, Items.bowl });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.pumpkinbread), new Object[] {Items.wheat, Items.wheat, Blocks.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.fishnchips), new Object[] {UFItems.FrenchFries, Items.cooked_fished });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotpie), new Object[] { Items.carrot, Items.egg, Items.sugar, Items.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamBiscuit), new Object[] {UFItems.AppleJam, UFItems.biscuit });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarbiscuit), new Object[] {Items.sugar, UFItems.biscuit });
		
		// 1.4
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.SquidSushi), new Object[] {UFItems.SquidTentacleRaw, Blocks.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CactusJuice), new Object[] {Items.glass_bottle, Blocks.cactus, Blocks.cactus, Blocks.cactus });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Spaghetti), new Object[] {Items.wheat, Items.water_bucket, Items.egg, Items.bowl });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleIceCream), new Object[] {UFItems.icecream, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MagicIceCream), new Object[] {new ItemStack(Items.golden_apple, 1, 0), Items.speckled_melon, Items.speckled_melon, UFItems.icecream});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolateApple), new Object[] {Items.stick, Items.apple, UFItems.hotchocolatebottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelBiscuit), new Object[] {UFItems.biscuit, UFItems.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.FishSoup), new Object[] {Items.bowl, Items.cooked_fished, Items.carrot, Items.potato, Items.water_bucket });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Tea), new Object[] {Items.glass_bottle, Blocks.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatecandy), new Object[] { new ItemStack(Items.dye, 1, 3), Items.sugar, Items.milk_bucket });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Cheese), new Object[] { UFItems.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonIceCream), new Object[] {UFItems.icecream, Items.melon, Items.melon, Items.melon });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.hotchocolatebottle), new Object[] { new ItemStack(Items.dye, 1, 3), Items.glass_bottle, UFItems.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatebottle), new Object[] { new ItemStack(Items.dye, 1, 3), Items.glass_bottle, UFItems.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocobiscuit, 2), new Object[] {UFItems.biscuit, UFItems.biscuit, UFItems.hotchocolatebottle});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelIceCream), new Object[] {UFItems.icecream, UFItems.caramel});
		
		// 1.4.3
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJelly), new Object[] {Items.sugar, Items.apple, Items.slime_ball, Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJelly), new Object[] {Items.sugar, Items.melon, Items.slime_ball, Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJelly), new Object[] {UFItems.jelly, Items.apple});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJelly), new Object[] {UFItems.jelly, Items.melon});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Cereal), new Object[] {UFItems.milkbottle, Items.wheat, Items.sugar, Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolateCereal), new Object[] {UFItems.milkbottle, Items.wheat, Items.sugar, new ItemStack(Items.dye, 1, 3), Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.FrenchFries), new Object[] {Items.baked_potato});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.PanCakeDough), new Object[] {Items.sugar, Items.milk_bucket, Items.wheat, Items.egg});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.PanCakeDough), new Object[] {Items.sugar, UFItems.milkbottle, Items.wheat, Items.egg});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJam),  new Object[] {Items.sugar, Items.bowl, Items.apple});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJam),  new Object[] {Items.sugar, Items.bowl, Items.melon});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamBiscuit),  new Object[] {UFItems.biscuit, UFItems.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamPanCake),  new Object[] {UFItems.PanCake, UFItems.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamToast),  new Object[] {UFItems.breadslice, UFItems.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelPanCake),  new Object[] {UFItems.PanCake, UFItems.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelToast),  new Object[] {UFItems.breadslice, UFItems.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolatePanCake),  new Object[] {UFItems.PanCake, UFItems.chocolatecandy});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolateToast),  new Object[] {UFItems.chocolatecandy, UFItems.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJamBiscuit),  new Object[] {UFItems.MelonJam, UFItems.biscuit});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJamToast),  new Object[] {UFItems.MelonJam, UFItems.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJamPanCake),  new Object[] {UFItems.PanCake, UFItems.MelonJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.SugarToast),  new Object[] {Items.sugar, UFItems.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.SugarPancake),  new Object[] {Items.sugar, UFItems.PanCake});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Donut),  new Object[] {Items.wheat, Items.wheat, Items.sugar, UFItems.milkbottle, new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Oreo),  new Object[] {UFItems.chocobiscuit, UFItems.chocobiscuit, Items.sugar, Items.sugar, UFItems.milkbottle});
	}

    private void AddSmeltingRecipes() {
    	AddSmeltingRecipe(UFItems.chocolatebottle, new ItemStack(UFItems.hotchocolatebottle));
    	AddSmeltingRecipe(UFItems.sugarcube, new ItemStack(UFItems.caramel));
    	AddSmeltingRecipe(Items.wheat_seeds, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Items.pumpkin_seeds, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Items.melon_seeds, new ItemStack(UFItems.RoastedSeeds));
    	AddSmeltingRecipe(Items.egg, new ItemStack(UFItems.friedegg));
    	AddSmeltingRecipe(UFItems.marshmallow, new ItemStack(UFItems.cmarshmallow));
    	AddSmeltingRecipe(UFItems.MuttonRaw, new ItemStack(UFItems.MuttonCooked));
		
		// 1.2
    	AddSmeltingRecipe(UFItems.SquidTentacleRaw, new ItemStack(UFItems.SquidTentacleCooked));
		
		// 1.4
    	AddSmeltingRecipe(UFItems.milkbottle, new ItemStack(UFItems.HotMilkBottle));
    	AddSmeltingRecipe(UFItems.PanCakeDough, new ItemStack(UFItems.PanCake));
	}
    
    @SuppressWarnings("unused")
	private void AddSmeltingRecipe(Item input, ItemStack output, float xp) {
    	GameRegistry.addSmelting(input, output, xp);
    	FurnitureRegister.getInstance().registerOvenRecipe(new ItemStack(input), output);
    }
    
    private void AddSmeltingRecipe(Item input, ItemStack output) {
    	GameRegistry.addSmelting(input, output, 0.3F);
    	FurnitureRegister.getInstance().registerOvenRecipe(new ItemStack(input), output);
    }
}
