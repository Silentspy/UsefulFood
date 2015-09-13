package mods.usefulfood;

import mods.usefulfood.proxies.Proxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent.MissingMapping;
import net.minecraftforge.fml.common.registry.GameRegistry.Type;

import java.util.List;

@Mod(modid = UsefulFood.MOD_ID, name = "UsefulFood", version = "@VERSION@")
public final class UsefulFood {

    @SidedProxy(serverSide = "mods.usefulfood.proxies.ServerProxy", clientSide = "mods.usefulfood.proxies.ClientProxy")
    public static Proxy proxy;

    public static final CreativeTabs tabUsefulFood = new CreativeTabUF("UsefulFood");
    public static final String MOD_ID = "UsefulFood";

    public static boolean MoCreatures = false;

    // public static final Fluid Chocolatefluid = new UFFluid("chocolate");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        new UFBlocks();
        new UFItems();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        UsefulFood.proxy.bakeItemModels();
        try {
            Class.forName("drzhark.mocreatures.MoCreatures");
            UsefulFood.MoCreatures = true;
            FMLLog.info("[UsefulFood] Mo's Creatures Detected. using 5x sugarcube recipe instead");
        } catch (ClassNotFoundException e) {
            UsefulFood.MoCreatures = false;
        }

        MinecraftForge.EVENT_BUS.register(new UFEvents());
        FMLLog.fine("[UsefulFood] loading mod_usefulfood recipes");
        new UFRecipes();
        FMLLog.fine("[UsefulFood] mod_usefulfood recipes initialized");
        //new UFDungeonLoot();
    }
}
