package concurrent.callable;

import java.util.concurrent.*;

/**
 * Created by Edwin Xu on 9/27/2020 6:57 PM
 */
public class CallableTest {

    class MyCallableTask implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            Thread.sleep(3000);
            return (int)(Math.random()*100);
        }
    }


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        System.out.println("task begins ");
        Future<Integer> future = executorService.submit(()->{
            Thread.sleep(3000);
            System.out.println("callable task begins ");
            return (int)(Math.random()*100);
        });
        try {
            System.out.println(future.get());
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("task ends ");

        executorService.shutdown();//关闭线程池，不关闭的程序一直运行
    }
}
