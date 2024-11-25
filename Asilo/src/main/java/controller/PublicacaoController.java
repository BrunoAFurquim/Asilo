/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Publicacao;
import dao.DAO;

public class PublicacaoController {
    private final DAO dao;

    public PublicacaoController() {
        this.dao = DAO.getInstance();
    }

    public void criarPublicacao(String titulo, String descricao) {
        dao.criarPublicacao(titulo, descricao);
    }

    public Publicacao atualizarPublicacao(String id, String titulo, String descricao) {
        return dao.atualizarPublicacao(id, titulo, descricao);
    }

    public ArrayList<Publicacao> listarPublicacoes() {
        return dao.getPublicacoes();
    }

    public void removerPublicacao(String id) {
        dao.deletarPublicacao(id);
    }
}
