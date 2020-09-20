package concurrent.sync;

/**
 * Created by Edwin Xu on 6/27/2020 1:42 PM
 *
 * 悲观锁Synchronized 怎么使用
 *
 */
public class Synchronized {
    private static int count =0;

    public static synchronized void test(){
        count++;
        System.out.println(count);
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{test();},"线程"+i).start();
        }

        System.out.println("--------------------------------------");

        for (int i = 0; i < 100; i++) {
            new SynchronizeTest().run();
        }

        Integer a = 0;
        synchronized(a) {

        }
    }
}

class SynchronizeTest implements Runnable{
    private static int cnt=0;
    @Override
    public void run(){
        synchronized (this){
            cnt++;
            System.out.println(cnt);
        }
    }


}