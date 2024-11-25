/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Necessidade;
import dao.DAO;

public class NecessidadeController {

    private final DAO dao;

    public NecessidadeController() {
        dao = DAO.getInstance();
    }

    public Necessidade criarNecessidade(String nome, String descricao, String categoria) {
        return dao.criarNecessidade(nome, descricao, categoria);
    }

    public void atualizarNecessidade(String id, String nome, String descricao, String categoria) {
        dao.atualizarNecessidade(id, nome, descricao, categoria);
    }

    public ArrayList<Necessidade> listarNecessidades() {
        return dao.getNecessidades();
    }

    public void removerNecessidade(String id) {
        dao.deletarNecessidade(id);
    }
    
    public Necessidade addNecessidadeAtendida(Necessidade n){
        return dao.addNecessidadeAtendida(n);
    }
}
