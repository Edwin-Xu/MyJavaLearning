package concurrent.threds.object;

import java.lang.String;

/**
 * Created by Edwin Xu on 7/29/2020 4:09 PM
 */
public class Obj {
    private Integer cnt = 0;
    class A implements Runnable {
        @Override
        public void run() {
            /*
            * 这里并没有效果，不会进行同步：因为在同步代码块中改变了cnt
            * 因为sync的原理在进行同步的时候是根据对象头的状态来进行同步的(这个
            * 不知道可以去查资料，这里不进行解释)，我们改变了对象过的
            * 指向，当然就会导致这种情况。
            *
            * */
            synchronized (cnt){
                System.out.println("Father get the res+++++");
                try {
                    Thread.sleep(1000);

                }catch (Exception e){
                }
                System.out.println("Father release the res+++++");
            }
        }
    }
    class B implements Runnable{
        @Override
        public void run() {
            synchronized (cnt){
                System.out.println("Son_SamePkg get the res-----");
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                }
                System.out.println("Son_SamePkg release the res-----");
            }
        }
    }


    public static void main(String[] args) {
//        try {
//            Integer a = 0;
//            a.wait(); //java.lang.IllegalMonitorStateException
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        Obj obj = new Obj();
//        Father a = obj.new Father();
//        Son_SamePkg b = obj.new Son_SamePkg();
//
//        Thread t1 = new Thread(a);
//        t1.start();
//        Thread t2 = new Thread(b);
//        t2.start();
//



        //不能改变的
        Integer a = 1;
        System.out.println(a.hashCode()); //1
        a = 2;
        System.out.println(a.hashCode());//2

//        ReentrantLock
//        AtomicInteger
//        Executor

        new Thread(()->{

        });

//        ThreadPoolExecutor tpe = new ThreadPoolExecutor();

//        Serializable

//        HashMap


    }


}
