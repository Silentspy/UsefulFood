package silentspy_server;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.common.FMLLog;

public class SilentspyEvents 
{
	@ForgeSubscribe
	public void ServerChatEvent(ServerChatEvent event) 
	{	
		Random random = new Random();
		String[] colorcodes = {
	            "2",
	            "3",
	            "4",
	            "5",
	            "6",
	            "7",
	            "8",
	            "9",
	            "a",
	            "b",
	            "c",
	            "d",
	            "e"
	    };
		
		int color = random.nextInt(colorcodes.length);
		
		String colorchosen = "f";
		
		boolean found = false;
		
		for (PlayerColor p : mod_silentspy.ls) {
		    if (p.name.equals(event.username)) {
		        found = true;
		        colorchosen = p.color;
		        break;
		    }
		} 
		
		if(!found) {
			mod_silentspy.ls.add(new PlayerColor(event.username, colorcodes[color]));
			colorchosen = colorcodes[color];
		}
		
		event.line = "§" + colorchosen + event.username + "§f: " + event.message;
		
		if(Config.enableBedModule) {
			if (event.message.toLowerCase() == Config.BedCommand) 
			{
				if(event.player.isPlayerFullyAsleep()) {
					long time = event.player.worldObj.getWorldTime() + 24000L;
					event.player.worldObj.setWorldTime(time - time % 24000L);
					FMLLog.info("[silentspy_server] Server was set to day");
				}
			}
		}
		
		if(event.message.contains(Config.MOTDReloadCommand))
		{
			if(mod_silentspy.isOP(event.player.username)) 
			{
				mod_silentspy.loadMOTD();
				FMLLog.info("[silentspy_server] MOTD reloaded...");
			}
		}
		
		if(event.message.contains(Config.MOTDCommand)) 
		{
			if(Config.enableMOTDModule) 
			{
				if(Config.motd_loaded) 
				{
					if(Config.motd.size() > 0) 
					{
						for (String motdline : ParseMOTD.motd) 
						{
							motdline = motdline.replace("$player", event.player.username);
							event.player.sendChatToPlayer(motdline);
						}
					}
				}
			}
		}
	}
}
