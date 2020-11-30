package nestedClass;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/3/2020 1:50 PM
 *
 *普通内部类
 */
public class RegularInnerClass {
    class A{
        public int a ;
//        static int c = 0; wrong
        public A(){
            System.out.println("inner class initializing");
        }
    }

    public A a= new A();

    public static void main(String[] args) {
        RegularInnerClass ri = new RegularInnerClass();
        RegularInnerClass.A a = ri.new A();
    }
}
