/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.util;

import controller.DoacaoController;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;

/**
 *
 * @author saraa
 */
public class Cliente  extends UnicastRemoteObject implements InterfaceCliente{
    
    DoacaoController controll;

    public Cliente() throws RemoteException {
        super();
        this.controll = new DoacaoController();
    }
    
    
    
    @Override
    public void notificarDoacao(double valor, String emailDoador, String metodo) throws RemoteException {
        try {
            controll.cadastrarDoacao(valor,emailDoador,metodo);
        } catch (IOException ex) {
            Logger.getLogger(DoacaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
