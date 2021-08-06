package javabasis.pkg_acc_right.samepkg;

import java.lang.String;

/**
 * Created by Edwin Xu on 8/25/2020 12:52 PM
 */
public class Father {
    private int a = 10;
    int b=0;
    protected int c =1;
    public int d = 9;


    public static void main(String[] args) {
        Father a  = new Father();
        System.out.println(a.a); //可以直接访问a，是因为同类
        System.out.println(a.b); //
        System.out.println(a.c); //
        System.out.println(a.d); //
    }
}
