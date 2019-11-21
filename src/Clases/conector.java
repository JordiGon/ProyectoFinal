/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
/**
 *
 * @author jordi
 */
public class conector {
    public static Connection cn;
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String User = "root";
    private static final String Password = "";
    private static final String URL = "jdbc:mysql://localhost:3306/materia_p";

    public conector() {
        cn=null;
        try{
        Class.forName(Driver);
        cn = DriverManager.getConnection(URL,User,Password);
        }
        catch(Exception e){
            System.out.println("Error al conectar..."+e);
        }
    }
    
    public Connection getConnection(){
      return cn;  
    }
    
    public void desconectar(){
        cn = null;
        if(cn == null){
            System.out.println("Conexion terminada...");
        }
    }
}
