public class PieceImpl implements Piece {
    
    private PieceType pieceType; 
    private Square square; 
    private boolean isWhite; 
    
    public PieceImpl(Square square, PieceType pieceType, boolean isWhite) {
      this.isWhite = isWhite;
      this.square = square; 
      this.pieceType = pieceType; 
    }
    
    public Square getSquare() {
       return square; 
    }
    
    public boolean isWhite() {
        return isWhite;
    }
    
    public boolean isCaptured() {
        return false; 
    } 
    
    public boolean isPlayer() {   
        return false; 
    }
}
