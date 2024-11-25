
package controller;

import java.util.ArrayList;
import dao.DAO;
import model.Usuario;

public class UsuarioController {
    private final DAO dao;

    public UsuarioController() {
        this.dao = DAO.getInstance();
    }

    public Usuario cadastrarUsuario(String nome, String email, String senha, String endereco, String telefone) {
        return dao.cadastrarUsuario(nome, email, senha, endereco, telefone);
    }

    public Usuario atualizarUsuario(String id, String nome, String email, String senha, String endereco, String telefone) {
        return dao.atualizarUsuario(id, nome, email, senha, endereco, telefone);
    }

    public Usuario atualizarUsuario(String id, String nome, String email, String endereco, String telefone) {
        return dao.atualizarUsuario(id, nome, email,  endereco, telefone);
    }
    
    public Usuario atualizarSenhaUsuario(String id, String senha){
        return dao.atualizarSenhaUsuario(id, senha);
    }
    
    public ArrayList<Usuario> listarUsuarios() {
        return dao.getUsuarios();
    }

    public void removerUsuario(String id) {
        dao.removerUsuario(id);
    }
    
    public Usuario getUsuarioPorEmail(String email){
        return dao.getUsuarioPorEmail(email);
    }
}
