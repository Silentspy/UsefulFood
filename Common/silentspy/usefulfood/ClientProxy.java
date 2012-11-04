package silentspy.usefulfood;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public void addNames () 
    {
        LanguageRegistry.addName(UsefulFoodContent.milkbowl, "Milk");
        LanguageRegistry.addName(UsefulFoodContent.chocolate, "Chocolate");
        LanguageRegistry.addName(UsefulFoodContent.cheese, "Cheese");
        LanguageRegistry.addName(UsefulFoodContent.chocolatecandy, "Chocolate Candy");
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
        LanguageRegistry.addName(UsefulFoodContent.marshmallow, "Marshmallow");
        LanguageRegistry.addName(UsefulFoodContent.cmarshmallow, "Roasted Marshmallow");
        LanguageRegistry.addName(UsefulFoodContent.icecream, "Vanilla Ice cream");
        LanguageRegistry.addName(UsefulFoodContent.toast, "Breadslice");
        LanguageRegistry.addName(UsefulFoodContent.porkwich, "Porkchop Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.steakwich, "Steak Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.fishwich, "Fish Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.chickenwich, "Chicken Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.eggwich, "Egg Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.applecake, "Apple Cake");
        LanguageRegistry.addName(UsefulFoodContent.applecakeitem, "Apple Cake");
        LanguageRegistry.addName(UsefulFoodContent.chococake, "Chocolate Cake");
        LanguageRegistry.addName(UsefulFoodContent.chococakeitem, "Chocolate Cake");
        LanguageRegistry.addName(UsefulFoodContent.biscuit, "Biscuit");
        LanguageRegistry.addName(UsefulFoodContent.trailmix, "Trail Mix");
        LanguageRegistry.addName(UsefulFoodContent.magiccake, "Magic Cake");
        LanguageRegistry.addName(UsefulFoodContent.magiccakeitem, "Magic Cake");
        LanguageRegistry.addName(UsefulFoodContent.hayball, "HayBall");
        LanguageRegistry.addName(UsefulFoodContent.mutton, "Cooked Mutton");
        LanguageRegistry.addName(UsefulFoodContent.muttonraw, "Raw Mutton");
        LanguageRegistry.addName(UsefulFoodContent.muttonwich, "Mutton Sandwich");
        if (UsefulFoodConfig.DebugMode) 
        {
            LanguageRegistry.addName(UsefulFoodContent.debugfood, "Debug Food");
        }
        /*
        LanguageRegistry.addName(UsefulFoodContent.banana, "Banana");
        LanguageRegistry.addName(UsefulFoodContent.bananapeeled, "Peeled Banana");
        LanguageRegistry.addName(UsefulFoodContent.blueberry, "Blueberry");
        LanguageRegistry.addName(UsefulFoodContent.orange, "Orange");
        LanguageRegistry.addName(UsefulFoodContent.peach, "Peach");
        LanguageRegistry.addName(UsefulFoodContent.pear, "Pear");
        LanguageRegistry.addName(UsefulFoodContent.strawberry, "Strawberry");
        LanguageRegistry.addName(UsefulFoodContent.blueberrybush, "Blueberry Bush");
        LanguageRegistry.addName(UsefulFoodContent.strawberrybush, "Strawberry Bush");
        LanguageRegistry.addName(UsefulFoodContent.blueberryseed, "Blueberry Seed");
        LanguageRegistry.addName(UsefulFoodContent.strawberryseed, "Strawberry Seed");
        
        LanguageRegistry.addName(UsefulFoodContent.strawberrysmoothie, "Strawberry Smoothie");
        LanguageRegistry.addName(UsefulFoodContent.bananasmoothie, "Banana Smoothie");
        */
        
        LanguageRegistry.addName(UsefulFoodContent.magicapplejuice, "Magic Apple Juice");
        //LanguageRegistry.addName(UsefulFoodContent.blueberrysmoothie, "Blueberry Smoothie");
        LanguageRegistry.addName(UsefulFoodContent.melonjuice, "Melon Juice");
        //LanguageRegistry.addName(UsefulFoodContent.orangejuice, "Orange Juice");
        LanguageRegistry.addName(UsefulFoodContent.applejuice, "Apple Juice");
        //LanguageRegistry.addName(UsefulFoodContent.cherryjuice, "Cherry Juice");
        //LanguageRegistry.addName(UsefulFoodContent.pearjuice, "Pear Juice");
        //LanguageRegistry.addName(UsefulFoodContent.peachjuice, "Peach Juice");
        LanguageRegistry.addName(UsefulFoodContent.carrotjuice, "Carrot Juice");
        LanguageRegistry.addName(UsefulFoodContent.sushi, "Sushi");
        LanguageRegistry.addName(UsefulFoodContent.squidtentacle, "Squid Tentacle");
        LanguageRegistry.addName(UsefulFoodContent.cookedsquidtentacle, "Cooked Squid Tentacle");
        LanguageRegistry.addName(UsefulFoodContent.squidwich, "Squid Sandwich");
        LanguageRegistry.addName(UsefulFoodContent.carrotsoup, "Carrot Soup");
        LanguageRegistry.addName(UsefulFoodContent.pumpkinbread, "Pumpkin Bread");
        LanguageRegistry.addName(UsefulFoodContent.fishnchips, "Fish N' Chips");
        LanguageRegistry.addName(UsefulFoodContent.sugarbiscuit, "Sugar Biscuit");
        LanguageRegistry.addName(UsefulFoodContent.applebiscuit, "Apple Biscuit");
        LanguageRegistry.addName(UsefulFoodContent.chocobiscuit, "Chocolate Biscuit");
        LanguageRegistry.addName(UsefulFoodContent.carrotpie, "Carrot Pie");
        LanguageRegistry.addName(UsefulFoodContent.hotchocolate, "Hot Chocolate");
        LanguageRegistry.addName(UsefulFoodContent.chocolateicecream, "Chocolate Ice cream");
        
    }
	
    public void registerRenderInformation() 
    {  
        MinecraftForgeClient.preloadTexture(mod_usefulfood.blocktextures);
        MinecraftForgeClient.preloadTexture(mod_usefulfood.itemtextures);
    }
}