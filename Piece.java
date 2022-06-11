public interface Piece {
    Square getSquare(); 
    boolean isWhite(); 
    boolean isCaptured(); 
    boolean isPlayer(); 
}