import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ConnectivityWithSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JDBC Connectivity With Swing");
        JTextField textField = new JTextField(25);
        JButton insert = new JButton("Insert");
        JButton display = new JButton("Display");
        JButton delete = new JButton("Delete");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(insert);
        frame.add(display);
        frame.add(delete);
        frame.setSize(300, 300);
        frame.setVisible(true);

        insert.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Java_Sagar", "root", "admin");
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate("INSERT INTO Student Values (106, 'Shivam', 'BCom')");
                    stmt.close();
                    conn.close();
                    textField.setText("Query Executed Successfully");
                } catch (SQLException er) {
                    System.out.println("Error: " + er.getMessage());
                }
            }
        });
    }
}
