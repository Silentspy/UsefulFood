package usefulfood;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.DungeonHooks;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "UsefulFood", name = "UsefulFood", version = "1.3.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_usefulfood {
	@SidedProxy(clientSide = "usefulfood.ClientProxy", serverSide = "usefulfood.CommonProxy")
	public static CommonProxy proxy;

	public static final String itemtextures = "/usefulfood/sprites/items.png";
	public static final String blocktextures = "/usefulfood/sprites/blocks.png";
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		UsefulFoodConfig.Properties(event);
		new UsefulFoodBlocks().init();
		new UsefulFoodItems().init();
		new UsefulFoodRegistry().init();
	}

	@Init
	public void load(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new UsefulFoodEvents());
		if(!UsefulFoodConfig.UseVanillaRecipes) {
			RecipeRemover.AddRecipe(Item.cake);
			RecipeRemover.RemoveRecipes();
		}
		FMLLog.fine("[UsefulFood] loading mod_usefulfood recipes");
		proxy.registerRenderInformation();
		UsefulFoodRecipes.init();
		FMLLog.fine("[UsefulFood] mod_usefulfood recipes initialized");
		
		proxy.addNames();
		GameRegistry.registerWorldGenerator(new usefulfood.world.WorldGenerator());
		new UsefulFoodDungeonLoot().init();
	}
}
