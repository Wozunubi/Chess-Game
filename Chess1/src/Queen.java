
/**
 *
 * @author Maia Dinsdale
 */
//imports ImageIcon library
import javax.swing.ImageIcon;
public class Queen extends Piece{
    
    public Queen(int x, int y, boolean isWhite, ImageIcon image){
        //calls superclass to get variables
        super(x, y, isWhite, image);
    }
    
    @Override
    public boolean isLegalMove (Chess1 chess, int xPos, int yPos){
        //distance moved horizontally
        int xdiff = x - xPos;
        //distance moved vertically
        int ydiff = y - yPos;
        
        //checking for vertical moves
        if (xdiff == 0){
            //check if piece moved downwards
            if (ydiff > 0){
                for (int i = y; i > yPos; i--){
                    //check colour of piece
                    if (isWhite == true){
                        //goes through the list of white pieces and sees if they intersect with the piece
                        for(Piece piece : chess.whitePlayer){
                            if (piece.y == i){
                                return false;
                            } 
                        }
                    }
                    else{
                        //goes through the list of black pieces and sees if they intersect with the piece
                        for(Piece piece : chess.blackPlayer){
                            if (piece.y == i){
                                return false;
                            }    
                        }
                    }
                }
            }
            //check if piece moved upwards
            else if (ydiff < 0){
                for (int i = y; i < yPos; i++){
                    //check colour of piece
                    if (isWhite == true){
                        //goes through the list of white pieces and sees if they intersect with the piece
                        for(Piece piece : chess.whitePlayer){
                            if (piece.y == i){
                                return false;
                            } 
                        }
                    }
                    else{
                        //goes through the list of black pieces and sees if they intersect with the piece
                        for(Piece piece : chess.blackPlayer){
                            if (piece.y == i){
                                return false;
                            }    
                        }
                    }
                }
            } 
        }
        //checking for horizontal moves
        else if (ydiff == 0){
            //check if piece moved left
            if (xdiff > 0){
                for (int i = x; i > xPos; i--){
                    //check colour of piece
                    if (isWhite == true){
                        //goes through the list of white pieces and sees if they intersect with the piece
                        for(Piece piece : chess.whitePlayer){
                            if (piece.x == i){
                                return false;
                            } 
                        }
                    }
                    else{
                        //goes through the list of black pieces and sees if they intersect with the piece
                        for(Piece piece : chess.blackPlayer){
                            if (piece.x == i){
                                return false;
                            }    
                        }
                    }
                }
            }
            //check if piece moved up
            else if (ydiff < 0){
                for (int i = x; i < xPos; i++){
                    //check colour of piece
                    if (isWhite == true){
                        //goes through the list of white pieces and sees if they intersect with the piece
                        for(Piece piece : chess.whitePlayer){
                            if (piece.x == i){
                                return false;
                            } 
                        }
                    }
                    else{
                        //goes through the list of black pieces and sees if they intersect with the piece
                        for(Piece piece : chess.blackPlayer){
                            if (piece.x == i){
                                return false;
                            }    
                        }
                    }
                }
            } 
        }
        //checking for diagonal moves
        else if (Math.abs(xdiff) == Math.abs(ydiff)){
            //check if piece moved left
            if (xdiff > 0){
                for (int i = x; i >= xPos; i--){
                    //check if piece moved down
                    if(ydiff > 0){
                        for(int j = y; j >= yPos; j--){
                            //check colour of piece
                            if (isWhite == true){
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
                            if (isWhite == true){
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
                            if (isWhite == true){
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
                            if (isWhite == true){
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
        return true;
    }
}
