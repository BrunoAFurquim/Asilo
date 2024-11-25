package model;

import java.io.Serializable;

public class Asilo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String chavePix;
    private double meta;

    public Asilo(String nome, String endereco, String telefone, String email, String chavePix, double meta) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.chavePix = chavePix;
        this.meta = meta;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }
    

    public Asilo() {
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
        this.email = "";
        this.chavePix = "";
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}
