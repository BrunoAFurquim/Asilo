package controller;

import model.Adm;
import model.Repositorio;

public class AdmController {

    private final Repositorio repositorio;

    public AdmController() {
        this.repositorio = Repositorio.getInstance();
      
    }

    public Adm cadastrarAdm(String nome, String email, String senha, int telefone) {
        return repositorio.cadastrarAdm(nome, email, senha, telefone);
    }

    public Adm atualizarAdm(String nome, String email, String senha, int telefone) {
        return repositorio.atualizarAdm(nome, email, senha, telefone);
    }

    public Adm getAdm() {
        return repositorio.getAdm();
    }
}
