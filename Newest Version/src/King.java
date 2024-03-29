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
    public boolean isLegalMove(Chess chess, int xPos, int yPos) {
        // If the target position is not a legal move then return false

        // set a 2 dimesional array for all possible king moves
        int[][] legalKingMoves = new int[][] {{-1, 1}, {-1, 0}, {-1, -1}, {0, 1}, {0, -1}, {1, 1}, {1, 0}, {1, -1}};
        
        //iterate throught the legalKingMoves array to check if the desired move is legal
        for (int[] w : legalKingMoves) {
            if ((this.getX() + w[0] == xPos) && (this.getY() + w[1] == yPos)) {
                
                // Loops through the white pieces
                for (Piece z : chess.whitePlayer){
                
                    // If the target position has another piece of the same colour on it, return false
                    if ((z.getX() == xPos && z.getY() == yPos) && this.getIsWhite()) {
                        return false;
                    }
                }
            
                // Loops through the black pieces
                for (Piece z : chess.blackPlayer){
                
                    // If the target position has another piece of the same colour on it, return false
                    if ((z.getX() == xPos && z.getY() == yPos) && !this.getIsWhite()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
