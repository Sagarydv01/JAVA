// 28. Write program to develop GUI applications using Swing components.

import java.awt.*;
import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter name:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Submit");
        JLabel result = new JLabel("");

        button.addActionListener(e -> {
            String name = textField.getText();
            result.setText("Hello, " + name);
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(result);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}