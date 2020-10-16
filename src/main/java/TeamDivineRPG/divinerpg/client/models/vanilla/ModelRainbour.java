package TeamDivineRPG.divinerpg.client.models.vanilla;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ModelRainbour<T extends Entity> extends SegmentedModel<T> {
    ModelRenderer body;
    ModelRenderer lwing1;
    ModelRenderer head;
    ModelRenderer lwing2;
    ModelRenderer lwing3;
    ModelRenderer lhorn1;
    ModelRenderer rhorn1;
    ModelRenderer snout;
    ModelRenderer lhorn2;
    ModelRenderer rhorn2;
    ModelRenderer tummy;
    ModelRenderer chin;
    ModelRenderer rwing1;
    ModelRenderer rwing2;
    ModelRenderer rwing3;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer lhip;
    ModelRenderer rhip;
    ModelRenderer rthigh;
    ModelRenderer lthigh;
    ModelRenderer lfoot;
    ModelRenderer rfoot;
    ModelRenderer hornything;

    public ModelRainbour() {
        textureWidth = 128;
        textureHeight = 64;

        body = new ModelRenderer(this, 0, 0);
        body.addBox(-4F, -4F, 0F, 8, 6, 11);
        body.setRotationPoint(0F, 8F, -5F);
        body.setTextureSize(128, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        lwing1 = new ModelRenderer(this, 0, 18);
        lwing1.addBox(0F, 0F, -2F, 9, 1, 7);
        lwing1.setRotationPoint(3F, 6F, -3F);
        lwing1.setTextureSize(128, 64);
        lwing1.mirror = true;
        setRotation(lwing1, 0F, -0.3665191F, 0F);
        head = new ModelRenderer(this, 0, 27);
        head.addBox(-3F, -2F, -5F, 6, 5, 6);
        head.setRotationPoint(0F, 7F, -5F);
        head.setTextureSize(128, 64);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        lwing2 = new ModelRenderer(this, 0, 39);
        lwing2.addBox(4F, 0F, 0F, 8, 1, 9);
        lwing2.setRotationPoint(3F, 6F, -3F);
        lwing2.setTextureSize(128, 64);
        lwing2.mirror = true;
        setRotation(lwing2, 0F, 0.1919862F, 0F);
        lwing3 = new ModelRenderer(this, 0, 50);
        lwing3.addBox(11F, 0F, -5F, 14, 1, 10);
        lwing3.setRotationPoint(3F, 6F, -3F);
        lwing3.setTextureSize(128, 64);
        lwing3.mirror = true;
        setRotation(lwing3, 0F, -0.2617994F, 0F);
        lhorn1 = new ModelRenderer(this, 24, 27);
        lhorn1.addBox(2.5F, -4F, -3.5F, 1, 4, 2);
        lhorn1.setRotationPoint(0F, 7F, -5F);
        lhorn1.setTextureSize(128, 64);
        lhorn1.mirror = true;
        setRotation(lhorn1, -0.6457718F, 0F, 0F);
        rhorn1 = new ModelRenderer(this, 30, 27);
        rhorn1.addBox(-3.5F, -4F, -3.5F, 1, 3, 2);
        rhorn1.setRotationPoint(0F, 7F, -5F);
        rhorn1.setTextureSize(128, 64);
        rhorn1.mirror = true;
        setRotation(rhorn1, -0.6457718F, 0F, 0F);
        snout = new ModelRenderer(this, 34, 41);
        snout.addBox(-2F, -1.2F, -7F, 4, 4, 3);
        snout.setRotationPoint(0F, 7F, -5F);
        snout.setTextureSize(128, 64);
        snout.mirror = true;
        setRotation(snout, 0F, 0F, 0F);
        lhorn2 = new ModelRenderer(this, 25, 34);
        lhorn2.addBox(2.5F, -6F, -2.5F, 1, 4, 1);
        lhorn2.setRotationPoint(0F, 7F, -5F);
        lhorn2.setTextureSize(128, 64);
        lhorn2.mirror = true;
        setRotation(lhorn2, -0.6457718F, 0F, 0F);
        rhorn2 = new ModelRenderer(this, 30, 34);
        rhorn2.addBox(-3.5F, -6F, -2.5F, 1, 3, 1);
        rhorn2.setRotationPoint(0F, 7F, -5F);
        rhorn2.setTextureSize(128, 64);
        rhorn2.mirror = true;
        setRotation(rhorn2, -0.6457718F, 0F, 0F);
        tummy = new ModelRenderer(this, 58, 0);
        tummy.addBox(-3F, 1F, 1F, 6, 2, 9);
        tummy.setRotationPoint(0F, 8F, -5F);
        tummy.setTextureSize(128, 64);
        tummy.mirror = true;
        setRotation(tummy, 0F, 0F, 0F);
        chin = new ModelRenderer(this, 39, 11);
        chin.addBox(-2F, 1.5F, -4F, 4, 2, 4);
        chin.setRotationPoint(0F, 7F, -5F);
        chin.setTextureSize(128, 64);
        chin.mirror = true;
        setRotation(chin, 0F, 0F, 0F);
        rwing1 = new ModelRenderer(this, 33, 18);
        rwing1.addBox(-9F, 0F, -2F, 9, 1, 7);
        rwing1.setRotationPoint(-3F, 6F, -3F);
        rwing1.setTextureSize(128, 64);
        rwing1.mirror = true;
        setRotation(rwing1, 0F, 0.3665191F, 0F);
        rwing2 = new ModelRenderer(this, 38, 28);
        rwing2.addBox(-12F, 0F, 0F, 8, 1, 9);
        rwing2.setRotationPoint(-3F, 6F, -3F);
        rwing2.setTextureSize(128, 64);
        rwing2.mirror = true;
        setRotation(rwing2, 0F, -0.1919862F, 0F);
        rwing3 = new ModelRenderer(this, 66, 15);
        rwing3.addBox(-25F, 0F, -5F, 14, 1, 10);
        rwing3.setRotationPoint(-3F, 6F, -3F);
        rwing3.setTextureSize(128, 64);
        rwing3.mirror = true;
        setRotation(rwing3, 0F, 0.2617994F, 0F);
        tail1 = new ModelRenderer(this, 48, 50);
        tail1.addBox(-3F, -2.5F, 0F, 6, 5, 6);
        tail1.setRotationPoint(0F, 7F, 4F);
        tail1.setTextureSize(128, 64);
        tail1.mirror = true;
        setRotation(tail1, 0F, 0F, 0F);
        tail2 = new ModelRenderer(this, 49, 40);
        tail2.addBox(-2F, -2F, 5F, 4, 4, 5);
        tail2.setRotationPoint(0F, 7F, 4F);
        tail2.setTextureSize(128, 64);
        tail2.mirror = true;
        setRotation(tail2, 0F, 0F, 0F);
        tail3 = new ModelRenderer(this, 68, 41);
        tail3.addBox(-1.5F, -1.5F, 9F, 3, 3, 4);
        tail3.setRotationPoint(0F, 7F, 4F);
        tail3.setTextureSize(128, 64);
        tail3.mirror = true;
        setRotation(tail3, 0F, 0F, 0F);
        tail4 = new ModelRenderer(this, 73, 52);
        tail4.addBox(-0.5F, -1F, 12F, 1, 2, 5);
        tail4.setRotationPoint(0F, 7F, 4F);
        tail4.setTextureSize(128, 64);
        tail4.mirror = true;
        setRotation(tail4, 0F, 0F, 0F);
        lhip = new ModelRenderer(this, 73, 28);
        lhip.addBox(-1.5F, 0F, -1.5F, 3, 5, 3);
        lhip.setRotationPoint(3F, 9F, 2F);
        lhip.setTextureSize(128, 64);
        lhip.mirror = true;
        setRotation(lhip, -0.2268928F, 0F, 0F);
        rhip = new ModelRenderer(this, 86, 28);
        rhip.addBox(-1.5F, 0F, -1.5F, 3, 5, 3);
        rhip.setRotationPoint(-3F, 9F, 2F);
        rhip.setTextureSize(128, 64);
        rhip.mirror = true;
        setRotation(rhip, -0.2268928F, 0F, 0F);
        rthigh = new ModelRenderer(this, 39, 1);
        rthigh.addBox(-1F, 2F, -4.5F, 2, 3, 2);
        rthigh.setRotationPoint(-3F, 9F, 2F);
        rthigh.setTextureSize(128, 64);
        rthigh.mirror = true;
        setRotation(rthigh, 0.7679449F, 0F, 0F);
        lthigh = new ModelRenderer(this, 99, 29);
        lthigh.addBox(-1F, 2F, -4.5F, 2, 3, 2);
        lthigh.setRotationPoint(3F, 9F, 2F);
        lthigh.setTextureSize(128, 64);
        lthigh.mirror = true;
        setRotation(lthigh, 0.7679449F, 0F, 0F);
        lfoot = new ModelRenderer(this, 56, 12);
        lfoot.addBox(-0.5F, 4.5F, 2F, 1, 4, 1);
        lfoot.setRotationPoint(3F, 9F, 2F);
        lfoot.setTextureSize(128, 64);
        lfoot.mirror = true;
        setRotation(lfoot, -0.3839724F, 0F, 0F);
        rfoot = new ModelRenderer(this, 61, 12);
        rfoot.addBox(-0.5F, 4.5F, 2F, 1, 4, 1);
        rfoot.setRotationPoint(-3F, 9F, 2F);
        rfoot.setTextureSize(128, 64);
        rfoot.mirror = true;
        setRotation(rfoot, -0.3839724F, 0F, 0F);
        hornything = new ModelRenderer(this, 49, 0);
        hornything.addBox(-1F, -0.9F, -4F, 2, 2, 2);
        hornything.setRotationPoint(0F, 7F, -5F);
        hornything.setTextureSize(128, 64);
        hornything.mirror = true;
        setRotation(hornything, -0.8028515F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(T entityIn, float par1, float par2, float par3, float par4, float par5) {
        head.rotateAngleX = par5 / 57.295776F;
        head.rotateAngleY = par4 / 57.295776F;
        snout.rotateAngleX = par5 / 57.295776F;
        snout.rotateAngleY = par4 / 57.295776F;
        lhorn1.rotateAngleX = (-0.646F + par5 / 57.295776F);
        lhorn1.rotateAngleY = par4 / 57.295776F;
        lhorn2.rotateAngleX = (-0.646F + par5 / 57.295776F);
        lhorn2.rotateAngleY = par4 / 57.295776F;
        rhorn1.rotateAngleX = (-0.646F + par5 / 57.295776F);
        rhorn1.rotateAngleY = par4 / 57.295776F;
        rhorn2.rotateAngleX = (-0.646F + par5 / 57.295776F);
        rhorn2.rotateAngleY = par4 / 57.295776F;
        chin.rotateAngleX = par5 / 57.295776F;
        chin.rotateAngleY = par4 / 57.295776F;
        hornything.rotateAngleX = par5 / 57.295776F;
        hornything.rotateAngleY = par4 / 57.295776F;
        //legs

        this.lhip.rotateAngleX = -0.227F + 1 * 1.4F * par2;
        this.lthigh.rotateAngleX = 0.768F + 1 * 1.4F * par2;
        this.lfoot.rotateAngleX = -0.384F + 1 * 1.4F * par2;
        this.rhip.rotateAngleX = -0.227F + 1 * 1.4F * par2;
        this.rthigh.rotateAngleX = 0.768F + 1 * 1.4F * par2;
        this.rfoot.rotateAngleX = -0.384F + 1 * 1.4F * par2;
        //wings
        this.rwing1.rotateAngleZ = MathHelper.cos(par3 * 0.3F) * (float) Math.PI * 0.30F;
        this.rwing2.rotateAngleZ = MathHelper.cos(par3 * 0.3F) * (float) Math.PI * 0.30F;
        this.rwing3.rotateAngleZ = MathHelper.cos(par3 * 0.3F) * (float) Math.PI * 0.30F;
        this.lwing1.rotateAngleZ = MathHelper.cos(par3 * 0.3F) * (float) Math.PI * -0.30F;
        this.lwing2.rotateAngleZ = MathHelper.cos(par3 * 0.3F) * (float) Math.PI * -0.30F;
        this.lwing3.rotateAngleZ = MathHelper.cos(par3 * 0.3F) * (float) Math.PI * -0.30F;
    }

    @Override
    public Iterable<ModelRenderer> getParts() {
        return ImmutableList.of(body, lwing1, head, lwing2, lwing3, lhorn1, rhorn1, snout, lhorn2, rhorn2, tummy, chin, rwing1, rwing2, rwing3, tail1,
                tail2, tail3, tail4, lhip, rhip, rthigh, lthigh, lfoot, rfoot, hornything);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
