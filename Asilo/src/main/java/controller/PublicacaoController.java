/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Publicacao;
import model.Repositorio;

public class PublicacaoController {
    private final Repositorio repositorio;

    public PublicacaoController() {
        this.repositorio = Repositorio.getInstance();
    }

    public void criarPublicacao(String titulo, String descricao) {
        repositorio.criarPublicacao(titulo, descricao);
    }

    public Publicacao atualizarPublicacao(String id, String titulo, String descricao) {
        return repositorio.atualizarPublicacao(id, titulo, descricao);
    }

    public ArrayList<Publicacao> listarPublicacoes() {
        return repositorio.getPublicacoes();
    }

    public void removerPublicacao(String id) {
        repositorio.deletarPublicacao(id);
    }
}
