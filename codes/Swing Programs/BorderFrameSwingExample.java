// Swing Border to Frame example
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderFrameSwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Border");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold other components
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE); // Set background color for demonstration
        frame.add(panel); // Add panel to the frame

        // Create a border
        Border border = BorderFactory.createLineBorder(Color.RED, 5);
        panel.setBorder(border); // Set the border to the panel

        frame.setVisible(true);
    }
}

/*
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class BorderSwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a border
        Border border = BorderFactory.createLineBorder(Color.RED, 5);
        frame.getRootPane().setBorder(border); // Set the border directly on the root pane

        frame.setVisible(true);
    }
}

 */