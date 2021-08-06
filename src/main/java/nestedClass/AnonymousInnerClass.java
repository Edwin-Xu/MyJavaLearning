package nestedClass;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/3/2020 1:05 PM
 */
public class AnonymousInnerClass {
    private String name = "edwin";
    public void f1(){
        String name = " def";
        //这才是匿名内部类：
        Runnable r = new Runnable() {
            //匿名内部类里面不能定义静态变量，除非是常量
            public final static int a =12;
            public final int b=0;
            //匿名内部类不能定义静态方法 :public static fs(){}
            String name = "XXX";
            @Override
            public void run() {
                System.out.println("hello "+name);//内部  XXX
                System.out.println("hello "+this.name);//内部：this表示匿名内部类  XXX
                System.out.println("hello "+AnonymousInnerClass.this.name);//外围  Edwin
            }
        };
        new Thread(r).start();
        System.out.println(r.getClass().getName());
        //如果还需要一个匿名内部类，必须重新实现
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("another an-inner class");
            }
        };
        new Thread(r2).start();
    }
    public static void main(String[] args) {
        AnonymousInnerClass aic= new AnonymousInnerClass();
        aic.f1();
    }
}


/*
* 总结：
* 匿名内部类：
* - 没有名字
* - 如Runnable
* - 需要继承或者实现父类 父接口
* - 匿名内部类中不能由静态方法、静态变量
* - 类中可以有常量
* - 类只能被使用一次，
* - 类中可以访问外围类的属性方法，包括private，不过需要外围类名.this.name
* - 外围类、其他类无法使用该类，因为不知道名字，无法访问。
* -
*
* */