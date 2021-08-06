package concurrent.runnable;

import java.lang.String;

/**
 * Created by Edwin Xu on 8/27/2020 1:36 PM
 */
public class MyTask implements Runnable {
    private Integer cnt = 0;
    @Override
    public void run() {
        while (true) {
            synchronized (cnt) {
                System.out.println("cnt = " + cnt++ + " by " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        MyTask t1 = new MyTask(); //这是一个任务：1
        MyTask t2 = new MyTask(); //这是另一个任务：2

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1); // 线程2如果也和任务1绑定，那么两个线程共享任务1的变量，
                                         // 否则两个线程执行不同的任务，互不影响
        thread1.start();
        thread2.start();
    }
}
