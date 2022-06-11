import java.util.List; 

interface ChessBoard {
    List<Piece> takenPieces(boolean isWhite);
    boolean move(boolean isWhite, Piece piece, Square from, Square to); 
}