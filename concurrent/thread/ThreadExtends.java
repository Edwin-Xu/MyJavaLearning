package concurrent.thread;

/**
 * Created by Edwin Xu on 9/27/2020 10:00 PM
 */
public class ThreadExtends extends Thread {
    @Override
    public void run() {
        System.out.println("-------");
    }


    public static void main(String[] args) {

        Integer a = new Integer(0);
        System.out.println(a.hashCode());// 0
        a++;
        System.out.println(a.hashCode());// 1


        new ThreadExtends().start();
    }
}
