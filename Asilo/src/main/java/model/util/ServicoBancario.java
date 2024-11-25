/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.util;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saraa
 */
public class ServicoBancario  extends UnicastRemoteObject implements InterfaceBancaria{
    InterfaceCliente cliente;

    public ServicoBancario() throws RemoteException {
        super();
    }
    
    @Override
    public void incluirCliente(InterfaceCliente cliente){
        this.cliente = cliente;
    }

    @Override
    public void Doar(double valor, String emailDoador, String metodo){
        try {
            this.notificarDoacao(valor, emailDoador, metodo);
        } catch (RemoteException ex) {
            Logger.getLogger(ServicoBancario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void notificarDoacao (double valor, String emailDoador, String metodo) throws RemoteException{
        this.cliente.notificarDoacao(valor, emailDoador, metodo);
    }

    
}
