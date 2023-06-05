package me.jissee.chess.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class XiangqiPieceBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACEDAT = ModBlockState.VERTICAL_FACING;
    protected static final VoxelShape BOTTOM_AABB = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
    public XiangqiPieceBlock(Settings settings) {
        super(settings);
        this.setDefaultState(((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)).with(FACEDAT, Direction.UP)));
    }
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return BOTTOM_AABB;
    }
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(state.get(FACEDAT)==Direction.UP){
            state = state.with(FACEDAT,Direction.DOWN);
        }else{
            state = state.with(FACEDAT,Direction.UP);
        }
        world.setBlockState(pos, state, 2);
        this.playToggleSound(player, world, pos, state.get(FACEDAT) == Direction.UP);
        return ActionResult.success(world.isClient);
    }
    @Override
    public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        if(!world.isClient()){
            ItemStack stack = player.getMainHandStack();
            if(stack.getItem() instanceof PickaxeItem){
                world.removeBlock(pos, false);
                ItemStack newStack = new ItemStack(state.getBlock().asItem());
                player.getInventory().insertStack(newStack);
            }
        }
    }
    protected void playToggleSound(@Nullable PlayerEntity player, World world, BlockPos pos, boolean open) {
        int i;
        if (open) {
            i = this.material == Material.METAL ? 1037 : 1007;
            world.syncWorldEvent(player, i, pos, 0);
        } else {
            i = this.material == Material.METAL ? 1036 : 1013;
            world.syncWorldEvent(player, i, pos, 0);
        }

        world.emitGameEvent(player, open ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = this.getDefaultState();
        Direction direction = ctx.getSide();
        if (!ctx.canReplaceExisting() && direction.getAxis().isHorizontal()) {
            blockState = blockState.with(FACING, direction);
        } else {
            blockState = blockState.with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
        }
        return blockState;
    }
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACEDAT);
    }

}
