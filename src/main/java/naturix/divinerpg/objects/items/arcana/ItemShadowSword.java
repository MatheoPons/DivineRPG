package naturix.divinerpg.objects.items.arcana;

import java.util.List;

import javax.annotation.Nullable;

import naturix.divinerpg.capabilities.ArcanaProvider;
import naturix.divinerpg.capabilities.IArcana;
import naturix.divinerpg.objects.items.base.ItemModSword;
import naturix.divinerpg.registry.ModSounds;
import naturix.divinerpg.utils.TooltipHelper;
import naturix.divinerpg.utils.TooltipLocalizer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemShadowSword extends ItemModSword {

    public ItemShadowSword(String name, ToolMaterial mat) {
        super(mat, name);
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase hitter) {
		IArcana arcana = target.getCapability(ArcanaProvider.ARCANA_CAP, null);
    	        if(arcana.getArcana()>=12) {
    	target.playSound(ModSounds.SHADOW_SABER, 1, 1);
        hitter.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5 * 20, 1));
        arcana.consume(target, 12);
    	        }
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> list, ITooltipFlag flagIn)
    {	list.add(TooltipLocalizer.arcanaConsumed(12));
    	list.add(TooltipHelper.getInfoText("tooltip.shadow_saber"));
    }
}