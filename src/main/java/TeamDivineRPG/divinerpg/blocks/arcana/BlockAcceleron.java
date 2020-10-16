package TeamDivineRPG.divinerpg.blocks.arcana;

import TeamDivineRPG.divinerpg.blocks.base.BlockMod;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.*;

public class BlockAcceleron extends BlockMod {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    @Deprecated
    public BlockAcceleron(String name) {
        super(name, Block.Properties.create(Material.ROCK, MaterialColor.STONE)
                .func_235861_h_()
                .hardnessAndResistance(3.0F, 3.0F)
                .sound(SoundType.WOOD)
                .slipperiness(1.2F));
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}