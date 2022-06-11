import java.util.List; 

public class ChessGameImpl implements ChessGame {
    
    private ChessBoardFactory chessBoardFactory; 
    
    public ChessGameImpl(ChessBoardFactory chessBoardFactory) {
        this.chessBoardFactory = chessBoardFactory;    
    }
    
    public void play() {
        // 1. create UserProfile. 
        ChessBoard chessBoard = createBoard(); 
    }
    
    private ChessBoard createBoard() {
         return chessBoardFactory.create();
    }
}
