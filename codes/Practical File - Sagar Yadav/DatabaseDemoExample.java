// 24. Write a java program to insert and update details data in the database
import java.sql.*;

public class DatabaseDemoExample {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/Java_Sagar";

    static final String USER = "root";
    static final String PASS = "admin";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();
            String sql = "INSERT INTO student (id, name, department) VALUES (101, 'Sagar Yadav', 'BCA')";
            stmt.executeUpdate(sql);
            System.out.println("Record(s) inserted successfully");

            System.out.println("Updating record...");
            sql = "UPDATE student SET Department = 'Bachelor of Computer Applications' WHERE id = 101";
            stmt.executeUpdate(sql);
            System.out.println("Record updated successfully");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Radhe Radhe!");
    }
} // Sagar Yadav, Enrollment No.: 02027902022, 4th Semester, BCA (2022-25)