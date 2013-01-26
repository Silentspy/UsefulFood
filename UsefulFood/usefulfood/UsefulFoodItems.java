package usefulfood;

import usefulfood.items.ItemBanana;
import usefulfood.items.ItemBottle;
import usefulfood.items.ItemBowl;
import usefulfood.items.ItemCake;
import usefulfood.items.ItemCarrotSoup;
import usefulfood.items.ItemCheese;
import usefulfood.items.ItemFoodDebug;
import usefulfood.items.ItemFoodStick;
import usefulfood.items.ItemJellyBowl;
import usefulfood.items.ItemJuice;
import usefulfood.items.ItemMagicAppleJuice;
import usefulfood.items.ItemMagicCake;
import usefulfood.items.ItemPumpkinsoup;
import usefulfood.items.ItemSuperFruitSalad;
import usefulfood.items.ItemUsefulFood;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;

public class UsefulFoodItems {
	public static Item milkbottle;
	public static Item chocolate;
	public static Item cheese;
	public static Item chocolatecandy;
	public static Item fruitsalad;
	public static Item superfruitsalad;
	public static Item sugarcube;
	public static Item caramel;
	public static Item caramelapple;
	public static Item cookedseeds;
	public static Item friedegg;
	public static Item pumpkinsoup;
	public static Item salad;
	public static Item seedsalad;
	public static Item jelly;
	public static Item marshmallow;
	public static Item cmarshmallow;
	public static Item icecream;
	public static Item toast;
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
 	public static Item blueberry;
 	public static Item strawberry;
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
	public static Item hotchocolate;
	public static Item chocolateicecream;
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
	
