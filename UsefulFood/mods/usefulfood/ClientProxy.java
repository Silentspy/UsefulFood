package mods.usefulfood;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ClientProxy extends CommonProxy 
{
	public void addNames() 
	{
		new UsefulFoodRegistry().localization();
	}

	public void registerRenderInformation() {
		
	}
}