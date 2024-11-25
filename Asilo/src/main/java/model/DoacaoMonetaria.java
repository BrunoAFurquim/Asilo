package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class DoacaoMonetaria implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private double valor;
    private String doador;
    private String data;
    private String metodo;

    public DoacaoMonetaria(double valor, String doador, String metodo) {
        this.id = UUID.randomUUID().toString();
        this.valor = valor;
        this.doador = doador;
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = hoje.format(formatter);
        this.metodo = metodo;
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

    public String getData() {
        return data;
    }

    public String getMetodo() {
        return metodo;
    }
    
    
}
