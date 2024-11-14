package controller;

import model.Adm;
import instancia.DAO;

public class AdmController {

    private final DAO dao;

    public AdmController() {
        this.dao = DAO.getInstance();
      
    }

    public Adm cadastrarAdm(String nome, String email, String senha, int telefone) {
        return dao.cadastrarAdm(nome, email, senha, telefone);
    }

    public Adm atualizarAdm(String nome, String email, String senha, int telefone) {
        return dao.atualizarAdm(nome, email, senha, telefone);
    }

    public Adm getAdm() {
        return dao.getAdm();
    }
}
