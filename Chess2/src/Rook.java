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
public class Rook extends Piece {
    
    // Constructor
    public Rook (int x, int y, boolean isWhite, ImageIcon image) {
        
        // Calls parent constructor, passes in variables
        super(x, y, isWhite, image);
    }
	
    @Override
    public boolean isLegalMove(Chess1 chess, int xPos, int yPos) {
	// Combines the white and black pieces together	
        ArrayList<Piece> allPlayer = new ArrayList<Piece>();
        allPlayer.addAll(chess.whitePlayer);
        allPlayer.addAll(chess.blackPlayer);
	    
        // If the destination is not in a straight line, it's not a legal move
        if (this.getX() != xPos && this.getY() != yPos){
            return false;
        }
	    
        // Loops through all the pieces
        for (Piece z : allPlayer){
            // If the destination space has a piece of the same colour, it's not allowed to move
            if (z.getX() == xPos && 
                z.getY() == yPos && 
                (this.getIsWhite() == z.getIsWhite()) ){
                return false;
            }
            // If the destination space has a piece blocking it vertically, it's not allowed to move
            if (this.getX() == z.getX() && z.getX() == xPos &&
                ((this.getY() < yPos && this.getY() < z.getY() && z.getY() < yPos) || 
                (this.getY() > yPos && this.getY() > z.getY() && z.getY() > yPos))) {
                return false;	
            }
            // If the destination space has a piece blocking it horizontally, it's not allowed to move	
            if (this.getY() == z.getY() && z.getY() == yPos &&
                ((this.getX() < xPos && this.getX() < z.getX() && z.getX() < xPos) || 
                (this.getX() > xPos && this.getX() > z.getX() && z.getX() > xPos))) {
                return false;	
            } 
        }
	// Otherwise, it's a legal move
        return true;
    } 
}
