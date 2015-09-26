package mods.usefulfood;

import java.util.Arrays;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class UFDungeonLoot {
	
	String[] ChestsToSpawnIn = { 
			ChestGenHooks.VILLAGE_BLACKSMITH,
			ChestGenHooks.BONUS_CHEST,
			ChestGenHooks.DUNGEON_CHEST
	};
	
	public UFDungeonLoot () 
	{
		this.AddDungeonLoot(new ItemStack(UF.items.MagicCake), 			1, 1, 1);
		this.AddDungeonLoot(new ItemStack(UF.items.magicapplejuice), 	1, 1, 1);
		this.AddDungeonLoot(new ItemStack(UF.items.caramel), 			1, 4, 2);
		this.AddDungeonLoot(new ItemStack(UF.items.Tea), 				1, 4, 2);
		this.AddDungeonLoot(new ItemStack(UF.items.Cheese), 				1, 4, 2);
		this.AddDungeonLoot(new ItemStack(UF.items.trailmix), 			1, 1, 2);
		this.AddDungeonLoot(new ItemStack(UF.items.biscuit), 			1, 4, 2);
		this.AddDungeonLoot(new ItemStack(UF.items.AppleJamBiscuit), 	1, 4, 2);
		this.AddDungeonLoot(new ItemStack(UF.items.salad), 				1, 1, 2);
	}
	
	/**
     * Adds a item to be spawned in dungeon
     *
     * @param item The Item to be added to the loot list
     * @param min The chance it will spawn in a dungeon chest
     * @param max the amount at a minimum it will spawn in a dungeon chest
     * @param chance the amount at a maximum it will spawn in a dungeon chest
     */
	
	private void AddDungeonLoot(ItemStack itemstack, int minStack, int maxStack, int weight) 
	{
		for(String Chest : ChestsToSpawnIn)
		{
			ChestGenHooks.addItem(Chest, new WeightedRandomChestContent(itemstack,minStack,maxStack,weight));
		}
	}
	
	public static void increaseLootGen(int min, int max, String... locations) {
        for (String location : locations) {
            ChestGenHooks lootInfo = ChestGenHooks.getInfo(location);
            lootInfo.setMin(lootInfo.getMin() + min);
            lootInfo.setMax(lootInfo.getMax() + max);
        }
    }
}
