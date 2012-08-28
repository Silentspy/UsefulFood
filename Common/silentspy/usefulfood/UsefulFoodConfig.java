package silentspy.usefulfood;

import java.util.logging.Level;

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
    static int bisquitID;
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
    static int HayBallBlockID;
    static int BushBlockID;
    static int LogsBlockID;
    static int BlueberryBushID;
    static int StrawberryBushID;
    
    static int bananasaplingID;
    static int orangesaplingID;
    static int peachsaplingID;
    static int pearsaplingID;
    
    static int blueberryseedID;
    static int strawberryseedID;
    
    static boolean DebugMode;
    
    public static void Properties(FMLPreInitializationEvent event) 
    {
        FMLLog.fine("[UsefulFood] loading mod_usefulfood "+ event.getModMetadata().version);
        Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
        try {
            
            cfg.load();
            
            // Items
            milkbowlID = cfg.getOrCreateIntProperty("milkbowl", cfg.CATEGORY_ITEM, 5054).getInt(5054);
            cacaobowlID = cfg.getOrCreateIntProperty("cacaobowl", cfg.CATEGORY_ITEM, 5058).getInt(5058);
            cheeseID = cfg.getOrCreateIntProperty("cheese", cfg.CATEGORY_ITEM, 5059).getInt(5059);
            chocolateID = cfg.getOrCreateIntProperty("chocolate", cfg.CATEGORY_ITEM, 5061).getInt(5061);
            fruitsaladID = cfg.getOrCreateIntProperty("fruitsalad", cfg.CATEGORY_ITEM, 5055).getInt(5055);
            superfruitsaladID = cfg.getOrCreateIntProperty("superfruitsalad", cfg.CATEGORY_ITEM, 5050).getInt(5050);
            sugarcubeID = cfg.getOrCreateIntProperty("sugarcube", cfg.CATEGORY_ITEM, 5057).getInt(5057);
            caramelID = cfg.getOrCreateIntProperty("caramel", cfg.CATEGORY_ITEM, 5062).getInt(5062);
            caramelappleID = cfg.getOrCreateIntProperty("caramelapple", cfg.CATEGORY_ITEM, 5063).getInt(5063);
            cookedseedsID = cfg.getOrCreateIntProperty("cookedseeds", cfg.CATEGORY_ITEM, 5056).getInt(5056);
            friedeggID = cfg.getOrCreateIntProperty("friedegg", cfg.CATEGORY_ITEM, 5051).getInt(5051);
            pumpkinsoupID = cfg.getOrCreateIntProperty("pumpkinsoup", cfg.CATEGORY_ITEM, 5052).getInt(5052);
            saladID = cfg.getOrCreateIntProperty("salad", cfg.CATEGORY_ITEM, 5053).getInt(5053);
            seedsaladID = cfg.getOrCreateIntProperty("seedsalad", cfg.CATEGORY_ITEM, 5064).getInt(5064);
            jellyID = cfg.getOrCreateIntProperty("jelly", cfg.CATEGORY_ITEM, 5065).getInt(5065);
            marshmallowID = cfg.getOrCreateIntProperty("marshmallow", cfg.CATEGORY_ITEM, 5066).getInt(5066);
            cmarshmallowID = cfg.getOrCreateIntProperty("cmarshmallow", cfg.CATEGORY_ITEM, 5067).getInt(5067);
            icecreamID = cfg.getOrCreateIntProperty("icecream", cfg.CATEGORY_ITEM, 5068).getInt(5068);
            toastID = cfg.getOrCreateIntProperty("toast", cfg.CATEGORY_ITEM, 5069).getInt(5069);
            porkwichID = cfg.getOrCreateIntProperty("porkwich", cfg.CATEGORY_ITEM, 5070).getInt(5070);
            steakwichID = cfg.getOrCreateIntProperty("steakwich", cfg.CATEGORY_ITEM, 5071).getInt(5071);
            fishwichID = cfg.getOrCreateIntProperty("fishwich", cfg.CATEGORY_ITEM, 5072).getInt(5072);
            chickenwichID = cfg.getOrCreateIntProperty("chickenwich", cfg.CATEGORY_ITEM, 5073).getInt(5073);
            eggwichID = cfg.getOrCreateIntProperty("eggwich", cfg.CATEGORY_ITEM, 5074).getInt(5074);
            applecakeitemID = cfg.getOrCreateIntProperty("applecake", cfg.CATEGORY_ITEM, 5075).getInt(5075);
            shococakeitemID = cfg.getOrCreateIntProperty("shococake", cfg.CATEGORY_ITEM, 5076).getInt(5076);
            bisquitID = cfg.getOrCreateIntProperty("bisquit", cfg.CATEGORY_ITEM, 5077).getInt(5077);
            trailmixID = cfg.getOrCreateIntProperty("trailmix", cfg.CATEGORY_ITEM, 5078).getInt(5078);
            magiccakeitemID = cfg.getOrCreateIntProperty("magiccake", cfg.CATEGORY_ITEM, 5079).getInt(5079);
            muttonitemID = cfg.getOrCreateIntProperty("mutton", cfg.CATEGORY_ITEM, 5080).getInt(5080);
            muttonrawitemID = cfg.getOrCreateIntProperty("rawmutton", cfg.CATEGORY_ITEM, 5081).getInt(5081);
            muttonwichID = cfg.getOrCreateIntProperty("muttonwich", cfg.CATEGORY_ITEM, 5082).getInt(5082);
            debugfoodID = cfg.getOrCreateIntProperty("debugfood", cfg.CATEGORY_ITEM, 5083).getInt(5083);
            bananaID = cfg.getOrCreateIntProperty("banana", cfg.CATEGORY_ITEM, 5084).getInt(5084);
            bananapeeledID = cfg.getOrCreateIntProperty("bananapeeled", cfg.CATEGORY_ITEM, 5085).getInt(5085);
            blueberryID = cfg.getOrCreateIntProperty("blueberry", cfg.CATEGORY_ITEM, 5086).getInt(5086);
            orangeID = cfg.getOrCreateIntProperty("orange", cfg.CATEGORY_ITEM, 5087).getInt(5087);
            peachID = cfg.getOrCreateIntProperty("peach", cfg.CATEGORY_ITEM, 5088).getInt(5088);
            pearID = cfg.getOrCreateIntProperty("pear", cfg.CATEGORY_ITEM, 5089).getInt(5089);
            strawberryID = cfg.getOrCreateIntProperty("strawberry", cfg.CATEGORY_ITEM, 5090).getInt(5090);

            bananasaplingID = cfg.getOrCreateIntProperty("bananasapling", cfg.CATEGORY_ITEM, 5091).getInt(5091);
            orangesaplingID = cfg.getOrCreateIntProperty("orangesapling", cfg.CATEGORY_ITEM, 5092).getInt(5092);
            peachsaplingID = cfg.getOrCreateIntProperty("peachsapling", cfg.CATEGORY_ITEM, 5093).getInt(5093);
            pearsaplingID = cfg.getOrCreateIntProperty("pearsapling", cfg.CATEGORY_ITEM, 5094).getInt(5094);
            
            blueberryseedID = cfg.getOrCreateIntProperty("blueberryseed", cfg.CATEGORY_ITEM, 5095).getInt(5095);
            strawberryseedID = cfg.getOrCreateIntProperty("strawberryseed", cfg.CATEGORY_ITEM, 5096).getInt(5096);
            
            // Blocks
            ApplecakeBlockID = cfg.getOrCreateIntProperty("Applecake", cfg.CATEGORY_BLOCK, 184).getInt(184);
            ShococakeBlockID = cfg.getOrCreateIntProperty("Shococake", cfg.CATEGORY_BLOCK, 185).getInt(185);
            MagiccakeBlockID = cfg.getOrCreateIntProperty("Magiccake", cfg.CATEGORY_BLOCK, 186).getInt(186);
            HayBallBlockID = cfg.getOrCreateIntProperty("Hayball", cfg.CATEGORY_BLOCK, 187).getInt(187);
            BushBlockID = cfg.getOrCreateIntProperty("Bush", cfg.CATEGORY_BLOCK, 188).getInt(188);
            LogsBlockID = cfg.getOrCreateIntProperty("Logs", cfg.CATEGORY_BLOCK, 189).getInt(189);
            
            BlueberryBushID = cfg.getOrCreateIntProperty("BlueBerryBush", cfg.CATEGORY_BLOCK, 190).getInt(190);
            StrawberryBushID = cfg.getOrCreateIntProperty("StrawberryBush", cfg.CATEGORY_BLOCK, 191).getInt(191);
            
            // Options
            DebugMode = cfg.getOrCreateBooleanProperty("Debug", cfg.CATEGORY_GENERAL, false).getBoolean(false);
            
        } catch (Exception e) {
            FMLLog.log(Level.SEVERE, e, "UsefulFood has a problem loading it's configuration");
        } finally {
            cfg.save();
        }
    }

}
