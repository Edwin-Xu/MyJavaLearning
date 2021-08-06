package rmi;

import java.lang.String;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Edwin Xu on 8/5/2020 2:52 PM
 */

public class ServiceImpl extends UnicastRemoteObject implements ServiceInterface {
    private String hello;
    public ServiceImpl(String hello) throws RemoteException{
        this.hello = hello+"---From Edwin Xu";
    }
    @Override
    public String sayHello() throws RemoteException {
        System.out.println("somebody invoked just now!");
        return hello;
    }
}
