package mods.usefulfood;

import java.util.ArrayList;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "UsefulFood", name = "UsefulFood", version = "1.5.0")
public class UF {
	@SidedProxy(clientSide="mods.usefulfood.UFClient", serverSide="mods.usefulfood.UFServer")
	public static UFServer proxy;
	private static ArrayList<UFItem2Model> itemsToSetAsModels = new ArrayList<UFItem2Model>();
	public static UFBlocks blocks;
	public static UFItems items;
	public static CreativeTabs tabUsefulFood = new CreativeTabUF("UsefulFood");
	public static boolean MoCreatures = false;
	
	public static ArrayList<UFItem2Model> getItem2Models() {
		return itemsToSetAsModels;
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		proxy.preInit(event);
		blocks = new UFBlocks().init();
		items = new UFItems().init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		proxy.init(event);
		new UFRecipes();
	}
}
