package concurrent.thread;

/**
 * Created by Edwin Xu on 6/28/2020 4:09 PM
 */
public class ThreadTest implements Runnable{
    private String name;
    private int cnt = 0;
    public ThreadTest(String name){
        this.name=name;
    }
    @Override
    public void run() {
        while (true){
            System.out.println(name+" :"+cnt);
            cnt++;

            Thread.yield();

            try {
                if (cnt>100){
//                    cnt=1;
                    this.wait();
                }
            }catch (Exception e){

            }

        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread( new ThreadTest("Father"));
        ThreadTest t2 = new ThreadTest("Son_SamePkg");
        t1.run();
        t2.run();
//        t1.notifyAll();


    }
}
