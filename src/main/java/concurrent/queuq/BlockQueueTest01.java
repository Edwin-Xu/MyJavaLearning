package concurrent.queuq;

import lombok.SneakyThrows;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Edwin Xu
 * @date 7/11/2021 4:48 PM.
 */

public class BlockQueueTest01 {
    public static void main(String[] args) throws InterruptedException {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

        Thread thread = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                Thread.sleep(1000);
                System.out.println("remove one");
                queue.poll();
            }
        });
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("putting "+i);
            queue.put(i);
        }
        System.out.println("it's not over");
        queue.put(11);


        System.out.println("over");
    }
}
