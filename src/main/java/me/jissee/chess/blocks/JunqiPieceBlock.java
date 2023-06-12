package me.jissee.chess.blocks;

import me.jissee.chess.items.JunqiPieceItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class JunqiPieceBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACEDAT = ModBlockState.VERTICAL_FACING;
    private final int PIECELEVEL;
    //fromx fromy fromz tox toy toz
    protected static final VoxelShape NORTH_SOUTH_AABB = Block.createCuboidShape(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape EAST_WEST_AABB = Block.createCuboidShape(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape BOTTOM_AABB = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D);


    public JunqiPieceBlock(Settings settings, int pieceLevel) {
        super(settings);
        PIECELEVEL = pieceLevel;
        this.setDefaultState(((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)).with(FACEDAT, Direction.UP)));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if(state.get(FACEDAT) == Direction.DOWN){
            return BOTTOM_AABB;
        }else if(state.get(FACEDAT) == Direction.UP){
            switch (state.get(FACING)){
                case SOUTH, NORTH -> {
                    return NORTH_SOUTH_AABB;
                }
                case WEST, EAST -> {
                    return EAST_WEST_AABB;
                }
            }
        }
        return VoxelShapes.fullCube();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACEDAT);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(world.isClient()){
            return ActionResult.success(world.isClient);
        }
        ItemStack itemStack = player.getStackInHand(hand);
        BlockState blockState = world.getBlockState(pos);
        if(blockState.getBlock() instanceof JunqiPieceBlock junqiPieceBlock){
            if(itemStack.getItem() instanceof JunqiPieceItem junqiPieceItem){

                int targetPieceLevel = junqiPieceBlock.getPieceLevel();//目标棋子（在地上的）
                int thisPieceLevel = junqiPieceItem.getPieceLevel();//手中的棋子

                int compareResult = compare(targetPieceLevel,thisPieceLevel);

                if(compareResult > 0){
                    player.getInventory().removeOne(itemStack);//掉落物品
                    player.dropItem(itemStack,false,false);
                }else if(compareResult == 0){
                    player.getInventory().removeOne(itemStack);//掉落两者
                    player.dropItem(itemStack,false,false);
                    world.removeBlock(pos,false);
                    ItemStack newStack = new ItemStack(junqiPieceBlock.asItem());
                    player.dropItem(newStack,false,false);
                }else{
                    world.removeBlock(pos,false);//掉落方块
                    ItemStack newStack = new ItemStack(junqiPieceBlock.asItem());
                    player.dropItem(newStack,false,false);
                }

            }else{
                if(state.get(FACEDAT)==Direction.UP){
                    state = state.with(FACEDAT,Direction.DOWN);
                }else{
                    state = state.with(FACEDAT,Direction.UP);
                }
                world.setBlockState(pos, state, 2);
                this.playToggleSound(player, world, pos, state.get(FACEDAT) == Direction.UP);
            }
        }
        return ActionResult.SUCCESS;
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

    protected void playToggleSound(@Nullable PlayerEntity player, World world, BlockPos pos, boolean open) {
        if (open) {
            world.playSound(player,pos, SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundCategory.BLOCKS, 1.0F, world.getRandom().nextFloat()  * 0.1F + 0.9F);
        } else {
            world.playSound(player,pos, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundCategory.BLOCKS, 1.0F, world.getRandom().nextFloat()  * 0.1F + 0.9F);
        }
        world.emitGameEvent(player, open ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
    }

    @Override
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


    public int getPieceLevel() {
        return PIECELEVEL;
    }
}
