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
                
                // If the target position has another piece of the same colour on it, return false
                if ((z.getX() == xPos && z.getY() == yPos) && this.isWhite ^ z.isWhite == false) {
                    return false;
                }
            }
            
            // Loops through the black pieces
            for (Piece z : chess.blackPlayer){
                
                // If the target position has another piece of the same colour on it, return false
                if ((z.getX() == xPos && z.getY() == yPos) && this.isWhite ^ z.isWhite == true) {
                    return false;
                }
            }
            return true;
        }
        return false;
    } 
}