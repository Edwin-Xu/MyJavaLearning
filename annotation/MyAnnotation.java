package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * Created by Edwin Xu on 4/29/2020 7:59 PM
 */

@Target(value = ElementType.METHOD)
@interface test{
    int value() default -100;
}


public class MyAnnotation {

    private int value;

    public int getValue() {
        System.out.println("value: "+value);
        return value;
    }

    @test(1000000)
    public void f(int a){
        System.out.println("a: "+a);
    }

    public static void main(String[] args) {
        try {
            MyAnnotation ma = new MyAnnotation();

            Class c= Class.forName("annotation.MyAnnotation");
            Method m= c.getMethod("f", int.class);
            System.out.println(m.getName());

            m.invoke(c.newInstance(),90);

            System.out.println(c.getMethods().length);
        }catch (Exception e){
            Class ec = e.getClass();
            System.out.println(ec.getName());
            e.printStackTrace();
        }

        int n=10;
        String s= String.format("%0" + n + "d", 0).replace("0","非常重要");
        System.out.println(s);
    }
}
