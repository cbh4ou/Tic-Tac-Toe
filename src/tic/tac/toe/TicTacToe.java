// Main class
package tic.tac.toe;

/**
 *
 * @author Connor
 */

import java.awt.EventQueue;
import javax.swing.JFrame;

public class TicTacToe extends JFrame {

    public TicTacToe() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Game());
        
        setResizable(false);
        pack();
        
        setTitle("TicTacToe");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new TicTacToe();
            ex.setVisible(true);
        });
    }
    
}