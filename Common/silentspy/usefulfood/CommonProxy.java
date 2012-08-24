package silentspy.usefulfood;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler
{
    
    public void addNames() 
    {
    	// Used in Client proxy
    }
    
    public void registerRenderInformation() 
    {
        //unused server side. -- see ClientProxy for implementation
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        // TODO Auto-generated method stub
        return null;
    }
}

