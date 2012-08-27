package silentspy.usefulfood;

import net.minecraft.src.*;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
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
        UsefulFoodRecipes.init();
        FMLLog.fine("[UsefulFood] mod_usefulfood recipes initialized");
        proxy.addNames();
        GameRegistry.registerWorldGenerator(new silentspy.usefulfood.world.WorldGenerator());
    }
}
