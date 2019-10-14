/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rizky
 */
public class koneksi {
        public static Connection getConnection(){
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/katalogkacamata","root","");
            System.out.println("Sukses");
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
        return c;
    }
}
