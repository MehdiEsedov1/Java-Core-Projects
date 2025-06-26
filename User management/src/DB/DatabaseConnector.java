package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String USER_NAME = "postgres";
    public static final String PASSWORD = "123";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }
}