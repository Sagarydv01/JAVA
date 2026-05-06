// 29. Write a program to develop make GUI application for Sum,Multiple,Division,Minus of two numbers.  

import javax.swing.*;

public class BasicCalculatorGUI {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Basic Calculator");
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // First number
        JLabel lbl1 = new JLabel("Number 1:");
        lbl1.setBounds(20, 20, 80, 25);
        frame.add(lbl1);

        JTextField tf1 = new JTextField();
        tf1.setBounds(100, 20, 250, 25);
        frame.add(tf1);

        // Second number
        JLabel lbl2 = new JLabel("Number 2:");
        lbl2.setBounds(20, 60, 80, 25);
        frame.add(lbl2);

        JTextField tf2 = new JTextField();
        tf2.setBounds(100, 60, 250, 25);
        frame.add(tf2);

        // Result label
        JLabel lblResult = new JLabel("Result:");
        lblResult.setBounds(20, 100, 80, 25);
        frame.add(lblResult);

        JTextField tfResult = new JTextField();
        tfResult.setBounds(100, 100, 250, 25);
        tfResult.setEditable(false);
        frame.add(tfResult);

        // Buttons
        JButton sumBtn = new JButton("Sum");
        sumBtn.setBounds(20, 140, 80, 30);
        frame.add(sumBtn);

        JButton mulBtn = new JButton("Multiply");
        mulBtn.setBounds(110, 140, 100, 30);
        frame.add(mulBtn);

        JButton divBtn = new JButton("Divide");
        divBtn.setBounds(220, 140, 80, 30);
        frame.add(divBtn);

        JButton minusBtn = new JButton("Minus");
        minusBtn.setBounds(310, 140, 80, 30);
        frame.add(minusBtn);

        // Action listeners
        sumBtn.addActionListener(e -> {
            double n1 = Double.parseDouble(tf1.getText());
            double n2 = Double.parseDouble(tf2.getText());
            tfResult.setText(String.valueOf(n1 + n2));
        });

        mulBtn.addActionListener(e -> {
            double n1 = Double.parseDouble(tf1.getText());
            double n2 = Double.parseDouble(tf2.getText());
            tfResult.setText(String.valueOf(n1 * n2));
        });

        divBtn.addActionListener(e -> {
            double n1 = Double.parseDouble(tf1.getText());
            double n2 = Double.parseDouble(tf2.getText());
            if (n2 != 0) {
                tfResult.setText(String.valueOf(n1 / n2));
            } else {
                JOptionPane.showMessageDialog(frame, "Division by zero is not allowed");
            }
        });

        minusBtn.addActionListener(e -> {
            double n1 = Double.parseDouble(tf1.getText());
            double n2 = Double.parseDouble(tf2.getText());
            tfResult.setText(String.valueOf(n1 - n2));
        });

        frame.setVisible(true);
    }
}