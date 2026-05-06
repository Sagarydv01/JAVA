// 31. Write a program to draw 2D shapes (line, rectangle, circle). 

import javax.swing.*;
import java.awt.*;

class DrawShapesPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a line (x1, y1, x2, y2)
        g.drawLine(50, 50, 200, 50);

        // Draw a rectangle (x, y, width, height)
        g.drawRect(50, 100, 150, 80);

        // Draw a circle (oval with equal width and height)
        g.drawOval(50, 220, 100, 100); // x, y, width, height
    }
}

public class Draw2DShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw 2D Shapes");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawShapesPanel panel = new DrawShapesPanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}