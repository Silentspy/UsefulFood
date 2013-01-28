package silentspy_server;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;

public class CheckPlayerEvent implements IPlayerTracker {

	@Override
	public void onPlayerLogin(EntityPlayer player) {
		if(Config.enableMOTDModule) {
			if(Config.motd.size() > 0) {
				for (String motdline : ParseMOTD.motd) {
					motdline = motdline.replace("§player", player.username);
					player.sendChatToPlayer(motdline);
				}
			}
		}
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

}
