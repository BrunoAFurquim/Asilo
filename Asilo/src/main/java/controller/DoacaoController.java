
package controller;

import java.util.ArrayList;
import model.DoacaoMonetaria;
import instancia.DAO;

public class DoacaoController {
    private final DAO dao;

    public DoacaoController() {
        this.dao = DAO.getInstance();
    }

    public DoacaoMonetaria cadastrarDoacao(double valor, String doador) {
        return dao.cadastrarDoacao(valor, doador);
    }

    public ArrayList<DoacaoMonetaria> listarDoacoes() {
        return dao.getDoacoes();
    }
}
