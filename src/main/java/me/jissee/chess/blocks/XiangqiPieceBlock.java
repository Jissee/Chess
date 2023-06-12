package me.jissee.chess.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class XiangqiPieceBlock extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACEDAT = ModBlockState.VERTICAL_FACING;
    protected static final VoxelShape BOTTOM_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);
    public XiangqiPieceBlock(Properties p_57526_) {
        super(p_57526_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACEDAT, Direction.UP));
    }
    public VoxelShape getShape(BlockState p_57563_, BlockGetter p_57564_, BlockPos p_57565_, CollisionContext p_57566_) {
        return BOTTOM_AABB;
    }
    public InteractionResult use(BlockState p_57540_, Level p_57541_, BlockPos p_57542_, Player p_57543_, InteractionHand p_57544_, BlockHitResult p_57545_) {
        if(p_57540_.getValue(FACEDAT)==Direction.UP){
            p_57540_ = p_57540_.setValue(FACEDAT,Direction.DOWN);
        }else{
            p_57540_ = p_57540_.setValue(FACEDAT,Direction.UP);
        }
        p_57541_.setBlock(p_57542_, p_57540_, 2);
        this.playSound(p_57543_, p_57541_, p_57542_, p_57540_.getValue(FACEDAT) == Direction.UP);
        return InteractionResult.sidedSuccess(p_57541_.isClientSide);
    }

    @Override
    public void attack(BlockState p_60499_, Level p_60500_, BlockPos p_60501_, Player p_60502_) {
        if(!p_60500_.isClientSide()) {
            ItemStack stack = p_60502_.getMainHandItem();
            if(stack.getItem() instanceof PickaxeItem){
                p_60500_.destroyBlock(p_60501_, false);
                ItemStack newStack = new ItemStack(p_60499_.getBlock().asItem());
                p_60502_.getInventory().add(newStack);
            }
        }
    }


    protected void playSound(@Nullable Player p_57528_, Level p_57529_, BlockPos p_57530_, boolean p_57531_) {
        if (p_57531_) {
            p_57529_.playSound(p_57528_,p_57530_, SoundEvents.WOODEN_DOOR_CLOSE, SoundSource.BLOCKS, 1.0F, p_57529_.getRandom().nextFloat() * 0.1F + 0.9F);
        } else {
            p_57529_.playSound(p_57528_,p_57530_, SoundEvents.WOODEN_DOOR_OPEN, SoundSource.BLOCKS, 1.0F, p_57529_.getRandom().nextFloat() * 0.1F + 0.9F);
        }
        p_57529_.gameEvent(p_57528_, p_57531_ ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, p_57530_);
    }

    public BlockState getStateForPlacement(BlockPlaceContext p_57533_) {
        BlockState blockstate = this.defaultBlockState();
        Direction direction = p_57533_.getClickedFace();
        if (!p_57533_.replacingClickedOnBlock() && direction.getAxis().isHorizontal()) {
            blockstate = blockstate.setValue(FACING, direction);
        } else {
            blockstate = blockstate.setValue(FACING, p_57533_.getHorizontalDirection().getOpposite());
        }
        return blockstate;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_57561_) {
        p_57561_.add(FACING, FACEDAT);
    }

}
