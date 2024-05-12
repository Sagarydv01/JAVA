import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextFieldEvent");

        JTextField textField1 = new JTextField(20);
        JTextField textField2 = new JTextField(20); // Adjust width as needed

        textField1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                textField2.setText(""); // Clear textField2
                // Remove setting text of textField1 here
            }
            public void keyReleased(KeyEvent e) {
                textField2.setText("Released!");
            }
        });

        frame.setLayout(new FlowLayout()); // Set layout to FlowLayout
        frame.add(textField1);
        frame.add(textField2);
        
        frame.setSize(300, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/*
The issue of the character appearing twice in textField1 is likely due to the way the keyPressed event is handled. Currently, in the keyPressed event handler, the text of textField1 is set to the character entered by the user. However, the subsequent processing in the keyReleased event handler sets the text of textField1 again, leading to duplication of the character.

To resolve this, you can modify the keyReleased event handler to only set the text of textField2 without modifying the text of textField1
 */