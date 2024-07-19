/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kiêt
 */
public class SYSConnection {
    private Connection connection=null;
    public Connection getConnection(){
        connection=null;
        String url = "jdbc:oracle:thin:@localhost:1521/orcl";
        String user = "sys as sysdba";
        String password = "sys";
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Kết nối thành công!");
        
        }catch (Exception e) {
			            
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
