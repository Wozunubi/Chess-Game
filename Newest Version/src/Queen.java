/**
 *
 * @author Maia Dinsdale
 */
//imports ImageIcon library
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Queen extends Piece{
    
    public Queen(int x, int y, boolean isWhite, ImageIcon image){
        //calls superclass to get variables
        super(x, y, isWhite, image);
    }
    
    @Override
    public boolean isLegalMove (Chess chess, int xPos, int yPos){
        // Combines the white and black pieces together
        ArrayList<Piece> allPlayer = new ArrayList<Piece>();
        allPlayer.addAll(chess.whitePlayer);
        allPlayer.addAll(chess.blackPlayer);

        // If the destination is not a diagonal or in a straight line, it's not a legal move
        if (!(Math.abs(this.getX() - xPos) == Math.abs(this.getY() - yPos) ||
            this.getX() == xPos ||
            this.getY() == yPos)){
            return false;
        }
        
        // Loops through all the pieces
        for (Piece z : allPlayer){

            // If the destination space has a piece of the same colour, it's not allowed to move there
            if (z.getX() == xPos && 
                z.getY() == yPos &&
                this.getIsWhite() == z.getIsWhite()){
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
            
            // If the destination space has a piece blocking it vertically, it's not allowed to move
            if (this.getX() == z.getX() && z.getX() == xPos &&
                ((this.getY() < z.getY() && z.getY() < yPos) || 
                (this.getY() > z.getY() && z.getY() > yPos))) {
                return false;
            }
            
            // If the destination space has a piece blocking it horizontally, it's not allowed to move	
            if (this.getY() == z.getY() && z.getY() == yPos &&
                ((this.getX() < z.getX() && z.getX() < xPos) || 
                (this.getX() > z.getX() && z.getX() > xPos))) {
                return false;	
            }
        }
        return true;
    }
}