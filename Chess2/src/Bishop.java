
/**
 *
 * @author Maia Dinsdale
 */

//importing library for image icon
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Bishop extends Piece{
    
    public Bishop (int x, int y, boolean isWhite, ImageIcon image){
       //calls superclass to get variables 
        super(x, y, isWhite, image);  
    }
    @Override
    public boolean isLegalMove(Chess1 chess, int xPos, int yPos){
	// Combines the white and black pieces together
        ArrayList<Piece> allPlayer = new ArrayList<Piece>();
        allPlayer.addAll(chess.whitePlayer);
        allPlayer.addAll(chess.blackPlayer);
		
        // If the destination is not a diagonal, it's not a legal move
        if (Math.abs(this.getX() - xPos) != Math.abs(this.getY() - yPos)){
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
			
            // Checks if there is a piece on the bishop's path and if the destination space is being blocked by the piece (diagonal northeast & southwest)
            if ((this.getX() - z.getX() == this.getY() - z.getY()) &&
                (this.getX() - xPos == this.getY() - yPos) &&
                ((this.getX() < z.getX() && z.getX() < xPos)||
                (this.getX() > z.getX() && z.getX() > xPos))){
                return false;
            }

            // Checks if there is a piece on the bishop's path and if the destination space is being blocked by the piece (diagonal northwest & southeast)
            if ((this.getX() - z.getX() == z.getY() - this.getY()) &&
                (this.getX() - xPos == yPos - this.getY()) &&
                ((this.getX() < z.getX() && z.getX() < xPos)||
                (this.getX() > z.getX() && z.getX() > xPos))){
                return false;
            }
	}
	returns true;
      
        /* //distance moved horizontally
        int xdiff = x - xPos;
        //distance moved vertically
        int ydiff = y - yPos;
        
        //checks to see if piece moved an equal x and y distance (diagonal)
        if (Math.abs(xdiff) == Math.abs(ydiff)){
            //check if piece moved left
            if (xdiff > 0){
                for (int i = x; i >= xPos; i--){
                    //check if piece moved down
                    if(ydiff > 0){
                        for(int j = y; j >= yPos; j--){
                            //check colour of piece
                            if (isWhite){
                                //goes through the list of white pieces and sees if they intersect with the piece
                                for(Piece piece : chess.whitePlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    } 
                                }
                            }
                            else{
                                //goes through the list of black pieces and sees if they intersect with the piece
                                for(Piece piece : chess.blackPlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                        }   
                    }
                    //check if piece moved up
                    else if (ydiff < 0){
                        for(int j = y; j <= yPos; j++){
                            if (isWhite){
                                //goes through the list of white pieces and sees if they intersect with the piece
                                for(Piece piece : chess.whitePlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                            else{
                                //goes through the list of black pieces and sees if they intersect with the piece
                                for(Piece piece : chess.blackPlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                        }   
                    }
                } 
            }
            //check if piece moved right
            else if (xdiff < 0){
                for (int i = x; i >= xPos; i++){
                    //check if piece moved down
                    if(ydiff > 0){
                        for(int j = y; j >= yPos; j--){
                            if (isWhite){
                                //goes through the list of white pieces and sees if they intersect with the piece
                                for(Piece piece : chess.whitePlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                            else{
                                //goes through the list of black pieces and sees if they intersect with the piece
                                for(Piece piece : chess.blackPlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                        }   
                    }
                    //check if piece moved up
                    else if (ydiff < 0){
                        for(int j = y; j <= yPos; j++){
                            //check colour of piece
                            if (isWhite){
                                //goes through the list of white pieces and sees if they intersect with the piece
                                for(Piece piece : chess.whitePlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                            else{
                                //goes through the list of black pieces and sees if they intersect with the piece
                                for(Piece piece : chess.blackPlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                        }   
                    }
                } 
            }
        }
        else{
            return false;
            }
        return true; */
    }
}
