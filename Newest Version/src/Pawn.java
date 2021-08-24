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
    // Counts the pawns moves
    int count;
	
    // Constructor
    public Pawn (int x, int y, boolean isWhite, ImageIcon image) {
        
        // Calls parent constructor, passes in variables
        super(x, y, isWhite, image);
        this.count = 0; // Count is set to 0
    }
    
    @Override
    public boolean isLegalMove(Chess chess, int xPos, int yPos) {
		
        boolean isBlocked = false;

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
                    count++;
                    return true;
                }

                // En Passant of white pawn
                if ( this.getY() == 5 && // Check if a pawn moved 3 spaces from its start position
                    Math.abs(this.getX() - xPos) == 1 && // Check if selected space is diagonal
                    this.getY() - yPos == -1 &&
                    (z.getX() == this.getX() + 1 || z.getX() == this.getX() - 1) && // Check if black pawn is next to capturing pawn
                    z.getY() == this.getY() && // same row
                    (z instanceof Pawn) && // Check if black pawn is in same row as capturing pawn
                    ((Pawn)z).count == 1) { // Check if it's a pawn's first move

                    // Captures the black pawn
                    chess.blackPlayer.remove(z);
                    count++;
                    return true;
                }
            }

            // Moves the pawn one or two spaces during it's first move
            if ((this.getX() == xPos && this.getY() == 2) && 
                (yPos == 3 || yPos == 4) &&
                !isBlocked ) {
                count++;
                return true;			
            }

            // Moves the pawn one space forward	
            if (this.getX() == xPos && 
                this.getY() >= 3 &&
                this.getY() - yPos == -1 &&
                !isBlocked ) {
                count++;
                return true;
            }
        } else {
            // Moves the pawn diagonally forward one space to capture the white piece
            for (Piece z : chess.whitePlayer){	
                if (Math.abs(this.getX() - z.getX()) == 1 &&
                    this.getY() - z.getY() == 1 &&
                    z.getX() == xPos &&
                    z.getY() == yPos) {
                    count++;
                    return true;
                }

                // En Passant for black pawn
                if ( this.getY() == 4 && // Check if a pawn moved 3 spaces from its start position
                    Math.abs(this.getX() - xPos) == 1 && // Check if selected space is diagonal
                    this.getY() - yPos == 1 &&
                    (z.getX() == this.getX() + 1 || z.getX() == this.getX() - 1) && // Check if white pawn is next to capturing pawn
                    z.getY() == this.getY() && // Check if white pawn is in same row as capturing pawn
                    (z instanceof Pawn) && // Check if it's a pawn
                    ((Pawn)z).count == 1) { // Check if it's a pawn's first move
                    
                    // Captures the white pawn
                    chess.whitePlayer.remove(z);
                    count++;
                    return true;
                }
            }

            // Moves the pawn one or two spaces during it's first move
            if ((this.getX() == xPos && this.getY() == 7) && 
                (yPos == 6 || yPos == 5) &&
                !isBlocked ) {
                count++;
                return true;			
            }

            // Moves the pawn one space forward	
            if (this.getX() == xPos && 
                this.getY() <= 6 &&
                this.getY() - yPos == 1 &&
                !isBlocked ) {
                count++;
                return true;
            }
        }	
        // Otherwise, it's an illegal move
        return false;		
    } 	
}

