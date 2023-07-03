/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dairo Santana
 */
public class consultaLogin {

    public boolean login(String usuario, String contrasena){
        login l=new login();
        if (l.getUsuario().equals(usuario) && l.getContrasena().equals(contrasena)) {
            return true;
        }else {
            return false;
        }
    }
}
