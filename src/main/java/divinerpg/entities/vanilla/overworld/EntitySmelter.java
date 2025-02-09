package divinerpg.entities.vanilla.overworld;

import divinerpg.entities.IAttackTimer;
import divinerpg.entities.base.EntityDivineTameable;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import net.minecraft.network.syncher.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.*;

public class EntitySmelter extends EntityDivineTameable implements IAttackTimer {
    private static final EntityDataAccessor<Integer> ATTACK_TIMER = SynchedEntityData.defineId(EntitySmelter.class, EntityDataSerializers.INT);
    public EntitySmelter(EntityType<? extends TamableAnimal> type, Level worldIn) {
        super(type, worldIn, 1F);
    }

    protected EntitySmelter(EntityType<? extends TamableAnimal> type, Level worldIn, Player player) {
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
        entityData.define(ATTACK_TIMER, 0);
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
    	return item.is(Items.FLINT);
    }
    @Override
    protected boolean isTamingFood(ItemStack item) {
    	return item.is(Items.FLINT);
    }
    @Override
    public boolean doHurtTarget(Entity entity) {
        boolean attack = super.doHurtTarget(entity);
        if (attack) {
            entity.setDeltaMovement(-Mth.sin(xRot * (float) Math.PI / 180.0F), 0.1D,
                    Mth.cos(xRot * (float) Math.PI / 180.0F));
            entity.setSecondsOnFire(5);
            entityData.set(ATTACK_TIMER, 10);
        }
        return attack;
    }

}