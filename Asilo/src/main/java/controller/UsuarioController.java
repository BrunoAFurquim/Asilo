
package controller;

import java.util.ArrayList;
import model.Repositorio;
import model.Usuario;

public class UsuarioController {
    private final Repositorio repositorio;

    public UsuarioController(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(String nome, String email, String senha, String endereco, String telefone) {
        return repositorio.cadastrarUsuario(nome, email, senha, endereco, telefone);
    }

    public Usuario atualizarUsuario(String id, String nome, String email, String senha, String endereco, String telefone) {
        return repositorio.atualizarUsuario(id, nome, email, senha, endereco, telefone);
    }

    public ArrayList<Usuario> listarUsuarios() {
        return repositorio.getUsuarios();
    }

    public void removerUsuario(String id) {
        repositorio.removerUsuario(id);
    }
}
