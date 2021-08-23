
/**
 *
 * @author Maia Dinsdale
 */

//importing library for image icon
import javax.swing.ImageIcon;

public class Bishop extends Piece{
    
    public Bishop (int x, int y, boolean isWhite, ImageIcon image){
       //calls superclass to get variables 
        super(x, y, isWhite, image);  
    }
    @Override
    public boolean isLegalMove(Chess1 chess, int xPos, int yPos){
      
        //distance moved horizontally
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
    return true;
    }
}