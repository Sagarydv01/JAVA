import javax.swing.*;

public class SwingButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button in Swing");
        JButton button = new JButton("Click Me");
        
        button.setBounds(50, 50, 100, 200);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }   
}
