package rmi;

import java.rmi.Naming;

/**
 * Created by Edwin Xu on 8/5/2020 2:52 PM
 */
public class RMIClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost:3333/hello";
            //使用共享远程对象接口ServiceInterface
            ServiceInterface serviceInterface = (ServiceInterface)Naming.lookup(url);
            String hello = serviceInterface.sayHello();
            System.out.println(hello);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
