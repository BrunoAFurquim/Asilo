/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author saraa
 */
public class TabelaNecessidades extends AbstractTableModel {
    private  final Repositorio repositorio;
    private final String[] colunas;

    public TabelaNecessidades() {
        this.repositorio = Repositorio.getInstance();
        this.colunas = new String[]{"Nome", "Categoria", "Descrição"};
    }



    @Override
    public int getRowCount() {
        return repositorio.getNecessidades().size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Necessidade n = repositorio.getNecessidades().get(rowIndex);
        switch(columnIndex){
                case 0:
                    return n.getNome();
                case 1:
                    return n.getCategoria();
                case 2:
                    return n.getDescricao();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int i){
        return colunas[i];
    }
    
}
