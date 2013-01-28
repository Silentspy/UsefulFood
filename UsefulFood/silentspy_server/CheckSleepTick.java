package silentspy_server;

import java.util.EnumSet;

import net.minecraft.entity.player.EntityPlayer;

import cpw.mods.fml.common.IScheduledTickHandler;
import cpw.mods.fml.common.TickType;

public class CheckSleepTick implements IScheduledTickHandler{

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		EntityPlayer player = (EntityPlayer)tickData[0];
		
		if(player.isPlayerFullyAsleep()) 
		{
				String message = Config.BedMessage.replace("$bedcommand", Config.BedCommand);
				player.sendChatToPlayer(message);
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nextTickSpacing() {
		// TODO Auto-generated method stub
		return 20*Config.BedCheckInterval;
	}
}
