package jvmmemory;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/4/2020 5:44 PM
 */
public class FinalizeAndSystemGc {
    public void print(){
        System.out.println("hello, I am still here!");
    }

    public static void main(String[] args) {
        try {
            FinalizeAndSystemGc f = new FinalizeAndSystemGc();
            f.finalize();//finalize不靠谱，调用之后不会立即被回收
            f.print();//hello, I am still here!

            System.gc();//也是不知道什么时候会被真正回收
            f.print();//hello, I am still here!
        }catch (Throwable e){
            e.printStackTrace();
        }

    }
}
