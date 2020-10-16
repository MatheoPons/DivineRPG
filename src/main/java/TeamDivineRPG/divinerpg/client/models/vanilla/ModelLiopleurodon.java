package TeamDivineRPG.divinerpg.client.models.vanilla;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ModelLiopleurodon<T extends Entity> extends SegmentedModel<T> {
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer tooth1;
    ModelRenderer tooth2;
    ModelRenderer tooth3;
    ModelRenderer tooth4;
    ModelRenderer tooth5;
    ModelRenderer tooth6;
    ModelRenderer tail1;
    ModelRenderer body;
    ModelRenderer tail2;
    ModelRenderer front;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer jawTop;
    ModelRenderer jawBottom;
    ModelRenderer fin3A;
    ModelRenderer fin3B;
    ModelRenderer fin4B;
    ModelRenderer fin4A;
    ModelRenderer fin1A;
    ModelRenderer fin1B;
    ModelRenderer fin2B;
    ModelRenderer fin2A;

    public ModelLiopleurodon() {
        textureWidth = 80;
        textureHeight = 80;

        tail3 = new ModelRenderer(this, 5, 33);
        tail3.addBox(0F, 0F, 0F, 6, 6, 9);
        tail3.setRotationPoint(-3F, 13F, -41F);
        tail3.setTextureSize(80, 80);
        tail3.mirror = true;
        setRotation(tail3, 0F, 0F, 0F);
        tail4 = new ModelRenderer(this, 8, 30);
        tail4.addBox(0F, 0F, 0F, 4, 4, 7);
        tail4.setRotationPoint(-2F, 14F, -47F);
        tail4.setTextureSize(80, 80);
        tail4.mirror = true;
        setRotation(tail4, 0F, 0F, 0F);
        tooth1 = new ModelRenderer(this, 0, 77);
        tooth1.addBox(0F, 0F, 0F, 1, 1, 2);
        tooth1.setRotationPoint(3F, 14F, 46F);
        tooth1.setTextureSize(80, 80);
        tooth1.mirror = true;
        setRotation(tooth1, 0F, 0F, 0F);
        tooth2 = new ModelRenderer(this, 0, 77);
        tooth2.addBox(0F, 0F, 0F, 1, 1, 2);
        tooth2.setRotationPoint(3F, 14F, 49F);
        tooth2.setTextureSize(80, 80);
        tooth2.mirror = true;
        setRotation(tooth2, 0F, 0F, 0F);
        tooth3 = new ModelRenderer(this, 0, 77);
        tooth3.addBox(0F, 0F, 0F, 1, 1, 2);
        tooth3.setRotationPoint(3F, 14F, 52F);
        tooth3.setTextureSize(80, 80);
        tooth3.mirror = true;
        setRotation(tooth3, 0F, 0F, 0F);
        tooth4 = new ModelRenderer(this, 0, 77);
        tooth4.addBox(0F, 0F, 0F, 1, 1, 2);
        tooth4.setRotationPoint(-4F, 14F, 46F);
        tooth4.setTextureSize(80, 80);
        tooth4.mirror = true;
        setRotation(tooth4, 0F, 0F, 0F);
        tooth5 = new ModelRenderer(this, 0, 77);
        tooth5.addBox(0F, 0F, 0F, 1, 1, 2);
        tooth5.setRotationPoint(-4F, 14F, 49F);
        tooth5.setTextureSize(80, 80);
        tooth5.mirror = true;
        setRotation(tooth5, 0F, 0F, 0F);
        tooth6 = new ModelRenderer(this, 0, 77);
        tooth6.addBox(0F, 0F, 0F, 1, 1, 2);
        tooth6.setRotationPoint(-4F, 14F, 52F);
        tooth6.setTextureSize(80, 80);
        tooth6.mirror = true;
        setRotation(tooth6, 0F, 0F, 0F);
        tail1 = new ModelRenderer(this, 17, 14);
        tail1.addBox(-4F, -5F, -26F, 12, 11, 14);
        tail1.setRotationPoint(-2F, 15F, 0F);
        tail1.setTextureSize(80, 80);
        tail1.mirror = true;
        setRotation(tail1, 0F, 0F, 0F);
        body = new ModelRenderer(this, 5, 6);
        body.addBox(-7F, -17F, -12F, 16, 28, 15);
        body.setRotationPoint(-1F, 11F, 3F);
        body.setTextureSize(80, 80);
        body.mirror = true;
        setRotation(body, 1.570796F, 0F, 0F);
        tail2 = new ModelRenderer(this, 31, 9);
        tail2.addBox(0F, 0F, 0F, 8, 8, 11);
        tail2.setRotationPoint(-4F, 12F, -33F);
        tail2.setTextureSize(80, 80);
        tail2.mirror = true;
        setRotation(tail2, 0F, 0F, 0F);
        front = new ModelRenderer(this, 6, 22);
        front.addBox(0F, 0F, 0F, 12, 10, 14);
        front.setRotationPoint(-6F, 9F, 11F);
        front.setTextureSize(80, 80);
        front.mirror = true;
        setRotation(front, 0F, 0F, 0F);
        neck = new ModelRenderer(this, 21, 7);
        neck.addBox(0F, 0F, 0F, 10, 7, 13);
        neck.setRotationPoint(-5F, 10F, 21F);
        neck.setTextureSize(80, 80);
        neck.mirror = true;
        setRotation(neck, 0F, 0F, 0F);
        head = new ModelRenderer(this, 8, 39);
        head.addBox(0F, 0F, 0F, 12, 9, 13);
        head.setRotationPoint(-6F, 9F, 31F);
        head.setTextureSize(80, 80);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        jawTop = new ModelRenderer(this, 0, 0);
        jawTop.addBox(0F, 0F, 0F, 10, 2, 13);
        jawTop.setRotationPoint(-5F, 11F, 42.26667F);
        jawTop.setTextureSize(80, 80);
        jawTop.mirror = true;
        setRotation(jawTop, 0F, 0F, 0F);
        jawBottom = new ModelRenderer(this, 0, 0);
        jawBottom.addBox(0F, 0F, 0F, 10, 2, 13);
        jawBottom.setRotationPoint(-5F, 15F, 42F);
        jawBottom.setTextureSize(80, 80);
        jawBottom.mirror = true;
        setRotation(jawBottom, 0F, 0F, 0F);
        fin3A = new ModelRenderer(this, 5, 6);
        fin3A.addBox(-18F, 0F, 0F, 18, 10, 3);
        fin3A.setRotationPoint(-5F, 19F, 6F);
        fin3A.setTextureSize(80, 80);
        fin3A.mirror = true;
        setRotation(fin3A, 1.570796F, 0F, 0F);
        fin3B = new ModelRenderer(this, 5, 6);
        fin3B.addBox(-22F, 1F, 0F, 8, 8, 2);
        fin3B.setRotationPoint(-5F, 19F, 6F);
        fin3B.setTextureSize(80, 80);
        fin3B.mirror = true;
        setRotation(fin3B, 1.570796F, 0F, 0F);
        fin4B = new ModelRenderer(this, 5, 6);
        fin4B.addBox(-22F, 1F, 0F, 8, 8, 2);
        fin4B.setRotationPoint(-5F, 19F, -15F);
        fin4B.setTextureSize(80, 80);
        fin4B.mirror = true;
        setRotation(fin4B, 1.570796F, 0F, 0F);
        fin4A = new ModelRenderer(this, 5, 6);
        fin4A.addBox(-18F, 0F, 0F, 18, 10, 3);
        fin4A.setRotationPoint(-5F, 19F, -15F);
        fin4A.setTextureSize(80, 80);
        fin4A.mirror = true;
        setRotation(fin4A, 1.570796F, 0F, 0F);
        fin1A = new ModelRenderer(this, 5, 6);
        fin1A.addBox(0F, 0F, 0F, 18, 10, 3);
        fin1A.setRotationPoint(5F, 18F, 6F);
        fin1A.setTextureSize(80, 80);
        fin1A.mirror = true;
        setRotation(fin1A, 1.570796F, 0F, 0F);
        fin1B = new ModelRenderer(this, 5, 6);
        fin1B.addBox(14F, 1F, 0F, 8, 8, 2);
        fin1B.setRotationPoint(5F, 18F, 6F);
        fin1B.setTextureSize(80, 80);
        fin1B.mirror = true;
        setRotation(fin1B, 1.570796F, 0F, 0F);
        fin2B = new ModelRenderer(this, 5, 6);
        fin2B.addBox(14F, 1F, 0F, 8, 8, 2);
        fin2B.setRotationPoint(5F, 19F, -15F);
        fin2B.setTextureSize(80, 80);
        fin2B.mirror = true;
        setRotation(fin2B, 1.570796F, 0F, 0F);
        fin2A = new ModelRenderer(this, 5, 6);
        fin2A.addBox(0F, 0F, 0F, 18, 10, 3);
        fin2A.setRotationPoint(5F, 19F, -15F);
        fin2A.setTextureSize(80, 80);
        fin2A.mirror = true;
        setRotation(fin2A, 1.570796F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(T entityIn, float f, float f1, float f2, float netHeadYaw, float headPitch) {

        this.fin1A.rotateAngleZ = this.fin1B.rotateAngleZ = this.fin4A.rotateAngleZ = this.fin4B.rotateAngleZ = MathHelper.sin((10 * f2 / (180f / (float) Math.PI))) * 0.3f;
        this.fin2A.rotateAngleZ = this.fin2B.rotateAngleZ = this.fin3A.rotateAngleZ = this.fin3B.rotateAngleZ = -MathHelper.sin((10 * f2 / (180f / (float) Math.PI))) * 0.3f;
    }

    @Override
    public Iterable<ModelRenderer> getParts() {
        return ImmutableList.of(tail3, tail4, tooth1, tooth2, tooth3, tooth4, tooth5, tooth6, tail1, body, tail2, front, neck, head, jawTop, jawBottom,
                fin3A, fin3B, fin4B, fin4A, fin1A, fin1B, fin2B, fin2A);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }


}
