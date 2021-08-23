/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Importing libraries
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author ahhhhhh
 */
public class Chess1 extends javax.swing.JFrame {

    // Declares two ArrayLists for storing the white and black pieces
    public ArrayList<Piece> whitePlayer = new ArrayList();
    public ArrayList<Piece> blackPlayer = new ArrayList();
    
    // Hashmap for converting string to JButton
    public HashMap<String, JButton> stringToJButton = new HashMap();
    
    // Declaring objects to store each piece image
    ImageIcon whiteRook = new ImageIcon("white rook.png");
    ImageIcon whiteKnight = new ImageIcon("white knight.png");
    ImageIcon whiteBishop = new ImageIcon("white bishop.png");
    ImageIcon whiteQueen = new ImageIcon("white queen.png");
    ImageIcon whiteKing = new ImageIcon("white king.png");
    ImageIcon whitePawn = new ImageIcon("white pawn.png");
    ImageIcon blackRook = new ImageIcon("black rook.png");
    ImageIcon blackKnight = new ImageIcon("black knight.png");
    ImageIcon blackBishop = new ImageIcon("black bishop.png");
    ImageIcon blackQueen = new ImageIcon("black queen.png");
    ImageIcon blackKing = new ImageIcon("black king.png");
    ImageIcon blackPawn = new ImageIcon("black pawn.png");
    
    // Used for user click logic
    Piece selectedPiece;
    int clickCount = 0, turnCount = 0;
    
