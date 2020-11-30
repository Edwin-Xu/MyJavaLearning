package rmi;

import java.lang.String;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Edwin Xu on 8/5/2020 2:53 PM
 */
public interface ServiceInterface extends Remote {
    String sayHello() throws RemoteException;
}