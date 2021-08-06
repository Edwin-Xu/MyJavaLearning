package javabasis.basis;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/12/2020 6:36 PM
 */
public class BasisTest {
    public static void main(String[] args) {
        System.out.println((int)Character.MAX_VALUE);
        char c = 65535;
        System.out.println(c);

        //string to int
        int a = Integer.valueOf("33");
//        int b = Integer.parseInt("3c3");

        short s1 = 1;
//        s1= s1+1;  //1默认是int，int不能转short
        s1+=1; //ok,+=会特殊处理

    }
}