    /**
     * Creates new form Chess
     */
    public Chess1() {
        // GUI
        initComponents();
        
        // Initializes hashmap
        mapStringToJButton();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        A7 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        E7 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        G7 = new javax.swing.JButton();
        H7 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        E6 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        G6 = new javax.swing.JButton();
        H6 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        G5 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        H5 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        H4 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        H3 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        D8 = new javax.swing.JButton();
        E8 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        G8 = new javax.swing.JButton();
        H8 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        H2 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        H1 = new javax.swing.JButton();
        txtOutput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnResign = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A7.setBackground(new java.awt.Color(153, 102, 0));
        A7.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 100));

        B7.setBackground(java.awt.Color.white);
        B7.setForeground(java.awt.Color.white);
        getContentPane().add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 100, 100));

        C7.setBackground(new java.awt.Color(153, 102, 0));
        C7.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 100, 100));

        D7.setBackground(java.awt.Color.white);
        D7.setForeground(java.awt.Color.white);
        getContentPane().add(D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 100, 100));

        E7.setBackground(new java.awt.Color(153, 102, 0));
        E7.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(E7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 100, 100));

        F7.setBackground(java.awt.Color.white);
        F7.setForeground(java.awt.Color.white);
        getContentPane().add(F7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 100, 100));

        G7.setBackground(new java.awt.Color(153, 102, 0));
        G7.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(G7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 100, 100));

        H7.setBackground(java.awt.Color.white);
        H7.setForeground(java.awt.Color.white);
        getContentPane().add(H7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 100, 100));

        B6.setBackground(new java.awt.Color(153, 102, 0));
        B6.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, 100));

        C6.setBackground(java.awt.Color.white);
        C6.setForeground(java.awt.Color.white);
        getContentPane().add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 100, 100));

        D6.setBackground(new java.awt.Color(153, 102, 0));
        D6.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 100, 100));

        E6.setBackground(java.awt.Color.white);
        E6.setForeground(java.awt.Color.white);
        getContentPane().add(E6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 100, 100));

        F6.setBackground(new java.awt.Color(153, 102, 0));
        F6.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 100, 100));

        G6.setBackground(java.awt.Color.white);
        G6.setForeground(java.awt.Color.white);
        getContentPane().add(G6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 100, 100));

        H6.setBackground(new java.awt.Color(153, 102, 0));
        H6.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(H6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 100, 100));

        A6.setBackground(java.awt.Color.white);
        A6.setForeground(java.awt.Color.white);
        getContentPane().add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 100, 100));

        C5.setBackground(new java.awt.Color(153, 102, 0));
        C5.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 100, 100));

        B5.setBackground(java.awt.Color.white);
        B5.setForeground(java.awt.Color.white);
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 100, 100));

        G5.setBackground(new java.awt.Color(153, 102, 0));
        G5.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(G5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 100, 100));

        A5.setBackground(new java.awt.Color(153, 102, 0));
        A5.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 100, 100));

        F5.setBackground(java.awt.Color.white);
        F5.setForeground(java.awt.Color.white);
        getContentPane().add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 100, 100));

        H5.setBackground(java.awt.Color.white);
        H5.setForeground(java.awt.Color.white);
        getContentPane().add(H5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 100, 100));

        E5.setBackground(new java.awt.Color(153, 102, 0));
        E5.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 100, 100));

        D5.setBackground(java.awt.Color.white);
        D5.setForeground(java.awt.Color.white);
        getContentPane().add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 100, 100));

        F4.setBackground(new java.awt.Color(153, 102, 0));
        F4.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 100, 100));

        G4.setBackground(java.awt.Color.white);
        G4.setForeground(java.awt.Color.white);
        getContentPane().add(G4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 100, 100));

        C4.setBackground(java.awt.Color.white);
        C4.setForeground(java.awt.Color.white);
        getContentPane().add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 100, 100));

        B4.setBackground(new java.awt.Color(153, 102, 0));
        B4.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 100, 100));

        A4.setBackground(java.awt.Color.white);
        A4.setForeground(java.awt.Color.white);
        getContentPane().add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 100, 100));

        H4.setBackground(new java.awt.Color(153, 102, 0));
        H4.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(H4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 100, 100));

        D4.setBackground(new java.awt.Color(153, 102, 0));
        D4.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 100, 100));

        E4.setBackground(java.awt.Color.white);
        E4.setForeground(java.awt.Color.white);
        getContentPane().add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 100, 100));

        G3.setBackground(new java.awt.Color(153, 102, 0));
        G3.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 670, 100, 100));

        H3.setBackground(java.awt.Color.white);
        H3.setForeground(java.awt.Color.white);
        getContentPane().add(H3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 670, 100, 100));

        E3.setBackground(new java.awt.Color(153, 102, 0));
        E3.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, 100, 100));

        A3.setBackground(new java.awt.Color(153, 102, 0));
        A3.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 100, 100));

        D3.setBackground(java.awt.Color.white);
        D3.setForeground(java.awt.Color.white);
        getContentPane().add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 100, 100));

        F3.setBackground(java.awt.Color.white);
        F3.setForeground(java.awt.Color.white);
        getContentPane().add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 670, 100, 100));

        C3.setBackground(new java.awt.Color(153, 102, 0));
        C3.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 670, 100, 100));

        B3.setBackground(java.awt.Color.white);
        B3.setForeground(java.awt.Color.white);
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 670, 100, 100));

        A8.setBackground(java.awt.Color.white);
        A8.setForeground(java.awt.Color.white);
        getContentPane().add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 100));

        B8.setBackground(new java.awt.Color(153, 102, 0));
        B8.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, 100));

        C8.setBackground(java.awt.Color.white);
        C8.setForeground(java.awt.Color.white);
        getContentPane().add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 100, 100));

        D8.setBackground(new java.awt.Color(153, 102, 0));
        D8.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(D8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 100, 100));

        E8.setBackground(java.awt.Color.white);
        E8.setForeground(java.awt.Color.white);
        getContentPane().add(E8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 100, 100));

        F8.setBackground(new java.awt.Color(153, 102, 0));
        F8.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(F8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 100, 100));

        G8.setBackground(java.awt.Color.white);
        G8.setForeground(java.awt.Color.white);
        getContentPane().add(G8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, 100));

        H8.setBackground(new java.awt.Color(153, 102, 0));
        H8.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(H8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 100, 100));

        E2.setBackground(java.awt.Color.white);
        E2.setForeground(java.awt.Color.white);
        getContentPane().add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 780, 100, 100));

        A2.setBackground(java.awt.Color.white);
        A2.setForeground(java.awt.Color.white);
        getContentPane().add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 780, 100, 100));

        D2.setBackground(new java.awt.Color(153, 102, 0));
        D2.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 780, 100, 100));

        F2.setBackground(new java.awt.Color(153, 102, 0));
        F2.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 780, 100, 100));

        C2.setBackground(java.awt.Color.white);
        C2.setForeground(java.awt.Color.white);
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 780, 100, 100));

        B2.setBackground(new java.awt.Color(153, 102, 0));
        B2.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 780, 100, 100));

        G2.setBackground(java.awt.Color.white);
        G2.setForeground(java.awt.Color.white);
        getContentPane().add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 780, 100, 100));

        H2.setBackground(new java.awt.Color(153, 102, 0));
        H2.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(H2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 780, 100, 100));

        A1.setBackground(new java.awt.Color(153, 102, 0));
        A1.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 890, 100, 100));

        F1.setBackground(java.awt.Color.white);
        F1.setForeground(java.awt.Color.white);
        getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 890, 100, 100));

        G1.setBackground(new java.awt.Color(153, 102, 0));
        G1.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 890, 100, 100));

        E1.setBackground(new java.awt.Color(153, 102, 0));
        E1.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 890, 100, 100));

        D1.setBackground(java.awt.Color.white);
        D1.setForeground(java.awt.Color.white);
        getContentPane().add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 890, 100, 100));

        C1.setBackground(new java.awt.Color(153, 102, 0));
        C1.setForeground(new java.awt.Color(153, 102, 0));
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 890, 100, 100));

        B1.setBackground(java.awt.Color.white);
        B1.setForeground(java.awt.Color.white);
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 890, 100, 100));

        H1.setBackground(java.awt.Color.white);
        H1.setForeground(java.awt.Color.white);
        getContentPane().add(H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 890, 100, 100));

        txtOutput.setEditable(false);
        getContentPane().add(txtOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1000, 864, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chess Board (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 1090));

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 50));

        btnResign.setText("Resign");
        btnResign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResignActionPerformed(evt);
            }
        });
        getContentPane().add(btnResign, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 160, 50));

        jButton1.setText("Look at moves history");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 270, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // Resets counters
        clickCount = 0;
        turnCount = 0;

        // Clears white and black pieces
        whitePlayer.clear();
        blackPlayer.clear();

        // Adds the rooks to the white and black player
        whitePlayer.add(new Rook(1, 1, true, whiteRook));
        whitePlayer.add(new Rook(8, 1, true, whiteRook));
        blackPlayer.add(new Rook(1, 8, false, blackRook));
        blackPlayer.add(new Rook(8, 8, false, blackRook));
        
        // Adds the knight to the white and black player
        whitePlayer.add(new Knight(2, 1, true, whiteKnight));
        whitePlayer.add(new Knight(7, 1, true, whiteKnight));
        blackPlayer.add(new Knight(2, 8, false, blackKnight));
        blackPlayer.add(new Knight(7, 8, false, blackKnight));
        
        // Adds the bishops to the white and black player
        whitePlayer.add(new Bishop(3, 1, true, whiteBishop));
        whitePlayer.add(new Bishop(6, 1, true, whiteBishop));
        blackPlayer.add(new Bishop(3, 8, false, blackBishop));
        blackPlayer.add(new Bishop(6, 8, false, blackBishop));
        
        // Adds the queens to the white and black player
        whitePlayer.add(new Queen(4, 1, true, whiteQueen));
        blackPlayer.add(new Queen(4, 8, false, blackQueen));
        
        // Adds the kingss to the white and black player
        whitePlayer.add(new King(5, 1, true, whiteKing));
        blackPlayer.add(new King(5, 8, false, blackKing));
        
        // Add the pawns to the white and black player
        for (int i = 1; i <= 8; i++) {
            whitePlayer.add(new Pawn(i, 2, true, whitePawn));
            blackPlayer.add(new Pawn(i, 7, false, blackPawn));
        }
        
        // Updates board
        updateBoard();
    }//GEN-LAST:event_btnStartActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        tilePressed(1, 1);
    }//GEN-LAST:event_A1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        tilePressed(2, 1);
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        tilePressed(3, 1);
    }//GEN-LAST:event_C1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        tilePressed(4, 1);
    }//GEN-LAST:event_D1ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        tilePressed(5, 1);
    }//GEN-LAST:event_E1ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        tilePressed(6, 1);
    }//GEN-LAST:event_F1ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        tilePressed(7, 1);
    }//GEN-LAST:event_G1ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        tilePressed(8, 1);
    }//GEN-LAST:event_H1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        tilePressed(1, 2);
    }//GEN-LAST:event_A2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        tilePressed(2, 2);
    }//GEN-LAST:event_B2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        tilePressed(3, 2);
    }//GEN-LAST:event_C2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        tilePressed(4, 2);
    }//GEN-LAST:event_D2ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        tilePressed(5, 2);
    }//GEN-LAST:event_E2ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        tilePressed(6, 2);
    }//GEN-LAST:event_F2ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        tilePressed(7, 2);
    }//GEN-LAST:event_G2ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
        tilePressed(8, 2);
    }//GEN-LAST:event_H2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        tilePressed(1, 3);
    }//GEN-LAST:event_A3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        tilePressed(2, 3);
    }//GEN-LAST:event_B3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        tilePressed(3, 3);
    }//GEN-LAST:event_C3ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        tilePressed(4, 3);
    }//GEN-LAST:event_D3ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        tilePressed(5, 3);
    }//GEN-LAST:event_E3ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        tilePressed(6, 3);
    }//GEN-LAST:event_F3ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        tilePressed(7, 3);
    }//GEN-LAST:event_G3ActionPerformed

    private void H3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H3ActionPerformed
        tilePressed(8, 3);
    }//GEN-LAST:event_H3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        tilePressed(1, 4);
    }//GEN-LAST:event_A4ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        tilePressed(2, 4);
    }//GEN-LAST:event_B4ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        tilePressed(3, 4);
    }//GEN-LAST:event_C4ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        tilePressed(4, 4);
    }//GEN-LAST:event_D4ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        tilePressed(5, 4);
    }//GEN-LAST:event_E4ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        tilePressed(6, 4);
    }//GEN-LAST:event_F4ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        tilePressed(7, 4);
    }//GEN-LAST:event_G4ActionPerformed

    private void H4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H4ActionPerformed
        tilePressed(8, 4);
    }//GEN-LAST:event_H4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        tilePressed(1, 5);
    }//GEN-LAST:event_A5ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        tilePressed(2, 5);
    }//GEN-LAST:event_B5ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        tilePressed(3, 5);
    }//GEN-LAST:event_C5ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        tilePressed(4, 5);
    }//GEN-LAST:event_D5ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
        tilePressed(5, 5);
    }//GEN-LAST:event_E5ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        tilePressed(6, 5);
    }//GEN-LAST:event_F5ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        tilePressed(7, 5);
    }//GEN-LAST:event_G5ActionPerformed

    private void H5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H5ActionPerformed
        tilePressed(8, 5);
    }//GEN-LAST:event_H5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        tilePressed(1, 6);
    }//GEN-LAST:event_A6ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        tilePressed(2, 6);
    }//GEN-LAST:event_B6ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        tilePressed(3, 6);
    }//GEN-LAST:event_C6ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        tilePressed(4, 6);
    }//GEN-LAST:event_D6ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        tilePressed(5, 6);
    }//GEN-LAST:event_E6ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        tilePressed(6, 6);
    }//GEN-LAST:event_F6ActionPerformed

    private void G6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G6ActionPerformed
        tilePressed(7, 6);
    }//GEN-LAST:event_G6ActionPerformed

    private void H6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H6ActionPerformed
        tilePressed(8, 6);
    }//GEN-LAST:event_H6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        tilePressed(1, 7);
    }//GEN-LAST:event_A7ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        tilePressed(2, 7);
    }//GEN-LAST:event_B7ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        tilePressed(3, 7);
    }//GEN-LAST:event_C7ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        tilePressed(4, 7);
    }//GEN-LAST:event_D7ActionPerformed

    private void E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E7ActionPerformed
        tilePressed(5, 7);
    }//GEN-LAST:event_E7ActionPerformed

    private void F7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F7ActionPerformed
        tilePressed(6, 7);
    }//GEN-LAST:event_F7ActionPerformed

    private void G7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G7ActionPerformed
        tilePressed(7, 7);
    }//GEN-LAST:event_G7ActionPerformed

    private void H7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H7ActionPerformed
        tilePressed(8, 7);
    }//GEN-LAST:event_H7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        tilePressed(1, 8);
    }//GEN-LAST:event_A8ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        tilePressed(2, 8);
    }//GEN-LAST:event_B8ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        tilePressed(3, 8);
    }//GEN-LAST:event_C8ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        tilePressed(4, 8);
    }//GEN-LAST:event_D8ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        tilePressed(5, 8);
    }//GEN-LAST:event_E8ActionPerformed

    private void F8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F8ActionPerformed
        tilePressed(6, 8);
    }//GEN-LAST:event_F8ActionPerformed

    private void G8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G8ActionPerformed
        tilePressed(7, 8);
    }//GEN-LAST:event_G8ActionPerformed

    private void H8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H8ActionPerformed
        tilePressed(8, 8);
    }//GEN-LAST:event_H8ActionPerformed
    
    private void btnResignActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(turnCount == 0 || turnCount%2 == 0){
            new blackWins().setVisible(true);
            dispose();
        }
        else{
            new whiteWins().setVisible(true);
            dispose();
        }
    }
    
    public void tilePressed(int x, int y) {      
        // Resets output
        txtOutput.setText("");
        
        // Increments click counter
        clickCount++;
        
        // If clicks is equal to 1
        if (clickCount == 1) {
            // Set selectedPiece to null
            selectedPiece = null;

            // Check if turn count is even or odd
            if (turnCount%2 == 0) {
                // Loop through all white pieces
                for (Piece z : whitePlayer){
                    // Check if a piece in the array is the same as the one selected
                    if (z.getX() == x && z.getY() == y) {
                        // Assigns selectedPiece to the piece choosen by the user
                        selectedPiece = z;
                        System.out.println(z.getX() + " " + z.getY());
                        break;
                    }
                }
            } else {
                // Loop through all black pieces
                for (Piece z : blackPlayer){
                    // Check if a piece in the array is the same as the one selected
                    if (z.getX() == x && z.getY() == y) {
                        // Assigns selectedPiece to the piece choosen by the user
                        selectedPiece = z;
                        System.out.println(z.getX() + " " + z.getY());
                        break;
                    }
                }
            }
            
            // If no piece has been selected or found
            if (selectedPiece == null) {
                // Output an error
                txtOutput.setText("--Error: Select the correct colour piece first, and not an empty tile!");
                clickCount = 0; // Reset clicks to 0
            }
        } else if (clickCount == 2 /*&& selectedPiece.isLegalMove(this, x, y)*/) { // If clicks is equal to 2
            // Checks if the second tile choosen is the same as the first
            if (selectedPiece.getX() != x || selectedPiece.getY() != y) {
                
                if (!selectedPiece.getIsWhite()) {
                    for (Piece z : whitePlayer) {
                        if (z.getX() == x && z.getY() == y) {
                            System.out.println("asdf");
                            whitePlayer.remove(z);
                            break;
                        }
                    }
                } else {
                    for (Piece z : blackPlayer) {
                        if (z.getX() == x && z.getY() == y) {
                            blackPlayer.remove(z);
                            System.out.println("gfds");
                            break;
                        }
                    }
                }
                
                // Displays who turn it is
                if (!selectedPiece.getIsWhite()){
                          txtOutput.setText("White's Turn.");
                 } else {
                          txtOutput.setText("Black's Turn.");
                }
                
                // Update new x and y position of the piece
                selectedPiece.setX(x);
                selectedPiece.setY(y);

                // Updates board
                updateBoard();

                // Increments turn
                turnCount++;
                
                // Resets clicks to 0
                clickCount = 0;
            } else {
                // Output an error
                txtOutput.setText("--Error: This piece was clicked twice, please try again!");
                clickCount = 0; // Reset clicks to 0
            }
        } else {
            clickCount = 0;
        }
    }
    
    // Updates board
    public void updateBoard() {
        // Loops through all coordinates
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                // Resets button to an empty icon
                stringToJButton.get("" + (char)(i+64) + (j)).setIcon(null);
            }
        }
        
        // Loops through all white pieces
        for (Piece z : whitePlayer){
            // Set button for piece z to the approriate icon
            stringToJButton.get("" + (char)(z.getX()+64) + (z.getY())).setIcon(z.getImage());
        }
        
        // Loops through all black pieces
        for (Piece z : blackPlayer){
            // Set button for piece z to the approriate icon
            stringToJButton.get("" + (char)(z.getX()+64) + (z.getY())).setIcon(z.getImage());
        }
    }
    
    // Assigns JButton to a String equivalent
    private void mapStringToJButton() {
        stringToJButton.put("A1", A1);
        stringToJButton.put("A2", A2);
        stringToJButton.put("A3", A3);
        stringToJButton.put("A4", A4);
        stringToJButton.put("A5", A5);
        stringToJButton.put("A6", A6);
        stringToJButton.put("A7", A7);
        stringToJButton.put("A8", A8);
        stringToJButton.put("B1", B1);
        stringToJButton.put("B2", B2);
        stringToJButton.put("B3", B3);
        stringToJButton.put("B4", B4);
        stringToJButton.put("B5", B5);
        stringToJButton.put("B6", B6);
        stringToJButton.put("B7", B7);
        stringToJButton.put("B8", B8);
        stringToJButton.put("C1", C1);
        stringToJButton.put("C2", C2);
        stringToJButton.put("C3", C3);
        stringToJButton.put("C4", C4);
        stringToJButton.put("C5", C5);
        stringToJButton.put("C6", C6);
        stringToJButton.put("C7", C7);
        stringToJButton.put("C8", C8);
        stringToJButton.put("D1", D1);
        stringToJButton.put("D2", D2);
        stringToJButton.put("D3", D3);
        stringToJButton.put("D4", D4);
        stringToJButton.put("D5", D5);
        stringToJButton.put("D6", D6);
        stringToJButton.put("D7", D7);
        stringToJButton.put("D8", D8);
        stringToJButton.put("E1", E1);
        stringToJButton.put("E2", E2);
        stringToJButton.put("E3", E3);
        stringToJButton.put("E4", E4);
        stringToJButton.put("E5", E5);
        stringToJButton.put("E6", E6);
        stringToJButton.put("E7", E7);
        stringToJButton.put("E8", E8);
        stringToJButton.put("F1", F1);
        stringToJButton.put("F2", F2);
        stringToJButton.put("F3", F3);
        stringToJButton.put("F4", F4);
        stringToJButton.put("F5", F5);
        stringToJButton.put("F6", F6);
        stringToJButton.put("F7", F7);
        stringToJButton.put("F8", F8);
        stringToJButton.put("G1", G1);
        stringToJButton.put("G2", G2);
        stringToJButton.put("G3", G3);
        stringToJButton.put("G4", G4);
        stringToJButton.put("G5", G5);
        stringToJButton.put("G6", G6);
        stringToJButton.put("G7", G7);
        stringToJButton.put("G8", G8);
        stringToJButton.put("H1", H1);
        stringToJButton.put("H2", H2);
        stringToJButton.put("H3", H3);
        stringToJButton.put("H4", H4);
        stringToJButton.put("H5", H5);
        stringToJButton.put("H6", H6);
        stringToJButton.put("H7", H7);
        stringToJButton.put("H8", H8);
    }
   
    /*public void setStartLayout(){
        A1.setIcon(whiteRook);
        B1.setIcon(whiteKnight);
        C1.setIcon(whiteBishop);
        D1.setIcon(whiteKing);
        E1.setIcon(whiteQueen);
        F1.setIcon(whiteBishop);
        G1.setIcon(whiteKnight);
        H1.setIcon(whiteRook);
        A2.setIcon(whitePawn);
        B2.setIcon(whitePawn);
        C2.setIcon(whitePawn);
        D2.setIcon(whitePawn);
        E2.setIcon(whitePawn);
        E2.setIcon(whitePawn);
        F2.setIcon(whitePawn);
        G2.setIcon(whitePawn);
        H2.setIcon(whitePawn);
        A8.setIcon(blackRook);
        B8.setIcon(blackKnight);
        C8.setIcon(blackBishop);
        D8.setIcon(blackKing);
        E8.setIcon(blackQueen);
        F8.setIcon(blackBishop);
        G8.setIcon(blackKnight);
        H8.setIcon(blackRook);
        A7.setIcon(blackPawn);
        B7.setIcon(blackPawn);
        C7.setIcon(blackPawn);
        D7.setIcon(blackPawn);
        E7.setIcon(blackPawn);
        F7.setIcon(blackPawn);
        G7.setIcon(blackPawn);
        H7.setIcon(blackPawn);
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chess1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chess1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chess1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chess1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TitlePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton D7;
    private javax.swing.JButton D8;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton E6;
    private javax.swing.JButton E7;
    private javax.swing.JButton E8;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JButton G1;
    private javax.swing.JButton G2;
    private javax.swing.JButton G3;
    private javax.swing.JButton G4;
    private javax.swing.JButton G5;
    private javax.swing.JButton G6;
    private javax.swing.JButton G7;
    private javax.swing.JButton G8;
    private javax.swing.JButton H1;
    private javax.swing.JButton H2;
    private javax.swing.JButton H3;
    private javax.swing.JButton H4;
    private javax.swing.JButton H5;
    private javax.swing.JButton H6;
    private javax.swing.JButton H7;
    private javax.swing.JButton H8;
    private javax.swing.JButton btnHowToPlay;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResign;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtOutput;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
