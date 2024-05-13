import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ConnectivityWithSwingExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JDBC Connectivity With Swing");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField textField = new JTextField(25);
        textField.setBounds(10, 10, 250, 25); // Set bounds for text field
        frame.add(textField);

        JButton insert = new JButton("Insert");
        insert.setBounds(10, 50, 100, 25); // Set bounds for insert button
        frame.add(insert);

        JButton display = new JButton("Display");
        display.setBounds(120, 50, 100, 25); // Set bounds for display button
        frame.add(display);

        JButton delete = new JButton("Delete");
        delete.setBounds(230, 50, 100, 25); // Set bounds for delete button
        frame.add(delete);

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
                    System.out.println("Error: " + er.getMessage());
                }
            }
        });

        display.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Java_Sagar", "root", "admin");
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
                    while (rs.next()) {
                        System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Course: " + rs.getString(3));
                    }
                    System.out.println("");
                    rs.close();
                    stmt.close();
                    conn.close();
                } catch (SQLException er) {
                    System.out.println("Error: " + er.getMessage());
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
                    System.out.println("Error: " + er.getMessage());
                }
            }
        });
    }
}
