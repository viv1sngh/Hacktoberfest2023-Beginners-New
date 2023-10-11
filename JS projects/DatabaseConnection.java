import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

Connection connection = null;
try {
    // Provide the database URL, username, and password
    String url = "jdbc:database://localhost:3306/your_database";
    String username = "your_username";
    String password = "your_password";

    // Initialize the connection
    connection = DriverManager.getConnection(url, username, password);

    if (connection != null) {
        System.out.println("Connected to the database.");
    }
} catch (SQLException e) {
    // Handle any database connection errors
    e.printStackTrace();
} finally {
    // Close the connection when done
    if (connection != null) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
