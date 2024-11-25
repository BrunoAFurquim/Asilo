
package model;


import dao.DAO;
import java.util.Date;


public class Relatorio {
    private final DAO dao;

    public Relatorio() {
        this.dao = DAO.getInstance();
    }

      public String gerarRelatorioTransparencia() {
        return dao.gerarRelatorioTransparencia();
    }

    public String gerarRelatorioMensalArrecadacoes(Date mesAno) {
        return dao.gerarRelatorioMensalArrecadacoes(mesAno);
    }

}
