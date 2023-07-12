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
 * @extends hacemos una herencia a la clase persona
 */

public class Profesor extends Persona {

    Conexion con = new Conexion();
    Connection cn = con.conectar();
    Statement st;

    private List<Profesor> listaProfesor = new ArrayList<>();

    public String Create() {
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO profesor(identificacion, nombre, apellido, edad, estado) VALUES (?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(this.getIdentificaion()));
            ps.setString(2, this.getNombre());
            ps.setString(3, this.getApellido());
            ps.setInt(4, this.getEdad());
            ps.setString(5, "A");
            ps.executeUpdate();
            return "Profesor creado";
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al crear el profesor";
        }

    }

    public List Read() {
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT*FROM profesor WHERE estado = 'A'");
            while (rs.next()) {
                Profesor profesor = new Profesor();
                profesor.setId(rs.getInt("id"));
                profesor.setIdentificaion(rs.getString("identificacion"));
                profesor.setNombre(rs.getString("nombre"));
                profesor.setApellido(rs.getString("apellido"));
                profesor.setEdad(rs.getInt("edad"));
                listaProfesor.add(profesor);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return listaProfesor;
    }
    
        public boolean upadate() {
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE profesor SET identificacion=?, nombre=?, apellido=?, edad=? WHERE id=?");
            ps.setInt(1, Integer.parseInt(this.getIdentificaion()));
            ps.setString(2, this.getNombre());
            ps.setString(3, this.getApellido());
            ps.setInt(4, this.getEdad());
            ps.setInt(5, this.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean delete() {
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE profesor SET estado = 'I' WHERE id = ?");
            ps.setInt(1, this.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    
    
}
