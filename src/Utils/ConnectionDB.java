/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PRINCE D. TOAD
 */
public class ConnectionDB {

    public static Connection getConnection() {
        Connection conn = null;
        String dbClass = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(dbClass);
            String dbUrl = "jdbc:mysql://localhost:3306/highschools";
            conn = DriverManager.getConnection(dbUrl, "root", "123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("" + e);
        }
        return conn;
        
    }

    public static void main(String[] args) {
        Connection conn = ConnectionDB.getConnection();
        if (conn != null) {
            System.out.println("Kết nối đến cơ sở dữ liệu thành công!");
            // Đã kết nối thành công, bạn có thể thực hiện các thao tác với cơ sở dữ liệu ở đây
            try {
                conn.close(); // Đóng kết nối sau khi sử dụng xong
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Không thể kết nối đến cơ sở dữ liệu!");
        }
    }

}
