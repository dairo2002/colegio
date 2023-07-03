/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.consultaLogin;

/**
 *
 * @author Dairo Santana
 */
public class loginController {

    public boolean login(String usuario, String contrasena) {
        consultaLogin L = new consultaLogin();
        return L.login(usuario, contrasena);
    }

}
