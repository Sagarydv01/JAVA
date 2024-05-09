import javax.swing.*;

public class SwingButtonWithActionWay2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Button with Action");
        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 100, 200);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Lamba expression
        button.addActionListener (e -> {
            button.setText("Clicked by you!");
        });
    }
}