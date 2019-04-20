/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Connor
 */
public class Game extends javax.swing.JPanel {

    
   
    String turn;
    int n = 3;
    String[][] board = new String[n][n];
    int moveCount;
    int uScore = 1;
    int cScore = 1;
          
    /**
     * Creates new form NewJPanel
     */
    public Game() {
        this.turn = "O";
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        computer = new javax.swing.JLabel();
        userScore = new javax.swing.JTextField();
        computerScore = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();

        jOptionPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jOptionPane1.setToolTipText("thrth");
        jOptionPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                r(evt);
            }
        });

        setBackground(java.awt.Color.darkGray);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.setOpaque(false);

        user.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        user.setForeground(new java.awt.Color(255, 102, 0));
        user.setText("User");

        computer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        computer.setForeground(new java.awt.Color(255, 102, 0));
        computer.setText("Computer");

        userScore.setEditable(false);
        userScore.setBackground(new java.awt.Color(51, 51, 51));
        userScore.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        userScore.setForeground(new java.awt.Color(255, 255, 255));
        userScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userScore.setText("0");
        userScore.setFocusable(false);
        userScore.setHighlighter(null);
        userScore.setRequestFocusEnabled(false);
        userScore.setSelectionColor(new java.awt.Color(0, 204, 153));
        userScore.setVerifyInputWhenFocusTarget(false);
        userScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userScoreActionPerformed(evt);
            }
        });

        computerScore.setEditable(false);
        computerScore.setBackground(new java.awt.Color(51, 51, 51));
        computerScore.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        computerScore.setForeground(new java.awt.Color(255, 255, 255));
        computerScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        computerScore.setText("0");
        computerScore.setFocusable(false);
        computerScore.setRequestFocusEnabled(false);
        computerScore.setVerifyInputWhenFocusTarget(false);
        computerScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(user))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(userScore, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(computer))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(computer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userScore)
                    .addComponent(computerScore))
                .addGap(32, 32, 32))
        );

        reset.setBackground(new java.awt.Color(255, 102, 0));
        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        b1.setBorderPainted(false);
        b1.setFocusPainted(false);
        b1.setFocusable(false);
        b1.setRequestFocusEnabled(false);
        b1.setRolloverEnabled(false);
        b1.setVerifyInputWhenFocusTarget(false);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                b1MouseReleased(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        b2.setBorderPainted(false);
        b2.setFocusPainted(false);
        b2.setFocusable(false);
        b2.setRequestFocusEnabled(false);
        b2.setRolloverEnabled(false);
        b2.setVerifyInputWhenFocusTarget(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        b3.setBorderPainted(false);
        b3.setFocusPainted(false);
        b3.setFocusable(false);
        b3.setRequestFocusEnabled(false);
        b3.setRolloverEnabled(false);
        b3.setVerifyInputWhenFocusTarget(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        b4.setBorderPainted(false);
        b4.setFocusPainted(false);
        b4.setFocusable(false);
        b4.setRequestFocusEnabled(false);
        b4.setRolloverEnabled(false);
        b4.setVerifyInputWhenFocusTarget(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        b5.setBorderPainted(false);
        b5.setFocusPainted(false);
        b5.setFocusable(false);
        b5.setRequestFocusEnabled(false);
        b5.setRolloverEnabled(false);
        b5.setVerifyInputWhenFocusTarget(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        b6.setBorderPainted(false);
        b6.setFocusPainted(false);
        b6.setFocusable(false);
        b6.setRequestFocusEnabled(false);
        b6.setRolloverEnabled(false);
        b6.setVerifyInputWhenFocusTarget(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        b7.setBorderPainted(false);
        b7.setFocusPainted(false);
        b7.setFocusable(false);
        b7.setRequestFocusEnabled(false);
        b7.setRolloverEnabled(false);
        b7.setVerifyInputWhenFocusTarget(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        b8.setBorderPainted(false);
        b8.setFocusPainted(false);
        b8.setFocusable(false);
        b8.setRequestFocusEnabled(false);
        b8.setRolloverEnabled(false);
        b8.setVerifyInputWhenFocusTarget(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        b9.setBorderPainted(false);
        b9.setFocusPainted(false);
        b9.setFocusable(false);
        b9.setRequestFocusEnabled(false);
        b9.setRolloverEnabled(false);
        b9.setVerifyInputWhenFocusTarget(false);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(59, 59, 59)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reset)
                        .addGap(258, 258, 258))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(reset)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        clearArray();
    }//GEN-LAST:event_resetActionPerformed

    private void userScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userScoreActionPerformed

    private void computerScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_computerScoreActionPerformed

    private void r(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_r
        // TODO add your handling code here:
    }//GEN-LAST:event_r

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        checkWin(0, 0, play(b1));
    }//GEN-LAST:event_b1ActionPerformed

    private void b1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseReleased
        
    }//GEN-LAST:event_b1MouseReleased

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        checkWin(0, 1, play(b2));
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        checkWin(0, 2, play(b3));
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        checkWin(1, 0, play(b4));
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        checkWin(1, 1, play(b5));
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        checkWin(1, 2, play(b6));
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        checkWin(2, 0, play(b7));
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        checkWin(2, 1, play(b8));
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        checkWin(2, 2, play(b9));
    }//GEN-LAST:event_b9ActionPerformed
    
    private void clearArray() {
    for (int row = 0; row < board.length; row++) 
    { for (int col = 0; col < board[row].length; col++) 
    { 
        board[row][col] = null; } 
    }


    
    }
    private String play(JButton j) {
       if("X".equals(turn)){
           j.setText(turn);
           turn = "O";
           return "X";
       }
       else if("O".equals(turn)){
           j.setText(turn);
           turn = "X";
           return "O";
       }
        return null;
    }
    
    public void checkWin(int x, int y, String s){
                
        if(board[x][y] == null){
            board[x][y] = s;
        }
        moveCount++;
        
        //check end conditions

        //check col
        for(int i = 0; i < n; i++){
            if(board[x][i] == null ? s != null : !board[x][i].equals(s))
                break;
            if(i == n-1){
                 if("X".equals(s)){
                     
                    userScore.setText(Integer.toString(uScore));
                    uScore++;
                }
                else if("O".equals(s)){ 
                    computerScore.setText(Integer.toString(cScore));
                    cScore++;
                }
            }
        }

        //check row
        for(int i = 0; i < n; i++){
            if(board[i][y] == null ? s != null : !board[i][y].equals(s))
                break;
            if(i == n-1){
                 if("X".equals(s)){
                     
                    userScore.setText(Integer.toString(uScore));
                    uScore++;
                }
                else if("O".equals(s)){ 
                    computerScore.setText(Integer.toString(cScore));
                    cScore++;
                }
            }
        }

        //check diag
        if(x == y){
            //we're on a diagonal
            for(int i = 0; i < n; i++){
                if(board[i][i] == null ? s != null : !board[i][i].equals(s))
                    break;
                if(i == n-1){
                     if("X".equals(s)){
                     
                    userScore.setText(Integer.toString(uScore));
                    uScore++;
                }
                else if("O".equals(s)){ 
                    computerScore.setText(Integer.toString(cScore));
                    cScore++;
                }
                }
            }
        }

        //check anti diag (thanks rampion)
        if(x + y == n - 1){
            for(int i = 0; i < n; i++){
                if(board[i][(n-1)-i] == null ? s != null : !board[i][(n-1)-i].equals(s))
                    break;
                if(i == n-1){
                    if("X".equals(s)){
                     
                    userScore.setText(Integer.toString(uScore));
                    uScore++;
                }
                else if("O".equals(s)){ 
                    computerScore.setText(Integer.toString(cScore));
                    cScore++;
                }
                }
            }
            
        }

        //check draw
        if(moveCount == (Math.pow(n, 2) - 1)){
            //report draw
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel computer;
    private javax.swing.JTextField computerScore;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reset;
    private javax.swing.JLabel user;
    private javax.swing.JTextField userScore;
    // End of variables declaration//GEN-END:variables

    
}