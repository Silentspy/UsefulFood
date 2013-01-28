package silentspy_server;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.FMLLog;

public class ParseMOTD {
	
	public static List<String> motd = new ArrayList<String>();
	
	public static void init() 
	{
		try 
		{
			motd.clear();
			
			for (String line : Config.motd) 
			{
				String temp = line.replace("$","§");
				motd.add(temp);
			}
		}
		catch (Exception ex) 
		{
			FMLLog.severe("[silentspy_server] Failed to Parse MOTD");
		}
	}
}