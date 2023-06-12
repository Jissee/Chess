package me.jissee.chess.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

public class ModBlockState {
    //public static final BooleanProperty FACEDAT = BooleanProperty.create("facedat");
    public static final DirectionProperty VERTICAL_FACING = DirectionProperty.create("facedat", Direction.Plane.VERTICAL);


}
