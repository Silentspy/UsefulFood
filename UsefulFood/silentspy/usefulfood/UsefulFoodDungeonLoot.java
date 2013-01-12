package silentspy.usefulfood;

import static net.minecraftforge.common.ChestGenHooks.DUNGEON_CHEST;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;

public class UsefulFoodDungeonLoot {

	public void init () 
	{
		this.AddDungeonLoot(UsefulFoodItems.magiccake, 1, 1, 1);
		this.AddDungeonLoot(UsefulFoodItems.magicapplejuice, 5, 1, 1);
		this.AddDungeonLoot(UsefulFoodItems.caramel, 50, 1, 10);
		this.AddDungeonLoot(UsefulFoodItems.Banana);
		this.AddDungeonLoot(UsefulFoodItems.Pear);
		this.AddDungeonLoot(UsefulFoodItems.Peach);
		this.AddDungeonLoot(UsefulFoodItems.Cherry);
		this.AddDungeonLoot(UsefulFoodItems.blueberry);
		this.AddDungeonLoot(UsefulFoodItems.strawberry);
	}
	
	/**
     * Adds a item to be spawned in dungeon
     *
     * @param item The Item to be added to the loot list
     * @return The new rarity of the loot.
     */
	
	public float AddDungeonLoot(Item item) 
	{
		return DungeonHooks.addDungeonLoot(new ItemStack(item), 10, 1, 10);
	}
	
	/**
     * Adds a item to be spawned in dungeon
     *
     * @param item The Item to be added to the loot list
     * @param chance The chance it will spawn in a dungeon chest
     * @param min the amount at a minimum it will spawn in a dungeon chest
     * @param max the amount at a maximum it will spawn in a dungeon chest
     * @return The new rarity of the loot.
     */
	
	public float AddDungeonLoot(Item item, int chance, int min, int max) 
	{
		return DungeonHooks.addDungeonLoot(new ItemStack(item), chance, min, max);
	}
}
