package classLoader.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Edwin Xu on 8/8/2020 11:11 AM
 */
public class RuntimeTest {
    public static void main(String[] args) {
//        Runtime runtime = Runtime.getRuntime();
//        System.out.println(runtime.toString());
//        System.out.println(runtime.freeMemory());
//        Hashtable

        for (int i = 0; i <10 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        System.out.println(Thread.currentThread().getName());
                        try {
                            Thread.sleep(1000);

                        }catch (Exception e){

                        }
                    }
                }
            }).start();
        }
    }
}
