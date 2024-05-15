/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan_smart;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;   

/**
 *
 * @author Yohanes Serpiyanto E
 */
public class koneksi {
    private static Connection MySQLConfig;
    public static Connection configDB() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/perpustakaan_smart";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url,user,pass);
        } catch(SQLException e  ) {
            System.out.println("KONEKSI KE DATABASE GAGAL "+ e.getMessage());
        }
        return MySQLConfig;
    }
}
