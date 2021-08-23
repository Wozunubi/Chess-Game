/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 334013489
 */
public class TitlePage extends javax.swing.JFrame {

    int startGameCounter = 0;
    int tutorialCounter = 0;
    int creditsCounter = 0;
    /**
     * Creates new form OpenProgramError
     */
    public TitlePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        background = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnTutorial = new javax.swing.JButton();
        btnCredits = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Title Page (2).jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 350, 100));

        btnTutorial.setText("How to Play");
        btnTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorialActionPerformed(evt);
            }
        });
        getContentPane().add(btnTutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 350, 100));

        btnCredits.setText("Credits");
        btnCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditsActionPerformed(evt);
            }
        });
        getContentPane().add(btnCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 760, 160, 60));

        pack();
    }// </editor-fold>                        

    private void btnCreditsActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(creditsCounter == 0){
            new Credits().setVisible(true);
            creditsCounter++;
        }
    }                                          

    private void btnTutorialActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(startGameCounter == 0){
            new Chess1().setVisible(true);
            startGameCounter++;
        }
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCredits;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnTutorial;
    // End of variables declaration                   
}