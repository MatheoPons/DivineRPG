package divinerpg.client.particle;


import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.BasicParticleType;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ParticleApalachiaPortal extends SpriteTexturedParticle
{
	IAnimatedSprite animatedSprite;
	private float portalParticleScale;
	private double portalPosX, portalPosY, portalPosZ;

	public ParticleApalachiaPortal(ClientWorld worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeed, double ySpeed, double zSpeed, IAnimatedSprite sprite)
	{
		this(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeed, ySpeed, zSpeed, 1.0F, sprite);
	}

	public ParticleApalachiaPortal(ClientWorld worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeed, double ySpeed, double zSpeed, float scale, IAnimatedSprite sprite)
	{
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeed, ySpeed, zSpeed);
		this.xo = xSpeed;
		this.yo = ySpeed;
		this.zo = zSpeed;
		this.portalPosX = this.x = xCoordIn;
		this.portalPosY = this.y = yCoordIn;
		this.portalPosZ = this.z = zCoordIn;
		float var14 = worldIn.random.nextFloat() * 0.6F + 0.4F;
		this.portalParticleScale = this.quadSize;
		this.bCol = 0.87F;
		this.gCol = 0.0F;
		this.rCol = 1.0F * var14;
		this.lifetime = (int) (Math.random() * 10.0D) + 40;
		this.animatedSprite = sprite;
	}

	@Override
	protected int getLightColor(float partialTick) {
		int var2 = super.getLightColor(partialTick);
		float var3 = (float) this.age / (float) this.lifetime;
		var3 *= var3;
		var3 *= var3;
		int var4 = var2 & 255;
		int var5 = var2 >> 16 & 255;
		var5 += (int) (var3 * 15.0F * 16.0F);

		if (var5 > 240) {
			var5 = 240;
		}

		return var4 | var5 << 16;
	}


	@Override
	public void render(IVertexBuilder buffer, ActiveRenderInfo renderInfo, float partialTicks) {
		float var8 = (this.age + partialTicks) / this.lifetime * 3;
		var8 = 1.0F - var8;
		var8 *= var8;
		var8 = 1.0F - var8;
		this.quadSize = this.portalParticleScale * var8;
		super.render(buffer, renderInfo, partialTicks);
	}

	@Override
	public void tick()
	{
		this.xo = this.x;
		this.yo = this.y;
		this.zo = this.z;
		float var1 = (float) this.age / (float) this.lifetime;
		float var2 = var1;
		var1 = -var1 + var1 * var1 * 2.0F;
		var1 = 1.0F - var1;
		this.x = this.portalPosX + this.xd * var1;
		this.y = this.portalPosY + this.yd * var1 + (1.0F - var2);
		this.z = this.portalPosZ + this.zd * var1;
		if (this.age++ >= this.lifetime) {
			this.remove();
		}
	}


	@Override
	public IParticleRenderType getRenderType() {
		return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@OnlyIn(Dist.CLIENT)
	public static class Factory implements IParticleFactory<BasicParticleType>
	{
		private final IAnimatedSprite spriteSet;

		public Factory(IAnimatedSprite spriteSetIn) {
			this.spriteSet = spriteSetIn;
		}

		@Override
		public Particle createParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			ParticleApalachiaPortal particle = new ParticleApalachiaPortal(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, spriteSet);
			particle.pickSprite(this.spriteSet);
			return particle;
		}
	}
}