	public void init() 
	{
		milkbottle = new ItemBottle(UsefulFoodConfig.milkbottleItemID, 0, 0.0F, true).setIconIndex(11).setItemName("Milk");
		chocolate = new ItemBottle(UsefulFoodConfig.chocolateItemID, 4, 0.3F, true).setIconIndex(13).setItemName("Chocolate");
		cheese = new ItemCheese(UsefulFoodConfig.cheeseItemID, 3, 0.5F, false).setIconIndex(12).setItemName("Cheese");
		chocolatecandy = new ItemUsefulFood(UsefulFoodConfig.chocolatecandyItemID, 3, 1.0F, false).setIconIndex(14).setItemName("Chocolatecandy");
		fruitsalad = new ItemBowl(UsefulFoodConfig.fruitsaladItemID, 7, 0.6F, false).setIconIndex(5).setItemName("Fruitsalad");
		superfruitsalad = new ItemSuperFruitSalad(UsefulFoodConfig.superfruitsaladItemID, 10, 0.6F, false).setPotionEffect(Potion.regeneration.id, 10, 0, 1.0F).setIconIndex(6).setItemName("MagicFruitsalad");
		sugarcube = new ItemUsefulFood(UsefulFoodConfig.sugarcubeItemID, 2, 0.1F,false).setPotionEffect(Potion.moveSpeed.id, 5, 0, 1.0F).setIconIndex(8).setItemName("Sugarcube");
		caramel = new ItemUsefulFood(UsefulFoodConfig.caramelItemID, 4, 0.2F, false).setIconIndex(9).setItemName("Caramel");
		caramelapple = new ItemFoodStick(UsefulFoodConfig.caramelappleItemID, 9, 0.5F, false).setIconIndex(10).setItemName("CaramelApple");
		cookedseeds = new ItemUsefulFood(UsefulFoodConfig.cookedseedsItemID, 1, 0.5F, false).setIconIndex(2).setItemName("RoastedSeeds");
		friedegg = new ItemUsefulFood(UsefulFoodConfig.friedeggItemID, 3, 0.4F, true).setIconIndex(1).setItemName("FriedEgg");
		pumpkinsoup = new ItemPumpkinsoup(UsefulFoodConfig.pumpkinsoupItemID, 5, 0.8F).setIconIndex(0).setItemName("PumpkinSoup");
		salad = new ItemBowl(UsefulFoodConfig.saladItemID, 3, 0.6F, false).setIconIndex(3).setItemName("Salad");
		seedsalad = new ItemBowl(UsefulFoodConfig.seedsaladItemID, 4, 0.6F, false).setIconIndex(4).setItemName("Oatmeal");
		jelly = new ItemJellyBowl(UsefulFoodConfig.jellyItemID, 7, 0.3F, false).setIconIndex(19).setItemName("Jelly");
		marshmallow = new ItemFoodStick(UsefulFoodConfig.marshmallowItemID, 1, 0.3F, false).setIconIndex(16).setItemName("RawMarshmallow");
		cmarshmallow = new ItemFoodStick(UsefulFoodConfig.cmarshmallowItemID, 3, 0.3F, false).setIconIndex(17).setItemName("Marshmallow");
		icecream = new ItemBowl(UsefulFoodConfig.icecreamItemID, 2, 0.3F, false).setIconIndex(15).setItemName("VanillaIcecream");
		toast = new ItemUsefulFood(UsefulFoodConfig.toastItemID, 1, 0.3F, false).setIconIndex(20).setItemName("Breadslice");
		porkwich = new ItemUsefulFood(UsefulFoodConfig.porkwichItemID, 11, 1.0F,true).setIconIndex(22).setItemName("PorkchopSandwich");
		steakwich = new ItemUsefulFood(UsefulFoodConfig.steakwichItemID, 11, 1.0F,true).setIconIndex(21).setItemName("SteakSandwich");
		fishwich = new ItemUsefulFood(UsefulFoodConfig.fishwichItemID, 8, 1.0F,true).setIconIndex(24).setItemName("FishSandwich");
		chickenwich = new ItemUsefulFood(UsefulFoodConfig.chickenwichItemID, 9, 1.0F, true).setIconIndex(23).setItemName("ChickenSandwich");
		eggwich = new ItemUsefulFood(UsefulFoodConfig.eggwichItemID, 6, 1.0F, true).setIconIndex(25).setItemName("EggSandwich");
		biscuit = new ItemUsefulFood(UsefulFoodConfig.biscuitItemID, 1, 0.3F, true).setIconIndex(18).setItemName("Biscuit");
		trailmix = new ItemBowl(UsefulFoodConfig.trailmixItemID, 4, 0.5F,false).setIconIndex(7).setItemName("TrailMix");

		applecake = new ItemCake(UsefulFoodConfig.applecakeItemID, UsefulFoodBlocks.applecake).setIconIndex(26).setMaxStackSize(1).setItemName("AppleCake");
		chococake = new ItemCake(UsefulFoodConfig.chococakeItemID, UsefulFoodBlocks.chococake).setIconIndex(27).setMaxStackSize(1).setItemName("ChocoCake");
		magiccake = new ItemMagicCake(UsefulFoodConfig.magiccakeItemID, UsefulFoodBlocks.magiccake).setIconIndex(28).setMaxStackSize(1).setItemName("MagicCake");

		// 1.0
		mutton = new ItemUsefulFood(UsefulFoodConfig.muttonItemID, 7, 0.8F,true).setIconIndex(30).setItemName("CookedMutton");
		muttonraw = new ItemUsefulFood(UsefulFoodConfig.muttonrawItemID, 3, 0.3F, true).setIconIndex(29).setItemName("RawMutton");
		muttonwich = new ItemUsefulFood(UsefulFoodConfig.muttonwichItemID, 10, 1.0F, true).setIconIndex(31).setItemName("MuttonSandwich");

		// 1.1
		debugfood = new ItemFoodDebug(UsefulFoodConfig.debugfoodItemID).setIconIndex(32).setItemName("DebugFood");
		
		// 1.2
		sushi = new ItemUsefulFood(UsefulFoodConfig.sushiItemID, 3, 0.6F, true).setIconIndex(50).setItemName("Sushi");
		squidtentacle = new ItemUsefulFood(UsefulFoodConfig.squidtentacleItemID, 2, 0.3F, true).setIconIndex(58).setItemName("SquidTentacle");
		cookedsquidtentacle = new ItemUsefulFood(UsefulFoodConfig.cookedsquidtentacleItemID, 4, 0.8F, true).setIconIndex(59).setItemName("CookedSquidTentacle");
		squidwich = new ItemUsefulFood(UsefulFoodConfig.squidwichItemID, 7, 0.8F,true).setIconIndex(60).setItemName("SquidWich");
		magicapplejuice = new ItemMagicAppleJuice(UsefulFoodConfig.magicapplejuiceItemID, 13, 1.2F).setIconIndex(66).setItemName("MagicAppleJuice");
		melonjuice = new ItemJuice(UsefulFoodConfig.melonjuiceItemID, 7, 1.2F).setIconIndex(64).setItemName("MelonJuice");
		applejuice = new ItemJuice(UsefulFoodConfig.applejuiceItemID, 13, 1.2F).setIconIndex(65).setItemName("AppleJuice");
		carrotjuice = new ItemJuice(UsefulFoodConfig.carrotjuiceItemID, 13, 1.2F).setIconIndex(67).setItemName("CarrotJuice");
		carrotsoup = new ItemCarrotSoup(UsefulFoodConfig.carrotsoupItemID, 9, 0.8F).setIconIndex(61).setItemName("CarrotSoup");
		pumpkinbread = new ItemUsefulFood(UsefulFoodConfig.pumpkinbreadItemID, 7, 0.6F, true).setIconIndex(62).setItemName("Bisquit");
		fishnchips = new ItemUsefulFood(UsefulFoodConfig.fishnchipsItemID, 13, 1.2F, true).setIconIndex(63).setItemName("fishnchips");
		sugarbiscuit = new ItemUsefulFood(UsefulFoodConfig.sugarbiscuitItemID, 2, 0.3F, true).setIconIndex(69).setItemName("SugarBiscuit");
		applebiscuit = new ItemUsefulFood(UsefulFoodConfig.applebiscuitItemID, 6, 0.3F, true).setIconIndex(70).setItemName("AppleBiscuit");
		chocobiscuit = new ItemUsefulFood(UsefulFoodConfig.chocobiscuitItemID, 4, 0.3F, true).setIconIndex(71).setItemName("ChocoBiscuit");
		carrotpie = new ItemUsefulFood(UsefulFoodConfig.carrotpieItemID, 8, 0.8F, true).setIconIndex(68).setItemName("CarrotPie");
		hotchocolate = new ItemBottle(UsefulFoodConfig.hotchocolateItemID, 6, 0.3F, true).setIconIndex(72).setItemName("HotChocolate");
		chocolateicecream = new ItemUsefulFood(UsefulFoodConfig.chocolateicecreamItemID, 5, 0.8F, true).setIconIndex(73).setItemName("ChocolateIcecream");
		
		// 1.3
		blueberry = new ItemUsefulFood(UsefulFoodConfig.blueberryItemID, 3, 0.3F, false).setIconIndex(35).setItemName("Blueberry");
		strawberry = new ItemUsefulFood(UsefulFoodConfig.strawberryItemID, 3, 0.3F, false).setIconIndex(39).setItemName("Strawberry");
		blueberrySmoothie = new ItemBottle(UsefulFoodConfig.blueberrySmoothieItemID, 9, 1.2F).setIconIndex(53).setItemName("BlueberrySmoothie");
		strawberrySmoothie = new ItemBottle(UsefulFoodConfig.strawberrySmoothieItemID, 9, 1.2F).setIconIndex(51).setItemName("StrawberrySmoothie");
		Banana = new ItemBanana(UsefulFoodConfig.BananaItemID).setIconIndex(33).setItemName("Banana");
		Bananapeeled = new ItemUsefulFood(UsefulFoodConfig.BananapeeledItemID, 3, 0.3F, false).setIconIndex(34).setItemName("BananaPeeled");
		Orange = new ItemUsefulFood(UsefulFoodConfig.OrangeItemID, 3, 0.3F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F).setIconIndex(36).setItemName("Orange");
		Peach = new ItemUsefulFood(UsefulFoodConfig.PeachItemID, 3, 0.3F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F).setIconIndex(37).setItemName("Peach");
		Pear = new ItemUsefulFood(UsefulFoodConfig.PearItemID, 3, 0.3F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F).setIconIndex(38).setItemName("Pear");
		Cherry = new ItemUsefulFood(UsefulFoodConfig.CherryItemID, 3, 0.3F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 1.0F).setIconIndex(40).setItemName("Cherry");
		Strawberrycake = new ItemCake(UsefulFoodConfig.StrawberrycakeItemID, UsefulFoodBlocks.strawberrycake).setIconIndex(43).setMaxStackSize(1).setItemName("StrawberryCake");
		Blueberrycake = new ItemCake(UsefulFoodConfig.BlueberrycakeItemID, UsefulFoodBlocks.blueberrycake).setIconIndex(44).setMaxStackSize(1).setItemName("BlueberryCake");
		Bananasmoothie = new ItemBottle(UsefulFoodConfig.BananasmoothieItemID, 9, 1.2F).setIconIndex(52).setItemName("BananaSmoothie");
		Orangejuice = new ItemJuice(UsefulFoodConfig.OrangejuiceItemID, 13, 1.2F).setIconIndex(54).setItemName("OrangeJuice");
		Cherryjuice = new ItemJuice(UsefulFoodConfig.CherryjuiceItemID, 7, 1.2F).setIconIndex(55).setItemName("CherryJuice");
		Pearjuice = new ItemJuice(UsefulFoodConfig.PearjuiceItemID, 13, 1.2F).setIconIndex(56).setItemName("PearJuice");
		Peachjuice = new ItemJuice(UsefulFoodConfig.PeachjuiceItemID, 13, 1.2F).setIconIndex(57).setItemName("PeachJuice");
	}
}
