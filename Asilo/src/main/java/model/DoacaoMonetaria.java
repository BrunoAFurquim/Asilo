package model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class DoacaoMonetaria implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private double valor;
    private String doador;
    private Date data;

    public DoacaoMonetaria(double valor, String doador) {
        this.id = UUID.randomUUID().toString();
        this.valor = valor;
        this.doador = doador;
        this.data = new Date();
    }

    public String getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getDoador() {
        return doador;
    }

    public Date getData() {
        return data;
    }
}
