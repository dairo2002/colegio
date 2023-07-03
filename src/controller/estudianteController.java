/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Estudiante;

/**
 *
 * @author Dairo Santana
 */
public class estudianteController {

    Estudiante estudiante = new Estudiante();

    public String agregarEstudiante(String identificacion, String nombre, String apellido, int edad) {
        estudiante.setIdentificaion(identificacion);
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setEdad(edad);
        return estudiante.Create();
    }

    public List<Estudiante> listaEstudiante() {
        return estudiante.Read();
    }

    public boolean actualizarEstudiante(int id, String identificacion, String nombre, String apellido, int edad) {
        estudiante.setId(id);
        estudiante.setIdentificaion(identificacion);
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setEdad(edad);
        return estudiante.upadate();
    }

    public boolean eliminarEstudiante(int id) {
        estudiante.setId(id);
        return estudiante.delete();
    }

//    public boolean matricular(String codigo, String identificacion) {
//        consultaEstudiante matricula = new consultaEstudiante();
//        return matricula.matricular(codigo, identificacion);
//    }
    
}
