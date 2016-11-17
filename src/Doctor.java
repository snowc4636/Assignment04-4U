/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class Doctor {
    private int row;
    private int col;
    
    public Doctor(int row, int col){
        
    }
    
    public void move(int newRow, int newCol){
        if (newRow == row || newRow == row + 1 || newRow == row - 1)&& (newCol == col || newCol == col + 1 || newCol == col - 1);
    }
        
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
    
}
