/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Necessidade;
import model.Repositorio;

public class NecessidadeController {

    private final Repositorio repositorio;

    public NecessidadeController() {
        repositorio = Repositorio.getInstance();
    }

    public Necessidade criarNecessidade(String nome, String descricao, int categoria) {
        return repositorio.criarNecessidade(nome, descricao, categoria);
    }

    public void atualizarNecessidade(String id, String nome, String descricao, int categoria) {
        repositorio.atualizarNecessidade(id, nome, descricao, categoria);
    }

    public ArrayList<Necessidade> listarNecessidades() {
        return repositorio.getNecessidades();
    }

    public void removerNecessidade(String id) {
        repositorio.deletarNecessidade(id);
    }
}
