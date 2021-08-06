package concurrent.threadlocal;

import java.lang.String;

/*
 * 描述 Java中的ThreadLocal类允许我们创建只能被同一个线程读写的变量。
 * 因此，如果一段代码含有一个ThreadLocal变量的引用，即使两个线程同时执行这段代码，
 * 它们也无法访问到对方的ThreadLocal变量。
 */
public class ThreadLocalTest {
    /**
     * 创建了一个MyRunnable实例，并将该实例作为参数传递给两个线程。两个线程分别执行run()方法，
     * 并且都在ThreadLocal实例上保存了不同的值。如果它们访问的不是ThreadLocal对象并且调用的set()方法被同步了，
     * 则第二个线程会覆盖掉第一个线程设置的值。但是，由于它们访问的是一个ThreadLocal对象，
     * 因此这两个线程都无法看到对方保存的值。也就是说，它们存取的是两个不同的值。
     */
    public static class MyRunnable implements Runnable {
        /**
         * 例化了一个ThreadLocal对象。我们只需要实例化对象一次，并且也不需要知道它是被哪个线程实例化。
         * 虽然所有的线程都能访问到这个ThreadLocal实例，但是每个线程却只能访问到自己通过调用ThreadLocal的
         * set()方法设置的值。即使是两个不同的线程在同一个ThreadLocal对象上设置了不同的值，
         * 他们仍然无法访问到对方的值。
         */
        private ThreadLocal threadLocal = new ThreadLocal();

        @Override
        public void run() {
            //一旦创建了一个ThreadLocal变量，你可以通过如下代码设置某个需要保存的值
            threadLocal.set((int) (Math.random() * 100D));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            //可以通过下面方法读取保存在ThreadLocal变量中的值
            System.out.println("-------threadLocal value-------" + threadLocal.get());
        }
    }

    public static void main(String[] args) {
        MyRunnable sharedRunnableInstance = new MyRunnable();
        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);
        thread1.start();
        thread2.start();
    }

/*
运行结果
-------threadLocal value-------38
-------threadLocal value-------88
*/

}

