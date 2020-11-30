package JavaCoreTechMooc.singletonpattern;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/8/2020 7:17 PM
 */
public class Singleton {
    private int a;
    private static Singleton obj = new Singleton(1);
    private Singleton(int a){ this.a = a; }
    private void setObj(int s){ this.a = s; }
    private static Singleton getObj(){ return obj; }

    public int getA() { return a; }

    public static void main(String[] args) {
        Singleton s =  Singleton.getObj();
        System.out.println( s.getA()); //1
        s.setObj(2);
        System.out.println(s.getA());

        Singleton s1= Singleton.getObj();
        System.out.println(s1==s); //true

    }
}
