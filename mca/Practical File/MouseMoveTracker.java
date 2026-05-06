// 30. Write a program to track mouse move event using Event driven programming. 

import javax.swing.*;
import java.awt.event.*;

public class MouseMoveTracker {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Mouse Move Tracker");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label to show mouse coordinates
        JLabel lblCoordinates = new JLabel("Move mouse inside the window");
        lblCoordinates.setBounds(50, 50, 300, 25);
        frame.add(lblCoordinates);

        // Add mouse motion listener
        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Optional: handle drag events
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                lblCoordinates.setText("Mouse Coordinates: X = " + x + ", Y = " + y);
            }
        });

        frame.setVisible(true);
    }
}