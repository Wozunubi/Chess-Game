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
public class Rook extends Piece {
    
    // Constructor
    public Rook (int x, int y, boolean isWhite, ImageIcon image) {
        
        // Calls parent constructor, passes in variables
        super(x, y, isWhite, image);
    }
    
    @Override
    public boolean isLegalMove(Chess1 chess, int xPos, int yPos) {
        // If the target position is not in a staight line, return false
        if (this.x != xPos || this.y != yPos){
            return false;
        }		
        // Loops through the white pieces
        for (Piece z : chess.whitePlayer){
            
            // If the target position already has a piece occupying it and is same colour, return false
            if ((z.x == xPos && z.y == yPos) && 
                (this.isWhite ^ z.isWhite) ){
                return false;
            }
            
            // If any white piece is in the middle of the vertical destination, return false
            if ((this.x == xPos && this.y != yPos) &&
                ((this.y < yPos) && (this.y < z.y) && (z.y < yPos)) || 
                ((this.y > yPos) && (this.y > z.y) && (z.y > yPos))) {
                return false;	
            }
            
            // If any white piece is in the middle of the horizontal destination, return false	
            if ((this.x != xPos && this.y == yPos) &&
                ((this.x < xPos) && (this.x < z.x) && (z.x < xPos)) || 
                ((this.x > xPos) && (this.x > z.x) && (z.x > xPos))) {
                return false;	
            } 
        }
        
        // Loops through the black pieces
        for (Piece z : chess.blackPlayer){
            
            // If target position already has a piece occupying it and is same colour, return false
            if ((z.x == xPos && z.y == yPos) && 
                (this.isWhite ^ z.isWhite) ){
                return false;
            }
            
            // If any black piece is in the middle of the vertical destination, return false
            if ((this.x == xPos && this.y != yPos) &&
                ((this.y < yPos) && (this.y < z.y) && (z.y < yPos)) || 
                ((this.y > yPos) && (this.y > z.y) && (z.y > yPos))) {
                return false;	
            }
            
            // If any black piece is in the middle of the horizontal destination, return false	
            if ((this.x != xPos && this.y == yPos) &&
                ((this.x < xPos) && (this.x < z.x) && (z.x < xPos)) || 
                ((this.x > xPos) && (this.x > z.x) && (z.x > xPos))) {
                return false;	
            } 
        }
		
        return true;
    } 
}
