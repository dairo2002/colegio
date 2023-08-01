/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Profesor;

/**
 *
 * @author Dairo Santana
 */
public class profesorController {

    Profesor profe = new Profesor();

    public String agregar(String identificacion, String nombre, String apellido, int edad) {
        profe.setIdentificaion(identificacion);
        profe.setNombre(nombre);
        profe.setApellido(apellido);
        profe.setEdad(edad);
        return profe.Create();
    }
    
    public List<Profesor> listaProfesor(){
        return profe.Read();
    }
    
        public boolean actualizar(int id, String identificacion, String nombre, String apellido, int edad) {
        profe.setId(id);
        profe.setIdentificaion(identificacion);
        profe.setNombre(nombre);
        profe.setApellido(apellido);
        profe.setEdad(edad);
        return profe.upadate();
    }

    public boolean eliminar(int id) {
        profe.setId(id);
        return profe.delete();
    }
}
