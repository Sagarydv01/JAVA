// Text Field Event Listener without setLayout() method
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldEventListnerDemo2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextFieldEvent");

        JTextField textField1 = new JTextField(20);
        JTextField textField2 = new JTextField(20); // Adjust width as needed

        textField1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                textField2.setText(""); // Clear textField2
                textField1.setText(String.valueOf(e.getKeyChar())); // Set text of textField1 to the typed character
            }
            public void keyReleased(KeyEvent e) {
                textField2.setText("Released!");
            }
        });

        frame.add(textField1, BorderLayout.NORTH); // Place textField1 in the NORTH region
        frame.add(textField2, BorderLayout.CENTER); // Place textField2 in the CENTER region
        
        frame.setSize(300, 100); // Reduced height to fit both text fields comfortably
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
