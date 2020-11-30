package nestedClass;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/3/2020 2:03 PM
 */
public class StaticNestedClass {
    int a=0;
    static int b =1;
    public static class A{
        static int a = 0; //静态、非静态都可以
        int b = 1;
        public A(){
            System.out.println("static nested class initializing");
            System.out.println(StaticNestedClass.b);
            //整个类是静态的，只能访问外围的静态变量、方法
            //如果要访问外围类非静态成员，需要new一个外围对象来访问
        }
    }
    public static void main(String[] args) {
        StaticNestedClass snc = new StaticNestedClass();
        StaticNestedClass.A a = new StaticNestedClass.A();
    }
}
