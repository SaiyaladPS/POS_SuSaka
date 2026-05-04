/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mysql_connect;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jayj2
 */
public class Mysql_connect {
    public static Connection connectDb() {
        String host = "jdbc:mysql://localhost:3306/pos_workshop?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8";
        String username = "root";
        String password = "";
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(host, username, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
    
    public static void main(String[] args) {
        connectDb();
    }
}
