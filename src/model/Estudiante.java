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
public class Estudiante extends Persona {

    Conexion con = new Conexion();
    Connection cn = con.conectar();
    Statement st;

    private List<Estudiante> listaEstudiante = new ArrayList<>();

    public String Create() {
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO estudiante(identificacion, nombre, apellido, edad, estado) VALUES(?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(this.getIdentificaion()));
            ps.setString(2, this.getNombre());
            ps.setString(3, this.getApellido());
            ps.setInt(4, this.getEdad());
            ps.setString(5, "A");
            ps.executeUpdate();
            return "Estudiante Creado";
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return "Error al crear el estudiante";
        }
    }

    public List Read() {
        try {
            st = cn.createStatement();
            //ResultSet rs = st.executeQuery("SELECT*FROM estudiante");
            ResultSet rs = st.executeQuery("SELECT*FROM estudiante WHERE estado = 'A'");
            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setId(rs.getInt("id"));
                estudiante.setIdentificaion(rs.getString("identificacion"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setEdad(rs.getInt("edad"));
                //estudiante.setEstado(rs.getString("estado"));
                listaEstudiante.add(estudiante);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return listaEstudiante;
    }

    public Estudiante consulta() {
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM estudiante WHERE identificacion=?");
            ps.setString(1, "identificacion");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setIdentificaion(rs.getString("identificacion"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setEdad(rs.getInt("edad"));
                //   estudiante.setEstado(rs.getString("estado"));
                //  estudiante.setId(rs.getInt("id"));
                return estudiante;
            }
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            return null;
        }
        return null;

    }

    public boolean upadate() {
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE estudiante SET identificacion=?, nombre=?, apellido=?, edad=? WHERE id=?");
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
            PreparedStatement ps = cn.prepareStatement("UPDATE estudiante SET estado = 'I' WHERE id = ?");
            // PreparedStatement ps = cn.prepareStatement("DELETE FROM estudiante WHERE id = ?");
            ps.setInt(1, this.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
