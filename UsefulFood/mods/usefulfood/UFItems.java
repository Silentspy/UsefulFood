package mods.usefulfood;

import mods.usefulfood.items.ItemBottle;
import mods.usefulfood.items.ItemBowl;
import mods.usefulfood.items.ItemCheese;
import mods.usefulfood.items.ItemFoodDebug;
import mods.usefulfood.items.ItemFoodStick;
import mods.usefulfood.items.ItemFoodUF;
import mods.usefulfood.items.ItemJuice;
import mods.usefulfood.items.ItemMagicAppleJuice;
import mods.usefulfood.items.ItemMagicCake;
import mods.usefulfood.items.ItemMagicFruitSalad;
import mods.usefulfood.items.ItemMagicIceCream;
import mods.usefulfood.items.ItemReedUF;
import mods.usefulfood.items.ItemSoupUF;
import mods.usefulfood.items.ItemTea;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;

public class UFItems 
{
	public static Item applebiscuit;
	public static Item AppleCake;
	public static Item AppleIceCream;
	public static Item applejuice;
	public static Item biscuit;
	public static Item breadslice;
	public static Item CactusJuice;
	public static Item caramel;
	public static Item caramelapple;
	public static Item CaramelBiscuit;
	public static Item CaramelCake;
	public static Item CaramelIceCream;
	public static Item carrotjuice;
	public static Item carrotpie;
	public static Item carrotsoup;
	public static Item Cheese;
	public static Item CheeseSandwich;
	public static Item chickenwich;
	public static Item chocobiscuit;
	public static Item ChocolateApple;
	public static Item chocolatebottle;
	public static Item ChocolateCake;
	public static Item chocolatecandy;
	public static Item chocolateicecream;
	public static Item cmarshmallow;
	public static Item debugfood;
	public static Item eggwich;
	public static Item fishnchips;
	public static Item FishSoup;
	public static Item fishwich;
	public static Item friedegg;
	public static Item fruitsalad;
	public static Item hotchocolatebottle;
	public static Item HotMilkBottle;
	public static Item icecream;
	public static Item jelly;
	public static Item magicapplejuice;
	public static Item MagicCake;
	public static Item magicfruitsalad;
	public static Item MagicIceCream;
	public static Item marshmallow;
	public static Item MelonIceCream;
	public static Item melonjuice;
	public static Item milkbottle;
	public static Item MuttonCooked;
	public static Item MuttonRaw;
	public static Item MuttonSandwich;
	public static Item porkwich;
	public static Item pumpkinbread;
	public static Item pumpkinsoup;
	public static Item RoastedSeeds;
	public static Item salad;
	public static Item Oatmeal;
	public static Item Spaghetti;
	public static Item SquidSandwich;
	public static Item SquidSushi;
	public static Item SquidTentacleCooked;
	public static Item SquidTentacleRaw;
	public static Item steakwich;
	public static Item sugarbiscuit;
	public static Item sugarcube;
	public static Item sushi;
	public static Item Tea;
	public static Item trailmix;
	
	
	public void init() 
	{
		milkbottle = new ItemBottle(UFConfig.milkbottleItemID, "MilkBottle", 0, 0.0F, true).setContainerItem(Item.glassBottle);
		chocolatebottle = new ItemBottle(UFConfig.chocolateItemID, "ChocolateMilkBottle", 3, 0.8F, true);
		Cheese = new ItemCheese(UFConfig.cheeseItemID, "Cheese", 3, 0.6F, true);
		chocolatecandy = new ItemFoodUF(UFConfig.chocolatecandyItemID, "ChocolateBar", 6, 1.0F, false);
		fruitsalad = new ItemBowl(UFConfig.fruitsaladItemID, "FruitSalad", 7, 0.6F, false);
		magicfruitsalad = new ItemMagicFruitSalad(UFConfig.magicfruitsaladItemID, "MagicFruitSalad", 6, 0.6F, false).setPotionEffect(Potion.regeneration.id, 5, 0, 1.0F).setPotionEffect(Potion.resistance.id, 10, 0, 1.0F);
		sugarcube = new ItemFoodUF(UFConfig.sugarcubeItemID, "SugarCube", 2, 0.1F,false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F);
		caramel = new ItemFoodUF(UFConfig.caramelItemID, "Caramel", 3, 0.2F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F);
		caramelapple = new ItemFoodStick(UFConfig.caramelappleItemID, "CaramelApple", 8, 0.5F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F);
		RoastedSeeds = new ItemFoodUF(UFConfig.cookedseedsItemID, "RoastedSeeds", 1, 0.5F, false);
		friedegg = new ItemFoodUF(UFConfig.friedeggItemID, "FriedEgg", 3, 0.4F, true);
		pumpkinsoup = new ItemSoupUF(UFConfig.pumpkinsoupItemID, "PumpkinSoup", 5, 0.8F);
		salad = new ItemBowl(UFConfig.saladItemID, "Salad", 3, 0.6F, false);
		Oatmeal = new ItemBowl(UFConfig.seedsaladItemID, "Oatmeal", 4, 0.6F, false);
		jelly = new ItemBowl(UFConfig.jellyItemID, "Jelly", 5, 0.3F, false).setPotionEffect(Potion.jump.id, 30, 0, 1.0F);
		marshmallow = new ItemFoodStick(UFConfig.marshmallowItemID, "RawMarshmallow", 3, 0.3F, false);
		cmarshmallow = new ItemFoodStick(UFConfig.cmarshmallowItemID, "CookedMarshmallow", 4, 0.3F, false);
		icecream = new ItemBowl(UFConfig.icecreamItemID, "VanillaIceCream", 2, 0.3F, false);
		breadslice = new ItemFoodUF(UFConfig.toastItemID, "Breadslice", 1, 0.3F, false);
		porkwich = new ItemFoodUF(UFConfig.porkwichItemID, "PorkChopSandwich", 11, 1.0F, true);
		steakwich = new ItemFoodUF(UFConfig.steakwichItemID, "SteakSandwich", 11, 1.0F, true);
		fishwich = new ItemFoodUF(UFConfig.fishwichItemID, "FishSandwich", 8, 1.0F, true);
		chickenwich = new ItemFoodUF(UFConfig.chickenwichItemID, "ChickenSandwich", 9, 1.0F, true);
		eggwich = new ItemFoodUF(UFConfig.eggwichItemID, "EggSandwich", 6, 1.0F, true);
		biscuit = new ItemFoodUF(UFConfig.biscuitItemID, "Biscuit", 1, 0.3F, true);
		trailmix = new ItemBowl(UFConfig.trailmixItemID, "Trailmix", 4, 0.5F, false);

		AppleCake = new ItemReedUF(UFConfig.applecakeItemID, UFBlocks.AppleCake, "AppleCake").setMaxStackSize(1);
		ChocolateCake = new ItemReedUF(UFConfig.chococakeItemID, UFBlocks.ChocolateCake, "ChocolateCake").setMaxStackSize(1);
		MagicCake = new ItemMagicCake(UFConfig.magiccakeItemID, UFBlocks.MagicCake, "MagicCake").setMaxStackSize(1);

		// 1.0
		MuttonCooked = new ItemFoodUF(UFConfig.muttonItemID, "CookedMutton", 6, 0.8F, true);
		MuttonRaw = new ItemFoodUF(UFConfig.muttonrawItemID, "RawMutton", 3, 0.3F, true);
		MuttonSandwich = new ItemFoodUF(UFConfig.muttonwichItemID, "MuttonSandwich", 9, 1.0F, true);

		// 1.1
		debugfood = new ItemFoodDebug(UFConfig.debugfoodItemID, "Hungrz");
		
		// 1.2
		sushi = new ItemFoodUF(UFConfig.sushiItemID, "Sushi", 5, 0.3F, true);
		SquidTentacleRaw = new ItemFoodUF(UFConfig.squidtentacleItemID, "SquidTentacle", 2, 0.3F, true);
		SquidTentacleCooked = new ItemFoodUF(UFConfig.cookedsquidtentacleItemID, "CookedSquidTentacle", 5, 0.8F, true);
		SquidSandwich = new ItemFoodUF(UFConfig.squidwichItemID, "SquidSandwich", 8, 0.8F, true);
		magicapplejuice = new ItemMagicAppleJuice(UFConfig.magicapplejuiceItemID, "MagicAppleJuice", 13, 1.2F);
		melonjuice = new ItemJuice(UFConfig.melonjuiceItemID, "MelonJuice", 6, 0.9F);
		applejuice = new ItemJuice(UFConfig.applejuiceItemID, "AppleJuice", 12, 0.9F);
		carrotjuice = new ItemJuice(UFConfig.carrotjuiceItemID, "CarrotJuice", 12, 0.9F);
		carrotsoup = new ItemSoupUF(UFConfig.carrotsoupItemID, "CarrotSoup", 9, 0.8F);
		pumpkinbread = new ItemFoodUF(UFConfig.pumpkinbreadItemID, "PumpkinBread", 10, 0.6F, true);
		fishnchips = new ItemFoodUF(UFConfig.fishnchipsItemID, "FishnChips", 13, 1.2F, true);
		sugarbiscuit = new ItemFoodUF(UFConfig.sugarbiscuitItemID, "SugarBiscuit", 3, 0.3F, true);
		applebiscuit = new ItemFoodUF(UFConfig.applebiscuitItemID, "AppleBiscuit", 6, 0.3F, true);
		chocobiscuit = new ItemFoodUF(UFConfig.chocobiscuitItemID, "ChocolateBiscuit", 9, 0.3F, true);
		carrotpie = new ItemFoodUF(UFConfig.carrotpieItemID, "CarrotPie", 9, 0.8F, true);
		hotchocolatebottle = new ItemBottle(UFConfig.hotchocolateItemID, "HotChocolateMilkBottle", 4, 1.0F, true).setContainerItem(Item.glassBottle);
		chocolateicecream = new ItemBowl(UFConfig.chocolateicecreamItemID, "ChocolateIceCream", 9, 0.8F, true);
		
		// 1.4
		MagicIceCream = new ItemMagicIceCream(UFConfig.MagicIceCreamItemID, "MagicIceCream", 9, 0.6F, true).setPotionEffect(Potion.regeneration.id, 5, 0, 1.0F).setPotionEffect(Potion.resistance.id, 10, 0, 1.0F);
		SquidSushi = new ItemFoodUF(UFConfig.SquidSushiItemID, "SquidSushi", 5, 0.3F, true);
		CactusJuice = new ItemJuice(UFConfig.CactusJuiceItemID, "CactusJuice", 5, 0.6F); 
		Spaghetti = new ItemBowl(UFConfig.SpaghettiItemID, "Spaghetti", 5, 0.6F, true);
		AppleIceCream = new ItemBowl(UFConfig.AppleIceCreamItemID, "AppleIceCream", 5, 0.6F, false);
		MelonIceCream = new ItemBowl(UFConfig.MelonIceCreamItemID, "MelonIceCream", 7, 0.6F, false);
		ChocolateApple = new ItemFoodStick(UFConfig.ChocolateAppleItemID, "ChocolateApple", 11, 0.6F, false);
		CaramelBiscuit = new ItemFoodUF(UFConfig.CaramelBiscuitItemID, "CaramelBiscuit", 8, 0.6F, false);
		FishSoup = new ItemSoupUF(UFConfig.FishSoupItemID, "FishSoup", 12, 0.6F);
		Tea = new ItemTea(UFConfig.TeaItemID, "Tea", 2);
		HotMilkBottle = new ItemBottle(UFConfig.HotMilkBottleItemID, "HotMilkBottle", 1, 0.3F, true).setContainerItem(Item.glassBottle);
		CaramelCake = new ItemReedUF(UFConfig.CaramelCakeItemID, UFBlocks.CaramelCake, "CaramelCake").setMaxStackSize(1);
		CheeseSandwich = new ItemFoodUF(UFConfig.CheeseSandwichItemID, "CheeseSandwich", 5, 1.0F, false);
		CaramelIceCream = new ItemBowl(UFConfig.CaramelIceCreamItemID, "CaramelIceCream", 6, 0.6F, false);
		}
}
