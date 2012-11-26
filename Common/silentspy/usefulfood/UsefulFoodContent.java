package silentspy.usefulfood;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.Potion;
import silentspy.usefulfood.blocks.*;
import silentspy.usefulfood.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class UsefulFoodContent {
	public static Item milkbowl;
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
	public static Item applecakeitem;
	public static Item chococakeitem;
	public static Item biscuit;
	public static Item trailmix;
	public static Item magiccakeitem;
	public static Item mutton;
	public static Item muttonraw;
	public static Item muttonwich;
	public static Item debugfood;

	/*
	 * public static Item banana; public static Item bananapeeled; public static
	 * Item blueberry; public static Item orange; public static Item peach;
	 * public static Item pear; public static Item strawberry;
	 */

	/*
	 * public static Item blueberryseed; public static Item strawberryseed;
	 */

	// public static Item strawberrysmoothie;
	// public static Item bananasmoothie;
	public static Item magicapplejuice;
	// public static Item blueberrysmoothie;
	public static Item melonjuice;
	// public static Item orangejuice;
	public static Item applejuice;
	// public static Item cherryjuice;
	// public static Item pearjuice;
	// public static Item peachjuice;
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

	public static Block applecake;
	public static Block chococake;
	public static Block magiccake;
	// public static Block blueberrycake;

	public static Block storage;

	/*
	 * public static Block blueberrybush; public static Block strawberrybush;
	 * 
	 * public static Block blueberrycrop; public static Block strawberrycrop;
	 */

	public void init() {
		setupBlocks();
		setupItems();
	}

	public void setupBlocks() {
		applecake = new BlockAppleCake(UsefulFoodConfig.ApplecakeBlockID).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setBlockName("AppleCake");
		chococake = new BlockChocoCake(UsefulFoodConfig.ChococakeBlockID).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setBlockName("ChocoCake");
		magiccake = new BlockMagicCake(UsefulFoodConfig.MagiccakeBlockID).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setBlockName("MagicCake");
		storage = new BlockStorage(UsefulFoodConfig.StorageBlockID).setHardness(0.8F).setResistance(1.0F).setStepSound(Block.soundClothFootstep).setBlockName("storage");

		/*
		 * blueberrybush = new
		 * BlockBlueberryBush(UsefulFoodConfig.BlueberryBushBlockID
		 * ).setBlockName("Bush"); strawberrybush = new
		 * BlockStrawberryBush(UsefulFoodConfig
		 * .StrawberryBushBlockID).setBlockName("Bush");
		 * 
		 * blueberrycrop = new
		 * BlockBlueberryCrop(UsefulFoodConfig.BlueberryCropBlockID,
		 * 17).setBlockName("BlueberryCrop"); strawberrycrop = new
		 * BlockStrawberryCrop(UsefulFoodConfig.StrawberryCropBlockID,
		 * 20).setBlockName("StrawberryCrop");
		 * 
		 * blueberrycake = new
		 * BlockMagicCake(UsefulFoodConfig.MagiccakeBlockID).
		 * setHardness(0.5F).setStepSound
		 * (Block.soundClothFootstep).setBlockName("MagicCake");
		 */

		// registry
		GameRegistry.registerBlock(applecake);
		GameRegistry.registerBlock(chococake);
		GameRegistry.registerBlock(magiccake);
		GameRegistry.registerBlock(storage, ItemBlockStorage.class);

		/*
		 * GameRegistry.registerBlock(blueberrybush);
		 * GameRegistry.registerBlock(strawberrybush);
		 * 
		 * 
		 * GameRegistry.registerBlock(blueberrycrop);
		 * GameRegistry.registerBlock(strawberrycrop);
		 */
	}

	public void setupItems() 
	{
		milkbowl = new ItemMilkbowl(UsefulFoodConfig.milkbowlID).setIconIndex(11).setItemName("Milk").setContainerItem(Item.bowlEmpty);
		chocolate = new ItemCocaoBowl(UsefulFoodConfig.chocolateID, 4, 0.3F).setIconIndex(13).setItemName("Chocolate");
		cheese = new ItemCheese(UsefulFoodConfig.cheeseID, 3, 0.5F, false).setIconIndex(12).setItemName("Cheese");
		chocolatecandy = new ItemUsefulFood(UsefulFoodConfig.chocolatecandyID, 3, 1.0F, false).setIconIndex(14).setItemName("Chocolatecandy");
		fruitsalad = new ItemFruitBowl(UsefulFoodConfig.fruitsaladID, 7, 0.6F, false).setIconIndex(5).setItemName("Fruitsalad");
		superfruitsalad = new ItemFruitBowl(UsefulFoodConfig.superfruitsaladID,10, 0.6F, false).setPotionEffect(Potion.regeneration.id, 10, 0, 1.0F).setIconIndex(6).setItemName("MagicFruitsalad");
		sugarcube = new ItemUsefulFood(UsefulFoodConfig.sugarcubeID, 2, 0.1F,false).setPotionEffect(Potion.moveSpeed.id, 5, 0, 1.0F).setIconIndex(8).setItemName("Sugarcube");
		caramel = new ItemUsefulFood(UsefulFoodConfig.caramelID, 4, 0.2F, false).setIconIndex(9).setItemName("Caramel");
		caramelapple = new ItemFoodStick(UsefulFoodConfig.caramelappleID, 9, 0.3F, false).setIconIndex(10).setItemName("CaramelApple");
		cookedseeds = new ItemUsefulFood(UsefulFoodConfig.cookedseedsID, 1, 0.1F, false).setIconIndex(2).setItemName("RoastedSeeds");
		friedegg = new ItemUsefulFood(UsefulFoodConfig.friedeggID, 3, 0.4F, true).setIconIndex(1).setItemName("FriedEgg");
		pumpkinsoup = new ItemPumpkinsoup(UsefulFoodConfig.pumpkinsoupID, 5).setIconIndex(0).setItemName("PumpkinSoup");
		salad = new ItemFruitBowl(UsefulFoodConfig.saladID, 3, 0.6F, false).setIconIndex(3).setItemName("Salad");
		seedsalad = new ItemFruitBowl(UsefulFoodConfig.seedsaladID, 4, 0.6F, false).setIconIndex(4).setItemName("Oatmeal");
		jelly = new ItemJellyBowl(UsefulFoodConfig.jellyID, 7, 0.3F, false).setPotionEffect(Potion.jump.id, 10, 0, 1.0F).setIconIndex(19).setItemName("Jelly");
		marshmallow = new ItemFoodStick(UsefulFoodConfig.marshmallowID, 1,0.3F, false).setIconIndex(16).setItemName("RawMarshmallow");
		cmarshmallow = new ItemFoodStick(UsefulFoodConfig.cmarshmallowID, 3,0.3F, false).setIconIndex(17).setItemName("Marshmallow");
		icecream = new ItemBowl(UsefulFoodConfig.icecreamID, 2, 0.3F, false).setIconIndex(15).setItemName("VanillaIcecream");
		toast = new ItemUsefulFood(UsefulFoodConfig.toastID, 1, 0.1F, false).setIconIndex(20).setItemName("Breadslice");
		porkwich = new ItemUsefulFood(UsefulFoodConfig.porkwichID, 11, 1.0F,true).setIconIndex(22).setItemName("PorkchopSandwich");
		steakwich = new ItemUsefulFood(UsefulFoodConfig.steakwichID, 11, 1.0F,true).setIconIndex(21).setItemName("SteakSandwich");
		fishwich = new ItemUsefulFood(UsefulFoodConfig.fishwichID, 8, 1.0F,true).setIconIndex(24).setItemName("FishSandwich");
		chickenwich = new ItemUsefulFood(UsefulFoodConfig.chickenwichID, 9,1.0F, true).setIconIndex(23).setItemName("ChickenSandwich");
		eggwich = new ItemUsefulFood(UsefulFoodConfig.eggwichID, 6, 1.0F, true).setIconIndex(25).setItemName("EggSandwich");
		biscuit = new ItemUsefulFood(UsefulFoodConfig.biscuitID, 1, 0.1F, true).setIconIndex(18).setItemName("Biscuit");
		trailmix = new ItemFruitBowl(UsefulFoodConfig.trailmixID, 4, 0.0F,false).setIconIndex(7).setItemName("TrailMix");

		applecakeitem = new ItemCake(UsefulFoodConfig.applecakeitemID,applecake).setIconIndex(26).setMaxStackSize(1).setItemName("AppleCake");
		chococakeitem = new ItemCake(UsefulFoodConfig.shococakeitemID,chococake).setIconIndex(27).setMaxStackSize(1).setItemName("ChocoCake");
		magiccakeitem = new ItemCake(UsefulFoodConfig.magiccakeitemID,magiccake).setIconIndex(28).setMaxStackSize(1).setItemName("MagicCake");

		// 1.0
		mutton = new ItemUsefulFood(UsefulFoodConfig.muttonitemID, 7, 0.3F,true).setIconIndex(30).setItemName("CookedMutton");
		muttonraw = new ItemUsefulFood(UsefulFoodConfig.muttonrawitemID, 3, 0.8F, true).setIconIndex(29).setItemName("RawMutton");
		muttonwich = new ItemUsefulFood(UsefulFoodConfig.muttonwichID, 10, 1.0F, true).setIconIndex(31).setItemName("MuttonSandwich");

		// 1.1
		if (UsefulFoodConfig.DebugMode) {
			debugfood = new ItemFoodDebug(UsefulFoodConfig.debugfoodID).setIconIndex(32).setItemName("DebugFood");
		}

		// 1.2
		/*
		 * banana = new
		 * ItemBanana(UsefulFoodConfig.bananaID).setIconIndex(33).setItemName
		 * ("Banana"); bananapeeled = new
		 * ItemUsefulFood(UsefulFoodConfig.bananapeeledID, 4, 0.3F,
		 * false).setPotionEffect(Potion.moveSpeed.id, 10, 0,
		 * 0.5F).setIconIndex(34).setItemName("PeeledBanana"); blueberry = new
		 * ItemUsefulFood(UsefulFoodConfig.blueberryID, 4, 0.3F,
		 * false).setIconIndex(35).setItemName("Blueberry"); orange = new
		 * ItemUsefulFood(UsefulFoodConfig.orangeID, 4, 0.3F,
		 * false).setIconIndex(36).setItemName("Orange"); peach = new
		 * ItemUsefulFood(UsefulFoodConfig.peachID, 4, 0.3F,
		 * false).setIconIndex(37).setItemName("Peach"); pear = new
		 * ItemUsefulFood(UsefulFoodConfig.pearID, 4, 0.3F,
		 * false).setIconIndex(38).setItemName("Pear"); strawberry = new
		 * ItemUsefulFood(UsefulFoodConfig.strawberryID, 4, 0.3F,
		 * false).setIconIndex(39).setItemName("Strawberry");
		 */

		// seeds

		/*
		 * blueberryseed = new
		 * ItemUsefulFoodSeed(UsefulFoodConfig.blueberryseedID,
		 * UsefulFoodContent.blueberrycrop.blockID,
		 * Block.tilledField.blockID).setIconIndex
		 * (40).setItemName("BlueberrySeed"); strawberryseed = new
		 * ItemUsefulFoodSeed(UsefulFoodConfig.strawberryseedID,
		 * UsefulFoodContent.strawberrycrop.blockID,
		 * Block.tilledField.blockID).setIconIndex
		 * (41).setItemName("StrawberrySeed");
		 */

		sushi = new ItemUsefulFood(UsefulFoodConfig.sushiID, 3, 0.6F, true).setIconIndex(50).setItemName("Sushi");
		squidtentacle = new ItemUsefulFood(UsefulFoodConfig.squidtentacleID, 2,0.3F, true).setIconIndex(58).setItemName("SquidTentacle");
		cookedsquidtentacle = new ItemUsefulFood(UsefulFoodConfig.cookedsquidtentacleID, 4, 0.8F, true).setIconIndex(59).setItemName("CookedSquidTentacle");
		squidwich = new ItemUsefulFood(UsefulFoodConfig.squidwichID, 7, 0.8F,true).setIconIndex(60).setItemName("SquidWich");

		// smoothies
		// strawberrysmoothie = new
		// ItemSmoothie(UsefulFoodConfig.strawberrysmoothieID, 2,
		// 0).setIconIndex(51).setItemName("StrawberrySmoothie");
		// bananasmoothie = new ItemSmoothie(UsefulFoodConfig.bananasmoothieID,
		// 2, 0).setIconIndex(52).setItemName("BananaSmoothie");
		magicapplejuice = new ItemMagicAppleJuice(UsefulFoodConfig.magicapplejuiceID, 13, 1.2F).setIconIndex(66).setItemName("MagicAppleJuice");
		// blueberrysmoothie = new
		// ItemSmoothie(UsefulFoodConfig.blueberrysmoothieID, 2,
		// 0).setIconIndex(54).setItemName("BlueberrySmoothie");

		melonjuice = new ItemJuice(UsefulFoodConfig.melonjuiceID, 7, 1.2F).setIconIndex(64).setItemName("MelonJuice");
		// orangejuice = new ItemJuice(UsefulFoodConfig.orangejuiceID, 2,
		// 0).setIconIndex(55).setItemName("OrangeJuice");
		applejuice = new ItemJuice(UsefulFoodConfig.applejuiceID, 13, 1.2F).setIconIndex(65).setItemName("AppleJuice");
		// cherryjuice = new ItemJuice(UsefulFoodConfig.cherryjuiceID, 2,
		// 0).setIconIndex(58).setItemName("CherryJuice");
		// pearjuice = new ItemJuice(UsefulFoodConfig.pearjuiceID, 2,
		// 0).setIconIndex(59).setItemName("PearJuice");
		// peachjuice = new ItemJuice(UsefulFoodConfig.peachjuiceID, 2,
		// 0).setIconIndex(60).setItemName("PeachJuice");
		carrotjuice = new ItemJuice(UsefulFoodConfig.carrotjuiceID, 13, 1.2F).setIconIndex(67).setItemName("CarrotJuice");
		carrotsoup = new ItemCarrotSoup(UsefulFoodConfig.carrotsoupID, 9, 0.8F).setIconIndex(61).setItemName("CarrotSoup");
		pumpkinbread = new ItemUsefulFood(UsefulFoodConfig.pumpkinbreadID, 7,0.6F, true).setIconIndex(62).setItemName("Bisquit");
		fishnchips = new ItemUsefulFood(UsefulFoodConfig.fishnchipsID, 13,1.2F, true).setIconIndex(63).setItemName("fishnchips");
		sugarbiscuit = new ItemUsefulFood(UsefulFoodConfig.sugarbiscuitID, 2,0.3F, true).setIconIndex(69).setItemName("SugarBiscuit");
		applebiscuit = new ItemUsefulFood(UsefulFoodConfig.applebiscuitID, 6,0.3F, true).setIconIndex(70).setItemName("AppleBiscuit");
		chocobiscuit = new ItemUsefulFood(UsefulFoodConfig.chocobiscuitID, 4,0.3F, true).setIconIndex(71).setItemName("ChocoBiscuit");
		carrotpie = new ItemUsefulFood(UsefulFoodConfig.carrotpieID, 8, 0.8F,true).setIconIndex(68).setItemName("CarrotPie");
		hotchocolate = new ItemCocaoBowl(UsefulFoodConfig.hotchocolateID, 6,0.3F).setIconIndex(72).setItemName("HotChocolate");
		chocolateicecream = new ItemUsefulFood(UsefulFoodConfig.chocolateicecreamID, 8, 0.8F, true).setIconIndex(73).setItemName("ChocolateIcecream");
	}
}
