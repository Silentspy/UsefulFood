package mods.usefulfood;

import java.util.Arrays;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class UFDungeonLoot {
	
	public UFDungeonLoot () 
	{
		this.AddDungeonLoot(new ItemStack(UFItems.magiccake), 			1, 2, 100);
		this.AddDungeonLoot(new ItemStack(UFItems.magicapplejuice), 	1, 2, 100);
		this.AddDungeonLoot(new ItemStack(UFItems.caramel), 			1, 10, 100);
		this.AddDungeonLoot(new ItemStack(UFItems.Tea), 				1, 10, 100);
		this.AddDungeonLoot(new ItemStack(UFItems.Cheese), 				1, 10, 100);
		this.AddDungeonLoot(new ItemStack(UFItems.trailmix), 			1, 10, 100);
		this.AddDungeonLoot(new ItemStack(UFItems.biscuit), 			1, 10, 100);
		this.AddDungeonLoot(new ItemStack(UFItems.applebiscuit), 		1, 10, 100);
		this.AddDungeonLoot(new ItemStack(UFItems.salad), 				1, 10, 100);
	}
	
	/**
     * Adds a item to be spawned in dungeon
     *
     * @param item The Item to be added to the loot list
     * @param min The chance it will spawn in a dungeon chest
     * @param max the amount at a minimum it will spawn in a dungeon chest
     * @param chance the amount at a maximum it will spawn in a dungeon chest
     */
	
	private void AddDungeonLoot(ItemStack itemstack, int min, int max, int weight) 
	{
		String[] ChestsToSpawnIn = { 
				ChestGenHooks.BONUS_CHEST, 
				ChestGenHooks.DUNGEON_CHEST,
			    ChestGenHooks.MINESHAFT_CORRIDOR,
			    ChestGenHooks.PYRAMID_DESERT_CHEST, 
			    ChestGenHooks.PYRAMID_JUNGLE_CHEST, 
			    ChestGenHooks.STRONGHOLD_CORRIDOR, 
			    ChestGenHooks.STRONGHOLD_CROSSING
		};
		
		for(String Chest : ChestsToSpawnIn )
		{
			ChestGenHooks.getInfo(Chest).addItem(new WeightedRandomChestContent(itemstack,min,max,weight));
		}
	}
}
