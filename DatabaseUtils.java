package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseUtils {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/hgd";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        String query = "SELECT * FROM hang_gia_dung";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Product product = new Product(
                        resultSet.getString("mahang"),
                        resultSet.getString("ten"),
                        resultSet.getString("nhasx"),
                        resultSet.getInt("soluong"),
                        resultSet.getFloat("dongia")
                );
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void deleteProduct(String maHang) {
        String query = "DELETE FROM hang_gia_dung WHERE mahang = '" + maHang + "'";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
