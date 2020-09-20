package collections.map;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Edwin Xu on 5/19/2020 9:54 PM
 *
 *
 * 1.8 HashMap 鬓发场景可能发生覆盖？？
 *
 * 终于搞懂了： (The {@code HashMap}
 *  * class is roughly equivalent to {@code Hashtable}, except that it is
 *  * unsynchronized and permits nulls.)
 *
 * HashMap本身设计就没有考虑任何多线程环境，代码中没有任何同步手段，没有任何volatile没有任何synchronized
 * ，本身就是让在单线程下使用的，你放到多线程下使用，自然会出现很多问题。
 *
 *
 *
 * run: 不是并发
 */
public class HashMapAnalysis {
    private AtomicInteger cnt = new AtomicInteger(0);
    HashMap<Integer,Integer> map =new HashMap<>();

    public static void main(String[] args) {
        HashMapAnalysis h = new HashMapAnalysis();
        for (int i = 0; i < 2; i++) {
            new Thread(h.new HMThread()).start();
        }



    }

    class HMThread implements Runnable{
        @Override
        public void run() {
            while (true){
                cnt.incrementAndGet();
                System.out.println(cnt.get()+" "+ map.size());
                map.put(cnt.get(),cnt.get());
                if (cnt.get()>1000)break;
            }
        }
    }


}
