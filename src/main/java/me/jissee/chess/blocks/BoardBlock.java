package me.jissee.chess.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BoardBlock extends HorizontalFacingBlock {
    public BoardBlock(Settings settings) {
        super(settings);
    }
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.PUSH_ONLY;
    }
    @Override
    public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        if(!world.isClient()){
            ItemStack stack = player.getMainHandStack();
            if(stack.getItem() instanceof AxeItem){
                world.removeBlock(pos, false);
                ItemStack newStack = new ItemStack(state.getBlock().asItem());
                player.getInventory().insertStack(newStack);
            }
        }
    }
}
