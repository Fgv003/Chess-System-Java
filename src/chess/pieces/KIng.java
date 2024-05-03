package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;


public class KIng extends ChessPiece{
    
    public KIng(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "K";
    }
    
}
