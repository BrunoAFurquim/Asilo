/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Adm;
import model.Login;
import model.LoginException;
import model.Usuario;

public class LoginController {
    private Usuario usuarioLogado;
    private Adm admLogado;

    public LoginController(String email, String senha) throws LoginException, Exception {
        Login login = new Login(email, senha);
        if (login.isUsuarioLogado()) {
            this.usuarioLogado = login.getUsuario();
        } else if (login.isAdmLogado()) {
            this.admLogado = login.getAdm();
        }
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public Adm getAdmLogado() {
        return admLogado;
    }

    public boolean isUsuarioLogado() {
        return usuarioLogado != null;
    }

    public boolean isAdmLogado() {
        return admLogado != null;
    }
}
