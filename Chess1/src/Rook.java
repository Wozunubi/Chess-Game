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
    public boolean isLegalMove(Chess chess, int xPos, int yPos) {
		
	ArrayList<Piece> allPlayer = new ArrayList<Piece>();
	allPlayer.addAll(chess.whitePlayer);
	allPlayer.addAll(chess.blackPlayer);
		
        if (this.getX() != xPos && this.getY() != yPos){
		return false;
	}		
		
	for (Piece z : allPlayer){
			
		if (z.getX() == xPos && 
			z.getY() == yPos && 
			(this.getIsWhite() == z.getIsWhite()) ){
			return false;
		}
			
		if (this.getX() == z.getX() && z.getX() == xPos &&
			((this.getY() < yPos && this.getY() < z.getY() && z.getY() < yPos) || 
			(this.getY() > yPos && this.getY() > z.getY() && z.getY() > yPos))) {
			return false;	
		}
				
		if (this.getY() == z.getY() && z.getY() == yPos &&
			((this.getX() < xPos && this.getX() < z.getX() && z.getX() < xPos) || 
			(this.getX() > xPos && this.getX() > z.getX() && z.getX() > xPos))) {
			return false;	
		} 
	}			
        return true;
    } 
}
