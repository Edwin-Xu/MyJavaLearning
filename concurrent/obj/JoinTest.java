package concurrent.obj;

import java.lang.String;

/**
 * Created by Edwin Xu on 8/27/2020 2:15 PM
 */
public class JoinTest {
    public static void main(String[] args) {
        System.out.println("--begin---");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                }
                System.out.println("working");
            }
        });
        t.start();
        try {
            t.join(); //等待被调用的线程t执行完毕，才会继续执行主线程

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("--end---");
    }
}
