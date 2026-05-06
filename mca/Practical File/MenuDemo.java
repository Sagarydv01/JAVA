// 34. Write a program to create Menu and MenuItem.

import javax.swing.*;

public class MenuDemo {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Menu Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Create menu items for File menu
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);

        // Create menu items for Edit menu
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        // Add menu items to Edit menu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set menu bar for frame
        frame.setJMenuBar(menuBar);

        // Add action listeners
        newItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "New selected"));
        openItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Open selected"));
        exitItem.addActionListener(e -> System.exit(0));
        cutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Cut selected"));
        copyItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Copy selected"));
        pasteItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Paste selected"));

        frame.setVisible(true);
    }
}