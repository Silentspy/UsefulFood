package usefulsound;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class UsefulSoundEvents 
{
	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
	public void PlaySoundEvent(PlaySoundEvent event) {
		
		if(!UsefulSoundConfig.CaveSounds) {
			if(event.source.soundName.contains("ambient/cave/")) {
				System.out.println(event.source.soundName);
				event.result = null;
			}
		}
	}
}
