/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;



/**
 *
 * @author MSI
 */
public class DBConnect {
    public static Connection connection(){
        Connection conn =  null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/the_gear_hub","root","");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
    
}
