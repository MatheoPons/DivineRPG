package divinerpg.blocks.vanilla;

import net.minecraft.core.*;
import net.minecraft.sounds.*;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.*;
import net.minecraft.world.phys.BlockHitResult;

import java.util.function.Supplier;

public class BlockMobPumpkin extends HorizontalDirectionalBlock {
    private final Supplier<SoundEvent> sound;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public BlockMobPumpkin(Supplier<SoundEvent> sound, MapColor color) {
        super(Block.Properties.of().strength(1.0F).pushReaction(PushReaction.DESTROY).sound(SoundType.WOOD).mapColor(color));
        this.sound = sound;
        registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        if ((player.isCrouching() && !player.getItemInHand(handIn).isEmpty()) || sound == null) {
            return InteractionResult.PASS;
        }
        worldIn.playSound(player, pos, sound.get(), SoundSource.BLOCKS, 3.0F, 1.0F);
        return InteractionResult.SUCCESS;
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
