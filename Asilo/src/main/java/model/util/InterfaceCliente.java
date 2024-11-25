package model.util;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.io.Serializable;

/**
 *
 * @author saraa
 */
public interface InterfaceCliente extends Remote { 
    void notificarDoacao(double valor, String emailDoador, String metodo) throws RemoteException;
}
