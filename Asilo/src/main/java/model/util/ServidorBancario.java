/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.util;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saraa
 */
public class ServidorBancario {

    public ServidorBancario() {
        try {
            InterfaceBancaria servicoBancario = new ServicoBancario();
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT); // Porta padrão RMI (1099) 
            Naming.rebind("rmi://localhost/ServicoBancario", servicoBancario);
        } catch (MalformedURLException | RemoteException ex) {
              Logger.getLogger(ServidorBancario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
