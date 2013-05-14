package mods.usefulfood;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class UFConfig {

	// items
	static int milkbottleItemID;
	static int chocolateItemID;
	static int cheeseItemID;
	static int chocolatecandyItemID;
	static int fruitsaladItemID;
	static int magicfruitsaladItemID;
	static int sugarcubeItemID;
	static int caramelItemID;
	static int caramelappleItemID;
	static int cookedseedsItemID;
	static int friedeggItemID;
	static int pumpkinsoupItemID;
	static int saladItemID;
	static int seedsaladItemID;
	static int jellyItemID;
	static int marshmallowItemID;
	static int cmarshmallowItemID;
	static int icecreamItemID;
	static int toastItemID;
	static int porkwichItemID;
	static int steakwichItemID;
	static int fishwichItemID;
	static int chickenwichItemID;
	static int eggwichItemID;
	static int applecakeItemID;
	static int chococakeItemID;
	static int biscuitItemID;
	static int trailmixItemID;
	static int magiccakeItemID;
	static int muttonItemID;
	static int muttonrawItemID;
	static int muttonwichItemID;
	static int debugfoodItemID;
	static int magicapplejuiceItemID;
	static int melonjuiceItemID;
	static int applejuiceItemID;
	static int sushiItemID;
	static int squidtentacleItemID;
	static int cookedsquidtentacleItemID;
	static int squidwichItemID;
	static int carrotsoupItemID;
	static int carrotjuiceItemID;
	static int pumpkinbreadItemID;
	static int fishnchipsItemID;
	static int sugarbiscuitItemID;
	static int applebiscuitItemID;
	static int chocobiscuitItemID;
	static int carrotpieItemID;
	static int hotchocolateItemID;
	static int chocolateicecreamItemID;
	// static int blueberryItemID;
	// static int strawberryItemID;
	// static int blueberrySmoothieItemID;
	// static int strawberrySmoothieItemID;
	// static int BananaItemID;
	// static int BananapeeledItemID;
	// static int OrangeItemID;
	// static int PeachItemID;
	// static int PearItemID;
	// static int CherryItemID;
	// static int StrawberrycakeItemID;
	// static int BlueberrycakeItemID;
	// static int BananacakeItemID;
	// static int OrangecakeItemID;
	// static int PeachcakeItemID;
	// static int PearcakeItemID;
	// static int CherrycakeItemID;
	// static int BananasmoothieItemID;
	// static int OrangejuiceItemID;
	// static int CherryjuiceItemID;
	// static int PearjuiceItemID;
	// static int PeachjuiceItemID;
	static int SquidSushiItemID;
	static int CactusJuiceItemID;
	static int SpaghettiItemID;
	static int AppleIceCreamItemID;
	// static int BananaIceCreamItemID;
	static int MelonIceCreamItemID;
	// static int PearIceCreamItemID;
	// static int OrangeIceCreamItemID;
	// static int CherryIceCreamItemID;
	// static int PeachIceCreamItemID;
	// static int StrawberryIceCreamItemID;
	// static int BlueberryIceCreamItemID;
	static int MagicIceCreamItemID;
	// static int CherryCakeItemID;
	// static int PearCakeItemID;
	// static int PeachCakeItemID;
	// static int BananaCakeItemID;
	// static int FruitPickerItemID;
	static int ChocolateAppleItemID;
	static int CaramelBiscuitItemID;
	static int FishSoupItemID;
	static int TeaItemID;
	static int HotMilkBottleItemID;
	static int CaramelCakeItemID;
	static int CheeseSandwichItemID;
	
	// blocks
	static int ApplecakeBlockID;
	static int ChococakeBlockID;
	static int MagiccakeBlockID;
	// static int StorageBlockID;
	// static int BlueberrycakeBlockID;
	// static int StrawberrycakeBlockID;
	static int CaramelCakeBlockID;
	
	// static boolean EnableStorageBlock = true;

	public static void Properties(FMLPreInitializationEvent event) 
	{
		FMLLog.fine("[UsefulFood] loading mod_usefulfood " + event.getModMetadata().version);

		File oldconfig = new File(event.getModConfigurationDirectory() + "\\silentspy_usefulfood.cfg").getAbsoluteFile();

		if (oldconfig.exists()) {
			FMLLog.fine("[UsefulFood] Found old config!");
			File newconfig = new File(event.getModConfigurationDirectory() + "\\UsefulFood.cfg").getAbsoluteFile();
			if (oldconfig.renameTo(newconfig)) {
				FMLLog.fine("[UsefulFood] Successfully renamed silentspy_usefulfood.cfg to UsefulFood.cfg");
			} else {
				FMLLog.warning("[UsefulFood] Failed to rename silentspy_usefulfood.cfg to UsefulFood.cfg");
			}
		}

		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try {

			cfg.load();

			// Items
			milkbottleItemID = cfg.getItem("milkbowl", 5054).getInt(5054);
			chocolateItemID = cfg.getItem("chocolate", 5058).getInt(5058);
			cheeseItemID = cfg.getItem("cheese", 5059).getInt(5059);
			chocolatecandyItemID = cfg.getItem("chocolatecandy", 5061).getInt(5061);
			fruitsaladItemID = cfg.getItem("fruitsalad", 5055).getInt(5055);
			magicfruitsaladItemID = cfg.getItem("superfruitsalad", 5050).getInt(5050);
			sugarcubeItemID = cfg.getItem("sugarcube", 5057).getInt(5057);
			caramelItemID = cfg.getItem("caramel", 5062).getInt(5062);
			caramelappleItemID = cfg.getItem("caramelapple", 5063).getInt(5063);
			cookedseedsItemID = cfg.getItem("cookedseeds", 5056).getInt(5056);
			friedeggItemID = cfg.getItem("friedegg", 5051).getInt(5051);
			pumpkinsoupItemID = cfg.getItem("pumpkinsoup", 5052).getInt(5052);
			saladItemID = cfg.getItem("salad", 5053).getInt(5053);
			seedsaladItemID = cfg.getItem("seedsalad", 5064).getInt(5064);
			jellyItemID = cfg.getItem("jelly", 5065).getInt(5065);
			marshmallowItemID = cfg.getItem("marshmallow", 5066).getInt(5066);
			cmarshmallowItemID = cfg.getItem("cmarshmallow", 5067).getInt(5067);
			icecreamItemID = cfg.getItem("icecream", 5068).getInt(5068);
			toastItemID = cfg.getItem("toast", 5069).getInt(5069);
			porkwichItemID = cfg.getItem("porkwich", 5070).getInt(5070);
			steakwichItemID = cfg.getItem("steakwich", 5071).getInt(5071);
			fishwichItemID = cfg.getItem("fishwich", 5072).getInt(5072);
			chickenwichItemID = cfg.getItem("chickenwich", 5073).getInt(5073);
			eggwichItemID = cfg.getItem("eggwich", 5074).getInt(5074);
			applecakeItemID = cfg.getItem("applecake", 5075).getInt(5075);
			chococakeItemID = cfg.getItem("chococake", 5076).getInt(5076);
			biscuitItemID = cfg.getItem("biscuit", 5077).getInt(5077);
			trailmixItemID = cfg.getItem("trailmix", 5078).getInt(5078);
			magiccakeItemID = cfg.getItem("magiccake", 5079).getInt(5079);
			muttonItemID = cfg.getItem("mutton", 5080).getInt(5080);
			muttonrawItemID = cfg.getItem("rawmutton", 5081).getInt(5081);
			muttonwichItemID = cfg.getItem("muttonwich", 5082).getInt(5082);
			debugfoodItemID = cfg.getItem("debugfood", 5083).getInt(5083);
			magicapplejuiceItemID = cfg.getItem("magicapplejuice", 5101).getInt(5101);
			melonjuiceItemID = cfg.getItem("melonjuice", 5103).getInt(5103);
			applejuiceItemID = cfg.getItem("applejuice", 5105).getInt(5105);
			sushiItemID = cfg.getItem("sushi", 5116).getInt(5116);
			squidtentacleItemID = cfg.getItem("squidtentacle", 5117).getInt(5117);
			cookedsquidtentacleItemID = cfg.getItem("cookedsquidtentacle", 5118).getInt(5118);
			squidwichItemID = cfg.getItem("squidwich", 5119).getInt(5119);
			carrotsoupItemID = cfg.getItem("carrotsoup", 5120).getInt(5120);
			carrotjuiceItemID = cfg.getItem("carrotjuice", 5121).getInt(5121);
			pumpkinbreadItemID = cfg.getItem("pumpkinbread", 5122).getInt(5122);
			fishnchipsItemID = cfg.getItem("fishnchips", 5123).getInt(5123);
			sugarbiscuitItemID = cfg.getItem("sugarbiscuit", 5124).getInt(5124);
			applebiscuitItemID = cfg.getItem("applebiscuit", 5125).getInt(5125);
			chocobiscuitItemID = cfg.getItem("chocobiscuit", 5126).getInt(5126);
			carrotpieItemID = cfg.getItem("carrotpie", 5127).getInt(5127);
			hotchocolateItemID = cfg.getItem("hotchocolate", 5128).getInt(5128);
			chocolateicecreamItemID = cfg.getItem("chocolateicecream", 5129).getInt(5129);
			// blueberryItemID = cfg.getItem("blueberry", 5130).getInt(5130);
			// strawberryItemID = cfg.getItem("strawberry", 5131).getInt(5131);
			// blueberrySmoothieItemID = cfg.getItem("blueberrysmoothie", 5132).getInt(5132);
			// strawberrySmoothieItemID = cfg.getItem("strawberrysmoothie", 5133).getInt(5133);
			// BananaItemID  = cfg.getItem("banana", 5134).getInt(5134);
			// BananapeeledItemID = cfg.getItem("bananapeeled", 5135).getInt(5135);
			// OrangeItemID = cfg.getItem("orange", 5136).getInt(5136);
			// PeachItemID = cfg.getItem("peach", 5137).getInt(5137);
			// PearItemID = cfg.getItem("pear", 5138).getInt(5138);
			// CherryItemID = cfg.getItem("cherry", 5139).getInt(5139);
			// StrawberrycakeItemID = cfg.getItem("strawberrycake", 5140).getInt(5140);
			// BlueberrycakeItemID = cfg.getItem("blueberrycake", 5141).getInt(5141);
			// BananasmoothieItemID = cfg.getItem("bananasmoothie", 5142).getInt(5142);
			// OrangejuiceItemID = cfg.getItem("orangejuice", 5143).getInt(5143);
			// CherryjuiceItemID = cfg.getItem("cherryjuice", 5144).getInt(5144);
			// PearjuiceItemID = cfg.getItem("pearjuice", 5145).getInt(5145);
			// PeachjuiceItemID = cfg.getItem("peachjuice", 5146).getInt(5146);
			SquidSushiItemID = cfg.getItem("squidsushi", 5147).getInt(5147);
			CactusJuiceItemID = cfg.getItem("cactusjuice", 5148).getInt(5148);
			SpaghettiItemID = cfg.getItem("spaghetti", 5149).getInt(5149);
			AppleIceCreamItemID = cfg.getItem("appleicecream", 5150).getInt(5150);
			// BananaIceCreamItemID = cfg.getItem("bananaicecream", 5151).getInt(5151);
			MelonIceCreamItemID = cfg.getItem("melonicecream", 5152).getInt(5152);
			// PearIceCreamItemID = cfg.getItem("pearicecream", 5153).getInt(5153);
			// OrangeIceCreamItemID = cfg.getItem("orangeicecream", 5154).getInt(5154);
			// CherryIceCreamItemID = cfg.getItem("cherryicecream", 5155).getInt(5155);
			// PeachIceCreamItemID = cfg.getItem("peachicecream", 5156).getInt(5156);
			// StrawberryIceCreamItemID = cfg.getItem("strawberryicecream", 5157).getInt(5157);
			// BlueberryIceCreamItemID = cfg.getItem("blueberryicecream", 5158).getInt(5158);
			MagicIceCreamItemID = cfg.getItem("magicicecream", 5159).getInt(5159);
			// CherryCakeItemID = cfg.getItem("cherrycake", 5160).getInt(5160);
			// PearCakeItemID = cfg.getItem("pearcake", 5161).getInt(5161);
			// PeachCakeItemID = cfg.getItem("peachcake", 5162).getInt(5162);
			// BananaCakeItemID = cfg.getItem("bananacake", 5163).getInt(5163);
			// FruitPickerItemID = cfg.getItem("fruitpicker", 5164).getInt(5164);
			ChocolateAppleItemID = cfg.getItem("chocolateapple", 5165).getInt(5165);
			CaramelBiscuitItemID = cfg.getItem("caramelbiscuit", 5166).getInt(5166);
			FishSoupItemID = cfg.getItem("fishsoup", 5167).getInt(5167);
			TeaItemID = cfg.getItem("tea", 5168).getInt(5168);
			HotMilkBottleItemID = cfg.getItem("hotmilkbottle", 5169).getInt(5169);
			CaramelCakeItemID = cfg.getItem("caramelcake", 5170).getInt(5170);
			CheeseSandwichItemID = cfg.getItem("cheesesandwich", 5171).getInt(5171);
			
			// Blocks
			ApplecakeBlockID = cfg.getBlock("Applecake", 2230).getInt(2230);
			ChococakeBlockID = cfg.getBlock("Chococake", 2231).getInt(2231);
			MagiccakeBlockID = cfg.getBlock("Magiccake", 2232).getInt(2232);
			// StorageBlockID = cfg.getBlock("Hayball", 2233).getInt(2233);
			CaramelCakeBlockID = cfg.getBlock("Caramelcake", 2237).getInt(2237);

			// Options
			// EnableStorageBlock = cfg.get(cfg.CATEGORY_GENERAL, "EnableStorageBlock", true).getBoolean(true);
			
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "UsefulFood has a problem loading it's configuration");
		} finally {
			cfg.save();
		}
	}
}
