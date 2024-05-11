// 21. Write program that uses swings to display combination of RGB using 3 scrollbars.
import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class RGBColorPicker extends JFrame {
    private JScrollBar redScrollBar;
    private JScrollBar greenScrollBar;
    private JScrollBar blueScrollBar;
    private JPanel colorPanel;

    public RGBColorPicker() {
        setTitle("RGB Color Picker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Create scroll bars
        redScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        greenScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);
        blueScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 256);

        // Create color panel
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.BLACK);

        // Set layout manager for the frame
        setLayout(new BorderLayout());

        // Create panels for scroll bars
        JPanel scrollPanel = new JPanel(new GridLayout(3, 1));
        scrollPanel.add(redScrollBar);
        scrollPanel.add(greenScrollBar);
        scrollPanel.add(blueScrollBar);

        // Add panels to the frame
        add(scrollPanel, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);

        // Add adjustment listeners to the scroll bars
        redScrollBar.addAdjustmentListener(new ScrollBarChangeListener());
        greenScrollBar.addAdjustmentListener(new ScrollBarChangeListener());
        blueScrollBar.addAdjustmentListener(new ScrollBarChangeListener());
    }

    // Adjustment listener for scroll bars
    class ScrollBarChangeListener implements AdjustmentListener {
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            int red = redScrollBar.getValue();
            int green = greenScrollBar.getValue();
            int blue = blueScrollBar.getValue();

            // Update color panel with new RGB values
            colorPanel.setBackground(new Color(red, green, blue));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RGBColorPicker colorPicker = new RGBColorPicker();
            colorPicker.setVisible(true);
        });
    }
}
