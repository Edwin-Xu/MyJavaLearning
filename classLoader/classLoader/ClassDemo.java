package classLoader.classLoader;

/**
 * Created by Edwin Xu on 9/7/2020 6:52 PM
 */
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;


class A{
    static {
        System.out.println("A");
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        System.out.println(A.class);
        System.out.println("============");
        A a = new A();
        Class aClass = a.getClass();



        System.out.println(A.class==aClass);
    }

    public void test(){
        synchronized (this){

        }
    }
}
