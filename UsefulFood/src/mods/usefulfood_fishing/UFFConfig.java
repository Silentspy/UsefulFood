package mods.usefulfood_fishing;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class UFFConfig {

		// items
		static int milkbottleItemID;

		public static void Properties(FMLPreInitializationEvent event) 
		{
			FMLLog.fine("[UsefulFood] loading usefulfood_fishing " + event.getModMetadata().version);
			Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
			try {
				cfg.load();

				// Items
				milkbottleItemID = cfg.getItem("milkbowl", 5054).getInt(5054);
				
			} catch (Exception e) {
				FMLLog.log(Level.SEVERE, e, "UsefulFoodFishing has a problem loading it's configuration");
			} finally {
				cfg.save();
			}
		}
	}