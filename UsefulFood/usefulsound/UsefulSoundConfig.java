package usefulsound;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class UsefulSoundConfig {
	
	public static boolean CaveSounds = false;
	
	public static void Properties(FMLPreInitializationEvent event) 
	{
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try {

			cfg.load();
			
			CaveSounds = cfg.get(cfg.CATEGORY_GENERAL, "CaveSounds", false).getBoolean(false);
			
		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, "UsefulSound has a problem loading it's configuration");
		} finally {
			cfg.save();
		}
	}
}
