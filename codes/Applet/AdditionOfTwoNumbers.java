// Addition of Two Numbers
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AdditionOfTwoNumbers extends Applet implements ActionListener {
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    TextField t3 = new TextField(10);

    Label l1 = new Label("First Number: ");
    Label l2 = new Label("Second Number: ");
    Label l3 = new Label("Result: ");
    Button button = new Button("Add");

    public void init() {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(button);
        button.addActionListener(this);
    }

    // Logical
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t3.setText(String.valueOf(c));
            } catch (NumberFormatException ex) {
                t3.setText("Invalid input");
            }
        }
    }
}
