// 15. Write a program to demonstrate any event handling.
import javax.swing.*;
import java.awt.event.*;

public class EventHandlingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Button with TextField Action Event");
        JButton button = new JButton("Click Me");
        JTextField textField = new JTextField();

        frame.setSize(300, 300);
        button.setBounds(50, 50, 100, 20);
        textField.setBounds(50, 30, 160, 20);

        frame.add(button);
        frame.add(textField);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button Clicked by Sagar!");
            }
        });
    }
} // Sagar Yadav, Enrollment No.: 02027902022, 4th Semester, BCA (2022-25)