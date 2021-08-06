package JavaCoreTechMooc.fin;

import java.lang.String;

/**
 * Created by Edwin Xu on 5/8/2020 10:23 PM
 */
public class StringUpdate {
    public static void main(String[] args) {
        final int N = 100000;
        long b = System.currentTimeMillis();
        String res ="";
        for (int i = 0; i < N; i++) {
            res+=i;
        }
        long e = System.currentTimeMillis();
        System.out.println(e-b); //4431

        b = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sb.append(i);
        }
        e = System.currentTimeMillis();
        System.out.println(e-b); //62

        b = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder();
        for (int i = 0; i <N ; i++) {
            sbl.append(i);
        }
        e = System.currentTimeMillis();
        System.out.println(e-b); //3
    }
}
