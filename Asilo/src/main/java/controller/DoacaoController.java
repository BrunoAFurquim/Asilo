
package controller;

import java.util.ArrayList;
import model.DoacaoMonetaria;
import model.Repositorio;

public class DoacaoController {
    private final Repositorio repositorio;

    public DoacaoController() {
        this.repositorio = Repositorio.getInstance();
    }

    public DoacaoMonetaria cadastrarDoacao(double valor, String doador) {
        return repositorio.cadastrarDoacao(valor, doador);
    }

    public ArrayList<DoacaoMonetaria> listarDoacoes() {
        return repositorio.getDoacoes();
    }
}
