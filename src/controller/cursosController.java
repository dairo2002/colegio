/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Cursos;

/**
 *
 * @author Dairo Santana
 */
public class cursosController {
    
    Cursos curso=new Cursos();
    
    public String agregarCurso (String codigo, String nombre){
        curso.setCodigo(codigo);
        curso.setNombre(nombre);
        return curso.Create();
    }
    
    public List<Cursos> listaCurso(){
        return curso.Read();
    }
    
    public boolean actualizarCurso(String codigo, String nombre){
        curso.setCodigo(codigo);
        curso.setNombre(nombre);
        return curso.Update();
    }
    
    public boolean eliminarCurso(String codigo){
        curso.setCodigo(codigo);
        return curso.delete();
    }
}
