package concurrent.sync;

import java.util.HashSet;

/**
 * Created by Edwin Xu on 6/27/2020 3:08 PM
 */
public class SynchronizedImplDetail {
    public static void main(String[] args) {
        synchronized (SynchronizedImplDetail.class){
            System.out.println("hah");
        }
        System.out.println(Float.MAX_EXPONENT);
        System.out.println(Double.MAX_EXPONENT);
        HashSet hashSet = new HashSet();
        hashSet.add(1);
    }

}
