/* Problem Statement:
You have two buttons and a textbox, if button1 ("OK") is clicked then the textbox will be updated with text "Pressed Button1 ("OK")" and if button2 ("Cancel") is clicked then the Textbox would be cleared!
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Problem1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components
        JTextField textField = new JTextField(20);
        JButton button1 = new JButton("OK");
        JButton button2 = new JButton("Cancel");

        // Add action listner to button1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Pressed Button1 (\"OK\")");
            }
        });

        // Add action listner to button2
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(""); // Clear the text field
            }
        });

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);

        // Add components to frame
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
