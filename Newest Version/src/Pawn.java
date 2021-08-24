/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Importing library for ImageIcon
import javax.swing.ImageIcon;
import java.util.ArrayList;
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
    public boolean isLegalMove(Chess chess, int xPos, int yPos) {
		
        boolean isBlocked = false;
        // Combines the white and black pieces together	
        ArrayList<Piece> allPlayer = new ArrayList<Piece>();
        allPlayer.addAll(chess.whitePlayer);
        allPlayer.addAll(chess.blackPlayer);

        // Check if it's a white pawn
        if (this.getIsWhite()){
            // Loops through all the pieces
            for (Piece z : allPlayer){
                // Checks to see if the destination is blocked by other pieces
                if (this.getX() == xPos &&
                    this.getX() == z.getX() &&
                    ((this.getY() - z.getY() == -1)||
                    (this.getY() == 2 && z.getY() == 3 && yPos == 4)||
                    (this.getY() == 2 && z.getY() == 4 && yPos == 4))){
                    isBlocked = true;
                }
            }			
        // Else it's a black pawn
        } else {
            // Loops through all the pieces
            for (Piece z : allPlayer){
                // Checks to see if the destination is blocked by other pieces
                if (this.getX() == xPos &&
                    this.getX() == z.getX() &&
                    ((this.getY() - z.getY() == 1)||
                    (this.getY() == 7 && z.getY() == 6 && yPos == 5)||
                    (this.getY() == 7 && z.getY() == 5 && yPos == 5))){
                    isBlocked = true;
                }
            }			
        }		

        // Check if it's a white pawn
        if (this.getIsWhite()){
            // Moves the pawn diagonally forward one space to capture the black piece 
            for (Piece z : chess.blackPlayer){	
                if (Math.abs(this.getX() - z.getX()) == 1 &&
                    this.getY() - z.getY() == -1 &&
                    z.getX() == xPos &&
                    z.getY() == yPos) {
                    return true;
                }
            }
            // Moves the pawn one or two spaces during it's first move
            if ((this.getX() == xPos && this.getY() == 2) && 
                (yPos == 3 || yPos == 4) &&
                !isBlocked ) {
                return true;			
            }
            // Moves the pawn one space forward	
            if (this.getX() == xPos && 
                this.getY() >= 3 &&
                this.getY() - yPos == -1 &&
                !isBlocked ) {
                return true;
            }
        } else {
            // Moves the pawn diagonally forward one space to capture the white piece
            for (Piece z : chess.whitePlayer){	
                if (Math.abs(this.getX() - z.getX()) == 1 &&
                    this.getY() - z.getY() == 1 &&
                    z.getX() == xPos &&
                    z.getY() == yPos) {
                    return true;
                }		
            }
            // Moves the pawn one or two spaces during it's first move
            if ((this.getX() == xPos && this.getY() == 7) && 
                (yPos == 6 || yPos == 5) &&
                !isBlocked ) {
                return true;			
            }
            // Moves the pawn one space forward	
            if (this.getX() == xPos && 
                this.getY() <= 6 &&
                this.getY() - yPos == 1 &&
                !isBlocked ) {
                return true;
            }
        }	
        // Otherwise, it's a illegal move
        return false;		
    } 	
}