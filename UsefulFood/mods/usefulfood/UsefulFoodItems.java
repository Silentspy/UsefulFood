package mods.usefulfood;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import mods.usefulfood.items.*;

public class UsefulFoodItems 
{
	public static Item milkbottle;
	public static Item chocolatebottle;
	public static Item cheese;
	public static Item chocolatecandy;
	public static Item fruitsalad;
	public static Item magicfruitsalad;
	public static Item sugarcube;
	public static Item caramel;
	public static Item caramelapple;
	public static Item RoastedSeeds;
	public static Item friedegg;
	public static Item pumpkinsoup;
	public static Item salad;
	public static Item seedsalad;
	public static Item jelly;
	public static Item marshmallow;
	public static Item cmarshmallow;
	public static Item icecream;
	public static Item breadslice;
	public static Item porkwich;
	public static Item steakwich;
	public static Item fishwich;
	public static Item chickenwich;
	public static Item eggwich;
	public static Item applecake;
	public static Item chococake;
	public static Item biscuit;
	public static Item trailmix;
	public static Item magiccake;
	public static Item mutton;
	public static Item muttonraw;
	public static Item muttonwich;
	public static Item debugfood; 
 	// public static Item blueberry;
 	// public static Item strawberry;
	public static Item magicapplejuice;
	public static Item melonjuice;
	public static Item applejuice;
	public static Item sushi;
	public static Item squidtentacle;
	public static Item cookedsquidtentacle;
	public static Item squidwich;
	public static Item carrotsoup;
	public static Item carrotjuice;
	public static Item pumpkinbread;
	public static Item fishnchips;
	public static Item sugarbiscuit;
	public static Item applebiscuit;
	public static Item chocobiscuit;
	public static Item carrotpie;
	public static Item hotchocolatebottle;
	public static Item chocolateicecream;
	/*
	public static Item blueberrySmoothie;
	public static Item strawberrySmoothie;
	public static Item Banana;
	public static Item Bananapeeled;
	public static Item Orange;
	public static Item Peach;
	public static Item Pear;
	public static Item Cherry;
	public static Item Strawberrycake;
	public static Item Blueberrycake;
	public static Item Bananasmoothie;
	public static Item Orangejuice;
	public static Item Cherryjuice;
	public static Item Pearjuice;
	public static Item Peachjuice;
	*/
	public static Item SquidSushi;
	public static Item CactusJuice;
	public static Item Spaghetti;
	public static Item AppleIceCream;
	// public static Item BananaIceCream;
	public static Item MelonIceCream;
	// public static Item PearIceCream;
	// public static Item OrangeIceCream;
	// public static Item CherryIceCream;
	// public static Item PeachIceCream;
	// public static Item StrawberryIceCream;
	// public static Item BlueberryIceCream;
	public static Item MagicIceCream;
	// public static Item CherryCake;
	// public static Item PearCake;
	// public static Item PeachCake;
	// public static Item BananaCake;
	// public static Item FruitPicker;
	public static Item ChocolateApple;
	public static Item CaramelBiscuit;
	public static Item FishSoup;
	public static Item Tea;
	public static Item HotMilkBottle;
	public static Item CaramelCake;
	public static Item CheeseSandwich;
	
	
	public void init() 
	{
		milkbottle = new ItemBottle(UsefulFoodConfig.milkbottleItemID, "MilkBottle", 0, 0.0F, true).setContainerItem(Item.glassBottle);
		chocolatebottle = new ItemBottle(UsefulFoodConfig.chocolateItemID, "ChocolateMilkBottle", 3, 0.3F, true);
		cheese = new ItemCheese(UsefulFoodConfig.cheeseItemID, "Cheese", 3, 0.5F, false);
		chocolatecandy = new ItemFoodUF(UsefulFoodConfig.chocolatecandyItemID, "ChocolateBar", 8, 1.0F, false);
		fruitsalad = new ItemBowl(UsefulFoodConfig.fruitsaladItemID, "FruitSalad", 7, 0.6F, false);
		magicfruitsalad = new ItemMagicFruitSalad(UsefulFoodConfig.magicfruitsaladItemID, "MagicFruitSalad", 6, 0.6F, false).setPotionEffect(Potion.regeneration.id, 4, 0, 1.0F).setPotionEffect(Potion.resistance.id, 4, 0, 1.0F);
		sugarcube = new ItemFoodUF(UsefulFoodConfig.sugarcubeItemID, "SugarCube", 2, 0.1F,false).setPotionEffect(Potion.moveSpeed.id, 5, 0, 1.0F);
		caramel = new ItemFoodUF(UsefulFoodConfig.caramelItemID, "Caramel", 4, 0.2F, false);
		caramelapple = new ItemFoodStick(UsefulFoodConfig.caramelappleItemID, "CaramelApple", 9, 0.5F, false);
		RoastedSeeds = new ItemFoodUF(UsefulFoodConfig.cookedseedsItemID, "RoastedSeeds", 1, 0.5F, false);
		friedegg = new ItemFoodUF(UsefulFoodConfig.friedeggItemID, "FriedEgg", 3, 0.4F, true);
		pumpkinsoup = new ItemSoupUF(UsefulFoodConfig.pumpkinsoupItemID, "PumpkinSoup", 5, 0.8F);
		salad = new ItemBowl(UsefulFoodConfig.saladItemID, "Salad", 3, 0.6F, false);
		seedsalad = new ItemBowl(UsefulFoodConfig.seedsaladItemID, "Oatmeal", 4, 0.6F, false);
		jelly = new ItemJellyBowl(UsefulFoodConfig.jellyItemID, "Jelly", 7, 0.3F, false);
		marshmallow = new ItemFoodStick(UsefulFoodConfig.marshmallowItemID, "RawMarshmallow", 1, 0.3F, false);
		cmarshmallow = new ItemFoodStick(UsefulFoodConfig.cmarshmallowItemID, "CookedMarshmallow", 3, 0.3F, false);
		icecream = new ItemBowl(UsefulFoodConfig.icecreamItemID, "VanillaIceCream", 2, 0.3F, false);
		breadslice = new ItemFoodUF(UsefulFoodConfig.toastItemID, "Breadslice", 1, 0.3F, false);
		porkwich = new ItemFoodUF(UsefulFoodConfig.porkwichItemID, "PorkChopSandwich", 11, 1.0F, true);
		steakwich = new ItemFoodUF(UsefulFoodConfig.steakwichItemID, "SteakSandwich", 11, 1.0F, true);
		fishwich = new ItemFoodUF(UsefulFoodConfig.fishwichItemID, "FishSandwich", 8, 1.0F, true);
		chickenwich = new ItemFoodUF(UsefulFoodConfig.chickenwichItemID, "ChickenSandwich", 9, 1.0F, true);
		eggwich = new ItemFoodUF(UsefulFoodConfig.eggwichItemID, "EggSandwich", 6, 1.0F, true);
		biscuit = new ItemFoodUF(UsefulFoodConfig.biscuitItemID, "Biscuit", 1, 0.3F, true);
		trailmix = new ItemBowl(UsefulFoodConfig.trailmixItemID, "Trailmix", 4, 0.5F, false);

		applecake = new ItemReedUF(UsefulFoodConfig.applecakeItemID, UsefulFoodBlocks.applecake, "AppleCake").setMaxStackSize(1);
		chococake = new ItemReedUF(UsefulFoodConfig.chococakeItemID, UsefulFoodBlocks.chococake, "ChocolateCake").setMaxStackSize(1);
		magiccake = new ItemMagicCake(UsefulFoodConfig.magiccakeItemID, UsefulFoodBlocks.magiccake, "MagicCake").setMaxStackSize(1);

		// 1.0
		mutton = new ItemFoodUF(UsefulFoodConfig.muttonItemID, "CookedMutton", 7, 0.8F, true);
		muttonraw = new ItemFoodUF(UsefulFoodConfig.muttonrawItemID, "RawMutton", 3, 0.3F, true);
		muttonwich = new ItemFoodUF(UsefulFoodConfig.muttonwichItemID, "MuttonSandwich", 10, 1.0F, true);

		// 1.1
		debugfood = new ItemFoodDebug(UsefulFoodConfig.debugfoodItemID, "Hungrz");
		
		// 1.2
		sushi = new ItemFoodUF(UsefulFoodConfig.sushiItemID, "Sushi", 4, 0.6F, true);
		squidtentacle = new ItemFoodUF(UsefulFoodConfig.squidtentacleItemID, "SquidTentacle", 2, 0.3F, true);
		cookedsquidtentacle = new ItemFoodUF(UsefulFoodConfig.cookedsquidtentacleItemID, "CookedSquidTentacle", 4, 0.8F, true);
		squidwich = new ItemFoodUF(UsefulFoodConfig.squidwichItemID, "SquidSandwich", 7, 0.8F,true);
		magicapplejuice = new ItemMagicAppleJuice(UsefulFoodConfig.magicapplejuiceItemID, "MagicAppleJuice", 13, 1.2F);
		melonjuice = new ItemJuice(UsefulFoodConfig.melonjuiceItemID, "MelonJuice", 7, 1.2F);
		applejuice = new ItemJuice(UsefulFoodConfig.applejuiceItemID, "AppleJuice", 13, 1.2F);
		carrotjuice = new ItemJuice(UsefulFoodConfig.carrotjuiceItemID, "CarrotJuice", 13, 1.2F);
		carrotsoup = new ItemSoupUF(UsefulFoodConfig.carrotsoupItemID, "CarrotSoup", 9, 0.8F);
		pumpkinbread = new ItemFoodUF(UsefulFoodConfig.pumpkinbreadItemID, "PumpkinBread", 7, 0.6F, true);
		fishnchips = new ItemFoodUF(UsefulFoodConfig.fishnchipsItemID, "FishnChips", 13, 1.2F, true);
		sugarbiscuit = new ItemFoodUF(UsefulFoodConfig.sugarbiscuitItemID, "SugarBiscuit", 2, 0.3F, true);
		applebiscuit = new ItemFoodUF(UsefulFoodConfig.applebiscuitItemID, "AppleBiscuit", 6, 0.3F, true);
		chocobiscuit = new ItemFoodUF(UsefulFoodConfig.chocobiscuitItemID, "ChocolateBiscuit", 4, 0.3F, true);
		carrotpie = new ItemFoodUF(UsefulFoodConfig.carrotpieItemID, "CarrotPie", 8, 0.8F, true);
		hotchocolatebottle = new ItemBottle(UsefulFoodConfig.hotchocolateItemID, "HotChocolateMilkBottle", 5, 0.3F, true).setContainerItem(Item.glassBottle);
		chocolateicecream = new ItemBowl(UsefulFoodConfig.chocolateicecreamItemID, "ChocolateIceCream", 10, 0.8F, true);
		
		// 1.3
		// blueberry = new ItemFoodUF(UsefulFoodConfig.blueberryItemID, 3, 0.3F, false).setUnlocalizedName("Blueberry");
		// strawberry = new ItemFoodUF(UsefulFoodConfig.strawberryItemID, 3, 0.3F, false).setUnlocalizedName("Strawberry");
		// blueberrySmoothie = new ItemBottle(UsefulFoodConfig.blueberrySmoothieItemID, 9, 1.2F).setUnlocalizedName("BlueberrySmoothie");
		// strawberrySmoothie = new ItemBottle(UsefulFoodConfig.strawberrySmoothieItemID, 9, 1.2F).setUnlocalizedName("StrawberrySmoothie");
		// Banana = new ItemBanana(UsefulFoodConfig.BananaItemID).setUnlocalizedName("Banana");
		// Bananapeeled = new ItemFoodUF(UsefulFoodConfig.BananapeeledItemID, 3, 0.3F, false).setUnlocalizedName("BananaPeeled");
		// Orange = new ItemFoodUF(UsefulFoodConfig.OrangeItemID, 3, 0.3F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F).setUnlocalizedName("Orange");
		// Peach = new ItemFoodUF(UsefulFoodConfig.PeachItemID, 3, 0.3F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F).setUnlocalizedName("Peach");
		// Pear = new ItemFoodUF(UsefulFoodConfig.PearItemID, 3, 0.3F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F).setUnlocalizedName("Pear");
		// Cherry = new ItemFoodUF(UsefulFoodConfig.CherryItemID, 3, 0.3F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F).setUnlocalizedName("Cherry");
		// Bananasmoothie = new ItemBottle(UsefulFoodConfig.BananasmoothieItemID, 9, 1.2F).setUnlocalizedName("BananaSmoothie");
		// Orangejuice = new ItemJuice(UsefulFoodConfig.OrangejuiceItemID, 13, 1.2F).setUnlocalizedName("OrangeJuice");
		// Cherryjuice = new ItemJuice(UsefulFoodConfig.CherryjuiceItemID, 7, 1.2F).setUnlocalizedName("CherryJuice");
		// Pearjuice = new ItemJuice(UsefulFoodConfig.PearjuiceItemID, 13, 1.2F).setUnlocalizedName("PearJuice");
		// Peachjuice = new ItemJuice(UsefulFoodConfig.PeachjuiceItemID, 13, 1.2F).setUnlocalizedName("PeachJuice");
		
		// 1.4
		MagicIceCream = new ItemMagicIceCream(UsefulFoodConfig.MagicIceCreamItemID, "MagicIceCream", 9, 0.6F, true).setPotionEffect(Potion.regeneration.id, 5, 0, 1.0F).setPotionEffect(Potion.resistance.id, 5, 0, 1.0F);
		SquidSushi = new ItemFoodUF(UsefulFoodConfig.SquidSushiItemID, "SquidSushi", 4, 0.6F, true);
		CactusJuice = new ItemJuice(UsefulFoodConfig.CactusJuiceItemID, "CactusJuice", 6, 0.6F); 
		Spaghetti = new ItemBowl(UsefulFoodConfig.SpaghettiItemID, "Spaghetti", 4, 0.6F, true);
		AppleIceCream = new ItemBowl(UsefulFoodConfig.AppleIceCreamItemID, "AppleIceCream", 7, 0.6F, true);
		MelonIceCream = new ItemBowl(UsefulFoodConfig.MelonIceCreamItemID, "MelonIceCream", 6, 0.6F, true);
		// FruitPicker = new ItemFruitPicker(UsefulFoodConfig.FruitPickerItemID, EnumToolMaterial.WOOD).setUnlocalizedName("FruitPicker");
		ChocolateApple = new ItemFoodStick(UsefulFoodConfig.ChocolateAppleItemID, "ChocolateApple", 10, 0.6F, true);
		CaramelBiscuit = new ItemFoodUF(UsefulFoodConfig.CaramelBiscuitItemID, "CaramelBiscuit", 6, 0.6F, true);
		FishSoup = new ItemSoupUF(UsefulFoodConfig.FishSoupItemID, "FishSoup", 12, 0.6F);
		Tea = new ItemTea(UsefulFoodConfig.TeaItemID, "Tea", 2);
		HotMilkBottle = new ItemBottle(UsefulFoodConfig.HotMilkBottleItemID, "HotMilkBottle", 0, 0.0F, true).setContainerItem(Item.glassBottle);
		CaramelCake = new ItemReedUF(UsefulFoodConfig.CaramelCakeItemID, UsefulFoodBlocks.CaramelCake, "CaramelCake").setMaxStackSize(1);
		CheeseSandwich = new ItemFoodUF(UsefulFoodConfig.CheeseSandwichItemID, "CheeseSandwich", 6, 1.0F, true);
	}
}
