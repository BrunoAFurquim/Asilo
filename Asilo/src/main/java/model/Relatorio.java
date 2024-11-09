
package model;

import java.util.Date;


public class Relatorio {
    private final Repositorio repositorio;

    public Relatorio() {
        this.repositorio = Repositorio.getInstance();
    }

      public String gerarRelatorioTransparencia() {
        return repositorio.gerarRelatorioTransparencia();
    }

    public String gerarRelatorioMensalArrecadacoes(Date mesAno) {
        return repositorio.gerarRelatorioMensalArrecadacoes(mesAno);
    }

}
