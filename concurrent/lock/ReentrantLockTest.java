package concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Edwin Xu on 6/27/2020 2:06 PM
 */
public class ReentrantLockTest {
    /*
    * ReentrantLock 实现了Lock接口，
    * 提供更加细粒度和灵活的锁操作
    *
    *  - 手动
    *  - 灵活
    *  - 公平锁
    *  - 非公平锁
    *  -
    * */
    private static  final Lock lock =  new ReentrantLock(true);
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->test(),"线程"+i).start();
        }

    }

    public static void test(){
        try{
            lock.lock();
            System.out.println(Thread.currentThread().getName()+" is using");

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println(Thread.currentThread().getName()+" is leaving");
            lock.unlock();
        }
    }
}
