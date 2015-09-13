package mods.usefulfood.proxies;

import mods.usefulfood.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

/**
 * Created by Master801 on 9/12/2015 at 8:15 PM.
 * @author Master801
 */
public final class ClientProxy implements Proxy {

    @Override
    public void bakeItemModels() {
        //Apple
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.AppleCake, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "AppleCake", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.AppleIceCream, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "AppleIceCream", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.AppleJam, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "AppleJam", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.AppleJamBiscuit, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "AppleJamBiscuit", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.AppleJamPanCake, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "AppleJamPancake", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.AppleJamToast, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "AppleJamToast", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.AppleJelly, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "AppleJelly", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.applejuice, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "AppleJuice", "inventory"));

        //Caramel
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.caramel, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Caramel", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.caramelapple, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CaramelApple", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.CaramelBiscuit, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CaramelBiscuit", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.CaramelCake, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CaramelCake", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.CaramelIceCream, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CaramelIceCream", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.CaramelPanCake, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CaramelPancake", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.CaramelToast, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CaramelToast", "inventory"));

        ///Carrot
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.carrotjuice, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CarrotJuice", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.carrotpie, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CarrotPie", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.carrotsoup, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CarrotSoup", "inventory"));

        //Cheese
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.Cheese, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Cheese", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.CheeseSandwich, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CheeseSandwich", "inventory"));

        //Chocolate
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.ChocolateApple, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "ChocolateApple", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.chocolatecandy, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "ChocolateBar", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.chocobiscuit, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "ChocolateBiscuit", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.ChocolateCake, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "ChocolateCake", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.ChocolateCereal, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "ChocolateCereal", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.chocolateicecream, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "ChocolateIceCream", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.chocolatebottle, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "ChocolateMilkBottle", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.ChocolatePanCake, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "ChocolatePancake", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.ChocolateToast, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "ChocolateToast", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.hotchocolatebottle, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "HotChocolateMilkBottle", "inventory"));

        //Magic
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.magicapplejuice, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MagicAppleJuice", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MagicCake, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MagicCake", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.magicfruitsalad, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MagicFruitSalad", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MagicIceCream, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MagicIceCream", "inventory"));

        //Melon
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MelonIceCream, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MelonIceCream", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MelonJam, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MelonJam", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MelonJamBiscuit, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MelonJamBiscuit", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MelonJamPanCake, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MelonJamPancake", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MelonJamToast, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MelonJamToast", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MelonJelly, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MelonJelly", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.melonjuice, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MelonJuice", "inventory"));

        //Pumpkin
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.pumpkinbread, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "PumpkinBread", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.pumpkinsoup, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "PumpkinSoup", "inventory"));

        //Seafood
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.SquidTentacleCooked, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CookedSquidTentacle", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.fishnchips, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "FishnChips", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.fishwich, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "FishSandwich", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.FishSoup, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "FishSoup", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.SquidSandwich, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "SquidSandwich", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.SquidSushi, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "SquidSushi", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.SquidTentacleRaw, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "SquidTentacle", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.sushi, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Sushi", "inventory"));

        //Sugar
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.sugarbiscuit, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "SugarBiscuit", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.sugarcube, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "SugarCube", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.SugarPancake, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "SugarPancake", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.SugarToast, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "SugarToast", "inventory"));

        //Unsorted
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.breadslice, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "BreadSlice", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.milkbottle, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MilkBottle", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.CactusJuice, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CactusJuice", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.Cereal, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Cereal", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.chickenwich, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "ChickenSandwich", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.cmarshmallow, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CookedMarshmallow", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MuttonCooked, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "CookedMutton", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.Donut, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Donut", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.eggwich, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "EggSandwich", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.FrenchFries, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "FrenchFries", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.friedegg, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "FriedEgg", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.salad, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Salad", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.fruitsalad, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "FruitSalad", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.HotMilkBottle, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "HotMilkBottle", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.debugfood, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Hungrz", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.jelly, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Jelly", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MuttonSandwich, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MilkBottle", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MuttonSandwich, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "MuttonSandwich", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.Oatmeal, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Oatmeal", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.Oreo, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Oreo", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.PanCake, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Pancake", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.PanCakeDough, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "PancakeDough", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.porkwich, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "PorkChopSandwich", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.marshmallow, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "RawMarshmallow", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.MuttonRaw, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "RawMutton", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.RoastedSeeds, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "RoastedSeeds", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.Spaghetti, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Spaghetti", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.steakwich, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "SteakSandwich", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.Tea, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Tea", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.trailmix, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Trailmix", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.icecream, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "VanillaIceCream", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.Waffle, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Waffle", "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(UFItems.biscuit, 0, new ModelResourceLocation(UsefulFood.MOD_ID.toLowerCase() + ":" + "Biscuit", "inventory"));
    }

}
