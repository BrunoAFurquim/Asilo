
package controller;

import java.util.ArrayList;
import instancia.DAO;
import model.Usuario;

public class UsuarioController {
    private final DAO dao;

    public UsuarioController(DAO dao) {
        this.dao = dao;
    }

    public Usuario cadastrarUsuario(String nome, String email, String senha, String endereco, String telefone) {
        return dao.cadastrarUsuario(nome, email, senha, endereco, telefone);
    }

    public Usuario atualizarUsuario(String id, String nome, String email, String senha, String endereco, String telefone) {
        return dao.atualizarUsuario(id, nome, email, senha, endereco, telefone);
    }

    public ArrayList<Usuario> listarUsuarios() {
        return dao.getUsuarios();
    }

    public void removerUsuario(String id) {
        dao.removerUsuario(id);
    }
}
