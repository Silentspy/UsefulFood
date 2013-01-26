package silentspy.recipear;

import java.util.HashSet;
import java.util.Set;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "Recipear", name = "Recipear", version = "1.0")
public class mod_recipear 
{
	static public Set<String> EntityItemPickUpEventPlayers = new HashSet<String>();
	public static boolean IC2Detected = false;
	public static boolean OreDictionaryDetected = false;
	public static boolean RedPower2Detected = false;
	public static boolean Thaumcraft3Detected = false;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		RecipearConfig.Properties(event);
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) 
	{
		try
		{
			Class.forName("ic2.core.AdvRecipe");
			IC2Detected	= true;
			FMLLog.info("[Recipear] IC2 detected");
		}
		catch (ClassNotFoundException ex)
		{
			IC2Detected	= false;
		}
		
		try
		{
			Class.forName("net.minecraftforge.oredict.OreDictionary");
			OreDictionaryDetected = true;
			FMLLog.info("[Recipear] Ore Dictionary detected");
		}
		catch (ClassNotFoundException ex)
		{
			OreDictionaryDetected = false;
		}
		
		try
		{
			Class.forName("com.eloraam.redpower.core.CraftLib");
			RedPower2Detected = true;
			FMLLog.info("[Recipear] RedPower2 detected");
		}
		catch (ClassNotFoundException e)
		{
			RedPower2Detected = false;
		}
		
		try
		{
			Class.forName("thaumcraft.api.ThaumcraftApi");
			Thaumcraft3Detected = true;
			FMLLog.info("[Recipear] Thaumcraft 3 detected");
		}
		catch (ClassNotFoundException e)
		{
			Thaumcraft3Detected = false;
		}
		
		if(RecipearConfig.disabled.length() > 0) {
			String [] temp = RecipearConfig.disabled.split(";");
			
			for(int i = 0; i < temp.length ; i++) { 
				
				String [] temp2 =  temp[i].split(":");
				
				if(temp2.length > 1) {
					if(Integer.parseInt(temp2[1]) > -1) 
					{
						FMLLog.info("[Recipear] Detected MetaData for ID" + temp2[0]);
						if(!RecipeRemover.bannedrecipes.contains(temp[i] + ":" + temp2[1]))
						{
							RecipeRemover.bannedrecipes.add(temp[i] + ":" + temp2[1]);
						}
					} else {
						if(!RecipeRemover.bannedrecipes.contains(temp[i] + ":-1")) 
						{
							RecipeRemover.bannedrecipes.add(temp[i] + ":-1");
						}
					}
				}
				else 
				{
					if(!RecipeRemover.bannedrecipes.contains(temp[i] + ":-1")) {
						RecipeRemover.bannedrecipes.add(temp[i] + ":-1");
					}
				}
			}
				RecipeRemover.RemoveRecipes();
				
				if(RecipearConfig.removeingame) {
					GameRegistry.registerPlayerTracker(new CheckPlayerEvent());
				}
			} else {
				FMLLog.info("[Recipear] nothing to disable");
			}
		}
	}
