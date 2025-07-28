import java.sql.*;

public class insertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employeedb";
        String user = "root";
        String password = "parsuram";

        // Connect to MySQL
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // Create table if it doesn't exist
            String createTable = "CREATE TABLE IF NOT EXISTS EmpData (" +
                    "empcode INT, " +
                    "empname VARCHAR(50), " +
                    "empage INT, " +
                    "esalary INT)";
            stmt.executeUpdate(createTable);

            // Insert records
            String[] queries = {
                    "INSERT INTO EmpData VALUES (101, 'Jenny', 25, 10000)",
                    "INSERT INTO EmpData VALUES (102, 'Jacky', 30, 20000)",
                    "INSERT INTO EmpData VALUES (103, 'Joe', 20, 40000)",
                    "INSERT INTO EmpData VALUES (104, 'John', 40, 80000)",
                    "INSERT INTO EmpData VALUES (105, 'Shameer', 25, 90000)"
            };

            for (String query : queries) {
                stmt.executeUpdate(query);
            }

            System.out.println("All Records inserted successfully");

            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
