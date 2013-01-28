package silentspy_server;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.Configuration;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {

	public static boolean enableBedModule = true;
	public static boolean enableMOTDModule = true;
	
	public static int BedCheckInterval = 5;
	public static String BedCommand = "!day";
	public static String BedMessage = "Type $bedcommand to make it daytime";
	
	public static String MOTDCommand = "!motd";
	public static String MOTDReloadCommand = "!reload";
	
	public static boolean motd_loaded = false;
	public static List<String> motd;
	
	public static String MOTDPath = "";
	public static String MOTDFilePath = "";
	
	public static void Properties(FMLPreInitializationEvent event) {
		
		MOTDPath = event.getModConfigurationDirectory().toString() + File.separator + "silentspy";
		MOTDFilePath = MOTDPath + File.separator + "MOTD.txt";
		
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		try 
		{
			cfg.load();

			enableBedModule = cfg.get("Modules", "Bed", true).getBoolean(true);
			enableMOTDModule = cfg.get("Modules", "MOTD", true).getBoolean(true);

			BedCheckInterval = cfg.get("Bed", "BedCheckInterval", 5).getInt(5);
			BedCommand = cfg.get("Bed", "BedCommand", "!day", "Bed command to skip to day").value;
			BedMessage = cfg.get("Bed", "BedMessage", "Type $bedcommand to make it daytime", "The Message to appear when someone goes to sleep, use $BedCommand to show current bed command").value;
		
			MOTDCommand = cfg.get("MOTD", "MOTDCommand", "!motd").value;
			MOTDReloadCommand = cfg.get("MOTD", "MOTDReloadCommand", "!reload", "Only work for OP or in SSP").value;
		} 
		catch (Exception e) 
		{
			FMLLog.severe("silentspy_server has a problem loading it's configuration");
		}
		finally 
		{
			cfg.save();
		}
	}

	public static void MOTD() 
	{
		motd_loaded = false;
		
		File MOTDdirectory = new File(MOTDPath); 
		MOTDdirectory.mkdir();
		File MOTDfile = new File(MOTDFilePath).getAbsoluteFile();

		if(!MOTDfile.exists()) 
		{
			try 
			{
				MOTDfile.createNewFile();
				BufferedWriter bw = new BufferedWriter(new FileWriter(MOTDfile));
				bw.write("Welcome $player");
				bw.close();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

		if(MOTDfile.exists()) 
		{
			try 
			{
				motd = new ArrayList<String>();;
				motd = Files.readLines(MOTDfile, Charsets.UTF_8);
				motd_loaded = true;
			} 
			catch (Exception e) 
			{
				FMLLog.severe("[silentspy_server] Failed to load MOTD");
				motd_loaded = false;
			}
		}
	}
}
