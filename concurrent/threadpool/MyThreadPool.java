package concurrent.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Edwin Xu on 8/4/2020 12:27 PM
 */

class MyTask implements Runnable{
    private String name ;
    private int count=0;
    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(name+" is running - "+count++);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class MyThreadPool {
    private ExecutorService executorService;

    public MyThreadPool() {
        executorService = Executors.newFixedThreadPool(5);
    }

    public void submit(Runnable r){
        executorService.submit(r);
    }

    public static void main(String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool();
        myThreadPool.submit(new MyTask("task-1"));
        myThreadPool.submit(new MyTask("task-2"));
        myThreadPool.submit(new MyTask("task-3"));
    }



}
