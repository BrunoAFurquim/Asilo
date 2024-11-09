package controller;

import model.Asilo;
import model.Repositorio;

public class AsiloController {

    private final Repositorio repositorio;

    public AsiloController() {
        this.repositorio = Repositorio.getInstance();
    }
    
    public Asilo cadastrarAsilo(String nome, String endereco, String telefone, String email, String chavePix) {
        return repositorio.cadastrarAsilo(nome, endereco, telefone, email, chavePix);
    }

    public Asilo atualizarAsilo(String nome, String endereco, String telefone, String email, String chavePix) {
        return repositorio.atualizarAsilo(nome, endereco, telefone, email, chavePix);
    }

    public Asilo getAsilo() {
        return repositorio.getAsilo();
    }
}
