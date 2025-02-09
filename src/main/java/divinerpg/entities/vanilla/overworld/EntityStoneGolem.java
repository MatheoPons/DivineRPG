package divinerpg.entities.vanilla.overworld;

import divinerpg.entities.IAttackTimer;
import divinerpg.entities.base.EntityDivineTameable;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.tags.*;
import net.minecraft.util.*;
import net.minecraft.world.level.Level;

import net.minecraft.network.syncher.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;

public class EntityStoneGolem extends EntityDivineTameable implements IAttackTimer {
    private static final EntityDataAccessor<Integer> ATTACK_TIMER = SynchedEntityData.defineId(EntityStoneGolem.class, EntityDataSerializers.INT);
    public EntityStoneGolem(EntityType<? extends TamableAnimal> type, Level worldIn) {
        super(type, worldIn, 1F);
    }
    protected EntityStoneGolem(EntityType<? extends TamableAnimal> type, Level worldIn, Player player) {
        super(type, worldIn, 1F);
        tame(player);
    }
    @Override
    protected float getStandingEyeHeight(Pose poseIn, EntityDimensions sizeIn) {
        return 3.2F;
    }
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        entityData.define(ATTACK_TIMER, Integer.valueOf(0));
    }
    @Override
    public void tick() {
        super.tick();
        if(getAttackTimer() > 0) entityData.set(ATTACK_TIMER, Integer.valueOf(getAttackTimer() - 1));
    }
    @Override
    public int getAttackTimer() {
        return entityData.get(ATTACK_TIMER).intValue();
    }
    @Override
    public boolean isFood(ItemStack item) {
    	return item.is(ItemTags.STONE_CRAFTING_MATERIALS);
    }
    @Override
    protected boolean isTamingFood(ItemStack item) {
    	return item.is(ItemTags.STONE_CRAFTING_MATERIALS);
    }
    @Override
    public boolean doHurtTarget(Entity entity) {
        boolean attack = super.doHurtTarget(entity);
        if(attack) {
            entity.setDeltaMovement(-Mth.sin(xRot * (float) Math.PI / 180F), .1, Mth.cos(xRot * (float) Math.PI / 180F));
            entityData.set(ATTACK_TIMER, Integer.valueOf(10));
        }
        return attack;
    }

}