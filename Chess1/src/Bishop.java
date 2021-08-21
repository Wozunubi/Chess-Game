/*
File Name:
Programmer: Maia Dinsdale
Date: August
Description:
 */

/**
 *
 * @author maiad
 */

//importing library for image icon
import javax.swing.ImageIcon;

public class Bishop extends Piece{
    
    public Bishop (int x, int y, boolean isWhite, ImageIcon image){
       //calls superclass to get variables 
        super(x, y, isWhite, image);  
    }
    
    public boolean IsLegalMove(int xPos, int yPos){
        //distance moved horizontally
        int xdiff = x - xPos;
        //distance moved vertically
        int ydiff = y - yPos;
        
        //checks to see if bishop moved an equal x and y distance (diagonal)
        if (Math.abs(xdiff) == Math.abs(ydiff)){
            //check if bishop moved left
            if (xdiff > 0){
                for (int i = x; i >= xPos; i--){
                    //check if bishop moved down
                    if(ydiff > 0){
                        for(int j = y; j >= yPos; j--){
                            //check colour of piece
                            if (isWhite == true){
                                //goes through the list of white pieces and sees if they intersect with the bishop
                                for(Piece piece : Chess1.whitePlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    } 
                                }
                            }
                            else{
                                //goes through the list of black pieces and sees if they intersect with the bishop
                                for(Piece piece : Chess1.blackPlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                        }   
                    }
                    //check if bishop moved up
                    else if (ydiff < 0){
                        for(int j = y; j <= yPos; j++){
                            if (isWhite == true){
                                //goes through the list of white pieces and sees if they intersect with the bishop
                                for(Piece piece : Chess1.whitePlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                            else{
                                //goes through the list of black pieces and sees if they intersect with the bishop
                                for(Piece piece : Chess1.blackPlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                        }   
                    }
                } 
            }
            //check if bishop moved right
            else if (xdiff < 0){
                for (int i = x; i >= xPos; i++){
                    //check if bishop moved down
                    if(ydiff > 0){
                        for(int j = y; j >= yPos; j--){
                            if (isWhite == true){
                                //goes through the list of white pieces and sees if they intersect with the bishop
                                for(Piece piece : Chess1.whitePlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                            else{
                                //goes through the list of black pieces and sees if they intersect with the bishop
                                for(Piece piece : Chess1.blackPlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                        }   
                    }
                    //check if bishop moved up
                    else if (ydiff < 0){
                        for(int j = y; j <= yPos; j++){
                            //check colour of piece
                            if (isWhite == true){
                                //goes through the list of white pieces and sees if they intersect with the bishop
                                for(Piece piece : Chess1.whitePlayer){
                                    if (piece.x == i && piece.y == j){
                                        return false;
                                    }    
                                }
                            }
                            else{
                                //goes through the list of black pieces and sees if they intersect with the bishop
                                for(Piece piece : Chess1.blackPlayer){
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
