package javabasis.init;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/12/2020 10:57 PM
 */
class X{
    public X(String s){
        System.out.println(s+"X");
    }
}

class F{
    private static X x= new X("Fs");
    static {
        System.out.println("F_static");
    }


    public F(){
        System.out.println("F");
    }
    private X x1 = new X("Fns");
    {
        System.out.println("F_notstatic");
    }
}

class S extends F{
    private X x1= new X("ss");
    private static X x2= new X("sns");
    {
        System.out.println("S_notstatic");
    }
    static {
        System.out.println("s_static");
    }
    public S(){
        System.out.println("S");
    }
}

public class Init {
    public static void main(String[] args) {
        new S();
        System.out.println((int)' ');

        Math.sqrt(12);
    }
}
