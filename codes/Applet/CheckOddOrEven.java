// Program to check a number is Odd number or Even number using Applet.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CheckOddOrEven extends Applet implements ActionListener { 
    TextField textField1 = new TextField(10);
    Label label1 = new Label("Enter number to check: ");
    TextField textField2 = new TextField(10);
    Label label2 = new Label("Result: ");
    Button button = new Button("Check");

    public void init() {
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            int num = Integer.parseInt(textField1.getText());
            if (num % 2 == 0)
                textField2.setText("Even Number");
            else
                textField2.setText("Odd Number");
        }
    }
}
