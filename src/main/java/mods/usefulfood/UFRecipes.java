package mods.usefulfood;

import com.mrcrayfish.furniture.api.FurnitureRegister;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
		GameRegistry.addRecipe(new ItemStack(UF.items.porkwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', Items.cooked_porkchop });
		GameRegistry.addRecipe(new ItemStack(UF.items.steakwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', Items.cooked_beef });
		GameRegistry.addRecipe(new ItemStack(UF.items.fishwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', Items.cooked_fish });
		GameRegistry.addRecipe(new ItemStack(UF.items.chickenwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', Items.cooked_chicken });
		GameRegistry.addRecipe(new ItemStack(UF.items.eggwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', UF.items.friedegg });
		GameRegistry.addRecipe(new ItemStack(UF.items.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', UF.items.milkbottle, 'B', Items.apple, 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UF.items.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', UF.items.milkbottle, 'B', new ItemStack(Items.dye, 1, 3), 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UF.items.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', UF.items.milkbottle, 'B', new ItemStack(Items.golden_apple, 1, 1), 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UF.items.MuttonSandwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', UF.items.MuttonCooked });

		// 1.2
		GameRegistry.addRecipe(new ItemStack(UF.items.SquidSandwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', UF.items.SquidTentacleCooked });
		
		// 1.4
		GameRegistry.addRecipe(new ItemStack(UF.items.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', UF.items.milkbottle, 'B', UF.items.caramel, 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UF.items.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', UF.items.caramel, 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UF.items.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.apple, 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UF.items.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', new ItemStack(Items.dye, 1, 3), 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UF.items.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', new ItemStack(Items.golden_apple, 1, 1), 'C', Items.wheat, 'E', Items.egg });
		GameRegistry.addRecipe(new ItemStack(UF.items.CheeseSandwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', UF.items.Cheese });
	
		// 1.5
		GameRegistry.addRecipe(new ItemStack(UF.items.MuttonSandwich), new Object[] { "#", "%", "#", '#', UF.items.breadslice, '%', Items.cooked_mutton });
	}

	private void AddShapelessRecipes() 
	{
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.milkbottle, 2), new Object[] { Items.glass_bottle, Items.glass_bottle, Items.milk_bucket });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.magicfruitsalad), new Object[] {Items.bowl, Items.speckled_melon, Items.golden_apple });
		
		if(UF.MoCreatures) 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UF.items.sugarcube), new Object[] { Items.sugar, Items.sugar, Items.sugar, Items.sugar, Items.sugar});
		}
		else 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UF.items.sugarcube), new Object[] { Items.sugar, Items.sugar, Items.sugar, Items.sugar});
		}
		
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.caramelapple), new Object[] { Items.stick, UF.items.caramel, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.pumpkinsoup), new Object[] {Items.bowl, Blocks.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.salad), new Object[] { Blocks.red_flower, Blocks.yellow_flower, Items.bowl, Items.wheat_seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.fruitsalad), new Object[] {Items.bowl, Items.melon, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Oatmeal), new Object[] { Items.bowl, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.jelly), new Object[] { Items.bowl, Items.slime_ball,Items.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.marshmallow), new Object[] { Items.stick, Items.water_bucket, Items.sugar, Items.sugar, Items.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.icecream), new Object[] { Items.bowl,Items.snowball, Items.sugar, UF.items.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.breadslice, 5), new Object[] { Items.bread });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.biscuit, 3), new Object[] { Items.wheat, Items.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.trailmix), new Object[] { Items.bowl, Items.pumpkin_seeds, Items.wheat_seeds, Items.melon_seeds });
		
		// 1.2
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.chocolatecandy), new Object[] { new ItemStack(Items.dye, 1, 3), Items.sugar, UF.items.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.chocolateicecream), new Object[] {UF.items.chocolatecandy, UF.items.icecream });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.sushi), new Object[] { Items.fish, Blocks.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.melonjuice), new Object[] {Items.melon, Items.melon, Items.melon, Items.glass_bottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.applejuice), new Object[] {Items.apple, Items.apple, Items.apple, Items.glass_bottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.carrotjuice), new Object[] {Items.carrot, Items.carrot, Items.carrot, Items.glass_bottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.magicapplejuice), new Object[] {new ItemStack(Items.golden_apple, 1, 1), new ItemStack(Items.golden_apple, 1, 0), new ItemStack(Items.golden_apple, 1, 0), Items.glass_bottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.carrotsoup), new Object[] {Items.carrot, Items.carrot, Items.bowl });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.pumpkinbread), new Object[] {Items.wheat, Items.wheat, Blocks.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.fishnchips), new Object[] {UF.items.FrenchFries, Items.cooked_fish });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.carrotpie), new Object[] { Items.carrot, Items.egg, Items.sugar, Items.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJamBiscuit), new Object[] {UF.items.AppleJam, UF.items.biscuit });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.sugarbiscuit), new Object[] {Items.sugar, UF.items.biscuit });
		
		// 1.4
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.SquidSushi), new Object[] {UF.items.SquidTentacleRaw, Blocks.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.CactusJuice), new Object[] {Items.glass_bottle, Blocks.cactus, Blocks.cactus, Blocks.cactus });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Spaghetti), new Object[] {Items.wheat, Items.water_bucket, Items.egg, Items.bowl });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleIceCream), new Object[] {UF.items.icecream, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MagicIceCream), new Object[] {new ItemStack(Items.golden_apple, 1, 0), Items.speckled_melon, Items.speckled_melon, UF.items.icecream});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.ChocolateApple), new Object[] {Items.stick, Items.apple, UF.items.hotchocolatebottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.CaramelBiscuit), new Object[] {UF.items.biscuit, UF.items.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.FishSoup), new Object[] {Items.bowl, Items.cooked_fish, Items.carrot, Items.potato, Items.water_bucket });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Tea), new Object[] {Items.glass_bottle, Blocks.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.chocolatecandy), new Object[] { new ItemStack(Items.dye, 1, 3), Items.sugar, Items.milk_bucket });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Cheese), new Object[] { UF.items.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonIceCream), new Object[] {UF.items.icecream, Items.melon, Items.melon, Items.melon });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.hotchocolatebottle), new Object[] { new ItemStack(Items.dye, 1, 3), Items.glass_bottle, UF.items.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.chocolatebottle), new Object[] { new ItemStack(Items.dye, 1, 3), Items.glass_bottle, UF.items.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.chocobiscuit, 2), new Object[] {UF.items.biscuit, UF.items.biscuit, UF.items.hotchocolatebottle});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.CaramelIceCream), new Object[] {UF.items.icecream, UF.items.caramel});
		
		// 1.4.3
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJelly), new Object[] {Items.sugar, Items.apple, Items.slime_ball, Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJelly), new Object[] {Items.sugar, Items.melon, Items.slime_ball, Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJelly), new Object[] {UF.items.jelly, Items.apple});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJelly), new Object[] {UF.items.jelly, Items.melon});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Cereal), new Object[] {UF.items.milkbottle, Items.wheat, Items.sugar, Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.ChocolateCereal), new Object[] {UF.items.milkbottle, Items.wheat, Items.sugar, new ItemStack(Items.dye, 1, 3), Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.FrenchFries), new Object[] {Items.baked_potato});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.PanCakeDough), new Object[] {Items.sugar, Items.milk_bucket, Items.wheat, Items.egg});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.PanCakeDough), new Object[] {Items.sugar, UF.items.milkbottle, Items.wheat, Items.egg});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJam),  new Object[] {Items.sugar, Items.bowl, Items.apple});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJam),  new Object[] {Items.sugar, Items.bowl, Items.melon});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJamBiscuit),  new Object[] {UF.items.biscuit, UF.items.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJamPanCake),  new Object[] {UF.items.PanCake, UF.items.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.AppleJamToast),  new Object[] {UF.items.breadslice, UF.items.AppleJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.CaramelPanCake),  new Object[] {UF.items.PanCake, UF.items.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.CaramelToast),  new Object[] {UF.items.breadslice, UF.items.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.ChocolatePanCake),  new Object[] {UF.items.PanCake, UF.items.chocolatecandy});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.ChocolateToast),  new Object[] {UF.items.chocolatecandy, UF.items.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJamBiscuit),  new Object[] {UF.items.MelonJam, UF.items.biscuit});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJamToast),  new Object[] {UF.items.MelonJam, UF.items.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.MelonJamPanCake),  new Object[] {UF.items.PanCake, UF.items.MelonJam});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.SugarToast),  new Object[] {Items.sugar, UF.items.breadslice});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.SugarPancake),  new Object[] {Items.sugar, UF.items.PanCake});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Donut),  new Object[] {Items.wheat, Items.wheat, Items.sugar, UF.items.milkbottle, new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(UF.items.Oreo),  new Object[] {UF.items.chocobiscuit, UF.items.chocobiscuit, Items.sugar, Items.sugar, UF.items.milkbottle});
	}

    private void AddSmeltingRecipes() {
    	AddSmeltingRecipe(UF.items.chocolatebottle, new ItemStack(UF.items.hotchocolatebottle));
    	AddSmeltingRecipe(UF.items.sugarcube, new ItemStack(UF.items.caramel));
    	AddSmeltingRecipe(Items.wheat_seeds, new ItemStack(UF.items.RoastedSeeds));
    	AddSmeltingRecipe(Items.pumpkin_seeds, new ItemStack(UF.items.RoastedSeeds));
    	AddSmeltingRecipe(Items.melon_seeds, new ItemStack(UF.items.RoastedSeeds));
    	AddSmeltingRecipe(Items.egg, new ItemStack(UF.items.friedegg));
    	AddSmeltingRecipe(UF.items.marshmallow, new ItemStack(UF.items.cmarshmallow));
    	AddSmeltingRecipe(UF.items.MuttonRaw, new ItemStack(UF.items.MuttonCooked));
		
		// 1.2
    	AddSmeltingRecipe(UF.items.SquidTentacleRaw, new ItemStack(UF.items.SquidTentacleCooked));
		
		// 1.4
    	AddSmeltingRecipe(UF.items.milkbottle, new ItemStack(UF.items.HotMilkBottle));
    	AddSmeltingRecipe(UF.items.PanCakeDough, new ItemStack(UF.items.PanCake));
	}
    
    private void AddSmeltingRecipe(Item input, ItemStack output, float xp) {
    	GameRegistry.addSmelting(input, output, xp);
    	FurnitureRegister.getInstance().registerOvenRecipe(new ItemStack(input), output);
    }
    
    private void AddSmeltingRecipe(Item input, ItemStack output) {
    	GameRegistry.addSmelting(input, output, 0.3F);
    	FurnitureRegister.getInstance().registerOvenRecipe(new ItemStack(input), output);
    }
}
