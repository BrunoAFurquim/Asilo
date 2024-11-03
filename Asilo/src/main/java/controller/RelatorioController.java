
package controller;

import java.util.Date;
import model.Relatorio;

public class RelatorioController {
    private final Relatorio relatorio;

    public RelatorioController() {
        this.relatorio = new Relatorio();
    }

    public String gerarRelatorioTransparencia() {
        return relatorio.gerarRelatorioTransparencia();
    }

    public String gerarRelatorioMensalArrecadacoes(Date mesAno) {
        return relatorio.gerarRelatorioMensalArrecadacoes(mesAno);
    }
}
