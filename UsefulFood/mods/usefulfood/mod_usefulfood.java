package mods.usefulfood;

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

@Mod(modid = "UsefulFood", name = "UsefulFood", version = "1.4.3")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_usefulfood {
	@SidedProxy(clientSide = "mods.usefulfood.ClientProxy", serverSide = "mods.usefulfood.CommonProxy")
	public static CommonProxy proxy;
	public static final CreativeTabs tabUsefulFood = new CreativeTabUF("UsefulFood");
	public static boolean MoCreatures = false;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		UFConfig.Properties(event);
		new UFBlocks();
		new UFItems();
	}
	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		try
		{
			Class.forName("drzhark.mocreatures.MoCreatures");
			MoCreatures = true;
			FMLLog.info("[UsefulFood] Mo's Creatures Detected. using 5x sugarcube recipe instead");
		}
		catch (ClassNotFoundException e)
		{
			MoCreatures = false;
		}
		
		MinecraftForge.EVENT_BUS.register(new UFEvents());
		FMLLog.fine("[UsefulFood] loading mod_usefulfood recipes");
		new UFRecipes();
		FMLLog.fine("[UsefulFood] mod_usefulfood recipes initialized");
		
		proxy.addNames();
		//new UFDungeonLoot();
	}
}
