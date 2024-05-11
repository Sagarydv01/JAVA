// 22. Write a swing application that uses atleast 5 swing controls.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingControlsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Controls Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        // Add label
        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel);

        // Add text field
        JTextField nameField = new JTextField(20);
        panel.add(nameField);

        // Add radio buttons
        JLabel genderLabel = new JLabel("Gender:");
        panel.add(genderLabel);

        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        panel.add(maleRadioButton);
        panel.add(femaleRadioButton);

        // Add checkbox
        JLabel hobbiesLabel = new JLabel("Hobbies:");
        panel.add(hobbiesLabel);

        JCheckBox readingCheckBox = new JCheckBox("Reading");
        JCheckBox sportsCheckBox = new JCheckBox("Sports");
        panel.add(readingCheckBox);
        panel.add(sportsCheckBox);

        // Add combo box
        JLabel countryLabel = new JLabel("Country:");
        panel.add(countryLabel);

        String[] countries = {"USA", "UK", "India", "Canada", "Australia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        panel.add(countryComboBox);

        // Add button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                String hobbies = (readingCheckBox.isSelected() ? "Reading, " : "") +
                                 (sportsCheckBox.isSelected() ? "Sports" : "");
                String country = (String) countryComboBox.getSelectedItem();

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name + "\nGender: " + gender + "\nHobbies: " + hobbies + "\nCountry: " + country,
                        "User Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(submitButton);

        // Add panel to frame
        frame.add(panel);

        frame.setVisible(true);
    }
}  // Sagar Yadav, Enrollment No.: 02027902022, 4rth Semester, 2022-25, BCA