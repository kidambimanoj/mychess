public class Square {
    private Row row;
    private int col;
    
    Square(Row row, int col){
        this.row = row; 
        this.col = col; 
    }
    
    public Row getRow() {
        return row; 
    }
    
    public int getColumn() {
        return col; 
    }
}