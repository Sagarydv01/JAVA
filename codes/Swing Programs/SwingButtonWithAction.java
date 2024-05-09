import javax.swing.*;
import java.awt.event.*;

public class SwingButtonWithAction {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Button with Action");
        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 100, 200);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setText("Hello, Sagar!");
            }
        });
    }
}
