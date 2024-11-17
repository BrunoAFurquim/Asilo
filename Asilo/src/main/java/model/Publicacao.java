package model;

import java.io.Serializable;
import java.util.UUID;

public class Publicacao implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String titulo;
    private String descricao;

    public Publicacao(String titulo, String descricao) {
        this.id = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
