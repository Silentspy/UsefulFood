package silentspy.usefulfood;

import java.util.logging.Level;
import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class UsefulFoodConfig 
{
    static int milkbowlID;
    static int cacaobowlID;
    static int cheeseID;
    static int chocolateID;
    static int fruitsaladID;
    static int superfruitsaladID;
    static int sugarcubeID;
    static int caramelID;
    static int caramelappleID;
    static int cookedseedsID;
    static int friedeggID;
    static int pumpkinsoupID;
    static int saladID;
    static int seedsaladID;
    static int jellyID;
    static int marshmallowID;
    static int cmarshmallowID;
    static int icecreamID;
    static int toastID;
    static int porkwichID;
    static int steakwichID;
    static int fishwichID;
    static int chickenwichID;
    static int eggwichID;
    static int applecakeitemID;
    static int shococakeitemID;
    static int biscuitID;
    static int trailmixID;
    static int magiccakeitemID;
    static int muttonitemID;
    static int muttonrawitemID;
    static int muttonwichID;
    static int debugfoodID;
    static int bananaID;
    static int bananapeeledID;
    static int blueberryID;
    static int orangeID;
    static int peachID;
    static int pearID;
    static int strawberryID;
    
    static int ApplecakeBlockID;
    static int ShococakeBlockID;
    static int MagiccakeBlockID;
    static int StrawberrycakeBlockID;
    static int BlueberrycakeBlockID;
    
    static int HayBallBlockID;
    
    static int BlueberryBushBlockID;
    static int StrawberryBushBlockID;
    
    static int BlueberryCropBlockID;
    static int StrawberryCropBlockID;
    
    static int applesaplingID;
    static int bananasaplingID;
    static int cherrysaplingID;
    static int orangesaplingID;
    static int peachsaplingID;
    static int pearsaplingID;
    
    static int blueberryseedID;
    static int strawberryseedID;
    
    static int strawberrysmoothieID;
    static int bananasmoothieID;
    static int magicsmoothieID;
    static int blueberrysmoothieID;
    static int melonjuiceID;
    static int orangejuiceID;
    static int applejuiceID;
    static int cherryjuiceID;
    static int pearjuiceID;
    static int peachjuiceID;
    
    static boolean DebugMode;
    
    public static void Properties(FMLPreInitializationEvent event) 
    {
        FMLLog.fine("[UsefulFood] loading mod_usefulfood "+ event.getModMetadata().version);
        
        File oldconfig = new File(event.getModConfigurationDirectory() + "\\silentspy_usefulfood.cfg").getAbsoluteFile();
      
        if(oldconfig.exists()) 
        {
        	FMLLog.fine("[UsefulFood] Found old config!");
        	File newconfig = new File(event.getModConfigurationDirectory() + "\\UsefulFood.cfg").getAbsoluteFile();
        	if(oldconfig.renameTo(newconfig)) 
        	{
        		FMLLog.fine("[UsefulFood] Successfully renamed silentspy_usefulfood.cfg to UsefulFood.cfg");
        	} 
        	else 
        	{
        		FMLLog.warning("[UsefulFood] Failed to rename silentspy_usefulfood.cfg to UsefulFood.cfg");
        	}
        }
    
        Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
        try {
            
            cfg.load();
            
            // Items
            milkbowlID = cfg.getItem("milkbowl", 5054).getInt(5054);
            cacaobowlID = cfg.getItem("cacaobowl", 5058).getInt(5058);
            cheeseID = cfg.getItem("cheese", 5059).getInt(5059);
            chocolateID = cfg.getItem("chocolate", 5061).getInt(5061);
            fruitsaladID = cfg.getItem("fruitsalad", 5055).getInt(5055);
            superfruitsaladID = cfg.getItem("superfruitsalad", 5050).getInt(5050);
            sugarcubeID = cfg.getItem("sugarcube", 5057).getInt(5057);
            caramelID = cfg.getItem("caramel", 5062).getInt(5062);
            caramelappleID = cfg.getItem("caramelapple", 5063).getInt(5063);
            cookedseedsID = cfg.getItem("cookedseeds", 5056).getInt(5056);
            friedeggID = cfg.getItem("friedegg", 5051).getInt(5051);
            pumpkinsoupID = cfg.getItem("pumpkinsoup", 5052).getInt(5052);
            saladID = cfg.getItem("salad", 5053).getInt(5053);
            seedsaladID = cfg.getItem("seedsalad", 5064).getInt(5064);
            jellyID = cfg.getItem("jelly", 5065).getInt(5065);
            marshmallowID = cfg.getItem("marshmallow", 5066).getInt(5066);
            cmarshmallowID = cfg.getItem("cmarshmallow", 5067).getInt(5067);
            icecreamID = cfg.getItem("icecream", 5068).getInt(5068);
            toastID = cfg.getItem("toast", 5069).getInt(5069);
            porkwichID = cfg.getItem("porkwich", 5070).getInt(5070);
            steakwichID = cfg.getItem("steakwich", 5071).getInt(5071);
            fishwichID = cfg.getItem("fishwich", 5072).getInt(5072);
            chickenwichID = cfg.getItem("chickenwich", 5073).getInt(5073);
            eggwichID = cfg.getItem("eggwich", 5074).getInt(5074);
            applecakeitemID = cfg.getItem("applecake", 5075).getInt(5075);
            shococakeitemID = cfg.getItem("shococake", 5076).getInt(5076);
            biscuitID = cfg.getItem("biscuit", 5077).getInt(5077);
            trailmixID = cfg.getItem("trailmix", 5078).getInt(5078);
            magiccakeitemID = cfg.getItem("magiccake", 5079).getInt(5079);
            muttonitemID = cfg.getItem("mutton", 5080).getInt(5080);
            muttonrawitemID = cfg.getItem("rawmutton", 5081).getInt(5081);
            muttonwichID = cfg.getItem("muttonwich", 5082).getInt(5082);
            debugfoodID = cfg.getItem("debugfood", 5083).getInt(5083);
            bananaID = cfg.getItem("banana", 5084).getInt(5084);
            bananapeeledID = cfg.getItem("bananapeeled", 5085).getInt(5085);
            blueberryID = cfg.getItem("blueberry", 5086).getInt(5086);
            orangeID = cfg.getItem("orange", 5087).getInt(5087);
            peachID = cfg.getItem("peach", 5088).getInt(5088);
            pearID = cfg.getItem("pear", 5089).getInt(5089);
            strawberryID = cfg.getItem("strawberry", 5090).getInt(5090);

            bananasaplingID = cfg.getItem("bananasapling", 5091).getInt(5091);
            orangesaplingID = cfg.getItem("orangesapling", 5092).getInt(5092);
            peachsaplingID = cfg.getItem("peachsapling", 5093).getInt(5093);
            pearsaplingID = cfg.getItem("pearsapling", 5094).getInt(5094);
            
            blueberryseedID = cfg.getItem("blueberryseed", 5095).getInt(5095);
            strawberryseedID = cfg.getItem("strawberryseed", 5096).getInt(5096);
            
            applesaplingID = cfg.getItem("applesapling", 5097).getInt(5097);
            cherrysaplingID = cfg.getItem("cherrysapling", 5098).getInt(5098);
            
			strawberrysmoothieID = cfg.getItem("strawberrysmoothie", 5099).getInt(5099);
			bananasmoothieID = cfg.getItem("bananasmoothie", 5100).getInt(5100);
			magicsmoothieID = cfg.getItem("magicsmoothie", 5101).getInt(5101);
			blueberrysmoothieID = cfg.getItem("blueberrysmoothie", 5102).getInt(5102);
			melonjuiceID = cfg.getItem("melonjuice", 5103).getInt(5103);
			orangejuiceID = cfg.getItem("orangejuice", 5104).getInt(5104);
			applejuiceID = cfg.getItem("applejuice", 5105).getInt(5105);
			cherryjuiceID = cfg.getItem("cherryjuice", 5106).getInt(5106);
			pearjuiceID = cfg.getItem("pearjuice", 5107).getInt(5107);
			peachjuiceID = cfg.getItem("peachjuice", 5108).getInt(5108);
            
            // Blocks
            ApplecakeBlockID = cfg.getBlock("Applecake", 2230).getInt(2230);
            ShococakeBlockID = cfg.getBlock("Shococake", 2231).getInt(2231);
            MagiccakeBlockID = cfg.getBlock("Magiccake", 2232).getInt(2232);

            HayBallBlockID = cfg.getBlock("Hayball", 2233).getInt(2233);
            
            BlueberryBushBlockID = cfg.getBlock("BlueberryBush", 2234).getInt(2234);
            StrawberryBushBlockID = cfg.getBlock("StrawberryBush", 2235).getInt(2235);
            
            BlueberryCropBlockID = cfg.getBlock("BlueBerryCrop", 2236).getInt(2236);
            StrawberryCropBlockID = cfg.getBlock("StrawberryCrop", 2237).getInt(2237);
            
            StrawberrycakeBlockID = cfg.getBlock("Strawberrycake", 2238).getInt(2238);
            BlueberrycakeBlockID = cfg.getBlock("Blueberrycake", 2239).getInt(2239);
            
            // Options
            DebugMode = cfg.get(cfg.CATEGORY_GENERAL, "Debug", false).getBoolean(false);
            
        } 
        catch (Exception e)
        {
            FMLLog.log(Level.SEVERE, e, "UsefulFood has a problem loading it's configuration");
        } 
        finally 
        {
            cfg.save();
        }
    }
}
