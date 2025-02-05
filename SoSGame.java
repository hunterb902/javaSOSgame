package SoSGame;

import java.awt.*;
import java.awt.event.*;

public class SoSGame extends Frame {
    Checkbox checkbox1, checkbox2;
    CheckboxGroup radioGroup;
    Checkbox radio1, radio2;
    String gamePiece = "";
    
    public SoSGame() {
        setTitle("First SOS test");
        setSize(400, 300);
        setLayout(null);
        
        // Label
        Label label = new Label("SOS Game");
        label.setBounds(50, 50, 100, 30);
        add(label);
        
        // Checkboxes
        checkbox1 = new Checkbox("S");
        checkbox2 = new Checkbox("O");
        
        checkbox1.setBounds(50, 100, 50, 30);
        checkbox2.setBounds(110, 100, 50, 30);
        
        checkbox1.addItemListener(e -> updateGamePiece("S"));
        checkbox2.addItemListener(e -> updateGamePiece("O"));
        
        add(checkbox1);
        add(checkbox2);
        
        // Radio Buttons
        radioGroup = new CheckboxGroup();
        radio1 = new Checkbox("Player 1", radioGroup, false);
        radio2 = new Checkbox("Player 2", radioGroup, false);
        
        radio1.setBounds(50, 140, 100, 30);
        radio2.setBounds(50, 170, 100, 30);
        
        add(radio1);
        add(radio2);
        
        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    
    public void updateGamePiece(String piece) {
        gamePiece = piece;
        System.out.println("Game piece set to: " + gamePiece);
    }
    
    public void paint(Graphics g) {
        g.drawLine(50, 200, 250, 200);
    }
    
    public static void main(String[] args) {
        SoSGame frame = new SoSGame();
        frame.setVisible(true);
    }
}
