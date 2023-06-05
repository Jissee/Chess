package me.jissee.chess.blocks;

import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.Direction;

public class ModBlockState {
    public static final BooleanProperty FACEDAT = BooleanProperty.of("faceat");
    public static final DirectionProperty VERTICAL_FACING = DirectionProperty.of("facedat", Direction.Type.VERTICAL);
}
