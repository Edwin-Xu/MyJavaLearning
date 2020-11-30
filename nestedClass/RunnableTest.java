package nestedClass;

import java.lang.String;

/**
 * Created by Edwin Xu on 8/7/2020 7:39 PM
 */
public class RunnableTest {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("sss");
            }
        };
        r.run();
        new Thread(r).start();
        r.run();


        Integer a = 1;
        System.out.println(a.hashCode());
        a = 2;
        System.out.println(a.hashCode());
    }


}
