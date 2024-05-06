// Prime Number
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PrimeNumber extends Applet implements ActionListener {
    TextField t1 = new TextField(10);
    Label l1 = new Label("Enter Number to Check: ");

    TextField t2 = new TextField(30);
    Label l2 = new Label("The number is: ");

    Button b = new Button("CHECK");

    public void init() {
        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(b);

        b.addActionListener(this); // Fixed typo here, ActionListener -> addActionListener
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            int num = Integer.parseInt(t1.getText());
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }

            if (count == 2)
                t2.setText("Prime Number");
            else
                t2.setText("Not a Prime Number");
        }
    }
}
