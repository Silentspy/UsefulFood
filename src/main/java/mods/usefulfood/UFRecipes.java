package mods.usefulfood;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.mrcrayfish.furniture.api.FurnitureRegister;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class UFRecipes  {

    public UFRecipes() {
        AddSmeltingRecipes();
        AddRecipes();
        AddShapelessRecipes();
    }

    private void AddRecipes() {
        GameRegistry.addRecipe(new ItemStack(UFItems.porkwich), "#", "%", "#", '#', UFItems.breadslice, '%', Items.cooked_porkchop);
        GameRegistry.addRecipe(new ItemStack(UFItems.steakwich), "#", "%", "#", '#', UFItems.breadslice, '%', Items.cooked_beef);
        GameRegistry.addRecipe(new ItemStack(UFItems.fishwich), "#", "%", "#", '#', UFItems.breadslice, '%', Items.cooked_fish);
        GameRegistry.addRecipe(new ItemStack(UFItems.chickenwich), "#", "%", "#", '#', UFItems.breadslice, '%', Items.cooked_chicken);
        GameRegistry.addRecipe(new ItemStack(UFItems.eggwich), "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.friedegg);
        GameRegistry.addRecipe(new ItemStack(UFItems.AppleCake), "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', Items.apple, 'C', Items.wheat, 'E', Items.egg);
        GameRegistry.addRecipe(new ItemStack(UFItems.ChocolateCake), "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', new ItemStack(Items.dye, 1, 3), 'C', Items.wheat, 'E', Items.egg);
        GameRegistry.addRecipe(new ItemStack(UFItems.MagicCake), "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', new ItemStack(Items.golden_apple, 1, 1), 'C', Items.wheat, 'E', Items.egg);
        GameRegistry.addRecipe(new ItemStack(UFItems.MuttonSandwich), "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.MuttonCooked);

        // 1.2
        GameRegistry.addRecipe(new ItemStack(UFItems.SquidSandwich), "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.SquidTentacleCooked);

        // 1.4
        GameRegistry.addRecipe(new ItemStack(UFItems.CaramelCake), "AAA", "BEB", "CCC", 'A', UFItems.milkbottle, 'B', UFItems.caramel, 'C', Items.wheat, 'E', Items.egg);
        GameRegistry.addRecipe(new ItemStack(UFItems.CaramelCake), "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', UFItems.caramel, 'C', Items.wheat, 'E', Items.egg);
        GameRegistry.addRecipe(new ItemStack(UFItems.AppleCake), "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.apple, 'C', Items.wheat, 'E', Items.egg);
        GameRegistry.addRecipe(new ItemStack(UFItems.ChocolateCake), "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', new ItemStack(Items.dye, 1, 3), 'C', Items.wheat, 'E', Items.egg);
        GameRegistry.addRecipe(new ItemStack(UFItems.MagicCake), "AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', new ItemStack(Items.golden_apple, 1, 1), 'C', Items.wheat, 'E', Items.egg);
        GameRegistry.addRecipe(new ItemStack(UFItems.CheeseSandwich), "#", "%", "#", '#', UFItems.breadslice, '%', UFItems.Cheese);
    }

    private void AddShapelessRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.milkbottle, 2), Items.glass_bottle, Items.glass_bottle, Items.milk_bucket);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.magicfruitsalad), Items.bowl, Items.speckled_melon, Items.golden_apple);

        if(UsefulFood.MoCreatures) {
            GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarcube), Items.sugar, Items.sugar, Items.sugar, Items.sugar, Items.sugar);
        } else {
            GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarcube), Items.sugar, Items.sugar, Items.sugar, Items.sugar);
        }


        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.caramelapple), Items.stick, UFItems.caramel, Items.apple);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.pumpkinsoup), Items.bowl, Blocks.pumpkin);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.salad), Blocks.red_flower, Blocks.yellow_flower, Items.bowl, Items.wheat_seeds);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.fruitsalad), Items.bowl, Items.melon, Items.apple);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Oatmeal), Items.bowl, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds, Items.wheat_seeds);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.jelly), Items.bowl, Items.slime_ball,Items.sugar);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.marshmallow), Items.stick, Items.water_bucket, Items.sugar, Items.sugar, Items.sugar);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.icecream), Items.bowl,Items.snowball, Items.sugar, UFItems.milkbottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.breadslice, 5), Items.bread);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.biscuit, 3), Items.wheat, Items.wheat);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.trailmix), Items.bowl, Items.pumpkin_seeds, Items.wheat_seeds, Items.melon_seeds);

        // 1.2
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatecandy), new ItemStack(Items.dye, 1, 3), Items.sugar, UFItems.milkbottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolateicecream), UFItems.chocolatecandy, UFItems.icecream);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sushi), Items.fish, Blocks.waterlily);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.melonjuice), Items.melon, Items.melon, Items.melon, Items.glass_bottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.applejuice), Items.apple, Items.apple, Items.apple, Items.glass_bottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotjuice), Items.carrot, Items.carrot, Items.carrot, Items.glass_bottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.magicapplejuice), new ItemStack(Items.golden_apple, 1, 1), new ItemStack(Items.golden_apple, 1, 0), new ItemStack(Items.golden_apple, 1, 0), Items.glass_bottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotsoup), Items.carrot, Items.carrot, Items.bowl);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.pumpkinbread), Items.wheat, Items.wheat, Blocks.pumpkin);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.fishnchips), UFItems.FrenchFries, Items.cooked_fish);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.carrotpie), Items.carrot, Items.egg, Items.sugar, Items.wheat);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamBiscuit), UFItems.AppleJam, UFItems.biscuit);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.sugarbiscuit), Items.sugar, UFItems.biscuit);

        // 1.4
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.SquidSushi), UFItems.SquidTentacleRaw, Blocks.waterlily);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CactusJuice), Items.glass_bottle, Blocks.cactus, Blocks.cactus, Blocks.cactus);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Spaghetti), Items.wheat, Items.water_bucket, Items.egg, Items.bowl);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleIceCream), UFItems.icecream, Items.apple);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MagicIceCream), new ItemStack(Items.golden_apple, 1, 0), Items.speckled_melon, Items.speckled_melon, UFItems.icecream);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolateApple), Items.stick, Items.apple, UFItems.hotchocolatebottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelBiscuit), UFItems.biscuit, UFItems.caramel);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.FishSoup), Items.bowl, Items.cooked_fish, Items.carrot, Items.potato, Items.water_bucket);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Tea), Items.glass_bottle, Blocks.waterlily);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatecandy), new ItemStack(Items.dye, 1, 3), Items.sugar, Items.milk_bucket);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Cheese), UFItems.HotMilkBottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonIceCream), UFItems.icecream, Items.melon, Items.melon, Items.melon);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.hotchocolatebottle), new ItemStack(Items.dye, 1, 3), Items.glass_bottle, UFItems.HotMilkBottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocolatebottle), new ItemStack(Items.dye, 1, 3), Items.glass_bottle, UFItems.milkbottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.chocobiscuit, 2), UFItems.biscuit, UFItems.biscuit, UFItems.hotchocolatebottle);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelIceCream), UFItems.icecream, UFItems.caramel);

        // 1.4.3
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJelly), Items.sugar, Items.apple, Items.slime_ball, Items.bowl);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJelly), Items.sugar, Items.melon, Items.slime_ball, Items.bowl);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJelly), UFItems.jelly, Items.apple);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJelly), UFItems.jelly, Items.melon);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Cereal), UFItems.milkbottle, Items.wheat, Items.sugar, Items.bowl);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolateCereal), UFItems.milkbottle, Items.wheat, Items.sugar, new ItemStack(Items.dye, 1, 3), Items.bowl);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.FrenchFries), Items.baked_potato);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.PanCakeDough), Items.sugar, Items.milk_bucket, Items.wheat, Items.egg);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.PanCakeDough), Items.sugar, UFItems.milkbottle, Items.wheat, Items.egg);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJam),  Items.sugar, Items.bowl, Items.apple);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJam),  Items.sugar, Items.bowl, Items.melon);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamBiscuit),  UFItems.biscuit, UFItems.AppleJam);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamPanCake),  UFItems.PanCake, UFItems.AppleJam);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.AppleJamToast),  UFItems.breadslice, UFItems.AppleJam);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelPanCake),  UFItems.PanCake, UFItems.caramel);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.CaramelToast),  UFItems.breadslice, UFItems.caramel);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolatePanCake),  UFItems.PanCake, UFItems.chocolatecandy);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.ChocolateToast),  UFItems.chocolatecandy, UFItems.breadslice);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJamBiscuit),  UFItems.MelonJam, UFItems.biscuit);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJamToast),  UFItems.MelonJam, UFItems.breadslice);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.MelonJamPanCake),  UFItems.PanCake, UFItems.MelonJam);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.SugarToast),  Items.sugar, UFItems.breadslice);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.SugarPancake),  Items.sugar, UFItems.PanCake);
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Donut), Items.wheat, Items.wheat, Items.sugar, UFItems.milkbottle, new ItemStack(Items.dye, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(UFItems.Oreo), UFItems.chocobiscuit, UFItems.chocobiscuit, Items.sugar, Items.sugar, UFItems.milkbottle);
    }

    private void AddSmeltingRecipes() {
        AddSmeltingRecipe(UFItems.chocolatebottle, new ItemStack(UFItems.hotchocolatebottle));
        AddSmeltingRecipe(UFItems.sugarcube, new ItemStack(UFItems.caramel));
        AddSmeltingRecipe(Items.wheat_seeds, new ItemStack(UFItems.RoastedSeeds));
        AddSmeltingRecipe(Items.pumpkin_seeds, new ItemStack(UFItems.RoastedSeeds));
        AddSmeltingRecipe(Items.melon_seeds, new ItemStack(UFItems.RoastedSeeds));
        AddSmeltingRecipe(Items.egg, new ItemStack(UFItems.friedegg));
        AddSmeltingRecipe(UFItems.marshmallow, new ItemStack(UFItems.cmarshmallow));
        AddSmeltingRecipe(UFItems.MuttonRaw, new ItemStack(UFItems.MuttonCooked));

        // 1.2
        AddSmeltingRecipe(UFItems.SquidTentacleRaw, new ItemStack(UFItems.SquidTentacleCooked));

        // 1.4
        AddSmeltingRecipe(UFItems.milkbottle, new ItemStack(UFItems.HotMilkBottle));
        AddSmeltingRecipe(UFItems.PanCakeDough, new ItemStack(UFItems.PanCake));
    }

    private void AddSmeltingRecipe(Item input, ItemStack output, float xp){
        GameRegistry.addSmelting(input, output, xp);
        FurnitureRegister.getInstance().registerOvenRecipe(new ItemStack(input), output);
    }

    private void AddSmeltingRecipe(Item input, ItemStack output){
        GameRegistry.addSmelting(input, output, 0.3F);
        FurnitureRegister.getInstance().registerOvenRecipe(new ItemStack(input), output);
    }
}
