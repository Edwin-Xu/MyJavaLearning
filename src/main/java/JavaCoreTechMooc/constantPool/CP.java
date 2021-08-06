package JavaCoreTechMooc.constantPool;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/8/2020 10:00 PM
 */
public class CP {
    public static void main(String[] args) {
        int a=127;
        int b=127;
        Integer c = 127;
        Integer d = 127;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);

        short e =127;
        int f = 127;
        System.out.println(e==f);//true

        char c1 = 'z';
        byte c2= 'z';
        System.out.println(c1==c2);//true

        char cc = 'z';
        int cc1 = 'z';
        System.out.println(cc==cc1);
    }
}
