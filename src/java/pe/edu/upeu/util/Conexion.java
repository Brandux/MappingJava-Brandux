/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author UPEU
 */
public class Conexion {
    
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String url="jdbc:mysql://localhost:3306/mappingjava";
    private static final String user ="root";
    private static final String pass ="brandux123";
    private static Connection cx = null; 
    
    public static Connection getCoxeion(){
        try {
            Class.forName(driver);
            if(cx == null){
                cx = DriverManager.getConnection(url, user, pass);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Brandux Error en la Conexion:" + e);
        }
        return cx;
    }
    
}
