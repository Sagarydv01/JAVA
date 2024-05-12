import javax.swing.*;

public class Jlabel_Icon {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Icon");
        ImageIcon icon = new ImageIcon("App Dev.png");
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setSize(500, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
