/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dairo Santana
 */
public class Conexion {

    private String user = "root";
    private String pass = "";
    private String url = "jdbc:mysql://localhost:3306/mydb";
    //private String url = "jdbc:mysql://localhost:3306/colegio";
    public Connection con;
    public Statement st;
    public ResultSet rs;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
    

}
