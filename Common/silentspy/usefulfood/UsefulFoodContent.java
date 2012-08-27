package silentspy.usefulfood;

import silentspy.usefulfood.blocks.*;
import silentspy.usefulfood.items.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.Potion;

public class UsefulFoodContent 
{
    public static Item milkbowl;
    public static Item cacaobowl;
    public static Item cheese;
    public static Item chocolate;
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
    public static Item shococakeitem;
    public static Item bisquit;
    public static Item trailmix;
    public static Item magiccakeitem;
    public static Item mutton;
    public static Item muttonraw;
    public static Item muttonwich;
    public static Item debugfood;
    public static Item banana;
    public static Item bananapeeled;
    public static Item blueberry;
    public static Item orange;
    public static Item peach;
    public static Item pear;
    public static Item strawberry;
    
    public static Block Applecake;
    public static Block Shococake;
    public static Block Magiccake;
    public static Block Hayball;
    public static Block Plants;
    public static Block Logs;
    
    public void init()
    {
        setupBlocks();
        setupItems();
    }
    
    public void setupBlocks()
    {
        Applecake = new BlockAppleCake(UsefulFoodConfig.ApplecakeBlockID).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setBlockName("AppleCake");
        Shococake = new BlockShocoCake(UsefulFoodConfig.ShococakeBlockID).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setBlockName("ShocoCake");
        Magiccake = new BlockMagicCake(UsefulFoodConfig.MagiccakeBlockID).setHardness(0.5F).setStepSound(Block.soundClothFootstep).setBlockName("MagicCake");
        Hayball = new BlockHayball(UsefulFoodConfig.HayBallBlockID).setHardness(0.8F).setStepSound(Block.soundClothFootstep).setBlockName("HayBall");
        
        //registry
        GameRegistry.registerBlock(Applecake);
        GameRegistry.registerBlock(Shococake);
        GameRegistry.registerBlock(Magiccake);
        GameRegistry.registerBlock(Hayball);
        
    }
    
