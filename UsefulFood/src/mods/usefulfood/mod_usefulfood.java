package mods.usefulfood;

import mods.usefulfood.fluids.UFFluid;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "UsefulFood", name = "UsefulFood", version = "1.4.5")
public class mod_usefulfood {
	public static final CreativeTabs tabUsefulFood = new CreativeTabUF("UsefulFood");
	public static boolean MoCreatures = false;
	
	// public static final Fluid Chocolatefluid = new UFFluid("chocolate");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		new UFBlocks();
		new UFItems();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) 
	{
		try
		{
			Class.forName("drzhark.mocreatures.MoCreatures");
			MoCreatures = true;
			FMLLog.info("[UsefulFood] Mo's Creatures Detected. using 5x sugarcube recipe instead");
		}
		catch (ClassNotFoundException e)
		{
			MoCreatures = false;
		}
		
		MinecraftForge.EVENT_BUS.register(new UFEvents());
		FMLLog.fine("[UsefulFood] loading mod_usefulfood recipes");
		new UFRecipes();
		FMLLog.fine("[UsefulFood] mod_usefulfood recipes initialized");
		//new UFDungeonLoot();
	}
}
