/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dairo Santana
 */
public class Cursos extends Curso{

    Conexion con = new Conexion();
    Connection cn = con.conectar();
    Statement st;
    
    private List<Cursos> listaCurso = new ArrayList<>();
    
    public String Create(){
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO curso(codigo, nombre) VALUES (?,?)");
            ps.setInt(1, Integer.parseInt(this.getCodigo()));
            ps.setString(2, this.getNombre());
            ps.executeUpdate();
            return "Curso creado";
        } catch (SQLException e) {
            System.out.println("Error Curso: "+e.getMessage());
            return "Error al crear el curso";
        }
    }
    
    public List Read() {
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM curso");
            while (rs.next()) {                
            Cursos curso=new Cursos();
            curso.setNombre(rs.getString("nombre"));
            curso.setCodigo(rs.getString("codigo"));
            listaCurso.add(curso);    
            }
        } catch (SQLException e) {
             System.out.println("Error: " + e.getMessage());
        }
        return listaCurso;
    } 
    
    public boolean  Update(){
        try {
            PreparedStatement ps =cn.prepareStatement("UPDATE curso SET nombre=?, codigo=?");
            ps.setString(1, this.getNombre());
            ps.setString(2, this.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " +e.getMessage());
            return false;
        }
    }
 
    public boolean delete(){
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE curso WHERE codigo=?");
            ps.setString(1, this.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            return false;
        }
    }
}
