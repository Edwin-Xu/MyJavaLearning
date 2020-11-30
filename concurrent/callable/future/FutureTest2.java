package concurrent.callable.future;

import java.lang.String;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Edwin Xu on 8/27/2020 4:03 PM
 */
class Task implements Callable<String>{
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Thread.currentThread().getName() +" returns!";
    }
}
public class FutureTest2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String > future = es.submit(new Task()); // 监视该Callable
        try {
            System.out.println(Thread.currentThread().getName()); //main

            String res = future.get(); //调用get方法，阻塞本线程，直到Callable调用完毕并返回
            //调用后这里会 等待3秒左右
            System.out.println(res); //pool-1-thread-1 returns!

            System.out.println(Thread.currentThread().getName()); //main
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
