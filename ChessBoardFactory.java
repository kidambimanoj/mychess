public class ChessBoardFactory {
  
   public ChessBoard create(boolean isWhite) {
      ChessBoard chessBoard = new ChessBoardImpl(isWhite); 
      return chessBoard; 
   }
}