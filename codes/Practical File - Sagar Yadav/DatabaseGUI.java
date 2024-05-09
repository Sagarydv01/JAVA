// 25. Write a java program to retrieve data from database and display it on GUI.

import javax.swing.*;
import javax.swing.table.DefaultTableModel; // Import DefaultTableModel
import java.sql.*;

public class DatabaseGUI extends JFrame {
    private JTable table;
    private JScrollPane scrollPane;

    public DatabaseGUI() {
        setTitle("Database Data Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Create table and scroll pane
        table = new JTable();
        scrollPane = new JScrollPane(table);
        add(scrollPane);

        // Fetch data from database and display in the table
        fetchData();

        // Set frame visibility
        setVisible(true);
    }

    private void fetchData() {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/Java_Sagar";
            String username = "root";
            String password = "admin";
            conn = DriverManager.getConnection(url, username, password);

            // Execute query to retrieve data
            stmt = conn.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(sql);

            // Populate data into the table model
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            // Set the table model
            table.setModel(model);

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DatabaseGUI::new);
    }
}
