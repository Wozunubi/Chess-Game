/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Importing library for ImageIcon
import javax.swing.ImageIcon;

/**
 *
 * @author ahhhhhh
 */
public abstract class Piece {
    
    private int x, y; // Piece x and y position
    private boolean isWhite; // Piece colour
    private ImageIcon image; // Image to represent the piece
    
    // Constructor
    public Piece(int x, int y, boolean isWhite, ImageIcon image) {
        // Sets global variables to variables passed in
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
        this.image = image;
    }
    
    // Returns whether the piece is black or white
    public boolean getIsWhite() {
        return isWhite;
    }
    
    // Returns the x position
    public int getX() {
        return x;
    }
    
    // Returns the y position
    public int getY() {
        return y;
    }
    
    // Sets the x position
    public void setX(int x) {
        this.x = x;
    }

    // Sets the y position
    public void setY(int y) {
        this.y = y;
    }
    
    // Returns the image icon
    public ImageIcon getImage() {
        return image;
    }
    
    // This method will be overridden in the subclasses
    public boolean isLegalMove(Chess chess, int xPos, int yPos) {        
        return true;
    }
}