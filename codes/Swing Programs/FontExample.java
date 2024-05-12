// Font formatting in Swing
import javax.swing.*;
import java.awt.*;

public class FontExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Font Formatting");
        
        JLabel label = new JLabel("Sagar", JLabel.CENTER); // Alignment: Center

        Font font = new Font("Times New Roman", Font.BOLD, 20); // Define Font
        label.setFont(font); // Set Font

        label.setForeground(Color.BLUE); // Change Font Color

        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}