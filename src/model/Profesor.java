/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dairo Santana
 */
//Heradamos la clase persona (extends) a profesor
public class Profesor extends Persona {

    Conexion con = new Conexion();
    Connection cn = con.conectar();
    Statement st;

    private List<Profesor> listaProfesor = new ArrayList<>();
    
//    public String Create(){
//        
//    }

}
