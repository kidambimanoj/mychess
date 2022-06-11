import java.util.List; 

interface Stats {
    int getWins(); 
    int getRank(); 
    int getLosses(); 
    int numWhite();
    int numBlack(); 
}
    
interface UserProfile {
    Stats getStats(); 
    String getName(); 
}

public class ChessGameImpl implements ChessGame {
    public void play() {
        // 1. create UserProfile. 
        // 2. create Board. 
        
    }
    
    public ChessBoard createBoard() {
         
    }
}
