import javax.swing.*;

public class SimpleScreen2 extends JFrame {
    SimpleScreen2() {
        setTitle("Simple Screen");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SimpleScreen2();        
    }
}
