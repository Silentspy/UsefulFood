package silentspy.usefulfood;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.Instance;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderInformation() 
	{  
		MinecraftForgeClient.preloadTexture(mod_usefulfood.blocktextures);
		MinecraftForgeClient.preloadTexture(mod_usefulfood.itemtextures);
	}
}