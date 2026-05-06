// 33. Write a program using different Layout Managers (Flow, Border, Grid). 

import javax.swing.*;
import java.awt.*;

public class SimpleLayoutDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Layouts");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // -------- FlowLayout --------
        JPanel flow = new JPanel();
        flow.setLayout(new FlowLayout());
        flow.add(new JButton("A"));
        flow.add(new JButton("B"));

        // -------- BorderLayout --------
        JPanel border = new JPanel();
        border.setLayout(new BorderLayout());
        border.add(new JButton("N"), BorderLayout.NORTH);
        border.add(new JButton("C"), BorderLayout.CENTER);

        // -------- GridLayout --------
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(2, 2));
        grid.add(new JButton("1"));
        grid.add(new JButton("2"));
        grid.add(new JButton("3"));
        grid.add(new JButton("4"));

        // Add all panels
        frame.setLayout(new GridLayout(3, 1));
        frame.add(flow);
        frame.add(border);
        frame.add(grid);

        frame.setVisible(true);
    }
}