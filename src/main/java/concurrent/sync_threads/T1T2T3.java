package concurrent.sync_threads;

import java.util.*;

/**
 * Created by Edwin Xu on 10/8/2020 5:35 PM.
 *
 * 现在有 T1、T2、T3 三个线程，你怎样保证 T2 在 T1 执行完后执行，T3 在 T2 执行完后执行？
 */

public class T1T2T3 {

    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.print("A");
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.print("B");
            }
        });
        Thread t3 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.print("C");
            }
        });

        t1.start();
        t1.join(); //等t1执行完后才会执行后面的

        t2.start();
        t2.join();//等t2执行完后才会执行后面的

        t3.start();
        t3.join();//等t3执行完后才会执行后面的

        /*
        * 不加join：
        * AABBBBBBBBBBAAAAAAAACCCCCCCCCC
        *
        * 加join：
        * AAAAAAAAAABBBBBBBBBBCCCCCCCCCC
        * */
    }


}
