import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ConnectivityWithSwingExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JDBC Connectivity With Swing");
        JTextField textField = new JTextField(25);
        JTextArea textArea = new JTextArea(10, 25); // TextArea to display results
        JButton insert = new JButton("Insert");
        JButton display = new JButton("Display");
        JButton delete = new JButton("Delete");

        // Layout with BorderLayout
        frame.setLayout(new BorderLayout());

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(insert);
        buttonPanel.add(display);
        buttonPanel.add(delete);

        // Add components to the frame
        frame.add(textField, BorderLayout.NORTH);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        insert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Java_Sagar", "root", "admin");
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate("INSERT INTO Student Values (106, 'Shivam', 'BCom')");
                    stmt.close();
                    conn.close();
                    textField.setText("Query Executed Successfully");
                } catch (SQLException er) {
                    textArea.append("Error: " + er.getMessage() + "\n");
                }
            }
        });

        display.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText(""); // Clear text area before displaying results
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Java_Sagar", "root", "admin");
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
                    while (rs.next()) {
                        textArea.append("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Course: " + rs.getString(3) + "\n");
                    }
                    rs.close();
                    stmt.close();
                    conn.close();
                } catch (SQLException er) {
                    textArea.append("Error: " + er.getMessage() + "\n");
                }
            }
        });

        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Java_Sagar", "root", "admin");
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate("DELETE FROM Student WHERE ID=106");
                    stmt.close();
                    conn.close();
                    textField.setText("Record Deleted Successfully");
                } catch (SQLException er) {
                    textArea.append("Error: " + er.getMessage() + "\n");
                }
            }
        });
    }
}
