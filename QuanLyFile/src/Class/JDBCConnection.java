/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCConnection {

    private Connection connection = null;

    public Connection getConnection() {
        connection = null;
        String url = "jdbc:oracle:thin:@localhost:1521/orcl";
        String user = "project";
        String password = "oracle";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối thành công!");

        } catch (Exception e) {

            System.out.println("Kết nối thất bại: " + e.getMessage());
        }
        return connection;
    }

    public Connection getConnection1() {
        connection = null;
        String url = "jdbc:oracle:thin:@localhost:1521/orcl";
        String user = "mindfulness";
        String password = "123";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối thành công!");

        } catch (Exception e) {

            System.out.println("Kết nối thất bại: " + e.getMessage());
        }
        return connection;
    }

//    phần mới thêm
    public Connection getConnection(String user, String password) {
        connection = null;
        String url = "jdbc:oracle:thin:@localhost:1521/orcl";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối thành công!");
        } catch (Exception e) {
            System.out.println("Kết nối thất bại: " + e.getMessage());
        }
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
