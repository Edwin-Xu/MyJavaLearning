package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Created by Edwin Xu on 8/5/2020 3:11 PM
 */
public class RMIServer {
    public static void main(String[] args) {
        try {
            ServiceImpl rmiServer = new ServiceImpl("hello, nihao");
            LocateRegistry.createRegistry(3333);
            Naming.bind("rmi://localhost:3333/hello",rmiServer);
            System.out.println("waiting for invoking...");//一直监听，不会停止
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
