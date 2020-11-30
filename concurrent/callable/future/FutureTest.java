package concurrent.callable.future;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Edwin Xu on 8/4/2020 1:18 PM
 */

public class FutureTest {

    public static class Task implements Callable<String> {
        private String name;
        public Task(String name) {
            this.name = name;
        }

        @Override
        public String call() throws Exception {
            System.out.println(name+" is running");
            return name+ " has completed";
        }
    }

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        List<Future<String>> results = new ArrayList<Future<String>>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(new Task("thread-"+i)));
        }
        for (Future<String> future : results) {
            System.out.println(future.get());
        }

        System.out.println("Main complete");

        if (!executorService.isShutdown()) {
            executorService.shutdown();
        }
    }
}