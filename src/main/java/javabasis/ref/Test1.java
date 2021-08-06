package javabasis.ref;

import java.util.*;

/**
 * Created by Edwin Xu on 10/21/2020 7:40 PM.
 */

public class Test1 {
    public int age ;
    public Test1(int age_){this.age = age_;}

    public static void setInt(Integer a){
        a = 100;
    }
    public static void setString(String s){
//        s = "aaa";
//        or:
        s = new String("aaa");
    }

    public static void setTest1(Test1 test1){
        test1 = new Test1(1000);
    }

    public static void setTest2(Test1 test){
        test.age = 1000;
    }

    public static void main(String[] args) {
        Integer a = 1;
        setInt(a);
        System.out.println(a); //still 1

        String s = "---";
        setString(s);
        System.out.println(s);//still ---

        String s1 = new String("abc")+"---";
        setString(s1);
        System.out.println(s1); //still abc---

        Test1 test1 = new Test1(1);
        setTest1(test1);
        System.out.println(test1.age);//still 1

        setTest2(test1);
        System.out.println(test1.age);//1000
    }
}
