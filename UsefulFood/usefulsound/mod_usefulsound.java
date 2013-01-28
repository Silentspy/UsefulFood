package usefulsound;

import usefulfood.UsefulFoodConfig;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "UsefulSound", name = "UsefulSound", version = "1.0.0")
public class mod_usefulsound {
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		UsefulSoundConfig.Properties(event);
	}

	@Init
	public void load(FMLInitializationEvent event) {
		System.out.println("Events Loaded");
		MinecraftForge.EVENT_BUS.register(new UsefulSoundEvents());
	}
}
