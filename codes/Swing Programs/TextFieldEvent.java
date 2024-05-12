import javax.swing.*;
import java.awt.event.*;

public class TextFieldEvent {
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

        // No layout manager specified, so components will be added from left to right
        frame.add(textField1);
        frame.add(textField2);
        
        frame.pack(); // Adjusts frame size to fit its contents
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
