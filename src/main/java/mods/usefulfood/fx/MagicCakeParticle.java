package mods.usefulfood.fx;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class MagicCakeParticle extends EntityFX {
	
	private static final ResourceLocation texture = new ResourceLocation("usefulfood/textures/particles.png");
	
	public MagicCakeParticle(World worldIn, BlockPos pos, double parMotionX, double parMotionY, double parMotionZ) 
    {
        super(worldIn, (double)((float) pos.getX() + worldIn.rand.nextFloat()), (double)((float) pos.getY() + worldIn.rand.nextFloat()), (double)((float) pos.getZ() + worldIn.rand.nextFloat()), parMotionX, parMotionY, parMotionZ);
        this.setParticleTextureIndex(0);
        this.particleScale = 1.0F;
        this.setAlphaF(0.7F);
    }
	
	@Override
	public int getFXLayer()
	{
		return 0;
	}
}
