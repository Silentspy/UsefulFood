package silentspy.recipear;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IPlayerTracker;

public class CheckPlayerEvent implements IPlayerTracker {

	@Override
	public void onPlayerLogin(EntityPlayer player) {
		for (ItemStack item : player.inventory.mainInventory) {
			if(item != null) {
				if(RecipeRemover.Check(item.itemID, item.getItemDamage())) {
					player.sendChatToPlayer("found a banned item, cleaning inventory");
					player.inventory.clearInventory(item.itemID, item.getItemDamage());
				}
			}
		}
		
		for (ItemStack item : player.inventory.armorInventory) {
			if(item != null) {
				if(RecipeRemover.Check(item.itemID, item.getItemDamage())) {
					player.sendChatToPlayer("found a equipped banned item, cleaning armor");
					player.inventory.clearInventory(item.itemID, item.getItemDamage());
				}
			}
		}
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

}
