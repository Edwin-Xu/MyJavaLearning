package syntax_sugar;

/**
 * Created by Edwin Xu on 4/28/2020 12:20 AM
 */

interface A{
    public default void f(){
        System.out.println("接口的默认方法");
    }
}

public class InterfaceDefaultMethod implements A {


    public static void main(String[] args) {
        InterfaceDefaultMethod x = new InterfaceDefaultMethod();
        x.f();
    }
}
