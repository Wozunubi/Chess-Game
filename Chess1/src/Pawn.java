/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Importing library for ImageIcon
import javax.swing.ImageIcon;

/**
 *
 * @author Joanna He
 */
public class Pawn extends Piece {
    
    // Constructor
    public Pawn (int x, int y, boolean isWhite, ImageIcon image) {
        
        // Calls parent constructor, passes in variables
        super(x, y, isWhite, image);		
    }
    
    @Override
    public boolean isLegalMove(Chess1 chess, int xPos, int yPos) {
		
        boolean isOccupied = false; // Declares a variable to see if a position is occupied
        boolean isBlocked = false; // Declares a variable to see if a position is being blocked on the first move
		
        // Loops through the white pieces
        for (Piece z : chess.whitePlayer){
            
            // If the target position has another piece on it, set isOccupied to true
            if (z.x == xPos && z.y == yPos) {
                isOccupied = true;
            }
            
            // If the target position has another piece blocking it, set isBlocked to true
            if (this.x == xPos && 
                this.x == z.x &&
                this.y == 2 &&				
                z.y == 3 &&
                yPos == 4 ) {
                
                isBlocked = true;
            }
        }

        // Loops through the black pieces
        for (Piece z : chess.blackPlayer){
            
            // If the target position has another piece on it, set isOccupied to true
            if (z.x == xPos && z.y == yPos) {
                isOccupied = true;
            }
            
            // If the target position has another piece blocking it, set isBlocked to true
            if (this.x == xPos &&
                this.x == z.x &&
                this.y == 7 &&
                z.y == 6 &&
                yPos == 5) {
                
                isBlocked = true;
            }
        }
		
        // Loops through the white pieces
        for (Piece z : chess.whitePlayer) {
            
            // If the pawn has not made its first move yet
            if ((this.x == xPos && this.y == 2) && 
                (yPos == 3 || yPos == 4) && // and the target position is either 1 or 2 spaces forward
                !isOccupied && !isBlocked) { // and the target position is not being occupied and not being blocked
                
                return true; // Returns legal move as true 			
            }
            
            // If the pawn already made its first move
            if (this.x == xPos && this.y > 2 &&
                (yPos - this.y) == 1 && // and the target position is only 1 space forward
                !isOccupied) { // and the space is not being occupied by another piece
                
                return true; // Returns legal move as true
            }
//***************************************white cant capture but black can*******************************
//*****************************other than capturing the opposite colour the logic works*****************
            // If the pawn wants to move forward one space diagonally
            if (Math.abs(this.x - xPos) == 1 &&
                (yPos - this.y) == 1 &&
                isOccupied == true && z.isWhite == false) { // and the space is being occupied by a black piece 
                
                return true; // Capture the black piece
            }	
	}
		
        // Loops through the black pieces
        for (Piece z : chess.blackPlayer) {
            
            // If the pawn has not made its first move yet
            if ((this.x == xPos && this.y == 7) && 
                (yPos == 6 || yPos == 5) && // and the target position is either 1 or 2 spaces forward
                !isOccupied && !isBlocked) { // and the target position is not being occupied and not being blocked
                
                return true; // Returns legal move as true			
            }

            // If the pawn already made its first move			
            if (this.x == xPos && this.y < 7 &&
                (this.y - yPos) == 1 && // and the target position is only 1 space forward
                !isOccupied) { // and the space is not being occupied by another piece
                
                return true; // Returns legal move as true
            }

            // If the pawn wants to move forward one space diagonally
            if (Math.abs(this.x - xPos) == 1 &&
                (this.y - yPos) == 1 &&
                isOccupied == true && z.isWhite == true) { // and the space is being occupied by a white piece
                
                return true; // Capture the white piece
            }	
        }
		
	return false;	
		
    }
    
}
