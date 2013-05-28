package mods.usefulfood_fishing;

import mods.usefulfood.CreativeTabUF;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "UsefulFoodFishing", name = "UsefulFoodFishing", version = "1.0", dependencies="required-after:Forge@[7.0,);required-after:UsefulFood@[1.4,)")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class usefulfood_fishing {
	@SidedProxy(clientSide = "mods.usefulfood_fishing.ClientProxy", serverSide = "mods.usefulfood_fishing.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) 
	{
		UFFConfig.Properties(event);
	}
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		FMLLog.fine("[UsefulFoodFishing] loading recipes");
		
		FMLLog.fine("[UsefulFoodFishing] recipes initialized");
		
		proxy.addNames();
	}
}
