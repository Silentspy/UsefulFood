package silentspy.usefulfood.items;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.*;

public class ItemUsefulFood extends ItemFood
{
	public ItemUsefulFood(int var1, int var2, float var3, boolean var4)
    {
        super(var1, var2, var3, var4);
    }
	
	public String getTextureFile()
    {
		return mod_usefulfood.itemtextures;
    }
}
