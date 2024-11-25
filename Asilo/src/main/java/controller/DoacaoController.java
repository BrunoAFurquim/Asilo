
package controller;

import java.util.ArrayList;
import model.DoacaoMonetaria;
import dao.DAO;
import java.io.IOException;


public class DoacaoController{
    private final DAO dao;

    public DoacaoController() {
        this.dao = DAO.getInstance();
    }

    public DoacaoMonetaria cadastrarDoacao(double valor, String emailDoador, String metodo) throws IOException {
        return dao.cadastrarDoacao(valor, emailDoador, metodo);
    }

    public ArrayList<DoacaoMonetaria> listarDoacoes() {
        return dao.getDoacoes();
    }

    
}
