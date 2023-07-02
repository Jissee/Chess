package me.jissee.chess.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class JunqiPieceItem extends BlockItem {
    private final int PIECELEVEL;

    public JunqiPieceItem(Block block, Settings settings, int pieceLevel) {
        super(block, settings);
        PIECELEVEL = pieceLevel;
    }

    public int getPieceLevel() {
        return PIECELEVEL;
    }
}
