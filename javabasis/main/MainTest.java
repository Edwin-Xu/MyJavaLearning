package javabasis.main;

import java.util.*;

/**
 * Created by Edwin Xu on 10/8/2020 5:07 PM.
 */

public class MainTest {

//    public void main(String[] args) { //去掉static
//        /*
//        * javac MainTest.java // ok，说明可以正常编译
//        *
//        * java MainTest // 运行失败
//        * Error: Could not find or load main class MainTest
//        * Caused by: java.lang.NoClassDefFoundError: javabasis/main/MainTest (wrong name: MainTest)
//        * */
//    }


    public static void main(String[] args, String s) {
        System.out.println("main(String[] args, String s)");
    }

    public static void main(String s, String[] args) {
        System.out.println("main(String s, String[] args)");
    }

    public static void main(String[] args) {
        String [] strs = {};
        String str = "";
        main(strs,str);
        main(str,strs);
    }
}
