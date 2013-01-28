package silentspy_server;

import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "SilentspyServer", name = "SilentspyServer", version = "1.0.0")
public class mod_silentspy {
	
	public static ArrayList<PlayerColor> ls=new ArrayList<PlayerColor>();
	
	public static boolean isOP(String name) 
	{
		if(FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().getOps().contains(name)) 
		{
			return true;
		}
		
		if (FMLCommonHandler.instance().getMinecraftServerInstance().isSinglePlayer()) 
		{
			return true;
		}
		return false;
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Config.Properties(event);
	}

	@Init
	public void load(FMLInitializationEvent event) 
	{
		loadbed();
		loadMOTD();
		MinecraftForge.EVENT_BUS.register(new SilentspyEvents());
	}
	
	public void loadbed () 
	{
		if(Config.enableBedModule) {
			TickRegistry.registerScheduledTickHandler(new CheckSleepTick(), Side.SERVER);
		}
	}
	
	public static void loadMOTD () 
	{
		if(Config.enableMOTDModule) 
		{
			Config.MOTD();
			
			if(Config.motd_loaded) 
			{
				if (Config.motd != null && Config.motd.size() > 0) 
				{
					ParseMOTD.init();
					GameRegistry.registerPlayerTracker(new CheckPlayerEvent());
				}
			}
		}
	}
}

