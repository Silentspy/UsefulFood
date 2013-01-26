package silentspy.recipear;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class RecipearConfig {
	
	public static String disabled = "";
	public static boolean removeingame = false;
	public static boolean showmessage = true;
	public static String ingamemessage = "The item you are trying to pick up is banned";
	public static int messageinterval = 30;
	
	public static void Properties(FMLPreInitializationEvent event) 
	{
		FMLLog.fine("[Recipear] loading Config " + event.getModMetadata().version);

		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try 
		{
			cfg.load();
			disabled = cfg.get(cfg.CATEGORY_GENERAL, "Disabled", "", "Example ID: 30174 will disable recipe related to that item, setting 30174:1 will only disable specific item with that metadata, seperate ID's with ;").value;
			removeingame = cfg.get(cfg.CATEGORY_GENERAL, "RemoveIngame", false, "Set this to true if you want to remove banned items from players").getBoolean(false);
			
			showmessage = cfg.get("IngameMessage", "Enable", true, "Show Banned Message ingame?").getBoolean(true);
			ingamemessage = cfg.get("IngameMessage", "Message", "The item you are trying to pick up is banned", "The Ingame message shown to players").value;
			messageinterval = cfg.get("IngameMessage", "Interval", 30, "How long between every Message").getInt();	
		}
		catch (Exception e) 
		{
			FMLLog.log(Level.SEVERE, e, "[Recipear] has a problem loading it's configuration");
		}
		finally 
		{
			cfg.save();
		}
	}
}
