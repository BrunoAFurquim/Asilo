/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.util;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author saraa
 */
public interface InterfaceBancaria extends Remote {
    void Doar(double valor, String emailDoador, String metodo) throws RemoteException;
    void incluirCliente(InterfaceCliente c) throws RemoteException;
}
