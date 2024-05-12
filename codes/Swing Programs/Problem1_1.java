/* Problem Statement:
You have two buttons and a textbox, if button1 ("OK") is clicked then the textbox will be updated with text "Pressed Button1 ("OK")" and if button2 ("Cancel") is clicked then the Textbox would be cleared!
without JPanel
*/
import javax.swing.*;
import java.awt.event.*;

public class Problem1_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JTextField textField = new JTextField(20);
        JButton button1 = new JButton("OK");
        JButton button2 = new JButton("Cancel");

        // Set layout for frame
        frame.setLayout(null);

        // Set bounds for components
        textField.setBounds(20, 20, 200, 30);
        button1.setBounds(20, 60, 80, 30);
        button2.setBounds(120, 60, 80, 30);

        // Add action listener to button1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Pressed Button1 (\"OK\")");
            }
        });

        // Add action listener to button2
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(""); // Clear the text field
            }
        });

        // Add components to the frame
        frame.add(textField);
        frame.add(button1);
        frame.add(button2);

        // Set frame size and make it visible
        frame.setSize(250, 150);
        frame.setVisible(true);
    }
}
