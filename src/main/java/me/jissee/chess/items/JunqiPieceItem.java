package me.jissee.chess.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class JunqiPieceItem extends BlockItem {
    private final int PIECELEVEL;

    public JunqiPieceItem(Block p_40565_, Properties p_40566_, int pieceLevel) {
        super(p_40565_, p_40566_);
        PIECELEVEL = pieceLevel;
    }

    public int getPieceLevel() {
        return PIECELEVEL;
    }
}
