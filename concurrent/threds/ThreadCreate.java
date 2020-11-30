package concurrent.threds;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/19/2020 10:48 PM
 */

class A extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Thread");
        }
    }
}
class B implements Runnable{
    @Override
    public void run(){
        while (true) System.out.println("Runnable");
    }
}
public class ThreadCreate {
    public static void main(String[] args) {
        new A().start();
//        new Thread(new Son_SamePkg()).start();
        new A().run();
        while (true) System.out.println("Main1");
    }
}
