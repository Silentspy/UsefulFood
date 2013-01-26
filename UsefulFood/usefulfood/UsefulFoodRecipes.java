package usefulfood;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class UsefulFoodRecipes {

	private static void AddRecipes() {
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.chocolate, 1), new Object[] { "#", "%", '#', new ItemStack(Item.dyePowder, 1, 3), '%', UsefulFoodItems.milkbottle });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.porkwich, 1), new Object[] { "#", "%", "#", '#', UsefulFoodItems.toast, '%', Item.porkCooked });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.steakwich, 1), new Object[] { "#", "%", "#", '#', UsefulFoodItems.toast, '%', Item.beefCooked });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.fishwich, 1), new Object[] { "#", "%", "#", '#', UsefulFoodItems.toast, '%', Item.fishCooked });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.chickenwich, 1), new Object[] { "#", "%", "#", '#', UsefulFoodItems.toast, '%', Item.chickenCooked });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.eggwich, 1), new Object[] { "#", "%", "#", '#', UsefulFoodItems.toast, '%', UsefulFoodItems.friedegg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.applecake, 1), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', Item.appleRed, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.chococake, 1), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', new ItemStack(Item.dyePowder, 1, 3), 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.magiccake, 1), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', new ItemStack(Item.appleGold, 1, 1), 'C', Item.wheat, 'E', Item.egg });
		if(UsefulFoodConfig.EnableStorageBlock) {
			GameRegistry.addRecipe(new ItemStack(UsefulFoodBlocks.storage, 1, 0), new Object[] { "###", "###", "###", '#', Item.wheat });
		}
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.muttonwich, 1), new Object[] { "#", "%", "#", '#', UsefulFoodItems.toast, '%', UsefulFoodItems.mutton });

		// 1.2
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.squidwich, 1), new Object[] { "#", "%", "#", '#', UsefulFoodItems.toast, '%', UsefulFoodItems.cookedsquidtentacle });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.chocobiscuit, 8), new Object[] {"BBB", "BHB", "BBB", 'B', UsefulFoodItems.biscuit, 'H', UsefulFoodItems.hotchocolate });
		
		// 1.2.1
		if(UsefulFoodConfig.EnableStorageBlock) {
			GameRegistry.addRecipe(new ItemStack(UsefulFoodBlocks.storage, 1, 1), new Object[] { "###", "###", "###", '#', Item.reed });
		}
		// 1.2.3
		if(!UsefulFoodConfig.UseVanillaRecipes) {
			GameRegistry.addRecipe(new ItemStack(Item.cake, 1), new Object[] {"AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', Item.sugar, 'C', Item.wheat, 'E', Item.egg});
		}
		
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.Blueberrycake, 1), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', UsefulFoodItems.blueberry, 'C', Item.wheat, 'E', Item.egg });
		GameRegistry.addRecipe(new ItemStack(UsefulFoodItems.Strawberrycake, 1), new Object[] { "AAA", "BEB", "CCC", 'A', UsefulFoodItems.milkbottle, 'B', UsefulFoodItems.strawberry, 'C', Item.wheat, 'E', Item.egg });
		
	}

	private static void AddShapelessRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.milkbottle, 2), new Object[] { Item.glassBottle, Item.glassBottle, Item.bucketMilk });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.superfruitsalad, 1), new Object[] {Item.bowlEmpty, Item.speckledMelon, Item.appleGold });
		
		if(UsefulFoodConfig.UseOldSugarRecipe) 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.sugarcube, 1), new Object[] { Item.sugar, Item.sugar, Item.sugar, Item.sugar});
		} 
		else 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.sugarcube, 1), new Object[] { Item.sugar, Item.sugar, Item.sugar, Item.sugar, Item.sugar});
		}
		
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.caramelapple, 1), new Object[] { Item.stick,UsefulFoodItems.caramel, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.pumpkinsoup, 1), new Object[] {Item.bowlEmpty, Block.pumpkin });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.salad,1), new Object[] { Block.plantRed, Block.plantYellow, Item.bowlEmpty, Item.seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.fruitsalad, 1), new Object[] {Item.bowlEmpty, Item.melon, Item.appleRed });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.seedsalad, 1), new Object[] { Item.bowlEmpty, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.jelly, 1), new Object[] { Item.bowlEmpty, Item.slimeBall,Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.marshmallow, 1), new Object[] { Item.stick, Item.bucketWater, Item.sugar, Item.sugar, Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.icecream, 1), new Object[] { Item.bowlEmpty,Item.snowball, Item.sugar });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.toast, 5), new Object[] { Item.bread });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.biscuit, 3), new Object[] { Item.wheat, Item.wheat });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.trailmix, 1), new Object[] { Item.bowlEmpty, Item.pumpkinSeeds, Item.seeds, Item.melonSeeds });
		
		if(UsefulFoodConfig.EnableStorageBlock) 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 9), new Object[] { new ItemStack(UsefulFoodBlocks.storage, 1, 0) });
		}
		
		// 1.2
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.chocolatecandy, 2), new Object[] { new ItemStack(UsefulFoodItems.hotchocolate, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.chocolateicecream, 1), new Object[] {new ItemStack(UsefulFoodItems.chocolatecandy, 1), new ItemStack(UsefulFoodItems.icecream, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.sushi, 1), new Object[] { new ItemStack(Item.fishRaw, 1), new ItemStack(Item.seeds) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.melonjuice, 1), new Object[] {new ItemStack(Item.melon, 1), new ItemStack(Item.melon, 1), new ItemStack(Item.melon, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.applejuice, 1), new Object[] {new ItemStack(Item.appleRed, 1), new ItemStack(Item.appleRed, 1), new ItemStack(Item.appleRed, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.carrotjuice, 1), new Object[] {new ItemStack(Item.carrot, 1), new ItemStack(Item.carrot, 1), new ItemStack(Item.carrot, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.magicapplejuice, 1), new Object[] {new ItemStack(Item.appleGold, 1, 1), new ItemStack(Item.appleGold, 1, 0), new ItemStack(Item.appleGold, 1, 0), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.carrotsoup, 1), new Object[] {new ItemStack(Item.carrot, 1), new ItemStack(Item.carrot, 1), new ItemStack(Item.bowlEmpty, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.pumpkinbread, 1), new Object[] {new ItemStack(Item.wheat, 1), new ItemStack(Item.wheat, 1), new ItemStack(Block.pumpkin, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.fishnchips, 1), new Object[] {new ItemStack(Item.bakedPotato, 1), new ItemStack(Item.fishCooked, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.carrotpie, 1), new Object[] {new ItemStack(Item.carrot, 1), new ItemStack(Item.egg, 1), new ItemStack(Item.sugar, 1), new ItemStack(Item.wheat, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.applebiscuit, 1), new Object[] {new ItemStack(Item.appleRed, 1), new ItemStack(UsefulFoodItems.biscuit, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.sugarbiscuit, 1), new Object[] {new ItemStack(Item.sugar, 1), new ItemStack(UsefulFoodItems.biscuit, 1) });
		
		// 1.2.1
		if(UsefulFoodConfig.EnableStorageBlock) 
		{
			GameRegistry.addShapelessRecipe(new ItemStack(Item.reed, 9), new Object[] { new ItemStack(UsefulFoodBlocks.storage, 1, 1) });
		}
		
		// 1.3
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.blueberrySmoothie, 1), new Object[] {new ItemStack(UsefulFoodItems.blueberry, 1), new ItemStack(UsefulFoodItems.blueberry, 1), new ItemStack(UsefulFoodItems.blueberry, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.strawberrySmoothie, 1), new Object[] {new ItemStack(UsefulFoodItems.strawberry, 1), new ItemStack(UsefulFoodItems.strawberry, 1), new ItemStack(UsefulFoodItems.strawberry, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Bananasmoothie, 1), new Object[] {new ItemStack(UsefulFoodItems.Bananapeeled, 1), new ItemStack(UsefulFoodItems.Bananapeeled, 1), new ItemStack(UsefulFoodItems.Bananapeeled, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Orangejuice, 1), new Object[] {new ItemStack(UsefulFoodItems.Orange, 1), new ItemStack(UsefulFoodItems.Orange, 1), new ItemStack(UsefulFoodItems.Orange, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Cherryjuice, 1), new Object[] {new ItemStack(UsefulFoodItems.Cherry, 1), new ItemStack(UsefulFoodItems.Cherry, 1), new ItemStack(UsefulFoodItems.Cherry, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Pearjuice, 1), new Object[] {new ItemStack(UsefulFoodItems.Pear, 1), new ItemStack(UsefulFoodItems.Pear, 1), new ItemStack(UsefulFoodItems.Pear, 1), new ItemStack(Item.glassBottle, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodItems.Peachjuice, 1), new Object[] {new ItemStack(UsefulFoodItems.Peach, 1), new ItemStack(UsefulFoodItems.Peach, 1), new ItemStack(UsefulFoodItems.Peach, 1), new ItemStack(Item.glassBottle, 1) });
		
	}

    private static void AddSmeltingRecipes() {
		GameRegistry.addSmelting(UsefulFoodItems.milkbottle.itemID, new ItemStack(UsefulFoodItems.cheese, 1), 0.3F);
		GameRegistry.addSmelting(UsefulFoodItems.chocolate.itemID, new ItemStack(UsefulFoodItems.hotchocolate, 1), 0.3F);
		GameRegistry.addSmelting(UsefulFoodItems.sugarcube.itemID, new ItemStack(UsefulFoodItems.caramel, 1), 0.3F);
		GameRegistry.addSmelting(Item.seeds.itemID, new ItemStack(UsefulFoodItems.cookedseeds, 1), 0.3F);
		GameRegistry.addSmelting(Item.pumpkinSeeds.itemID, new ItemStack(UsefulFoodItems.cookedseeds, 1), 0.3F);
		GameRegistry.addSmelting(Item.melonSeeds.itemID, new ItemStack(UsefulFoodItems.cookedseeds, 1), 0.3F);
		GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(UsefulFoodItems.friedegg, 1), 0.3F);
		GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(UsefulFoodItems.friedegg, 1), 0.3F);
		GameRegistry.addSmelting(UsefulFoodItems.marshmallow.itemID, new ItemStack(UsefulFoodItems.cmarshmallow, 1), 0.3F);
		GameRegistry.addSmelting(UsefulFoodItems.muttonraw.itemID, new ItemStack(UsefulFoodItems.mutton, 1), 0.3F);
		
		// 1.2
		GameRegistry.addSmelting(UsefulFoodItems.squidtentacle.itemID, new ItemStack(UsefulFoodItems.cookedsquidtentacle, 1), 0.3F);
	}

	public static void init() {
		AddSmeltingRecipes();
		AddRecipes();
		AddShapelessRecipes();
	}
}