    public void setupItems()
    {
        milkbowl = new ItemMilkbowl(UsefulFoodConfig.milkbowlID, 0, 0.0F, false).setPotionEffect(Potion.moveSpeed.id, 5, 0, 1.0F).setIconIndex(11).setItemName("Milk");
        cacaobowl = new ItemBowl(UsefulFoodConfig.cacaobowlID, 7, 0.0F, false).setIconIndex(13).setItemName("Cocoa");
        cheese = new ItemCheese(UsefulFoodConfig.cheeseID, 3, 0.5F, false).setIconIndex(12).setItemName("Cheese");
        chocolate = new ItemUsefulFood(UsefulFoodConfig.chocolateID, 9, 1.0F, false).setIconIndex(14).setItemName("Chocolatecandy");
        fruitsalad = new ItemFruitBowl(UsefulFoodConfig.fruitsaladID, 7, 0.0F, false).setIconIndex(5).setItemName("Fruitsalad");
        superfruitsalad = new ItemFruitBowl(UsefulFoodConfig.superfruitsaladID, 10, 0.0F, false).setPotionEffect(Potion.regeneration.id, 10, 0, 1.0F).setIconIndex(6).setItemName("MagicFruitsalad");
        sugarcube = new ItemUsefulFood(UsefulFoodConfig.sugarcubeID, 2, 0.1F, false).setPotionEffect(Potion.moveSpeed.id, 5, 0, 1.0F).setIconIndex(8).setItemName("Sugarcube");
        caramel = new ItemUsefulFood(UsefulFoodConfig.caramelID, 4, 0.2F, false).setIconIndex(9).setItemName("Caramel");
        caramelapple = new ItemFoodStick(UsefulFoodConfig.caramelappleID, 9, 0.0F, false).setIconIndex(10).setItemName("CaramelApple");
        cookedseeds = new ItemUsefulFood(UsefulFoodConfig.cookedseedsID, 1, 0.1F, false).setIconIndex(2).setItemName("RoastedSeeds");
        friedegg = new ItemUsefulFood(UsefulFoodConfig.friedeggID, 3, 0.4F, true).setIconIndex(1).setItemName("FriedEgg");
        pumpkinsoup = new ItemPumpkinsoup(UsefulFoodConfig.pumpkinsoupID, 5).setIconIndex(0).setItemName("PumpkinSoup");
        salad = new ItemFruitBowl(UsefulFoodConfig.saladID, 3, 0.0F, false).setIconIndex(3).setItemName("Salad");
        seedsalad = new ItemFruitBowl(UsefulFoodConfig.seedsaladID, 4, 0.0F, false).setIconIndex(4).setItemName("Oatmeal");
        jelly = new ItemBowl(UsefulFoodConfig.jellyID, 7, 0.0F, false).setPotionEffect(Potion.jump.id, 10, 0, 1.0F).setIconIndex(19).setItemName("Jelly");
        marshmallow = new ItemFoodStick(UsefulFoodConfig.marshmallowID, 1, 0.0F, false).setIconIndex(16).setItemName("RawMarshmallow");
        cmarshmallow = new ItemFoodStick(UsefulFoodConfig.cmarshmallowID, 3, 0.0F, false).setIconIndex(17).setItemName("Marshmallow");
        icecream = new ItemBowl(UsefulFoodConfig.icecreamID, 2, 0.0F, false).setIconIndex(15).setItemName("Icecream");
        toast = new ItemUsefulFood(UsefulFoodConfig.toastID, 1, 0.1F, false).setIconIndex(20).setItemName("Breadslice");
        porkwich = new ItemUsefulFood(UsefulFoodConfig.porkwichID, 11, 1.0F, true).setIconIndex(22).setItemName("PorkchopSandwich");
        steakwich = new ItemUsefulFood(UsefulFoodConfig.steakwichID, 11, 1.0F, true).setIconIndex(21).setItemName("SteakSandwich");
        fishwich = new ItemUsefulFood(UsefulFoodConfig.fishwichID, 8, 1.0F, true).setIconIndex(24).setItemName("FishSandwich");
        chickenwich = new ItemUsefulFood(UsefulFoodConfig.chickenwichID, 9, 1.0F, true).setIconIndex(23).setItemName("ChickenSandwich");
        eggwich = new ItemUsefulFood(UsefulFoodConfig.eggwichID, 6, 1.0F, true).setIconIndex(25).setItemName("EggSandwich");
        bisquit = new ItemUsefulFood(UsefulFoodConfig.bisquitID, 1, 0.1F, true).setIconIndex(18).setItemName("Bisquit");
        trailmix = new ItemFruitBowl(UsefulFoodConfig.trailmixID, 4, 0.0F, false).setIconIndex(7).setItemName("TrailMix");

        applecakeitem = new ItemCake(UsefulFoodConfig.applecakeitemID, Applecake).setIconIndex(26).setMaxStackSize(1).setItemName("AppleCake");
        shococakeitem = new ItemCake(UsefulFoodConfig.shococakeitemID, Shococake).setIconIndex(27).setMaxStackSize(1).setItemName("ShocoCake");
        magiccakeitem = new ItemCake(UsefulFoodConfig.magiccakeitemID, Magiccake).setIconIndex(28).setMaxStackSize(1).setItemName("MagicCake");

        // 1.0
        mutton = new ItemUsefulFood(UsefulFoodConfig.muttonitemID, 7, 0.3F, true).setIconIndex(30).setItemName("CookedMutton");
        muttonraw = new ItemUsefulFood(UsefulFoodConfig.muttonrawitemID, 3, 0.8F, true).setIconIndex(29).setItemName("RawMutton");
        muttonwich = new ItemUsefulFood(UsefulFoodConfig.muttonwichID, 10, 1.0F, true).setIconIndex(31).setItemName("MuttonSandwich");

        // 1.1
        if (UsefulFoodConfig.DebugMode) 
        {
            debugfood = new ItemFoodDebug(UsefulFoodConfig.debugfoodID).setIconIndex(32).setItemName("DebugFood");
        }
        
        banana = new ItemBanana(UsefulFoodConfig.bananaID).setIconIndex(33).setItemName("Banana");
        bananapeeled = new ItemUsefulFood(UsefulFoodConfig.bananapeeledID, 4, 0.3F, false).setPotionEffect(Potion.moveSpeed.id, 10, 0, 0.5F).setIconIndex(34).setItemName("PeeledBanana");
        blueberry = new ItemUsefulFood(UsefulFoodConfig.blueberryID, 4, 0.3F, false).setIconIndex(35).setItemName("Blueberry");
        orange = new ItemUsefulFood(UsefulFoodConfig.orangeID, 4, 0.3F, false).setIconIndex(36).setItemName("Orange");
        peach = new ItemUsefulFood(UsefulFoodConfig.peachID, 4, 0.3F, false).setIconIndex(37).setItemName("Peach");
        pear = new ItemUsefulFood(UsefulFoodConfig.pearID, 4, 0.3F, false).setIconIndex(38).setItemName("Pear");
        strawberry = new ItemUsefulFood(UsefulFoodConfig.strawberryID, 4, 0.3F, false).setIconIndex(39).setItemName("Strawberry");
    }

}
