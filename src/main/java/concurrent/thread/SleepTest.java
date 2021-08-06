package concurrent.thread;

import java.lang.String;

/**
 * Created by Edwin Xu on 9/11/2020 10:53 AM
 *
 * sleep: 不会占用时间片？
 */
public class SleepTest {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        try {
//                            Thread.sleep(10000);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }
}

