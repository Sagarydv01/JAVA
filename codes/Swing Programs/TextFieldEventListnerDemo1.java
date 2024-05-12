// TextFieldEventListener with setLayout()
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldEventListnerDemo1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextFieldEvent");

        JTextField textField1 = new JTextField(20);
        JTextField textField2 = new JTextField(20);

        textField1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                // textField2.setText(""); // Clear textField2
                textField1.setText(String.valueOf(e.getKeyChar())); // Set text of textField1 to the typed character
            }
            public void keyReleased(KeyEvent e) {
                textField2.setText("Released!");
            }
        });

        // Set layout to FlowLayout
        frame.setLayout(new FlowLayout());
        frame.add(textField1);
        frame.add(textField2);
        
        frame.setSize(300, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
