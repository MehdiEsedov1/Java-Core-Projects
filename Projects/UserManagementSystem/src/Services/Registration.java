package Services;

import DB.DatabaseConnector;
import Management.Helpers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registration {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;

    public void registrationOfUser() {
        String name = Helpers.scannerString("\n------------------\nName :");
        String surname = Helpers.scannerString("Surname :");
        int age = Helpers.scannerInt("Age :");
        String position = Helpers.scannerString("Position :");
        int salary = Helpers.scannerInt("Salary :");

        try {
            connection = DatabaseConnector.connect();
            String query = "insert into users values(?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, position);
            preparedStatement.setInt(4, salary);
            preparedStatement.setInt(5, age);

            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}