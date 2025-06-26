import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Services implements ServicesInterface {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345";

    public void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter the fin: ");
        String fin = scanner.nextLine();

        System.out.print("Enter the serial number (passport): ");
        String serialNumber = scanner.nextLine();

        System.out.print("Enter the number of departures: ");
        int numberOfDepartures = scanner.nextInt();

        System.out.print("Enter the register date (dd.MM.yyyy): ");
        String registerDateString = scanner.next();

        System.out.print("Enter the membership expiration date (dd.MM.yyyy): ");
        String expirationDateString = scanner.next();

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            String sql = "INSERT INTO gym (name, surname, fin, serial_number, "
                    + "number_of_departures, register_date, expiration_date, amount) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, fin);
            preparedStatement.setString(4, serialNumber);
            preparedStatement.setInt(5, numberOfDepartures);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date registerDate = dateFormat.parse(registerDateString);
            Date expirationDate = dateFormat.parse(expirationDateString);

            java.sql.Date sqlRegisterDate = new java.sql.Date(registerDate.getTime());
            java.sql.Date sqlExpirationDate = new java.sql.Date(expirationDate.getTime());

            preparedStatement.setDate(6, sqlRegisterDate);
            preparedStatement.setDate(7, sqlExpirationDate);

            preparedStatement.setDouble(8, amount);

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Success!!!");
            } else {
                System.out.println("Error!!!");
            }

        } catch (ClassNotFoundException | SQLException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void showAllMembers() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            String sql = "SELECT * FROM gym";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String fin = resultSet.getString("fin");
                String serialNumber = resultSet.getString("serial_number");
                int numberOfDepartures = resultSet.getInt("number_of_departures");
                Date registerDate = resultSet.getDate("register_date");
                Date expirationDate = resultSet.getDate("expiration_date");
                double amount = resultSet.getDouble("amount");
                //soyadı
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

                System.out.println("---------------");
                System.out.println(id + ". " + surname + " " + name);
                System.out.println("   Fin: " + fin);
                System.out.println("   Serial Number (passport): " + serialNumber);
                System.out.println("   Number of departures: " + numberOfDepartures);
                System.out.println("   Register date: " + dateFormat.format(registerDate));
                System.out.println("   Update date: " + dateFormat.format(new Date()));
                System.out.println("   Membership expiration date: " + dateFormat.format(expirationDate));
                System.out.println("   Amount: " + amount + " Azn");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void enterGYM() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------| Enter the gym |------");
        System.out.print("Enter the fin code: ");
        String finCode = scanner.nextLine();

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            String checkFinCodeSql = "SELECT * FROM gym WHERE fin = ?";
            PreparedStatement checkFinCodeStatement = connection.prepareStatement(checkFinCodeSql);
            checkFinCodeStatement.setString(1, finCode);
            ResultSet finCodeResultSet = checkFinCodeStatement.executeQuery();

            if (finCodeResultSet.next()) {
                int memberId = finCodeResultSet.getInt("id");
                int remainingDepartures = finCodeResultSet.getInt("number_of_departures");

                if (remainingDepartures > 0) {
                    System.out.println("---- " + finCodeResultSet.getString("surname") + " "
                            + finCodeResultSet.getString("name") + " - " + remainingDepartures + " departures left. ----");

                    String updateDeparturesSql = "UPDATE gym SET number_of_departures = ? WHERE id = ?";
                    PreparedStatement updateDeparturesStatement = connection.prepareStatement(updateDeparturesSql);
                    updateDeparturesStatement.setInt(1, remainingDepartures - 1);
                    updateDeparturesStatement.setInt(2, memberId);
                    updateDeparturesStatement.executeUpdate();
                } else {
                    System.out.println("---- Rejected ----");
                }
            } else {
                System.out.println("Member with fin code " + finCode + " not found.");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateDepartures() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------| Update departures |------");
        System.out.print("Enter the fin code: ");
        String finCode = scanner.nextLine();

        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            String checkFinCodeSql = "SELECT * FROM gym WHERE fin = ?";
            PreparedStatement checkFinCodeStatement = connection.prepareStatement(checkFinCodeSql);
            checkFinCodeStatement.setString(1, finCode);
            ResultSet finCodeResultSet = checkFinCodeStatement.executeQuery();

            if (finCodeResultSet.next()) {
                int memberId = finCodeResultSet.getInt("id");
                int currentDepartures = finCodeResultSet.getInt("number_of_departures");

                System.out.print("Add number of departures: ");
                int additionalDepartures = scanner.nextInt();

                System.out.print("Enter the update date (dd.MM.yyyy): ");
                String updateDateString = scanner.next();

                System.out.print("Enter the membership expiration date (dd.MM.yyyy): ");
                String expirationDateString = scanner.next();

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                Date updateDate = dateFormat.parse(updateDateString);
                Date expirationDate = dateFormat.parse(expirationDateString);

                java.sql.Date sqlUpdateDate = new java.sql.Date(updateDate.getTime());
                java.sql.Date sqlExpirationDate = new java.sql.Date(expirationDate.getTime());

                int updatedDepartures = currentDepartures + additionalDepartures;

                String updateDeparturesSql = "UPDATE gym SET number_of_departures = ?, "
                        + "update_date = ?, expiration_date = ? WHERE id = ?";
                PreparedStatement updateDeparturesStatement = connection.prepareStatement(updateDeparturesSql);
                updateDeparturesStatement.setInt(1, updatedDepartures);
                updateDeparturesStatement.setDate(2, sqlUpdateDate);
                updateDeparturesStatement.setDate(3, sqlExpirationDate);
                updateDeparturesStatement.setInt(4, memberId);
                updateDeparturesStatement.executeUpdate();

                System.out.println(finCodeResultSet.getString("surname") + " "
                        + finCodeResultSet.getString("name") + " – Departure updated successfully!");
            } else {
                System.out.println("Member with fin code " + finCode + " not found.");
            }

        } catch (ClassNotFoundException | SQLException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}