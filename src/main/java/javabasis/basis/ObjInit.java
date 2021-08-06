package javabasis.basis;

/**
 * @author Edwin Xu
 * @date 7/10/2021 11:26 PM.
 */

public class ObjInit {
    A A1 = new A();

    static A A2 ;

    static {
        System.out.println("static");
    }

    public ObjInit(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new ObjInit();
    }
}

class A{
    public A(){
        System.out.println("A constr");
    }
}