import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class LabelBorderSwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        // Create labels
        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");

        // Create a border
        Border border = BorderFactory.createLineBorder(Color.RED, 5);

        // Set the border for each label
        label1.setBorder(border);
        label2.setBorder(border);

        // Add labels to the panel
        panel.add(label1);
        panel.add(label2);

        frame.setVisible(true);
    }
}
