package silentspy.usefulfood;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public void addNames () 
    {
        LanguageRegistry.addName(UsefulFoodContent.milkbowl, "Milk");
        LanguageRegistry.addName(UsefulFoodContent.cacaobowl, "Cocoa");
        LanguageRegistry.addName(UsefulFoodContent.cheese, "Cheese");
        LanguageRegistry.addName(UsefulFoodContent.chocolate, "Chocolatecandy");
        LanguageRegistry.addName(UsefulFoodContent.fruitsalad, "Fruitsalad");
        LanguageRegistry.addName(UsefulFoodContent.superfruitsalad, "Magic Fruitsalad");
        LanguageRegistry.addName(UsefulFoodContent.sugarcube, "Sugarcube");
        LanguageRegistry.addName(UsefulFoodContent.caramel, "Caramel");
        LanguageRegistry.addName(UsefulFoodContent.caramelapple, "Caramel Apple");
        LanguageRegistry.addName(UsefulFoodContent.cookedseeds, "Roasted Seeds");
        LanguageRegistry.addName(UsefulFoodContent.friedegg, "Fried Egg");
        LanguageRegistry.addName(UsefulFoodContent.pumpkinsoup, "Pumpkin Soup");
        LanguageRegistry.addName(UsefulFoodContent.salad, "Salad");
        LanguageRegistry.addName(UsefulFoodContent.seedsalad, "Oatmeal");
        LanguageRegistry.addName(UsefulFoodContent.jelly, "Jelly");
        LanguageRegistry.addName(UsefulFoodContent.marshmallow, "Raw Marshmallow");
        LanguageRegistry.addName(UsefulFoodContent.cmarshmallow, "Marshmallow");
        LanguageRegistry.addName(UsefulFoodContent.icecream, "Icecream");
        LanguageRegistry.addName(UsefulFoodContent.toast, "Breadslice");
        LanguageRegistry.addName(UsefulFoodContent.porkwich, "Porkchop Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.steakwich, "Steak Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.fishwich, "Fish Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.chickenwich, "Chicken Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.eggwich, "Egg Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.Applecake, "Apple Cake");
        LanguageRegistry.addName(UsefulFoodContent.applecakeitem, "Apple Cake");
        LanguageRegistry.addName(UsefulFoodContent.Shococake, "Chocolate Cake");
        LanguageRegistry.addName(UsefulFoodContent.shococakeitem, "Chocolate Cake");
        LanguageRegistry.addName(UsefulFoodContent.bisquit, "Bisquit");
        LanguageRegistry.addName(UsefulFoodContent.trailmix, "Trail Mix");
        LanguageRegistry.addName(UsefulFoodContent.Magiccake, "Magic Cake");
        LanguageRegistry.addName(UsefulFoodContent.magiccakeitem, "Magic Cake");
        LanguageRegistry.addName(UsefulFoodContent.Hayball, "HayBall");
        LanguageRegistry.addName(UsefulFoodContent.mutton, "Cooked Mutton");
        LanguageRegistry.addName(UsefulFoodContent.muttonraw, "Raw Mutton");
        LanguageRegistry.addName(UsefulFoodContent.muttonwich, "Mutton Sandwich");
        if (UsefulFoodConfig.DebugMode) 
        {
            LanguageRegistry.addName(UsefulFoodContent.debugfood, "Debug Food");
        }
        LanguageRegistry.addName(UsefulFoodContent.banana, "Banana");
        LanguageRegistry.addName(UsefulFoodContent.bananapeeled, "Peeled Banana");
        LanguageRegistry.addName(UsefulFoodContent.blueberry, "Blueberry");
        LanguageRegistry.addName(UsefulFoodContent.orange, "Orange");
        LanguageRegistry.addName(UsefulFoodContent.peach, "Peach");
        LanguageRegistry.addName(UsefulFoodContent.pear, "Pear");
        LanguageRegistry.addName(UsefulFoodContent.strawberry, "Strawberry");
        
    }
	
    public void registerRenderInformation() 
    {  
        MinecraftForgeClient.preloadTexture(mod_usefulfood.blocktextures);
        MinecraftForgeClient.preloadTexture(mod_usefulfood.itemtextures);
    }
}