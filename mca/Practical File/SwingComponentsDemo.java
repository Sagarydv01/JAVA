// 32. Write a program using Buttons, Checkboxes, and Radio Buttons. 

import javax.swing.*;
import java.awt.event.*;

public class SwingComponentsDemo {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label to display output
        JLabel lblOutput = new JLabel("Select options and click button");
        lblOutput.setBounds(50, 20, 300, 25);
        frame.add(lblOutput);

        // Button
        JButton btnClick = new JButton("Click Me");
        btnClick.setBounds(50, 60, 100, 30);
        frame.add(btnClick);

        // Checkboxes
        JCheckBox cb1 = new JCheckBox("Option 1");
        cb1.setBounds(50, 100, 100, 25);
        frame.add(cb1);

        JCheckBox cb2 = new JCheckBox("Option 2");
        cb2.setBounds(160, 100, 100, 25);
        frame.add(cb2);

        // Radio Buttons
        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(50, 140, 80, 25);
        frame.add(rb1);

        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(140, 140, 80, 25);
        frame.add(rb2);

        // Group radio buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        // Button action listener
        btnClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String msg = "You clicked the button. ";
                
                // Check selected checkboxes
                if (cb1.isSelected()) msg += "Option 1 selected. ";
                if (cb2.isSelected()) msg += "Option 2 selected. ";
                
                // Check selected radio button
                if (rb1.isSelected()) msg += "Male selected.";
                else if (rb2.isSelected()) msg += "Female selected.";
                else msg += "No gender selected.";

                lblOutput.setText(msg);
            }
        });

        frame.setVisible(true);
    }
}