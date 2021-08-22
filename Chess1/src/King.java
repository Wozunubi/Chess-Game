/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Importing library for ImageIcon
import javax.swing.ImageIcon;

/**
 *
 * @author ahhhhhhhh
 */
public class King extends Piece {
    
    // Constructor
    public King (int x, int y, boolean isWhite, ImageIcon image) {
        
        // Calls parent constructor, passes in variables
        super(x, y, isWhite, image);
    }
    
    @Override
    public boolean isLegalMove(Chess1 chess, int xPos, int yPos) {
        // If the target position is not a legal move then return false

        /*
        // set a 2 dimesional array for all possible king moves
        int[][] legalKingMoves = new int[][] {{-1, 1}, {-1, 0}, {-1, -1}, {0, 1}, {0, -1}, {1, 1}, {1, 0}, {1, -1}};
        
        //iterate throught the legalKingMoves array to check if the desired move is legal
        for (int[] z : legalKingMoves) {
            if ((x + z[0] == xPos) && (y + z[1] == yPos)) {
        */
        
        //could be set as an array that is iterated through but this still works
        if ((x - xPos == -1 && y - yPos == 1) ||
            (x - xPos == -1 && y - yPos == 0) ||
            (x - xPos == -1 && y - yPos == -1) ||
            (x - xPos == 0 && y - yPos == 1) ||
            (x - xPos == 0 && y - yPos == -1) ||
            (x - xPos == 1 && y - yPos == 1) ||
            (x - xPos == 1 && y - yPos == 0) ||
            (x - xPos == 1 && y - yPos == -1)) {
            
            // Loops through the white pieces
            for (Piece z : chess.whitePlayer){
                
                // If the target position has another piece of the same solour on it, return false
                if ((z.getX() == xPos && z.getY() == yPos) && this.isWhite ^ z.isWhite == false) {
                    return false;
                }
            }
            //****************************white can only capture when the black loop isnt run and vice versa***************************
            /*
            // Loops through the black pieces
            for (Piece z : chess.blackPlayer){
                
                // If the target position has another piece of the same solour on it, return false
                if ((z.getX() == xPos && z.getY() == yPos) && this.isWhite ^ z.isWhite == false) {
                    return false;
                }
            }*/
            
            /*
            // Loops through the white pieces to check if move is legal
            for (Piece z : chess.whitePlayer){
                if ((z.x == xPos && z.y == yPos) && !isOccupied && z.isWhite) { // illegal if occupied by white
                    return false;
                }
                if ((z.x == xPos && z.y == yPos) && isOccupied && !z.isWhite) { // capture if space is occupied by black
                    return true;
                }
            }
            
            // Loops through the black pieces
            for (Piece z : chess.blackPlayer){
                if ((z.x == xPos && z.y == yPos) && !isOccupied) { // illegal if occupied by black
                    return false;
                }
                if ((z.x == xPos && z.y == yPos) && isOccupied && z.isWhite) { // capture if space is occupied by white
                    return true;
                }
            }*/
            return true;
        }
        return false;
    } 
}
