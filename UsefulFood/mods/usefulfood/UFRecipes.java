package mods.usefulfood;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class UFRecipes {

	private static void AddRecipes() 
	{
		GameRegistry.addRecipe(new ItemStack(UFItems.porkwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Item.porkCooked });
		GameRegistry.addRecipe(new ItemStack(UFItems.steakwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Item.beefCooked });
		GameRegistry.addRecipe(new ItemStack(UFItems.fishwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Item.fishCooked });
		GameRegistry.addRecipe(new ItemStack(UFItems.chickenwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', Item.chickenCooked });
		GameRegistry.addRecipe(new ItemStack(UFItems.eggwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.friedegg });
		GameRegistry.addRecipe(new ItemStack(UFItems.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', Item.appleRed, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', new ItemStack(Item.dyePowder, 1, 3), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', new ItemStack(Item.appleGold, 1, 1), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.MuttonSandwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.MuttonCooked });

		// 1.2
		GameRegistry.addRecipe(new ItemStack(UFItems.SquidSandwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.SquidTentacleCooked });
		
		// 1.4
		GameRegistry.addRecipe(new ItemStack(UFItems.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', UFItems.caramel, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', UFItems.caramel, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.AppleCake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', Item.appleRed, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.ChocolateCake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', new ItemStack(Item.dyePowder, 1, 3), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.MagicCake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', new ItemStack(Item.appleGold, 1, 1), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UFItems.CheeseSandwich), new Object[] { "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.Cheese });
	}

	private static void AddShapelessRecipes() 
	{
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.milkbottle, 2), new Object[] { Item.glassBottle, Item.glassBottle, Item.bucketMilk });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.magicfruitsalad), new Object[] {Item.bowlEmpty, Item.speckledMelon, Item.appleGold });
		
		if(mod_usefulfood.MoCreatures) 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarcube), new Object[] { Item.sugar, Item.sugar, Item.sugar, Item.sugar, Item.sugar});
		}
		else 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarcube), new Object[] { Item.sugar, Item.sugar, Item.sugar, Item.sugar});
		}
		
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.caramelapple), new Object[] { Item.stick,UFItems.caramel, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.pumpkinsoup), new Object[] {Item.bowlEmpty, Block.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.salad), new Object[] { Block.plantRed, Block.plantYellow, Item.bowlEmpty, Item.seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.fruitsalad), new Object[] {Item.bowlEmpty, Item.melon, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Oatmeal), new Object[] { Item.bowlEmpty, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.jelly), new Object[] { Item.bowlEmpty, Item.slimeBall,Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.marshmallow), new Object[] { Item.stick, Item.bucketWater, Item.sugar, Item.sugar, Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.icecream), new Object[] { Item.bowlEmpty,Item.snowball, Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.breadslice, 5), new Object[] { Item.bread });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.biscuit, 3), new Object[] { Item.wheat, Item.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.trailmix), new Object[] { Item.bowlEmpty, Item.pumpkinSeeds, Item.seeds, Item.melonSeeds });
		
		// 1.2
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatecandy), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.sugar, UFItems.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolateicecream), new Object[] {UFItems.chocolatecandy, UFItems.icecream });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sushi), new Object[] { Item.fishRaw, Block.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.melonjuice), new Object[] {Item.melon, Item.melon, Item.melon, Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.applejuice), new Object[] {Item.appleRed, Item.appleRed, Item.appleRed, Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotjuice), new Object[] {Item.carrot, Item.carrot, Item.carrot, Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.magicapplejuice), new Object[] {new ItemStack(Item.appleGold, 1, 1), new ItemStack(Item.appleGold, 1, 0), new ItemStack(Item.appleGold, 1, 0), Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotsoup), new Object[] {Item.carrot, Item.carrot, Item.bowlEmpty });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.pumpkinbread), new Object[] {Item.wheat, Item.wheat, Block.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.fishnchips), new Object[] {Item.bakedPotato, Item.fishCooked });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotpie), new Object[] { Item.carrot, Item.egg, Item.sugar, Item.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.applebiscuit), new Object[] {Item.appleRed, UFItems.biscuit });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarbiscuit), new Object[] {Item.sugar, UFItems.biscuit });
		
		// 1.4
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.SquidSushi), new Object[] {UFItems.SquidTentacleRaw, Block.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CactusJuice), new Object[] {Item.glassBottle, Block.cactus, Block.cactus, Block.cactus });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Spaghetti), new Object[] {Item.wheat, Item.bucketWater, Item.egg, Item.bowlEmpty });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleIceCream), new Object[] {UFItems.icecream, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MagicIceCream), new Object[] {new ItemStack(Item.appleGold, 1, 0), Item.speckledMelon, Item.speckledMelon, UFItems.icecream});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolateApple), new Object[] {Item.stick, Item.appleRed, UFItems.hotchocolatebottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelBiscuit), new Object[] {UFItems.biscuit, UFItems.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.FishSoup), new Object[] {Item.bowlEmpty, Item.fishCooked, Item.carrot, Item.potato, Item.bucketWater });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Tea), new Object[] {Item.glassBottle, Block.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatecandy), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.sugar, Item.bucketMilk });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Cheese), new Object[] { UFItems.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonIceCream), new Object[] {UFItems.icecream, Item.melon, Item.melon, Item.melon });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.hotchocolatebottle), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.glassBottle, UFItems.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatebottle), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.glassBottle, UFItems.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocobiscuit), new Object[] {UFItems.biscuit, UFItems.chocolatecandy});
		GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelIceCream), new Object[] {UFItems.icecream, UFItems.caramel});
	}

    private static void AddSmeltingRecipes() {
		GameRegistry.addSmelting(UFItems.chocolatebottle.itemID, new ItemStack(UFItems.hotchocolatebottle), 0.3F);
		GameRegistry.addSmelting(UFItems.sugarcube.itemID, new ItemStack(UFItems.caramel), 0.3F);
		GameRegistry.addSmelting(Item.seeds.itemID, new ItemStack(UFItems.RoastedSeeds), 0.3F);
		GameRegistry.addSmelting(Item.pumpkinSeeds.itemID, new ItemStack(UFItems.RoastedSeeds), 0.3F);
		GameRegistry.addSmelting(Item.melonSeeds.itemID, new ItemStack(UFItems.RoastedSeeds), 0.3F);
		GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(UFItems.friedegg), 0.3F);
		GameRegistry.addSmelting(UFItems.marshmallow.itemID, new ItemStack(UFItems.cmarshmallow), 0.3F);
		GameRegistry.addSmelting(UFItems.MuttonRaw.itemID, new ItemStack(UFItems.MuttonCooked), 0.3F);
		
		// 1.2
		GameRegistry.addSmelting(UFItems.SquidTentacleRaw.itemID, new ItemStack(UFItems.SquidTentacleCooked), 0.3F);
		
		// 1.4
		GameRegistry.addSmelting(UFItems.milkbottle.itemID, new ItemStack(UFItems.HotMilkBottle), 0.3F);
	}	

	public static void init() {
		AddSmeltingRecipes();
		AddRecipes();
		AddShapelessRecipes();
	}
}
