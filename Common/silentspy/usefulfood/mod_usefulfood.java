package silentspy.usefulfood;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "UsefulFood", name = "UsefulFood", version = "1.2.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_usefulfood {
	@SidedProxy(clientSide = "silentspy.usefulfood.ClientProxy", serverSide = "silentspy.usefulfood.CommonProxy")
	public static CommonProxy proxy;

	public static final String itemtextures = "/silentspy/usefulfood/sprites/items.png";
	public static final String blocktextures = "/silentspy/usefulfood/sprites/blocks.png";

	private static UsefulFoodContent contentInstance;

	public static UsefulFoodContent getContentInstance() {
		return contentInstance;
	}

	@Init
	public void load(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new UsefulFoodEvents());
		FMLLog.fine("[UsefulFood] loading mod_usefulfood recipes");
		proxy.registerRenderInformation();
		UsefulFoodRecipes.init();
		FMLLog.fine("[UsefulFood] mod_usefulfood recipes initialized");
		// MinecraftForge.addGrassSeed(new
		// ItemStack(UsefulFoodContent.strawberryseed, 1, 0), 10);
		proxy.addNames();
		// GameRegistry.registerWorldGenerator(new
		// silentspy.usefulfood.world.WorldGenerator());
	}

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		UsefulFoodConfig.Properties(event);
		contentInstance = new UsefulFoodContent();
		contentInstance.init();
	}
}
