package silentspy.usefulfood;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class UsefulFoodRecipes {
	
    public static void init()
    {
        AddSmeltingRecipes();
        AddRecipes();
        AddShapelessRecipes();
    }

    public static void AddSmeltingRecipes()
    {
        GameRegistry.addSmelting(UsefulFoodContent.milkbowl.shiftedIndex, new ItemStack(UsefulFoodContent.cheese, 1), 0.3F);
        GameRegistry.addSmelting(UsefulFoodContent.chocolate.shiftedIndex, new ItemStack(UsefulFoodContent.hotchocolate, 1), 0.3F);
        GameRegistry.addSmelting(UsefulFoodContent.sugarcube.shiftedIndex, new ItemStack(UsefulFoodContent.caramel, 1), 0.3F);
        GameRegistry.addSmelting(Item.seeds.shiftedIndex, new ItemStack(UsefulFoodContent.cookedseeds, 1), 0.3F);
        GameRegistry.addSmelting(Item.pumpkinSeeds.shiftedIndex, new ItemStack(UsefulFoodContent.cookedseeds, 1), 0.3F);
        GameRegistry.addSmelting(Item.melonSeeds.shiftedIndex, new ItemStack(UsefulFoodContent.cookedseeds, 1), 0.3F);
        GameRegistry.addSmelting(Item.egg.shiftedIndex, new ItemStack(UsefulFoodContent.friedegg, 1), 0.3F);
        GameRegistry.addSmelting(Item.egg.shiftedIndex, new ItemStack(UsefulFoodContent.friedegg, 1), 0.3F);
        GameRegistry.addSmelting(UsefulFoodContent.marshmallow.shiftedIndex, new ItemStack(UsefulFoodContent.cmarshmallow, 1), 0.3F);
        GameRegistry.addSmelting(UsefulFoodContent.muttonraw.shiftedIndex, new ItemStack(UsefulFoodContent.mutton, 1), 0.3F);
        
        // 1.2
        GameRegistry.addSmelting(UsefulFoodContent.squidtentacle.shiftedIndex, new ItemStack(UsefulFoodContent.cookedsquidtentacle, 1), 0.3F);
        
    }
    
    public static void AddRecipes() 
    {
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.chocolate, 1), new Object[] {"#", "%", '#', new ItemStack(Item.dyePowder, 1, 3), '%', UsefulFoodContent.milkbowl});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.porkwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', Item.porkCooked});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.steakwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', Item.beefCooked});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.fishwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', Item.fishCooked});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.chickenwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', Item.chickenCooked});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.eggwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', UsefulFoodContent.friedegg});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.applecakeitem, 1), new Object[] {"AAA", "BBB", "CCC", 'A', Item.bucketMilk, 'B', Item.appleRed, 'C', Item.wheat});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.chococakeitem, 1), new Object[] {"AAA", "BBB", "CCC", 'A', Item.bucketMilk, 'B', new ItemStack(Item.dyePowder, 1, 3), 'C', Item.wheat});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.magiccakeitem, 1), new Object[] {"AAA", "BDB", "CCC", 'A', Item.bucketMilk, 'B', new ItemStack(Item.appleGold, 1, 1), 'C', Item.wheat, 'D', Item.speckledMelon});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.hayball, 1), new Object[] {"###", "###", "###", '#', Item.wheat});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.muttonwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', UsefulFoodContent.mutton});
        
        // 1.2
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.squidwich, 1), new Object[] {"#", "%", "#", '#', UsefulFoodContent.toast, '%', UsefulFoodContent.cookedsquidtentacle});
        GameRegistry.addRecipe(new ItemStack(UsefulFoodContent.chocobiscuit, 8), new Object[] {"BBB", "BHB", "BBB", 'B', UsefulFoodContent.biscuit, 'H', UsefulFoodContent.hotchocolate});
        
    }
    
    public static void AddShapelessRecipes() 
    {
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.milkbowl, 1), new Object[] {Item.bowlEmpty, Item.bucketMilk});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.superfruitsalad, 1), new Object[] {Item.bowlEmpty, Item.speckledMelon, Item.appleGold});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.sugarcube, 1), new Object[] {Item.sugar, Item.sugar, Item.sugar, Item.sugar, Item.sugar});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.caramelapple, 1), new Object[] {Item.stick, UsefulFoodContent.caramel, Item.appleRed});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.pumpkinsoup, 1), new Object[] {Item.bowlEmpty, Block.pumpkin});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.salad, 1), new Object[] {Block.plantRed, Block.plantYellow, Item.bowlEmpty, Item.seeds});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.fruitsalad, 1), new Object[] {Item.bowlEmpty, Item.melon, Item.appleRed});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.seedsalad, 1), new Object[] {Item.bowlEmpty, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds, Item.seeds});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.jelly, 1), new Object[] {Item.bowlEmpty, Item.slimeBall, Item.sugar});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.marshmallow, 1), new Object[] {Item.stick, Item.bucketWater, Item.sugar, Item.sugar, Item.sugar});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.icecream, 1), new Object[] {Item.bowlEmpty, Item.snowball, Item.sugar});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.toast, 5), new Object[] {Item.bread});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.biscuit, 3), new Object[] {Item.wheat, Item.wheat});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.trailmix, 1), new Object[] {Item.bowlEmpty, Item.pumpkinSeeds, Item.seeds, Item.melonSeeds});
        GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 9), new Object[] {new ItemStack(UsefulFoodContent.hayball, 1)});
        
        // 1.2
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.chocolatecandy, 2), new Object[] {new ItemStack(UsefulFoodContent.hotchocolate, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.chocolateicecream, 1), new Object[] {new ItemStack(UsefulFoodContent.chocolatecandy, 1), new ItemStack(UsefulFoodContent.icecream, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.sushi, 1), new Object[] {new ItemStack(Item.fishRaw, 1), new ItemStack(Item.seeds)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.melonjuice, 1), new Object[] {new ItemStack(Item.melon, 1), new ItemStack(Item.melon, 1), new ItemStack(Item.melon, 1), new ItemStack(Item.glassBottle, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.applejuice, 1), new Object[] {new ItemStack(Item.appleRed, 1), new ItemStack(Item.appleRed, 1), new ItemStack(Item.appleRed, 1), new ItemStack(Item.glassBottle, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.carrotjuice, 1), new Object[] {new ItemStack(Item.field_82797_bK, 1), new ItemStack(Item.field_82797_bK, 1), new ItemStack(Item.field_82797_bK, 1), new ItemStack(Item.glassBottle, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.magicapplejuice, 1), new Object[] {new ItemStack(Item.appleGold, 1, 1), new ItemStack(Item.appleGold, 1, 0), new ItemStack(Item.appleGold, 1, 0), new ItemStack(Item.glassBottle, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.carrotsoup, 1), new Object[] {new ItemStack(Item.field_82797_bK, 1), new ItemStack(Item.field_82797_bK, 1), new ItemStack(Item.bowlEmpty, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.pumpkinbread, 1), new Object[] {new ItemStack(Item.wheat, 1), new ItemStack(Item.wheat, 1), new ItemStack(Block.pumpkin, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.fishnchips, 1), new Object[] {new ItemStack(Item.field_82795_bM, 1), new ItemStack(Item.fishCooked, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.carrotpie, 1), new Object[] {new ItemStack(Item.field_82797_bK, 1), new ItemStack(Item.egg, 1), new ItemStack(Item.sugar, 1), new ItemStack(Item.wheat, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.applebiscuit, 1), new Object[] {new ItemStack(Item.appleRed, 1), new ItemStack(UsefulFoodContent.biscuit, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(UsefulFoodContent.sugarbiscuit, 1), new Object[] {new ItemStack(Item.sugar, 1), new ItemStack(UsefulFoodContent.biscuit, 1)});
    }
}
