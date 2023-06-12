package me.jissee.chess.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class BWPieceBlock extends Block {
    private static final VoxelShape SHAPE = Block.createCuboidShape(5d,0d,5d,11d,1d,11d);
    public BWPieceBlock(Settings p_57526_) {
        super(p_57526_);
    }
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context){
        return SHAPE;
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
}
