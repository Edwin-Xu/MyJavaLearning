package syntax_sugar;

import java.lang.String;

import static java.lang.Math.PI;
import static java.lang.Math.max;



/**
 * Created by Edwin Xu on 4/27/2020 11:50 PM
 */
public class StaticImport {

    public static void main(String[] args) {
        //java.lang 默认导入，java基础语言包

        System.out.println(PI);
        System.out.println(max(2,3));

        long x = 12345679;
        for (int i = 1; i < 10; i++) {
            System.out.println(x+" *"+i*9+" = "+i*9*x);
        }
    }
}
