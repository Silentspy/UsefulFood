package silentspy.usefulfood.blocks;

import java.util.Random;

import silentspy.usefulfood.UsefulFoodContent;

public class BlockStrawberryBush extends BlockBlueberryBush{

	public BlockStrawberryBush(int id) {
		super(id);
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return UsefulFoodContent.strawberry.shiftedIndex;
    }

}
