package JavaCoreTechMooc.abstr;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/8/2020 6:34 PM
 */
public abstract class AbstractClass {
    private int a = 0;
    private void f1(){
        System.out.println("f1");
    }
    private void f2(){
        System.out.println("f2");
    }
//    private abstract void f3();
    public abstract void f4(int a);
    abstract void f5();


    public static void main(String[] args) {

    }

}
