package me.jissee.chess.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BWPieceBlock extends Block {
    private static final VoxelShape SHAPE = Block.box(5d,0d,5d,11d,1d,11d);
    public BWPieceBlock(Properties p_57526_) {
        super(p_57526_);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_60809_, BlockPos p_60810_, CollisionContext context){
        return SHAPE;
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
}
