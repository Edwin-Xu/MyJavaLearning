package nestedClass;

/**
 * Created by Edwin Xu on 5/3/2020 12:53 PM
 *
 * nested classes:
 * - 静态嵌套类
 * - 非静态嵌套类：又名内部类
 *  + 普通内部类
 *  + 局部内部类
 *  + 匿名内部类
 */


//静态内部类：
class A{
    static class A_nest{
        private int a;
    }
}
//内部类：普通
class B{
    class B_nested{

    }
}

//内部类：局部
class C{
    public class C_nest{

    }
}

//内部类：匿名
class D{
    public void f(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("e");
            }
        }).start();
    }
}


public class NestedClassBasis {
    public static void main(String[] args) {

    }

}


