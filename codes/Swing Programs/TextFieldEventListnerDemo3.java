// TextField Event Listner with JPanel
import javax.swing.*;
import java.awt.event.*;

public class TextFieldEventListnerDemo3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextFieldEvent");
        JPanel panel = new JPanel(); // Panel to hold components

        JTextField textField1 = new JTextField(20);
        JTextField textField2 = new JTextField(20); // Adjust width as needed

        textField1.addKeyListener(new KeyAdapter() { // Use KeyAdapter for simplicity
            public void keyPressed(KeyEvent e) {
                textField1.setText(String.valueOf(e.getKeyChar())); // Set text of textField1 to the typed character
            }
            public void keyReleased(KeyEvent e) { // Corrected method name
                textField2.setText("Released!");
            }
        });

        panel.add(textField1);
        panel.add(textField2);
        
        frame.add(panel); // Add panel to the frame
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
