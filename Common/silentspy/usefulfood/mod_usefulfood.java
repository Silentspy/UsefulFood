package silentspy.usefulfood;

import java.io.File;
import java.util.*;
import java.util.logging.Level;

import net.minecraft.src.*;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "silentspy_usefulfood", name = "UsefulFood", version = "1.1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_usefulfood
{
	@SidedProxy(clientSide = "silentspy.usefulfood.ClientProxy", serverSide = "silentspy.usefulfood.CommonProxy")
	public static CommonProxy proxy;
	
	public static final String itemtextures = "/silentspy/usefulfood/sprites/items.png";
	public static final String blocktextures = "/silentspy/usefulfood/sprites/blocks.png";
	
    private static UsefulFoodContent contentInstance;
	public static UsefulFoodContent getContentInstance()
	{
		return contentInstance;
	}
    
    @PreInit
	public void preInit(FMLPreInitializationEvent event) 
    {
    	UsefulFoodConfig.Properties(event);
    	contentInstance = new UsefulFoodContent();
		contentInstance.init();
	}
    	
    @Init
    public void load(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new CustomLoot());
    	FMLLog.fine("[UsefulFood] loading mod_usefulfood recipes");
    	proxy.registerRenderInformation();
        AddSmeltingRecipes();
        AddRecipes();
        AddShapelessRecipes();
        FMLLog.fine("[UsefulFood] mod_usefulfood recipes initialized");
        AddNames();
    }
    
    public void AddSmeltingRecipes()
    {
    	GameRegistry.addSmelting(UsefulFoodContent.milkbowl.shiftedIndex, new ItemStack(UsefulFoodContent.cheese, 1), 0.3F);
    	GameRegistry.addSmelting(UsefulFoodContent.cacaobowl.shiftedIndex, new ItemStack(UsefulFoodContent.chocolate, 1), 0.3F);
    	GameRegistry.addSmelting(UsefulFoodContent.sugarcube.shiftedIndex, new ItemStack(UsefulFoodContent.caramel, 1), 0.3F);
    	GameRegistry.addSmelting(Item.seeds.shiftedIndex, new ItemStack(UsefulFoodContent.cookedseeds, 1), 0.3F);
    	GameRegistry.addSmelting(Item.pumpkinSeeds.shiftedIndex, new ItemStack(UsefulFoodContent.cookedseeds, 1), 0.3F);
    	GameRegistry.addSmelting(Item.melonSeeds.shiftedIndex, new ItemStack(UsefulFoodContent.cookedseeds, 1), 0.3F);
    	GameRegistry.addSmelting(Item.egg.shiftedIndex, new ItemStack(UsefulFoodContent.friedegg, 1), 0.3F);
    	GameRegistry.addSmelting(Item.egg.shiftedIndex, new ItemStack(UsefulFoodContent.friedegg, 1), 0.3F);
    	GameRegistry.addSmelting(UsefulFoodContent.marshmallow.shiftedIndex, new ItemStack(UsefulFoodContent.cmarshmallow, 1), 0.3F);
    	GameRegistry.addSmelting(UsefulFoodContent.muttonraw.shiftedIndex, new ItemStack(UsefulFoodContent.mutton, 1), 0.3F);
    }
    
    public void AddRecipes() 
    {
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.cacaobowl, 1), new Object[] {"#", "%", '#', new ItemStack(Item.dyePowder, 1, 3), '%', UsefulFoodContent.milkbowl});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.fruitsalad, 1), new Object[] {Item.bowlEmpty, Item.melon, Item.appleRed});
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.porkwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', Item.porkCooked});
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.steakwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', Item.beefCooked});
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.fishwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', Item.fishCooked});
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.chickenwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', Item.chickenCooked});
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.eggwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', UsefulFoodContent.friedegg});
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.applecakeitem, 1), new Object[] {"AAA", "BBB", "CCC", 'A', Item.bucketMilk, 'B', Item.appleRed, 'C', Item.wheat});
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.shococakeitem, 1), new Object[] {"AAA", "BBB", "CCC", 'A', Item.bucketMilk, 'B', new ItemStack(Item.dyePowder, 1, 3), 'C', Item.wheat});
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.magiccakeitem, 1), new Object[] {"AAA", "BDB", "CCC", 'A', Item.bucketMilk, 'B', new ItemStack(Item.appleGold, 1, 1), 'C', Item.wheat, 'D', Item.speckledMelon});
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.Hayball, 1), new Object[] {"###", "###", "###", '#', Item.wheat});
    	GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.muttonwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', UsefulFoodContent.mutton});
    }
    
    public void AddShapelessRecipes() 
    {
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.milkbowl, 1), new Object[] {Item.bowlEmpty, Item.bucketMilk});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.superfruitsalad, 1), new Object[] {Item.bowlEmpty, Item.speckledMelon, Item.appleGold});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.sugarcube, 1), new Object[] {Item.sugar, Item.sugar, Item.sugar, Item.sugar, Item.sugar});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.caramelapple, 1), new Object[] {Item.stick, UsefulFoodContent.caramel, Item.appleRed});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.pumpkinsoup, 1), new Object[] {Item.bowlEmpty, Block.pumpkin});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.salad, 1), new Object[] {Block.plantRed, Block.plantYellow, Item.bowlEmpty, Item.seeds});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.seedsalad, 1), new Object[] {Item.bowlEmpty, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.jelly, 1), new Object[] {Item.bowlEmpty, Item.slimeBall, Item.sugar});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.marshmallow, 1), new Object[] {Item.stick, Item.bucketWater, Item.sugar, Item.sugar, Item.sugar});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.icecream, 1), new Object[] {Item.bowlEmpty, Item.snowball, Item.sugar});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.toast, 5), new Object[] {Item.bread});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.bisquit, 3), new Object[] {Item.wheat, Item.wheat});
    	GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.trailmix, 1), new Object[] {Item.bowlEmpty, Item.pumpkinSeeds, Item.seeds, Item.melonSeeds});
    	GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 9), new Object[] {UsefulFoodContent.Hayball});
    }
    
    public void AddNames() 
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
}
