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
public class Knight extends Piece {
    
    // Constructor
    public Knight (int x, int y, boolean isWhite, ImageIcon image) {
        
        // Calls parent constructor, passes in variables
        super(x, y, isWhite, image);
    }
    
    @Override
    public boolean isLegalMove(Chess1 chess, int xPos, int yPos) { 
        // If the target position is not a legal move then return false

        // set a 2 dimesional array for all possible knight moves
        int[][] legalKnightMoves = new int[][] {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
        boolean legalKnight = false;
        
        //iterate throught the legalKnightMoves array to check if the desired move is legal
        for (int[] z : legalKnightMoves) {
            if ((x + z[0] == xPos) && (y + z[1] == yPos)) {
                legalKnight = true;
            }
        }
        
        // Loops through the white pieces
        for (Piece z : chess.whitePlayer){
                
            // If the target position has another piece of the same colour on it, return false
            if ((z.getX() == xPos && z.getY() == yPos) && this.isWhite ^ z.isWhite == false && legalKnight == true) {
                return false;
            }
        }
        //****************************white can only capture balck and not white when the black loop isn't ran and vice versa***************************
        // to fix this issue i think a counter to diferentiate whos turn it is would work becuase then only the loop for the colour whos turn it is is being run
        /* for that reason this black loop is commented out so that white works 100%
        // Loops through the black pieces
        for (Piece z : chess.blackPlayer){
               
            // If the target position has another piece of the same colour on it, return false
            if ((z.getX() == xPos && z.getY() == yPos) && this.isWhite ^ z.isWhite == false) {
                return false;
            }
        }*/
        return false;
    } 
}
