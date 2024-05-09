// 24. Write a java program to insert and update details data in the database
import java.sql.*;

public class DatabaseDemo {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/Java_Sagar";

    static final String USER = "root";
    static final String PASS = "admin";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute a query to insert data
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();
            String sql = "INSERT INTO student (id, name, department) VALUES (101, 'Sagar Yadav', 'BCA')";
            stmt.executeUpdate(sql);
            System.out.println("Record(s) inserted successfully");

            // Execute a query to update data
            System.out.println("Updating record...");
            sql = "UPDATE student SET Department = 'Bachelor of Computer Applications' WHERE id = 101";
            stmt.executeUpdate(sql);
            System.out.println("Record updated successfully");

            // Clean-up environment
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Radhe Radhe!");
    }
}
