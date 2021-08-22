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
        
        //iterate throught the legalKnightMoves array to check if the desired move is legal
        for (int[] z : legalKnightMoves) {
            if ((x + z[0] == xPos) && (y + z[1] == yPos)) {
                return true;
            }
        }
        return false;
    } 
}
