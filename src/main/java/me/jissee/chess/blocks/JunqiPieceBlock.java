package me.jissee.chess.blocks;

import me.jissee.chess.items.JunqiPieceItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class JunqiPieceBlock extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACEDAT = ModBlockState.VERTICAL_FACING;
    private final int PIECELEVEL;
    //fromx fromy fromz tox toy toz
    protected static final VoxelShape NORTH_SOUTH_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
     protected static final VoxelShape EAST_WEST_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape BOTTOM_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);


    public JunqiPieceBlock(Properties p_54120_, int pieceLevel) {
        super(p_54120_);
        this.PIECELEVEL = pieceLevel;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACEDAT, Direction.UP));
    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        if(p_60555_.getValue(FACEDAT) == Direction.DOWN){
            return BOTTOM_AABB;
        }else if(p_60555_.getValue(FACEDAT) == Direction.UP){
            switch (p_60555_.getValue(FACING)){
                case SOUTH, NORTH -> {
                    return NORTH_SOUTH_AABB;
                }
                case WEST, EAST -> {
                    return EAST_WEST_AABB;
                }
            }
        }
        return Shapes.block();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_57561_) {
        p_57561_.add(FACING, FACEDAT);
    }

    @Override
    public InteractionResult use(BlockState p_57540_, Level p_57541_, BlockPos p_57542_, Player p_57543_, InteractionHand p_57544_, BlockHitResult p_57545_){
        if(p_57541_.isClientSide()){
            return InteractionResult.sidedSuccess(p_57541_.isClientSide);
        }
        ItemStack itemStack = p_57543_.getItemInHand(p_57544_);
        BlockState blockState = p_57541_.getBlockState(p_57542_);
        if(blockState.getBlock() instanceof JunqiPieceBlock junqiPieceBlock){
            if(itemStack.getItem() instanceof JunqiPieceItem junqiPieceItem){

                int targetPieceLevel = junqiPieceBlock.getPieceLevel();//目标棋子（在地上的）
                int thisPieceLevel = junqiPieceItem.getPieceLevel();//手中的棋子

                int compareResult = compare(targetPieceLevel,thisPieceLevel);

                if(compareResult > 0){
                    p_57543_.getInventory().removeItem(itemStack);//掉落物品
                    p_57543_.drop(itemStack,false,false);
                }else if(compareResult == 0){
                    p_57543_.getInventory().removeItem(itemStack);//掉落两者
                    p_57543_.drop(itemStack,false,false);
                    p_57541_.destroyBlock(p_57542_,false);
                    ItemStack newStack = new ItemStack(junqiPieceBlock.asItem());
                    p_57543_.drop(newStack,false,false);
                }else{
                    p_57541_.destroyBlock(p_57542_,false);//掉落方块
                    ItemStack newStack = new ItemStack(junqiPieceBlock.asItem());
                    p_57543_.drop(newStack,false,false);
                }

            }else{
                    if(p_57540_.getValue(FACEDAT)==Direction.UP){
                        p_57540_ = p_57540_.setValue(FACEDAT,Direction.DOWN);
                    }else{
                        p_57540_ = p_57540_.setValue(FACEDAT,Direction.UP);
                    }
                    p_57541_.setBlock(p_57542_, p_57540_, 2);
                    this.playSound(p_57543_, p_57541_, p_57542_, p_57540_.getValue(FACEDAT) == Direction.UP);
            }
        }
        return InteractionResult.SUCCESS;
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

    private int compare(int targetPieceLevel, int thisPieceLevel){
        if(targetPieceLevel == 10 || thisPieceLevel == 10){
            return 0;
        }
        if(targetPieceLevel == 11 && thisPieceLevel == 1){
            return -1;
        }
        if(targetPieceLevel == 11){
            return 0;
        }
        return targetPieceLevel - thisPieceLevel;
    }

    protected void playSound(@Nullable Player p_57528_, Level p_57529_, BlockPos p_57530_, boolean p_57531_) {
        if (p_57531_) {
            int i = this.material == Material.METAL ? 1037 : 1007;
            p_57529_.levelEvent(p_57528_, i, p_57530_, 0);
        } else {
            int j = this.material == Material.METAL ? 1036 : 1013;
            p_57529_.levelEvent(p_57528_, j, p_57530_, 0);
        }

        p_57529_.gameEvent(p_57528_, p_57531_ ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, p_57530_);
    }

    @Override
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


    public int getPieceLevel() {
        return PIECELEVEL;
    }
}
