package controller;

import model.Asilo;
import dao.DAO;

public class AsiloController {

    private final DAO dao;

    public AsiloController() {
        this.dao = DAO.getInstance();
    }
    
    public Asilo cadastrarAsilo(String nome, String endereco, String telefone, String email, String chavePix) {
        return dao.cadastrarAsilo(nome, endereco, telefone, email, chavePix);
    }

    public Asilo atualizarAsilo(String nome, String endereco, String telefone, String email, String chavePix) {
        return dao.atualizarAsilo(nome, endereco, telefone, email, chavePix);
    }
   

    public Asilo getAsilo() {
        return dao.getAsilo();
    }
    
    public Asilo atualizarMeta(double meta){
        return dao.atualizarMeta(meta);

    }
    
    public double getMeta(){
        return dao.getMeta();
    }
}
