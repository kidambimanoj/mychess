import java.util.List; 

interface ChessBoard {
    List<Piece> capturedPieces(boolean isWhite);
    boolean move(boolean isWhite, Piece piece, Square from, Square to); 
}