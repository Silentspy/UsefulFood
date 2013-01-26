package silentspy.usefullamp;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "UsefulLamp", name = "UsefulLamp", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class mod_usefullamp {
	
	public static final String blocktextures = "/silentspy/usefulfood/sprites/blocks.png";
	
	private static UsefulLampContent contentInstance;
	
	public static UsefulLampContent getContentInstance() {
		return contentInstance;
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		contentInstance = new UsefulLampContent();
		contentInstance.init();
	}
}
