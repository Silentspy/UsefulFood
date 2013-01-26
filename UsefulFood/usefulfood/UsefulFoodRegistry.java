package usefulfood;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import usefulfood.blocks.BlockBush;
import usefulfood.blocks.BlockCake;
import usefulfood.blocks.BlockMagicCake;
import usefulfood.blocks.BlockStorage;
import usefulfood.items.ItemBlockBush;
import usefulfood.items.ItemBlockStorage;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class UsefulFoodRegistry {
	
	public void init () 
	{
		GameRegistry.registerBlock(UsefulFoodBlocks.applecake, "UsefulFoodAppleCake");
		GameRegistry.registerBlock(UsefulFoodBlocks.chococake, "UsefulFoodChocoCake");
		GameRegistry.registerBlock(UsefulFoodBlocks.magiccake, "UsefulFoodMagicCake");
		GameRegistry.registerBlock(UsefulFoodBlocks.blueberrycake, "UsefulFoodBlueberryCake");
		GameRegistry.registerBlock(UsefulFoodBlocks.strawberrycake, "UsefulFoodStrawberryCake");
		if(UsefulFoodConfig.EnableStorageBlock) {
			GameRegistry.registerBlock(UsefulFoodBlocks.storage, ItemBlockStorage.class, "UsefulFoodStorage");
		}
		
		if(UsefulFoodConfig.EnableBushes) {
			GameRegistry.registerBlock(UsefulFoodBlocks.bush, ItemBlockBush.class, "UsefulFoodBush");
		}
		
		if(UsefulFoodConfig.FruitDropRateGrass > 0) {
			MinecraftForge.addGrassSeed(new ItemStack(UsefulFoodItems.Banana), UsefulFoodConfig.FruitDropRateGrass);
			MinecraftForge.addGrassSeed(new ItemStack(UsefulFoodItems.Orange), UsefulFoodConfig.FruitDropRateGrass);
			MinecraftForge.addGrassSeed(new ItemStack(UsefulFoodItems.Peach), UsefulFoodConfig.FruitDropRateGrass);
			MinecraftForge.addGrassSeed(new ItemStack(UsefulFoodItems.Pear), UsefulFoodConfig.FruitDropRateGrass);
			MinecraftForge.addGrassSeed(new ItemStack(UsefulFoodItems.Cherry), UsefulFoodConfig.FruitDropRateGrass);
		}
	}
	
	public void localization () 
	{
		LanguageRegistry.addName(UsefulFoodItems.milkbottle, "Milk Bottle");
		LanguageRegistry.addName(UsefulFoodItems.chocolate, "Chocolate Bottle");
		LanguageRegistry.addName(UsefulFoodItems.cheese, "Cheese");
		LanguageRegistry.addName(UsefulFoodItems.chocolatecandy, "Chocolate Candy");
		LanguageRegistry.addName(UsefulFoodItems.fruitsalad, "Fruitsalad");
		LanguageRegistry.addName(UsefulFoodItems.superfruitsalad, "Magic Fruitsalad");
		LanguageRegistry.addName(UsefulFoodItems.sugarcube, "Sugarcube");
		LanguageRegistry.addName(UsefulFoodItems.caramel, "Caramel");
		LanguageRegistry.addName(UsefulFoodItems.caramelapple, "Caramel Apple");
		LanguageRegistry.addName(UsefulFoodItems.cookedseeds, "Roasted Seeds");
		LanguageRegistry.addName(UsefulFoodItems.friedegg, "Fried Egg");
		LanguageRegistry.addName(UsefulFoodItems.pumpkinsoup, "Pumpkin Soup");
		LanguageRegistry.addName(UsefulFoodItems.salad, "Salad");
		LanguageRegistry.addName(UsefulFoodItems.seedsalad, "Oatmeal");
		LanguageRegistry.addName(UsefulFoodItems.jelly, "Jelly");
		LanguageRegistry.addName(UsefulFoodItems.marshmallow, "Marshmallow");
		LanguageRegistry.addName(UsefulFoodItems.cmarshmallow, "Roasted Marshmallow");
		LanguageRegistry.addName(UsefulFoodItems.icecream, "Vanilla Ice cream");
		LanguageRegistry.addName(UsefulFoodItems.toast, "Breadslice");
		LanguageRegistry.addName(UsefulFoodItems.porkwich, "Porkchop Sandwich");
		LanguageRegistry.addName(UsefulFoodItems.steakwich, "Steak Sandwich");
		LanguageRegistry.addName(UsefulFoodItems.fishwich, "Fish Sandwich");
		LanguageRegistry.addName(UsefulFoodItems.chickenwich, "Chicken Sandwich");
		LanguageRegistry.addName(UsefulFoodItems.eggwich, "Egg Sandwich");
		LanguageRegistry.addName(UsefulFoodBlocks.applecake, "Apple Cake");
		LanguageRegistry.addName(UsefulFoodItems.applecake, "Apple Cake");
		LanguageRegistry.addName(UsefulFoodBlocks.chococake, "Chocolate Cake");
		LanguageRegistry.addName(UsefulFoodItems.chococake, "Chocolate Cake");
		LanguageRegistry.addName(UsefulFoodItems.biscuit, "Biscuit");
		LanguageRegistry.addName(UsefulFoodItems.trailmix, "Trail Mix");
		LanguageRegistry.addName(UsefulFoodBlocks.magiccake, "Magic Cake");
		LanguageRegistry.addName(UsefulFoodItems.magiccake, "Magic Cake");
		LanguageRegistry.addName(UsefulFoodItems.mutton, "Cooked Mutton");
		LanguageRegistry.addName(UsefulFoodItems.muttonraw, "Raw Mutton");
		LanguageRegistry.addName(UsefulFoodItems.muttonwich, "Mutton Sandwich");
		LanguageRegistry.addName(UsefulFoodItems.debugfood, "UsefulFood Debug");
		LanguageRegistry.addName(UsefulFoodItems.magicapplejuice, "Magic Apple Juice");
		LanguageRegistry.addName(UsefulFoodItems.melonjuice, "Melon Juice");
		LanguageRegistry.addName(UsefulFoodItems.applejuice, "Apple Juice");
		LanguageRegistry.addName(UsefulFoodItems.carrotjuice, "Carrot Juice");
		LanguageRegistry.addName(UsefulFoodItems.sushi, "Sushi");
		LanguageRegistry.addName(UsefulFoodItems.squidtentacle, "Squid Tentacle");
		LanguageRegistry.addName(UsefulFoodItems.cookedsquidtentacle, "Cooked Squid Tentacle");
		LanguageRegistry.addName(UsefulFoodItems.squidwich, "Squid Sandwich");
		LanguageRegistry.addName(UsefulFoodItems.carrotsoup, "Carrot Soup");
		LanguageRegistry.addName(UsefulFoodItems.pumpkinbread, "Pumpkin Bread");
		LanguageRegistry.addName(UsefulFoodItems.fishnchips, "Fish N' Chips");
		LanguageRegistry.addName(UsefulFoodItems.sugarbiscuit, "Sugar Biscuit");
		LanguageRegistry.addName(UsefulFoodItems.applebiscuit, "Apple Biscuit");
		LanguageRegistry.addName(UsefulFoodItems.chocobiscuit, "Chocolate Biscuit");
		LanguageRegistry.addName(UsefulFoodItems.carrotpie, "Carrot Pie");
		LanguageRegistry.addName(UsefulFoodItems.hotchocolate, "Hot Chocolate Bottle");
		LanguageRegistry.addName(UsefulFoodItems.chocolateicecream, "Chocolate Ice cream");
		
		LanguageRegistry.addName(UsefulFoodItems.blueberry, "Blueberry");
		LanguageRegistry.addName(UsefulFoodItems.strawberry, "Strawberry");
		
		LanguageRegistry.addName(UsefulFoodItems.blueberrySmoothie, "Blueberry Smoothie");
		LanguageRegistry.addName(UsefulFoodItems.strawberrySmoothie, "Strawberry Smoothie");
		
		LanguageRegistry.instance().addStringLocalization("tile.usefulfood.storage.hay.name", "Hay Block");
		LanguageRegistry.instance().addStringLocalization("tile.usefulfood.storage.sugarcane.name", "Reed block");
		
		// 1.3
		LanguageRegistry.instance().addStringLocalization("tile.usefulfood.bush.blueberry.name", "Blueberry Bush");
		LanguageRegistry.instance().addStringLocalization("tile.usefulfood.bush.strawberry.name", "Strawberry Bush");
		
		LanguageRegistry.addName(UsefulFoodItems.Banana, "Banana");
		LanguageRegistry.addName(UsefulFoodItems.Bananapeeled, "Peeled Banana");
		LanguageRegistry.addName(UsefulFoodItems.Orange, "Orange");
		LanguageRegistry.addName(UsefulFoodItems.Peach, "Peach");
		LanguageRegistry.addName(UsefulFoodItems.Pear, "Pear");
		LanguageRegistry.addName(UsefulFoodItems.Cherry, "Cherry");
		LanguageRegistry.addName(UsefulFoodItems.Strawberrycake, "Strawberry Cake");
		LanguageRegistry.addName(UsefulFoodItems.Blueberrycake, "Blueberry Cake");
		LanguageRegistry.addName(UsefulFoodItems.Bananasmoothie, "Banana Smoothie");
		LanguageRegistry.addName(UsefulFoodItems.Orangejuice, "Orange Juice");
		LanguageRegistry.addName(UsefulFoodItems.Cherryjuice, "Cherry Juice");
		LanguageRegistry.addName(UsefulFoodItems.Pearjuice, "Pear Juice");
		LanguageRegistry.addName(UsefulFoodItems.Peachjuice, "Peach Juice");
	}
}
