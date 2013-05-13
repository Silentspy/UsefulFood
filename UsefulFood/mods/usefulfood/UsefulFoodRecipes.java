package mods.usefulfood;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class UsefulFoodRecipes {

	private static void AddRecipes() {
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.porkwich), new Object[] { "#", "%", "#", '#', UsefulFoodItems.breadslice, '%', Item.porkCooked });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.steakwich), new Object[] { "#", "%", "#", '#', UsefulFoodItems.breadslice, '%', Item.beefCooked });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.fishwich), new Object[] { "#", "%", "#", '#', UsefulFoodItems.breadslice, '%', Item.fishCooked });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.chickenwich), new Object[] { "#", "%", "#", '#', UsefulFoodItems.breadslice, '%', Item.chickenCooked });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.eggwich), new Object[] { "#", "%", "#", '#', UsefulFoodItems.breadslice, '%', UsefulFoodItems.friedegg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.applecake), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', Item.appleRed, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.chococake), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', new ItemStack(Item.dyePowder, 1, 3), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.magiccake), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', new ItemStack(Item.appleGold, 1, 1), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.muttonwich), new Object[] { "#", "%", "#", '#', UsefulFoodItems.breadslice, '%', UsefulFoodItems.mutton });

		// 1.2
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.squidwich), new Object[] { "#", "%", "#", '#', UsefulFoodItems.breadslice, '%', UsefulFoodItems.cookedsquidtentacle });
		
		/*
		// 1.2.1
		if(UsefulFoodConfig.EnableStorageBlock) 
		{
			GameRegistry.addRecipe(new ItemStack(UsefulFoodBlocks.storage, 1, 1), new Object[] { "###", "###", "###", '#', Item.reed });
			GameRegistry.addRecipe(new ItemStack(UsefulFoodBlocks.storage, 1, 0), new Object[] { "###", "###", "###", '#', Item.wheat });
		}
		
		*/
		
		//GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.Blueberrycake, 1), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', UsefulFoodItems.blueberry, 'C', Item.wheat, 'E', Item.egg });
		//GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.Strawberrycake, 1), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', UsefulFoodItems.strawberry, 'C', Item.wheat, 'E', Item.egg });
		//GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.Blueberrycake, 1), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', UsefulFoodItems.blueberry, 'C', Item.wheat, 'E', Item.egg });
		//GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.Strawberrycake, 1), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', UsefulFoodItems.strawberry, 'C', Item.wheat, 'E', Item.egg });
		
		// 1.4
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', UsefulFoodItems.caramel, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.CaramelCake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', UsefulFoodItems.caramel, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.applecake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', Item.appleRed, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.chococake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', new ItemStack(Item.dyePowder, 1, 3), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.magiccake), new Object[] { "AAA", "BEB", "CCC", 'A', Item.bucketMilk, 'B', new ItemStack(Item.appleGold, 1, 1), 'C', Item.wheat, 'E', Item.egg });
	
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.chocobiscuit), new Object[] {"H", "B", 'B', UsefulFoodItems.biscuit, 'H', UsefulFoodItems.chocolatecandy });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.cheese), new Object[] { "#", "%", "#", '#', UsefulFoodItems.breadslice, '%', UsefulFoodItems.mutton });
	}

	private static void AddShapelessRecipes() 
	{
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.milkbottle, 2), new Object[] { Item.glassBottle, Item.glassBottle, Item.bucketMilk });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.magicfruitsalad), new Object[] {Item.bowlEmpty, Item.speckledMelon, Item.appleGold });
		
		if(mod_usefulfood.MoCreatures) 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.sugarcube), new Object[] { Item.sugar, Item.sugar, Item.sugar, Item.sugar, Item.sugar});
		}
		else 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.sugarcube), new Object[] { Item.sugar, Item.sugar, Item.sugar, Item.sugar});
		}
		
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.caramelapple), new Object[] { Item.stick,UsefulFoodItems.caramel, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.pumpkinsoup), new Object[] {Item.bowlEmpty, Block.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.salad), new Object[] { Block.plantRed, Block.plantYellow, Item.bowlEmpty, Item.seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.fruitsalad), new Object[] {Item.bowlEmpty, Item.melon, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.seedsalad), new Object[] { Item.bowlEmpty, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.jelly), new Object[] { Item.bowlEmpty, Item.slimeBall,Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.marshmallow), new Object[] { Item.stick, Item.bucketWater, Item.sugar, Item.sugar, Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.icecream), new Object[] { Item.bowlEmpty,Item.snowball, Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.breadslice, 5), new Object[] { Item.bread });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.biscuit, 3), new Object[] { Item.wheat, Item.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.trailmix), new Object[] { Item.bowlEmpty, Item.pumpkinSeeds, Item.seeds, Item.melonSeeds });
		
		// 1.2
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.chocolatecandy), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.sugar, UsefulFoodItems.milkbottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.chocolateicecream), new Object[] {UsefulFoodItems.chocolatecandy, UsefulFoodItems.icecream });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.sushi), new Object[] { Item.fishRaw, Block.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.melonjuice), new Object[] {Item.melon, Item.melon, Item.melon, Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.applejuice), new Object[] {Item.appleRed, Item.appleRed, Item.appleRed, Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.carrotjuice), new Object[] {Item.carrot, Item.carrot, Item.carrot, Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.magicapplejuice), new Object[] {new ItemStack(Item.appleGold, 1, 1), new ItemStack(Item.appleGold, 1, 0), new ItemStack(Item.appleGold, 1, 0), Item.glassBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.carrotsoup), new Object[] {Item.carrot, Item.carrot, Item.bowlEmpty });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.pumpkinbread), new Object[] {Item.wheat, Item.wheat, Block.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.fishnchips), new Object[] {Item.bakedPotato, Item.fishCooked });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.carrotpie), new Object[] { Item.carrot, Item.egg, Item.sugar, Item.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.applebiscuit), new Object[] {Item.appleRed, UsefulFoodItems.biscuit });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.sugarbiscuit), new Object[] {Item.sugar, UsefulFoodItems.biscuit });
		
		/*
		// 1.2.1
		if(UsefulFoodConfig.EnableStorageBlock) 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(Item.reed, 9), new Object[] { new ItemStack(UsefulFoodBlocks.storage, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 9), new Object[] { new ItemStack(UsefulFoodBlocks.storage, 1, 0) });
		}
		*/
		
		// 1.3
		/* GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.blueberrySmoothie, 1), new Object[] {new ItemStack(UsefulFoodItems.blueberry, 1), new ItemStack(UsefulFoodItems.blueberry, 1), new ItemStack(UsefulFoodItems.blueberry, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.strawberrySmoothie, 1), new Object[] {new ItemStack(UsefulFoodItems.strawberry, 1), new ItemStack(UsefulFoodItems.strawberry, 1), new ItemStack(UsefulFoodItems.strawberry, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Bananasmoothie, 1), new Object[] {new ItemStack(UsefulFoodItems.Bananapeeled, 1), new ItemStack(UsefulFoodItems.Bananapeeled, 1), new ItemStack(UsefulFoodItems.Bananapeeled, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Orangejuice, 1), new Object[] {new ItemStack(UsefulFoodItems.Orange, 1), new ItemStack(UsefulFoodItems.Orange, 1), new ItemStack(UsefulFoodItems.Orange, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Cherryjuice, 1), new Object[] {new ItemStack(UsefulFoodItems.Cherry, 1), new ItemStack(UsefulFoodItems.Cherry, 1), new ItemStack(UsefulFoodItems.Cherry, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Pearjuice, 1), new Object[] {new ItemStack(UsefulFoodItems.Pear, 1), new ItemStack(UsefulFoodItems.Pear, 1), new ItemStack(UsefulFoodItems.Pear, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Peachjuice, 1), new Object[] {new ItemStack(UsefulFoodItems.Peach, 1), new ItemStack(UsefulFoodItems.Peach, 1), new ItemStack(UsefulFoodItems.Peach, 1), new ItemStack(Item.glassBottle, 1) });
		*/
		
		// 1.4
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.SquidSushi), new Object[] {UsefulFoodItems.squidtentacle, Block.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.CactusJuice), new Object[] {Item.glassBottle, Block.cactus, Block.cactus, Block.cactus });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Spaghetti), new Object[] {Item.wheat, Item.bucketWater, Item.egg, Item.bowlEmpty });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.AppleIceCream), new Object[] {UsefulFoodItems.icecream, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.MagicIceCream), new Object[] {new ItemStack(Item.appleGold, 1, 0), Item.speckledMelon, Item.speckledMelon, UsefulFoodItems.icecream});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.ChocolateApple), new Object[] {Item.stick, Item.appleRed, UsefulFoodItems.hotchocolatebottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.CaramelBiscuit), new Object[] {UsefulFoodItems.biscuit, UsefulFoodItems.caramel});
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.FishSoup), new Object[] {Item.bowlEmpty, Item.fishCooked, Item.carrot, Item.potato, Item.bucketWater });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Tea), new Object[] {Item.glassBottle, Block.waterlily });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.chocolatecandy), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.sugar, Item.bucketMilk });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.cheese), new Object[] { UsefulFoodItems.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.MelonIceCream), new Object[] {UsefulFoodItems.icecream, Item.melon, Item.melon, Item.melon });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.hotchocolatebottle), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.glassBottle, UsefulFoodItems.HotMilkBottle });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.chocolatebottle), new Object[] { new ItemStack(Item.dyePowder, 1, 3), Item.glassBottle, UsefulFoodItems.milkbottle });
	}

    private static void AddSmeltingRecipes() {
		GameRegistry.addSmelting(UsefulFoodItems.chocolatebottle.itemID, new ItemStack(UsefulFoodItems.hotchocolatebottle), 0.3F);
		GameRegistry.addSmelting(UsefulFoodItems.sugarcube.itemID, new ItemStack(UsefulFoodItems.caramel), 0.3F);
		GameRegistry.addSmelting(Item.seeds.itemID, new ItemStack(UsefulFoodItems.RoastedSeeds), 0.3F);
		GameRegistry.addSmelting(Item.pumpkinSeeds.itemID, new ItemStack(UsefulFoodItems.RoastedSeeds), 0.3F);
		GameRegistry.addSmelting(Item.melonSeeds.itemID, new ItemStack(UsefulFoodItems.RoastedSeeds), 0.3F);
		GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(UsefulFoodItems.friedegg), 0.3F);
		GameRegistry.addSmelting(UsefulFoodItems.marshmallow.itemID, new ItemStack(UsefulFoodItems.cmarshmallow), 0.3F);
		GameRegistry.addSmelting(UsefulFoodItems.muttonraw.itemID, new ItemStack(UsefulFoodItems.mutton), 0.3F);
		
		// 1.2
		GameRegistry.addSmelting(UsefulFoodItems.squidtentacle.itemID, new ItemStack(UsefulFoodItems.cookedsquidtentacle), 0.3F);
		
		// 1.4
		GameRegistry.addSmelting(UsefulFoodItems.milkbottle.itemID, new ItemStack(UsefulFoodItems.HotMilkBottle), 0.3F);
	}	

	public static void init() {
		AddSmeltingRecipes();
		AddRecipes();
		AddShapelessRecipes();
	}
}
